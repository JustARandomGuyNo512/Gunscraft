package sheridan.gunscraft.network.packets;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import sheridan.gunscraft.container.AttachmentContainer;
import sheridan.gunscraft.items.attachments.GenericAttachment;
import sheridan.gunscraft.items.attachments.util.NBTAttachmentsMap;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.screen.AttachmentScreen;

import java.util.function.Supplier;

import static sheridan.gunscraft.items.attachments.GenericAttachment.NONE;

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
                    ServerPlayerEntity player = ((ServerPlayNetHandler) handler).player;
                    if (player.openContainer instanceof AttachmentContainer && message.attachmentId == NONE) {
                        AttachmentContainer container = (AttachmentContainer) player.openContainer;
                        container.attachmentInventory.setInventorySlotContents(0, ItemStack.EMPTY);
                        container.attachmentInventory.markDirty();
                    }
                }
            }
        });
    }
}
