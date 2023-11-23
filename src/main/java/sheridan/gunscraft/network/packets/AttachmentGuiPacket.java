package sheridan.gunscraft.network.packets;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.NetworkHooks;
import sheridan.gunscraft.container.AttachmentContainer;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.function.Supplier;

public class AttachmentGuiPacket implements IPacket<AttachmentGuiPacket>{
    @Override
    public void encode(AttachmentGuiPacket message, PacketBuffer buffer) {

    }

    @Override
    public AttachmentGuiPacket decode(PacketBuffer buffer) {
        return new AttachmentGuiPacket();
    }

    @Override
    public void handle(AttachmentGuiPacket message, Supplier<NetworkEvent.Context> supplier) {
        supplier.get().enqueueWork(() -> {
            ServerPlayerEntity player = supplier.get().getSender();
            if (player != null) {
                //ServerPlayHandler.handleAttachments(player);
                ItemStack heldItem = player.getHeldItemMainhand();
                if (heldItem.getItem() instanceof IGenericGun) {
                    NetworkHooks.openGui(player, new SimpleNamedContainerProvider((windowId, playerInventory, player1) -> new AttachmentContainer(windowId, playerInventory, heldItem),
                            new TranslationTextComponent("container.gunscraft.attachments")));
                }
            }

        });
        supplier.get().setPacketHandled(true);
    }
}
