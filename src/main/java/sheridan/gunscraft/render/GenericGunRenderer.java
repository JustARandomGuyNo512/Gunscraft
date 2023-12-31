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
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationData;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationHandler;
import sheridan.gunscraft.capability.CapabilityHandler;
import sheridan.gunscraft.events.PlayerEvents;
import sheridan.gunscraft.events.RenderEvents;
import sheridan.gunscraft.items.attachments.util.GunAttachmentSlot;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.items.attachments.util.NBTAttachmentsMap;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.render.bulletShell.BulletShellRenderer;
import sheridan.gunscraft.render.fx.muzzleFlash.CommonMuzzleFlash;
import sheridan.gunscraft.render.fx.muzzleFlash.MuzzleFlash;
import sheridan.gunscraft.render.fx.muzzleFlash.MuzzleFlashTrans;

import static sheridan.gunscraft.ClientProxy.TICK_LEN;
import static sheridan.gunscraft.ClientProxy.bulletSpread;

@OnlyIn(Dist.CLIENT)
public class GenericGunRenderer implements IGunRender{
    private static final Matrix4f DEFAULT_FIRST_PERSON_FOV_MATRIX;
    public static final float DEFAULT_FIRST_PERSON_FOV = 56.75f;
    public PlayerEntity player;

    static {
        DEFAULT_FIRST_PERSON_FOV_MATRIX = new Matrix4f();
        DEFAULT_FIRST_PERSON_FOV_MATRIX.setIdentity();
        Minecraft minecraft = Minecraft.getInstance();
        DEFAULT_FIRST_PERSON_FOV_MATRIX.mul(Matrix4f.perspective(DEFAULT_FIRST_PERSON_FOV,
                (float) minecraft.getMainWindow().getFramebufferWidth() / (float) minecraft.getMainWindow().getFramebufferHeight(),
                0.05F, (float) minecraft.gameSettings.renderDistanceChunks * 64F));
    }

    public void justRenderModel(ItemStack itemStackIn, ItemCameraTransforms.TransformType transformTypeIn,
        MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, IGenericGun gun, IGunModel model, TransformData transformData) {
        if (model != null) {
            if (transformData != null) {
                matrixStackIn.push();
                transformData.applyTransform(transformTypeIn, matrixStackIn, false, 0);
                int fireMode = gun.getFireMode(itemStackIn);
                int ammoLeft = gun.getAmmoLeft(itemStackIn);
                long fireDis = (gun.getShootDelay() - 1) * TICK_LEN;
                GunRenderContext context = NBTAttachmentsMap.renderAttachments(matrixStackIn, transformTypeIn, combinedLightIn, combinedOverlayIn, ammoLeft, 0, true, fireMode,itemStackIn, gun);
                model.render(matrixStackIn, bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(gun.getTexture(gun.getCurrentTextureIndex(itemStackIn)))),
                      transformTypeIn, combinedLightIn, combinedOverlayIn, 1, 1, 1, 1, ammoLeft,0, false, fireMode,context,fireDis);
                matrixStackIn.pop();
            }
        }
    }

    private long tempLastShootMain;
    private long tempLastShootOff;
    int delay;
    Matrix4f temp;
    public void renderWithLivingEntity(LivingEntity entityIn, MatrixStack stackIn,
        ItemStack itemStackIn, ItemCameraTransforms.TransformType type, IRenderTypeBuffer bufferIn, IGenericGun gun,
        int combinedLightIn, int combinedOverlayIn, boolean leftHand, IGunModel model, TransformData transformData) {
        if (!Gunscraft.proxy.shouldRenderCustom(itemStackIn, gun, entityIn, !leftHand)) {
            return;
        }
        int ammoLeft = gun.getAmmoLeft(itemStackIn);
        if (entityIn == null) {
            justRenderModel(itemStackIn,type,stackIn,bufferIn,combinedLightIn,combinedOverlayIn,gun,model,transformData);
            return;
        }
        delay ++;
        if (model != null) {
            if (transformData != null) {
                stackIn.push();
                ClientProxy.mainHandStatus.handleAiming(RenderEvents.delta);
                boolean isFirstPerson = type.isFirstPerson();
                boolean transAiming = entityIn instanceof PlayerEntity && !leftHand &&
                        (ClientProxy.mainHandStatus.aiming || ClientProxy.mainHandStatus.aimingProgress != 0) && isFirstPerson;
                float aimingProgress = ClientProxy.mainHandStatus.aimingProgress;
                transformData.applyTransform(type, stackIn, transAiming, aimingProgress);
                RecoilAnimationData recoilAnimationData = transformData.getRecoilAnimationData();
                int fireMode = gun.getFireMode(itemStackIn);
                long fireDis = (gun.getShootDelay() - 1) * TICK_LEN;
                player = Minecraft.getInstance().player;

                if (delay > 800) {
                    delay = 0;
                }
                if (isFirstPerson) {
                    applyFOV();
                    long lastShootTime = leftHand ? ClientProxy.offHandStatus.lastShoot : ClientProxy.mainHandStatus.lastShoot;
                    TransformData.BulletShellAniData bulletShellAniData = transformData.bulletShellAniData;
                    if (bulletShellAniData != null && player != null) {
                        boolean shouldPlayBulletShell;
                        if (!leftHand) {
                            shouldPlayBulletShell = tempLastShootMain != lastShootTime && lastShootTime != 0L;
                        } else {
                            shouldPlayBulletShell = tempLastShootOff != lastShootTime && lastShootTime != 0L;
                        }
                        if (shouldPlayBulletShell) {
                            stackIn.push();
                            transformData.applyBulletShellTrans(stackIn, !leftHand);
                            BulletShellRenderer.push(stackIn, bulletShellAniData.xSpeed,
                                    bulletShellAniData.ySpeed,
                                    bulletShellAniData.zSpeed,
                                    bulletShellAniData.rSpeed,
                                    bulletShellAniData.drop,
                                    bulletShellAniData.random,
                                    bulletShellAniData.length, gun.getBulletType(), !leftHand);
                            stackIn.pop();
                        }
                        if (!leftHand) {
                            tempLastShootMain = lastShootTime;
                        } else {
                            tempLastShootOff = lastShootTime;
                        }
                    }
                    if (entityIn instanceof PlayerEntity) {
                        if (recoilAnimationData != null) {
                            RecoilAnimationHandler.update(recoilAnimationData, stackIn, !leftHand);
                        }
                        int handPose = ClientProxy.armPose;
                        renderArm(stackIn, bufferIn, combinedLightIn, combinedOverlayIn, transformData, handPose, leftHand);
                    }

                    GunRenderContext context = NBTAttachmentsMap.renderAttachments(stackIn, type, combinedLightIn, combinedOverlayIn, ammoLeft, lastShootTime, !leftHand, fireMode,itemStackIn, gun);

                    model.render(stackIn, bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(gun.getTexture(gun.getCurrentTextureIndex(itemStackIn)))),
                            type, combinedLightIn, combinedOverlayIn, 1, 1, 1, 1, ammoLeft, lastShootTime, !leftHand, fireMode, context,fireDis);

                    renderMuzzleFlash(gun, itemStackIn, transformData, lastShootTime, bufferIn, stackIn, true);

                    BulletShellRenderer.play(combinedLightIn, combinedOverlayIn);
                } else {
                    long lastShoot;
                    if (entityIn.getEntityId() == ClientProxy.clientPlayerId) {
                        lastShoot = leftHand ? ClientProxy.offHandStatus.lastShoot : ClientProxy.mainHandStatus.lastShoot;
                        if (RecoilAnimationHandler.getIsEnable(true) || RecoilAnimationHandler.getIsEnable(false)) {
                            RecoilAnimationHandler.clearAll();
                        }
                    } else {
                        lastShoot = leftHand ?
                                CapabilityHandler.getInstance().get((PlayerEntity) entityIn, ClientProxy.LAST_SHOOT_LEFT) :
                                CapabilityHandler.getInstance().get((PlayerEntity) entityIn, ClientProxy.LAST_SHOOT_RIGHT);
                    }
                    GunRenderContext context = NBTAttachmentsMap.renderAttachments(stackIn, type, combinedLightIn, combinedOverlayIn, ammoLeft, lastShoot, !leftHand, fireMode,itemStackIn, gun);
                    stackIn.push();
                    model.render(stackIn, bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(gun.getTexture(gun.getCurrentTextureIndex(itemStackIn)))),
                          type, combinedLightIn, combinedOverlayIn, 1, 1, 1, 1, ammoLeft, lastShoot, !leftHand, fireMode, context,fireDis);

                    stackIn.pop();
                    renderMuzzleFlash(gun, itemStackIn, transformData, lastShoot, bufferIn, stackIn, false);
                }
                stackIn.pop();
            }
        }
    }

    @Override
    public void renderInGuiScreen(ItemStack itemStack, MatrixStack matrixStack, IGenericGun gun, IGunModel model, GunAttachmentSlot selectSlot) {
        matrixStack.push();
        int ammoLeft = gun.getAmmoLeft(itemStack);
        int fireMode = gun.getFireMode(itemStack);
        long fireDis = (gun.getShootDelay() - 1) * TICK_LEN;
        TransformData transformData = ClientProxy.transformDataMap.get(itemStack.getItem());
        transformData.applyTransform(ItemCameraTransforms.TransformType.GROUND, matrixStack, false, 0);
        GunRenderContext context = NBTAttachmentsMap.renderAttachments(matrixStack, ItemCameraTransforms.TransformType.GROUND, 15728880, 655360,
                ammoLeft, 0, true, fireMode,itemStack, gun);
        IRenderTypeBuffer.Impl impl = Minecraft.getInstance().getRenderTypeBuffers().getBufferSource();
        model.render(matrixStack,
                impl.getBuffer(RenderType.getEntityCutoutNoCull(gun.getTexture(gun.getCurrentTextureIndex(itemStack)))),
                ItemCameraTransforms.TransformType.GROUND,15728880, 655360, 1, 1, 1, 1,ammoLeft,0,  true, 0, context,fireDis);
        impl.finish();
        NBTAttachmentsMap.renderAttachmentIcons(matrixStack, gun, selectSlot, itemStack);
        matrixStack.pop();
    }

    private static void renderMuzzleFlash(IGenericGun gun, ItemStack itemStack, TransformData transformData, long startTime, IRenderTypeBuffer buffer, MatrixStack stack, boolean firsPerson) {
        String state = gun.getMuzzleFlashState(itemStack);
        if (state != null) {
            String flashName = transformData.getMuzzleFlashName(state);
            MuzzleFlashTrans trans = transformData.getMuzzleFlashTrans(state);
            if (flashName != null && trans != null) {
                MuzzleFlash flash = CommonMuzzleFlash.flashMap.get(flashName);
                if (flash != null) {
                    flash.play(startTime, buffer, stack, trans, firsPerson);
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
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_RIGHT_HAND, rightArm, data, skin, isSlim, true);
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_LEFT_HAND, leftArm, data, skin, isSlim, false);
            } else if (handPose == PlayerEvents.RIGHT_HAND_PISTOL) {
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_RIGHT_HAND, rightArm, data, skin, isSlim, true);
            } else if (handPose == PlayerEvents.LEFT_HAND_PISTOL) {
                renderArmModel(matrixStack, buffer, light, overlay, TransformData.LEFT_SIDE, leftArm, data, skin, isSlim, false);
            } else if (handPose == PlayerEvents.DOUBLE_PISTOL) {
                if (!leftHand) {
                    renderArmModel(matrixStack, buffer, light, overlay, TransformData.RIGHT_SIDE_RIGHT_HAND, rightArm, data, skin, isSlim, true);
                } else {
                    renderArmModel(matrixStack, buffer, light, overlay, TransformData.LEFT_SIDE, leftArm, data, skin, isSlim, false);
                }
            }
        }
    }

    private void renderArmModel(MatrixStack matrixStack, IRenderTypeBuffer buffer, int light, int overlay, int trans, ModelRenderer model, TransformData data, ResourceLocation skin, boolean isSlim, boolean mainHand){
        matrixStack.push();
        data.applyFPArmPoseTransform(trans, matrixStack, isSlim, model, mainHand);
        model.render(matrixStack, buffer.getBuffer(RenderType.getEntityCutout(skin)), light, overlay);
        matrixStack.pop();
    }

}
