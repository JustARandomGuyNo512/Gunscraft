package sheridan.gunscraft.network.packets;

import net.minecraft.item.ItemStack;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.function.Supplier;

public class GunFirePacket implements IPacket<GunFirePacket> {
    public boolean mainHand;
    public float spread;

    public GunFirePacket() {}

    public GunFirePacket(boolean mainHand, float spread) {
        this.mainHand = mainHand;
        this.spread = spread;
    }

    @Override
    public void encode(GunFirePacket message, PacketBuffer buffer) {
        buffer.writeBoolean(message.mainHand);
        buffer.writeFloat(message.spread);
    }

    @Override
    public GunFirePacket decode(PacketBuffer buffer) {
        GunFirePacket packet = new GunFirePacket();
        packet.mainHand = buffer.readBoolean();
        packet.spread = buffer.readFloat();
        return packet;
    }

    @Override
    public void handle(GunFirePacket message, Supplier<NetworkEvent.Context> supplier) {
        supplier.get().enqueueWork(() -> {
            INetHandler handler = supplier.get().getNetworkManager().getNetHandler();
            if (handler instanceof ServerPlayNetHandler) {
                boolean mainHand = message.mainHand;
                ItemStack heldStack;
                heldStack = mainHand ? ((ServerPlayNetHandler) handler).player.getHeldItemMainhand() : ((ServerPlayNetHandler) handler).player.getHeldItemOffhand();
                IGenericGun gun = (IGenericGun) heldStack.getItem();
                gun.shoot(heldStack, ((ServerPlayNetHandler) handler).player, mainHand, message.spread);
            }
        });
    }
}
