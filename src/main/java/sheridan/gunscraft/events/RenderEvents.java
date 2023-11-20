package sheridan.gunscraft.events;


import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.animation.recoilAnimation.RecoilCameraHandler;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.render.crosshairs.BasicCrossHairRenderer;


@Mod.EventBusSubscriber
public class RenderEvents {

    public static float delta = 0;
    public static float particularTick = 0;
    private static long lastTickTime = -1;
    private static final BasicCrossHairRenderer renderer = new BasicCrossHairRenderer();
    public static RecoilCameraHandler cameraHandler = new RecoilCameraHandler();

    @SubscribeEvent
    public static void onRenderTick(TickEvent.RenderTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            if (lastTickTime == -1) {
                lastTickTime = System.currentTimeMillis();
                return;
            }
            particularTick = event.renderTickTime;
            int dis = (int) (System.currentTimeMillis() - lastTickTime);
            lastTickTime = System.currentTimeMillis();
            delta = (float) dis * 0.001f;
            if (!cameraHandler.inModify.get()) {
                cameraHandler.handle(delta);
            }
        }
    }

    @SubscribeEvent
    public static void renderCrossHair(RenderGameOverlayEvent event) {
        if (event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
            if (ClientProxy.mainHandStatus.holdingGun.get() || ClientProxy.offHandStatus.holdingGun.get()) {
                event.setCanceled(true);
                if (ClientProxy.mainHandStatus.aiming) {
                    return;
                }
                MainWindow window = Minecraft.getInstance().getMainWindow();
                renderer.render(event.getMatrixStack(), ClientProxy.bulletSpread, window, BasicCrossHairRenderer.WHITE);
            }
        }
    }

    @SubscribeEvent
    public static void renderGunInfo(RenderGameOverlayEvent event) {
        if (event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
            FontRenderer renderer = Minecraft.getInstance().fontRenderer;
            MatrixStack matrixStackIn = event.getMatrixStack();
            Minecraft minecraft = Minecraft.getInstance();
            MainWindow window = Minecraft.getInstance().getMainWindow();
            PlayerEntity player = minecraft.player;

            if (player != null) {
                ItemStack stackMain = player.getHeldItemMainhand();
                ItemStack stackOff = player.getHeldItemOffhand();
                int color = 0xFFFAFA0F;
                if (stackMain.getItem() instanceof IGenericGun) {
                    matrixStackIn.push();
                    matrixStackIn.translate(0.8f * (window.getScaledWidth()), 0.75f * (window.getScaledHeight()), 0.0D);
                    matrixStackIn.scale(0.7f, 0.7f, 1f);
                    IGenericGun gun = (IGenericGun) stackMain.getItem();
                    renderer.drawString(matrixStackIn, "ammo: " + gun.getAmmoLeft(stackMain), 0f, 0f, color);
                    matrixStackIn.pop();
                    matrixStackIn.push();
                    matrixStackIn.translate(0.8f * (window.getScaledWidth()), 0.8f * (window.getScaledHeight()), 0.0D);
                    matrixStackIn.scale(0.7f, 0.7f, 1f);
                    renderer.drawString(matrixStackIn, GenericGun.getFireModeStr(gun.getFireMode(stackMain)),0,0,color);
                    matrixStackIn.pop();
                }

                if (stackOff.getItem() instanceof IGenericGun) {
                    if (!ClientProxy.offHandStatus.holdingGun.get()) {
                        color = 0xFF0000;
                    } else {
                        color = 0xffffff;
                    }
                    matrixStackIn.push();
                    matrixStackIn.translate(0.2f * (window.getScaledWidth()), 0.75f * (window.getScaledHeight()), 0.0D);
                    matrixStackIn.scale(0.7f, 0.7f, 1);
                    IGenericGun gun = (IGenericGun) stackOff.getItem();
                    String s1 ="ammo: " + gun.getAmmoLeft(stackOff);
                    renderer.drawString(matrixStackIn, s1, -renderer.getStringWidth(s1), 0, color);
                    matrixStackIn.pop();
                    matrixStackIn.push();
                    matrixStackIn.translate(0.2f * (window.getScaledWidth()), 0.8f * (window.getScaledHeight()), 0.0D);
                    matrixStackIn.scale(0.7f, 0.7f, 1);
                    String s2 = GenericGun.getFireModeStr(gun.getFireMode(stackOff));
                    renderer.drawString(matrixStackIn, s2,-renderer.getStringWidth(s2),0,color);
                    matrixStackIn.pop();
                }

            }
        }
    }


}
