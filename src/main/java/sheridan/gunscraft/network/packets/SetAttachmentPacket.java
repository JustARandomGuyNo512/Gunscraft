package sheridan.gunscraft.network.packets;

import net.minecraft.item.ItemStack;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import sheridan.gunscraft.items.attachments.util.NBTAttachmentsMap;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.function.Supplier;

public class SetAttachmentPacket implements IPacket<SetAttachmentPacket>{
    public int attachmentId;
    public String slotName;

    public SetAttachmentPacket() {
    }

    public SetAttachmentPacket(int attachmentId, String slotName) {
        this.attachmentId = attachmentId;
        this.slotName = slotName;
    }

    @Override
    public void encode(SetAttachmentPacket message, PacketBuffer buffer) {
        buffer.writeInt(message.attachmentId);
        buffer.writeString(message.slotName);
    }

    @Override
    public SetAttachmentPacket decode(PacketBuffer buffer) {
        SetAttachmentPacket packet = new SetAttachmentPacket();
        packet.attachmentId = buffer.readInt();
        packet.slotName = buffer.readString();
        return packet;
    }

    @Override
    public void handle(SetAttachmentPacket message, Supplier<NetworkEvent.Context> supplier) {
        supplier.get().enqueueWork(() -> {
            INetHandler handler = supplier.get().getNetworkManager().getNetHandler();
            if (handler instanceof ServerPlayNetHandler) {
                ItemStack stack = ((ServerPlayNetHandler) handler).player.getHeldItemMainhand();
                if (stack.getItem() instanceof IGenericGun) {
                    IGenericGun gun = (IGenericGun) stack.getItem();
                    NBTAttachmentsMap.set(message.slotName, message.attachmentId, stack, gun);
                }
            }
        });
    }
}
