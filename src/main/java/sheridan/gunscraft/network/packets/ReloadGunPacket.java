package sheridan.gunscraft.network.packets;

import net.minecraft.item.ItemStack;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.function.Supplier;

public class ReloadGunPacket implements IPacket<ReloadGunPacket>{
    public boolean isMainHand;

    public ReloadGunPacket() {
    }

    public ReloadGunPacket(boolean isMainHand) {
        this.isMainHand = isMainHand;
    }

    @Override
    public void encode(ReloadGunPacket message, PacketBuffer buffer) {
        buffer.writeBoolean(message.isMainHand);
    }

    @Override
    public ReloadGunPacket decode(PacketBuffer buffer) {
        ReloadGunPacket packet = new ReloadGunPacket();
        packet.isMainHand = buffer.readBoolean();
        return packet;
    }

    @Override
    public void handle(ReloadGunPacket message, Supplier<NetworkEvent.Context> supplier) {
        supplier.get().enqueueWork(() -> {
            INetHandler handler = supplier.get().getNetworkManager().getNetHandler();
            if (handler instanceof ServerPlayNetHandler) {
                boolean isMainHand = message.isMainHand;
                ItemStack heldStack;
                heldStack = isMainHand ? ((ServerPlayNetHandler) handler).player.getHeldItemMainhand() : ((ServerPlayNetHandler) handler).player.getHeldItemOffhand();
                IGenericGun gun = (IGenericGun) heldStack.getItem();
                gun.reload(heldStack, ((ServerPlayNetHandler) handler).player, isMainHand);
            }
        });
    }
}
