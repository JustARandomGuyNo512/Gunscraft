package sheridan.gunscraft.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.opengl.GL11;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.animation.IAnimation;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationData;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationHandler;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationState;
import sheridan.gunscraft.capability.CapabilityHandler;
import sheridan.gunscraft.events.PlayerEvents;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.render.fx.muzzleFlash.CommonMuzzleFlash;
import sheridan.gunscraft.render.fx.muzzleFlash.MuzzleFlash;
import sheridan.gunscraft.render.fx.muzzleFlash.MuzzleFlashTrans;

@OnlyIn(Dist.CLIENT)
public class GenericGunRenderer implements IGunRender{
    private static final Matrix4f DEFAULT_FIRST_PERSON_FOV_MATRIX;
    public static final float DEFAULT_FIRST_PERSON_FOV = 56.75f;

    public static RecoilAnimationState recoilAnimationState;
    //public static RecoilAnimationData recoilAnimationData;

    static {
        DEFAULT_FIRST_PERSON_FOV_MATRIX = new Matrix4f();
        DEFAULT_FIRST_PERSON_FOV_MATRIX.setIdentity();
        Minecraft minecraft = Minecraft.getInstance();
        DEFAULT_FIRST_PERSON_FOV_MATRIX.mul(Matrix4f.perspective(DEFAULT_FIRST_PERSON_FOV, (float) minecraft.getMainWindow().getFramebufferWidth() / (float) minecraft.getMainWindow().getFramebufferHeight(), 0.05F, (float) minecraft.gameSettings.renderDistanceChunks * 64F));

    }

    public void justRenderModel(ItemStack itemStackIn, ItemCameraTransforms.TransformType transformTypeIn,
        MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, IGenericGun gun, IGunModel model, TransformData transformData) {
        if (model != null) {
            if (transformData != null) {
                matrixStackIn.push();
                transformData.applyTransform(transformTypeIn, matrixStackIn);
                int fireMode = gun.getFireMode(itemStackIn);
                model.render(matrixStackIn, bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(gun.getTexture(gun.getCurrentTextureIndex(itemStackIn)))),
                        transformTypeIn, combinedLightIn, combinedOverlayIn, 1, 1, 1, 1, 1,0, false, fireMode);
                matrixStackIn.pop();
            }
        }
    }

    public void renderWithLivingEntity(LivingEntity entityIn, MatrixStack stackIn,
        ItemStack itemStackIn, ItemCameraTransforms.TransformType type, IRenderTypeBuffer bufferIn, IGenericGun gun,
        int combinedLightIn, int combinedOverlayIn, boolean leftHand, IGunModel model, TransformData transformData) {
        if (!Gunscraft.proxy.shouldRenderCustom(itemStackIn, gun, entityIn, !leftHand)) {
            return;
        }
        if (entityIn == null) {
            justRenderModel(itemStackIn,type,stackIn,bufferIn,combinedLightIn,combinedOverlayIn,gun,model,transformData);
            return;
        }
        if (model != null) {
            if (transformData != null) {
                stackIn.push();
                transformData.applyTransform(type, stackIn);
                RecoilAnimationData recoilAnimationData = transformData.getRecoilAnimationData();
                int fireMode = gun.getFireMode(itemStackIn);

                if (type.isFirstPerson()) {
                    applyFOV();
                    long lastShootTime = leftHand ? ClientProxy.FPLLastShoot : ClientProxy.FPRLastShoot;
                    stackIn.push();
                    if (entityIn instanceof PlayerEntity) {
                        if (recoilAnimationData != null) {
                            RecoilAnimationHandler.update(recoilAnimationData, stackIn, !leftHand);
                        }
                        int handPose = ClientProxy.armPose;
                        renderArm(stackIn, bufferIn, combinedLightIn, combinedOverlayIn, transformData, handPose, leftHand);
                    }

                    model.render(stackIn, bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(gun.getTexture(gun.getCurrentTextureIndex(itemStackIn)))),
                            type, combinedLightIn, combinedOverlayIn, 1, 1, 1, 1, 1, lastShootTime, !leftHand, fireMode);
                    stackIn.pop();
                    renderMuzzleFlash(gun, itemStackIn, transformData, lastShootTime, bufferIn, stackIn);

                } else {
                    long lastShoot;
                    if (entityIn.getEntityId() == ClientProxy.clientPlayerId) {
                        lastShoot = leftHand ? ClientProxy.FPLLastShoot : ClientProxy.FPRLastShoot;
                        if (RecoilAnimationHandler.getIsEnable(true) || RecoilAnimationHandler.getIsEnable(false)) {
                            RecoilAnimationHandler.clearAll();
                        }
                    } else {
                        lastShoot = leftHand ?
                                CapabilityHandler.instance().get((PlayerEntity) entityIn, ClientProxy.LAST_SHOOT_LEFT) :
                                CapabilityHandler.instance().get((PlayerEntity) entityIn, ClientProxy.LAST_SHOOT_RIGHT);

                    }
                    stackIn.push();
                    model.render(stackIn, bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(gun.getTexture(gun.getCurrentTextureIndex(itemStackIn)))),
                            type, combinedLightIn, combinedOverlayIn, 1, 1, 1, 1, 1, lastShoot, !leftHand, fireMode);
                    stackIn.pop();
                    renderMuzzleFlash(gun, itemStackIn, transformData, lastShoot, bufferIn, stackIn);
                }
                stackIn.pop();
            }
        }
    }

    private static void renderMuzzleFlash(IGenericGun gun, ItemStack itemStack, TransformData transformData, long startTime, IRenderTypeBuffer buffer, MatrixStack stack) {
        String state = gun.getMuzzleFlashState(itemStack);
        if (state != null) {
            String flashName = transformData.getMuzzleFlashName(state);
            MuzzleFlashTrans trans = transformData.getMuzzleFlashTrans(state);
            if (flashName != null && trans != null) {
                MuzzleFlash flash = CommonMuzzleFlash.flashMap.get(flashName);
                if (flash != null) {
                    flash.play(startTime, buffer, stack, trans);
                }
            }
        }
    }

    private static void applyFOV(float fov) {
        RenderSystem.matrixMode(GL11.GL_PROJECTION);
        RenderSystem.loadIdentity();
        if (fov == DEFAULT_FIRST_PERSON_FOV) {
            Minecraft minecraft = Minecraft.getInstance();
            minecraft.gameRenderer.resetProjectionMatrix(DEFAULT_FIRST_PERSON_FOV_MATRIX);
        } else {
            Matrix4f matrix4f = new Matrix4f();
            matrix4f.setIdentity();
            Minecraft minecraft = Minecraft.getInstance();
            matrix4f.mul(Matrix4f.perspective(fov, (float) minecraft.getMainWindow().getFramebufferWidth() / (float) minecraft.getMainWindow().getFramebufferHeight(), 0.05F, (float) minecraft.gameSettings.renderDistanceChunks * 64F));
            minecraft.gameRenderer.resetProjectionMatrix(matrix4f);
        }
        RenderSystem.matrixMode(GL11.GL_MODELVIEW);
    }

    private static void applyFOV() {
        applyFOV(DEFAULT_FIRST_PERSON_FOV);
    }

    private void renderArm(MatrixStack matrixStack, IRenderTypeBuffer buffer, int light, int overlay, TransformData data, int handPose, boolean leftHand) {
        AbstractClientPlayerEntity abstractClientPlayer = Minecraft.getInstance().player;
        if (abstractClientPlayer != null) {
            boolean isSlim = "slim".equals(abstractClientPlayer.getSkinType());
            ResourceLocation skin = abstractClientPlayer.getLocationSkin();
            PlayerRenderer renderPlayer = (PlayerRenderer) Minecraft.getInstance().getRenderManager().getRenderer(abstractClientPlayer);

            ModelRenderer rightArm = renderPlayer.getEntityModel().bipedRightArm;
            ModelRenderer leftArm = renderPlayer.getEntityModel().bipedLeftArm;
            if (handPose == PlayerEvents.TWO_HAND_PISTOL || handPose == PlayerEvents.RIFLE) {
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_RIGHT_HAND, rightArm, data, skin, isSlim);
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_LEFT_HAND, leftArm, data, skin, isSlim);
            } else if (handPose == PlayerEvents.RIGHT_HAND_PISTOL) {
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_RIGHT_HAND, rightArm, data, skin, isSlim);
            } else if (handPose == PlayerEvents.LEFT_HAND_PISTOL) {
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.LEFT_SIDE, leftArm, data, skin, isSlim);
            } else if (handPose == PlayerEvents.DOUBLE_PISTOL) {
                if (!leftHand) {
                    renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_RIGHT_HAND, rightArm, data, skin, isSlim);
                } else {
                    renderArmModel(matrixStack, buffer, light, overlay, TransformData.LEFT_SIDE, leftArm, data, skin, isSlim);
                }
            }
        }
    }

    private void renderArmModel(MatrixStack matrixStack, IRenderTypeBuffer buffer, int light, int overlay, int trans, ModelRenderer model, TransformData data, ResourceLocation skin, boolean isSlim){
        matrixStack.push();
        data.applyFPArmPoseTransform(trans, matrixStack, isSlim, model);
        model.render(matrixStack, buffer.getBuffer(RenderType.getEntityCutout(skin)), light, overlay);
        matrixStack.pop();
    }

}
