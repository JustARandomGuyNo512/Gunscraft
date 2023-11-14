package sheridan.gunscraft.network.packets;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkEvent;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.capability.CapabilityHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SyncPlayerDataPacket implements IPacket<SyncPlayerDataPacket>
{
    private int entityId;
    private List<CapabilityHandler.Pair<?>> entries;

    public SyncPlayerDataPacket() {}

    public SyncPlayerDataPacket(int entityId, List<CapabilityHandler.Pair<?>> entries)
    {
        this.entityId = entityId;
        this.entries = entries;
    }

    @Override
    public void encode(SyncPlayerDataPacket message, PacketBuffer buffer)
    {
        buffer.writeVarInt(message.entityId);
        buffer.writeVarInt(message.entries.size());
        message.entries.forEach(entry -> entry.write(buffer));
    }

    @Override
    public SyncPlayerDataPacket decode(PacketBuffer buffer)
    {
        int entityId = buffer.readVarInt();
        int size = buffer.readVarInt();
        List<CapabilityHandler.Pair<?>> entries = new ArrayList<>();
        for(int i = 0; i < size; i++)
        {
            entries.add(CapabilityHandler.Pair.read(buffer));
        }
        return new SyncPlayerDataPacket(entityId, entries);
    }

    @Override
    public void handle(SyncPlayerDataPacket message, Supplier<NetworkEvent.Context> supplier)
    {
        if(supplier.get().getDirection() == NetworkDirection.PLAY_TO_CLIENT)
        {
            supplier.get().enqueueWork(() -> ClientProxy.updatePlayerData(message.entityId, message.entries));
            supplier.get().setPacketHandled(true);
        }
    }
}
