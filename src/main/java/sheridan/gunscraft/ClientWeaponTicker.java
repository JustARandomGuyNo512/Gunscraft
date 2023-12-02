package sheridan.gunscraft;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.TimerTask;

public class ClientWeaponTicker extends TimerTask {
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

            if (ClientProxy.mainHandStatus.buttonDown.get() && ClientProxy.mainHandStatus.holdingGun.get() &&
                    ClientProxy.mainHandStatus.shouldHandle.get() && mainHandPostDelay <= 0) {
                postShootTask(minecraft, player, true);
            }

            if (ClientProxy.offHandStatus.buttonDown.get() && ClientProxy.offHandStatus.holdingGun.get() &&
                    ClientProxy.offHandStatus.shouldHandle.get() && offHandPostDelay <= 0) {
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
                    minecraft.enqueue(ClientProxy::handleFireMain);
                    mainHandPostDelay = ClientProxy.mainHandStatus.shootDelay.get();
                } else {
                    minecraft.enqueue(ClientProxy::handleFireOff);
                    offHandPostDelay = ClientProxy.offHandStatus.shootDelay.get();
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
