package sheridan.gunscraft.events;


import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.render.crosshairs.BasicCrossHairRenderer;


@Mod.EventBusSubscriber
public class RenderEvents {

    public static float delta = 0;
    private static long lastTickTime = -1;
    private static final BasicCrossHairRenderer renderer = new BasicCrossHairRenderer();

    @SubscribeEvent
    public static void onRenderTick(TickEvent.RenderTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            if (lastTickTime == -1) {
                lastTickTime = System.currentTimeMillis();
                return;
            }
            int dis = (int) (System.currentTimeMillis() - lastTickTime);
            lastTickTime = System.currentTimeMillis();
            delta = (float) dis * 0.001f;
        }
    }

    @SubscribeEvent
    public static void renderCrossHair(RenderGameOverlayEvent event) {
        if (event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
            if (ClientProxy.holdingGunMain.get() || ClientProxy.holdingGunOff.get()) {
                event.setCanceled(true);
                MainWindow window = Minecraft.getInstance().getMainWindow();
                renderer.render(event.getMatrixStack(), ClientProxy.bulletSpread, window, BasicCrossHairRenderer.WHITE);
            }
        }
    }


}
