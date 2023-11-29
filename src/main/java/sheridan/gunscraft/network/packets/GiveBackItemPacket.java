package sheridan.gunscraft.network.packets;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class GiveBackItemPacket implements IPacket<GiveBackItemPacket>{
    public int itemId;
    public int count;

    public GiveBackItemPacket() {
    }

    public GiveBackItemPacket(int itemId, int count) {
        this.itemId = itemId;
        this.count = count;
    }

    @Override
    public void encode(GiveBackItemPacket message, PacketBuffer buffer) {
        buffer.writeInt(message.itemId);
        buffer.writeInt(message.count);
    }

    @Override
    public GiveBackItemPacket decode(PacketBuffer buffer) {
        GiveBackItemPacket packet = new GiveBackItemPacket();
        packet.itemId = buffer.readInt();
        packet.count = buffer.readInt();
        return packet;
    }

    @Override
    public void handle(GiveBackItemPacket message, Supplier<NetworkEvent.Context> supplier) {
        supplier.get().enqueueWork(() -> {
            INetHandler handler = supplier.get().getNetworkManager().getNetHandler();
            ItemStack returnStack = new ItemStack(Item.getItemById(message.itemId), message.count);
            ServerPlayerEntity player = ((ServerPlayNetHandler) handler).player;
            ItemEntity entity = new ItemEntity(player.world, player.getPosX(), player.getPosY(), player.getPosZ(), returnStack);
            player.world.addEntity(entity);
        });
    }
}
