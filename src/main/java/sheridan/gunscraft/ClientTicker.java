package sheridan.gunscraft;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.TimerTask;

public class ClientTicker extends TimerTask {
    public int mainHandPostDelay;
    public int offHandPostDelay;

    @Override
    public void run() {
        try {
            Minecraft minecraft = Minecraft.getInstance();
            PlayerEntity player = Gunscraft.proxy.getClientPlayer();
            if (!minecraft.isGameFocused() || minecraft.isGamePaused() || minecraft.currentScreen != null) {
                return;
            }

            if (player == null) {
                handleCoolDown();
                return;
            }
            if (player.isSpectator() || player.isSwimming() || player.isInLava()) {
                handleCoolDown();
                return;
            }

            if (ClientProxy.leftDown.get() && ClientProxy.holdingGunMain.get() && ClientProxy.shouldHandleMain.get() && mainHandPostDelay <= 0) {
                postShootTask(minecraft, player, true);
            }

            if (ClientProxy.rightDown.get() && ClientProxy.holdingGunOff.get() && ClientProxy.shouldHandleOff.get() && offHandPostDelay <= 0) {
                postShootTask(minecraft, player, false);
            }
            handleCoolDown();
        } catch (Exception ignored) {}
    }

    private void postShootTask(Minecraft minecraft, PlayerEntity player, boolean mainHand) {
        if (player != null) {
            ItemStack stack = mainHand ? player.getHeldItemMainhand() : player.getHeldItemOffhand();
            if (stack.getItem() instanceof IGenericGun) {
                if (mainHand) {
                    minecraft.enqueue(ClientProxy::tryFireMain);
                    mainHandPostDelay = ClientProxy.mainHandShootDelay.get();
                } else {
                    minecraft.enqueue(ClientProxy::tryFireOff);
                    offHandPostDelay = ClientProxy.offHandShootDelay.get();
                }
            }
        }
    }

    private void handleCoolDown() {
        if (mainHandPostDelay > 0) {
            mainHandPostDelay--;
        }
        if (offHandPostDelay > 0) {
            offHandPostDelay--;
        }
    }

}
