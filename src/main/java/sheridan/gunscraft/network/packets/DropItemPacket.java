package sheridan.gunscraft.network.packets;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.function.Supplier;

public class DropItemPacket implements IPacket<DropItemPacket>{
    public int itemId;
    public int count;

    public DropItemPacket() {
    }

    public DropItemPacket(int itemId, int count) {
        this.itemId = itemId;
        this.count = count;
    }

    @Override
    public void encode(DropItemPacket message, PacketBuffer buffer) {
        buffer.writeInt(message.itemId);
        buffer.writeInt(message.count);
    }

    @Override
    public DropItemPacket decode(PacketBuffer buffer) {
        DropItemPacket packet = new DropItemPacket();
        packet.itemId = buffer.readInt();
        packet.count = buffer.readInt();
        return packet;
    }

    @Override
    public void handle(DropItemPacket message, Supplier<NetworkEvent.Context> supplier) {
        supplier.get().enqueueWork(() -> {
            INetHandler handler = supplier.get().getNetworkManager().getNetHandler();
            if (handler instanceof ServerPlayNetHandler) {
                ((ServerPlayNetHandler) handler).player.dropItem(new ItemStack(Item.getItemById(message.itemId), message.count), true, false);
            }
        });
    }
}
