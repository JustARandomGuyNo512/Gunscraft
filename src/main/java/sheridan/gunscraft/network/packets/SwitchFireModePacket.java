package sheridan.gunscraft.network.packets;

import net.minecraft.item.ItemStack;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.function.Supplier;

public class SwitchFireModePacket implements IPacket<SwitchFireModePacket>{
    public boolean isMainHand;

    public SwitchFireModePacket() {}

    public SwitchFireModePacket(boolean isMainHand) {
        this.isMainHand = isMainHand;
    }

    @Override
    public void encode(SwitchFireModePacket message, PacketBuffer buffer) {
        buffer.writeBoolean(message.isMainHand);
    }

    @Override
    public SwitchFireModePacket decode(PacketBuffer buffer) {
        SwitchFireModePacket packet = new SwitchFireModePacket();
        packet.isMainHand = buffer.readBoolean();
        return packet;
    }

    @Override
    public void handle(SwitchFireModePacket message, Supplier<NetworkEvent.Context> supplier) {
        supplier.get().enqueueWork(() -> {
            INetHandler handler = supplier.get().getNetworkManager().getNetHandler();
            if (handler instanceof ServerPlayNetHandler) {
                boolean isMainHand = message.isMainHand;
                ItemStack heldStack;
                heldStack = isMainHand ? ((ServerPlayNetHandler) handler).player.getHeldItemMainhand() : ((ServerPlayNetHandler) handler).player.getHeldItemOffhand();
                IGenericGun gun = (IGenericGun) heldStack.getItem();

            }
        });
    }
}
