package sheridan.gunscraft.container;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.CreativeCraftingListener;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import sheridan.gunscraft.items.guns.IGenericGun;

import javax.annotation.Nullable;

public class AttachmentContainer extends Container {
    public IInventory playerInventory;
    public IInventory attachmentInventory;
    public ItemStack heldStack;

    public AttachmentContainer(int windowId, PlayerInventory playerInventory, ItemStack heldStack) {
        this(windowId, playerInventory);
        this.playerInventory = playerInventory;
        this.heldStack = heldStack;

    }

    public AttachmentContainer(int windowId, PlayerInventory playerInventory) {
        super(ModContainers.ATTACHMENTS.get(), windowId);
        this.playerInventory = playerInventory;
        this.attachmentInventory = new Inventory(1) {
            public void markDirty() {
                super.markDirty();
                AttachmentContainer.this.detectAndSendChanges();
            }
        };
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, (i + 1) * 9 + j, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }

        this.addSlot(new Slot(attachmentInventory, 0, 152, 63));

    }


    @Override
    public void putStackInSlot(int slotID, ItemStack stack) {
        super.putStackInSlot(slotID, stack);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        ItemStack stack = playerIn.getHeldItemMainhand();
        return stack.getItem() instanceof IGenericGun;
    }
}
