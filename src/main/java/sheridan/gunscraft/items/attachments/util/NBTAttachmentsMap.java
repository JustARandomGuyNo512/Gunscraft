package sheridan.gunscraft.items.attachments.util;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.*;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.items.attachments.AttachmentRegistry;
import sheridan.gunscraft.items.attachments.GenericAttachment;
import sheridan.gunscraft.items.attachments.IGenericAttachment;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IAttachmentModel;

import java.util.List;

public class NBTAttachmentsMap{
    private static CompoundNBT createEmptySlot(String slotName) {
        CompoundNBT slot = new CompoundNBT();
        slot.putString("slot_name", slotName);
        slot.putBoolean("empty", true);
        slot.putInt("attachment_id", GenericAttachment.NONE);
        return slot;
    }

    public static void init(List<GunAttachmentSlot> slots, ItemStack stack, boolean reset) {
        CompoundNBT stackNBT = stack.getTag();
        if (stackNBT == null) {
            System.out.println("nbt not init...");
            return;
        }
        if (stackNBT.contains("attachments")) {
            if (!reset) {
                System.out.println("attachment slots have been created...");
                return;
            }
            stackNBT.remove("attachments");
        }
        CompoundNBT slotsNBT = new CompoundNBT();
        for (GunAttachmentSlot slot : slots) {
            slotsNBT.put(slot.name, createEmptySlot(slot.name));
        }
        stackNBT.put("attachments", slotsNBT);
    }



    public static GunRenderContext renderAttachments(MatrixStack matrixStack, ItemCameraTransforms.TransformType transformType,
           int packedLight, int packedOverlay, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode,ItemStack stack, IGenericGun gun) {
        CompoundNBT slots = checkAndGet(stack);
        GunRenderContext params = new GunRenderContext();
        if (slots != null) {
            for (String slotName : slots.keySet()) {
                CompoundNBT slot = slots.getCompound(slotName);
                if (!slot.getBoolean("empty")) {
                    int attachmentId = slot.getInt("attachment_id");
                    IAttachmentModel model = AttachmentRegistry.getModel(attachmentId);
                    GunAttachmentSlot slotInGun = gun.getSlot(slotName);
                    IGenericAttachment attachment = AttachmentRegistry.get(attachmentId);
                    if (model != null && slotInGun != null && attachment != null) {
                        attachment.handleParams(params);
                        matrixStack.push();
                        slotInGun.applyTrans(matrixStack);
                        model.render(matrixStack, transformType, packedLight, packedOverlay, bulletLeft, lastFireTime, mainHand, fireMode, gun);
                        matrixStack.pop();
                    }
                }
            }
        }
        return params;
    }

    public static GunAttachmentSlotEntry getEntry(String slotName, ItemStack stack, IGenericGun gun) {
        GunAttachmentSlot slot = gun.getSlot(slotName);
        if (slot != null) {
            CompoundNBT nbt = checkAndGet(stack);
            if (nbt != null) {
                CompoundNBT slotNBT = nbt.getCompound(slotName);
                GunAttachmentSlotEntry entry = new GunAttachmentSlotEntry();
                entry.empty = slotNBT.getBoolean("empty");
                entry.attachmentId = slotNBT.getInt("attachment_id");
                entry.slot = slot;
                return entry;
            }
        }
        return null;
    }

    public static boolean isSlotOccupied() {return false;}

    public static IGenericAttachment set(String slotName, int attachmentId, ItemStack stack, IGenericGun gun) {
        GunAttachmentSlot slot = gun.getSlot(slotName);
        System.out.println(slot + " " + " " + attachmentId + " " + slotName);
        if (slot != null && (slot.accept(attachmentId) || attachmentId == GenericAttachment.NONE)) {
            System.out.println("aaa");
            CompoundNBT slots = checkAndGet(stack);
            if (slots != null && slots.contains(slotName)) {
                CompoundNBT slotNBT = slots.getCompound(slotName);
                if (attachmentId == GenericAttachment.NONE) {
                    IGenericAttachment returnVal = null;
                    if (!slotNBT.getBoolean("empty")) {
                        IGenericAttachment attachment = AttachmentRegistry.get(slotNBT.getInt("attachment_id"));
                        if(attachment != null) {
                            attachment.onOff(stack, gun);
                            returnVal = attachment;
                        }
                    }
                    slotNBT.putBoolean("empty", true);
                    slotNBT.putInt("attachment_id", attachmentId);
                    return returnVal;
                } else {
                    System.out.println("bbb");
                    if (slotNBT.getBoolean("empty")) {
                        System.out.println("ccc");
                        IGenericAttachment attachment = AttachmentRegistry.get(attachmentId);
                        if (attachment != null) {
                            System.out.println("ddd");
                            slotNBT.putBoolean("empty", false);
                            slotNBT.putInt("attachment_id", attachmentId);
                            attachment.onAttach(stack, gun);
                            return attachment;
                        }
                    }
                }
            }
        }
        return null;
    }

    private static CompoundNBT checkAndGet(ItemStack stack) {
        CompoundNBT nbt = stack.getTag();
        if (nbt != null && nbt.contains("attachments")) {
            return nbt.getCompound("attachments");
        }
        return null;
    }

    public static void renderAttachmentIcons(MatrixStack matrixStack, IGenericGun gun, GunAttachmentSlot selectSlot, ItemStack stack) {
        List<GunAttachmentSlot> slots = gun.getAllSlots();
        if (slots != null) {
            for (GunAttachmentSlot slot : slots) {
                if (slot != null) {
                    GunAttachmentSlotEntry entry = NBTAttachmentsMap.getEntry(slot.name, stack, gun);
                    boolean selected = selectSlot != null && slot == selectSlot;
                    boolean occupied = entry != null && !entry.empty;
                    slot.renderIcon(matrixStack, selected, occupied);
                }
            }
        }
    }


}
