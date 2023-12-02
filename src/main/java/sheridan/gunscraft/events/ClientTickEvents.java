package sheridan.gunscraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sheridan.gunscraft.ClientProxy;

@Mod.EventBusSubscriber
public class ClientTickEvents {
    @OnlyIn(Dist.CLIENT)
    public static ReloadingHandler reloadingHandler = new ReloadingHandler();

    private static long lastTick = 0;
    public static float clientDelta = 0.05f;

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void clientTick(TickEvent.ClientTickEvent event) {
        PlayerEntity clientPlayer = Minecraft.getInstance().player;
        if (clientPlayer != null) {
            ClientProxy.clientPlayerId = clientPlayer.getEntityId();
        }
        if (ClientProxy.equipDuration > 0 || Minecraft.getInstance().isGamePaused()) {
            ClientProxy.mainHandStatus.aiming = false;
        }
        if (reloadingHandler != null) {
            reloadingHandler.tick();
        }
        if (event.phase == TickEvent.Phase.END) {
            if (lastTick == 0) {
                lastTick = System.currentTimeMillis();
            } else {
                long now = System.currentTimeMillis();
                long dis = now - lastTick;
                lastTick = now;
                clientDelta = (float) dis * 0.001f;
            }
        }
        if (Minecraft.getInstance().currentScreen != null) {
            // System.out.println(Minecraft.getInstance().currentScreen.getClass());
        }
    }

}
