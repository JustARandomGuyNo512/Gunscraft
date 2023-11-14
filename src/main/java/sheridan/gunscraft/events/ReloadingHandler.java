package sheridan.gunscraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.network.PacketHandler;
import sheridan.gunscraft.network.packets.ReloadGunPacket;

@OnlyIn(Dist.CLIENT)
public class ReloadingHandler {
    private ItemStack lastTickMainStack;
    private ItemStack lastTickOffStack;

    private int reloadTimerMain;
    private int reloadTimerOff;

    public int getReloadTimer() {

        return (reloadTimerMain < Integer.MAX_VALUE ? reloadTimerMain : 0) +
                (reloadTimerOff < Integer.MAX_VALUE ? reloadTimerOff : 0);
    }


    public boolean setTickingStack(ItemStack stack, boolean isMainHand) {
        if (!(stack.getItem() instanceof IGenericGun)) {
            return false;
        }
        IGenericGun gun = (IGenericGun) stack.getItem();
        if (isMainHand && stack != lastTickMainStack) {
            lastTickMainStack = stack;
            reloadTimerMain = gun.getReloadLength(stack);
            return true;
        } else if (!isMainHand && stack != lastTickOffStack) {
            lastTickOffStack = stack;
            reloadTimerOff = gun.getReloadLength(stack);
            return true;
        }
        return false;
    }

     public void tick() {
        if (lastTickOffStack == null && lastTickMainStack == null) {
            return;
        }
         PlayerEntity player = Minecraft.getInstance().player;
         if (player != null) {
             // System.out.println(reloadTimerMain + reloadTimerOff);
             ItemStack stackMain = player.getHeldItemMainhand();
             ItemStack stackOff = player.getHeldItemOffhand();
             int point = 1;
             if (stackMain == lastTickMainStack) {
                 reloadTimerMain -= point;
                 point --;
             } else {
                 lastTickMainStack = null;
                 reloadTimerMain = Integer.MAX_VALUE;
             }
             if (stackOff == lastTickOffStack) {
                 reloadTimerOff -= point;
             } else {
                 lastTickOffStack = null;
                 reloadTimerOff = Integer.MAX_VALUE;
             }
             if (reloadTimerMain <=0) {
                 finishReload(true);
             }
             if (reloadTimerOff <=0) {
                 finishReload(false);
             }
         }
     }



     private void finishReload(boolean isMainHand) {
        if (isMainHand) {
            lastTickMainStack = null;
            reloadTimerMain = Integer.MAX_VALUE;
            PacketHandler.CommonChannel.sendToServer(new ReloadGunPacket(true));
        } else {
            lastTickOffStack = null;
            reloadTimerOff = Integer.MAX_VALUE;
            PacketHandler.CommonChannel.sendToServer(new ReloadGunPacket(false));
        }
     }


}
