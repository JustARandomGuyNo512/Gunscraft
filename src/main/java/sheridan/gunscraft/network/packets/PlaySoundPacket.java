package sheridan.gunscraft.network.packets;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class PlaySoundPacket implements IPacket<PlaySoundPacket>{
    @Override
    public void encode(PlaySoundPacket message, PacketBuffer buffer) {

    }

    @Override
    public PlaySoundPacket decode(PacketBuffer buffer) {
        return null;
    }

    @Override
    public void handle(PlaySoundPacket message, Supplier<NetworkEvent.Context> supplier) {

    }
}
