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

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void clientTick(TickEvent.ClientTickEvent event) {
        PlayerEntity clientPlayer = Minecraft.getInstance().player;
        if (clientPlayer != null) {
            ClientProxy.clientPlayerId = clientPlayer.getEntityId();
        }
        if (ClientProxy.bulletSpread > ClientProxy.maxBulletSpread) {
            ClientProxy.bulletSpread = ClientProxy.maxBulletSpread;
        } else if (ClientProxy.bulletSpread < ClientProxy.minBulletSpread + 0.1f) {
            ClientProxy.bulletSpread = ClientProxy.minBulletSpread;
        } else {
            ClientProxy.addSpread(-0.1f);
        }
        if (reloadingHandler != null) {
            reloadingHandler.tick();
        }
    }

}
