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

    public static void renderAttachments(MatrixStack matrixStack, ItemCameraTransforms.TransformType transformType,
           int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft,
           long lastFireTime, boolean mainHand, int fireMode,ItemStack stack, IGenericGun gun) {
        CompoundNBT slots = checkAndGet(stack);
        if (slots != null) {
            for (String slotName : slots.keySet()) {
                CompoundNBT slot = slots.getCompound(slotName);
                if (!slot.getBoolean("empty")) {
                    int attachmentId = slot.getInt("attachment_id");
                    IAttachmentModel model = ClientProxy.attachmentModelMap.get(stack.getItem());
                    GunAttachmentSlot slotInGun = gun.getSlot(slotName);
                    IGenericAttachment attachment = AttachmentRegistry.get(attachmentId);
                    if (model != null && slotInGun != null && attachment != null) {
                        matrixStack.push();
                        slotInGun.applyTrans(matrixStack);
                        //do model render...
                        model.render(matrixStack, Minecraft.getInstance().getRenderTypeBuffers().getBufferSource().getBuffer( RenderType.getEntityCutoutNoCull(attachment.getTexture())),
                                transformType,packedLight, packedOverlay,
                                red, green, blue, alpha, bulletLeft, lastFireTime, mainHand, fireMode);
                        matrixStack.pop();
                    }
                }
            }
        }
    }

    public static GunAttachmentSlotEntry getEntry(String slotName, ItemStack stack, IGenericGun gun) {

        return null;
    }

    public static boolean set(String slotName, int attachmentId, ItemStack stack, IGenericGun gun) {
        GunAttachmentSlot slot = gun.getSlot(slotName);
        if (slot != null && slot.accept(attachmentId)) {
            CompoundNBT slots = checkAndGet(stack);
            if (slots != null && slots.contains(slotName)) {
                CompoundNBT slotNBT = slots.getCompound(slotName);
                if (attachmentId == GenericAttachment.NONE) {
                    if (!slotNBT.getBoolean("empty")) {
                        IGenericAttachment attachment = AttachmentRegistry.get(slotNBT.getInt("attachment_id"));
                        if(attachment != null) {
                            attachment.onOff(stack, gun);
                        }
                    }
                    slotNBT.putBoolean("empty", true);
                    slotNBT.putInt("attachment_id", attachmentId);
                } else {
                    if (slotNBT.getBoolean("empty")) {
                        IGenericAttachment attachment = AttachmentRegistry.get(attachmentId);
                        if (attachment != null) {
                            slotNBT.putBoolean("empty", false);
                            slotNBT.putInt("attachment_id", attachmentId);
                            attachment.onAttach(stack, gun);
                        }
                    }
                }
            }
        }
        return false;
    }

    private static CompoundNBT checkAndGet(ItemStack stack) {
        CompoundNBT nbt = stack.getTag();
        if (nbt != null && nbt.contains("attachments")) {
            return nbt.getCompound("attachments");
        }
        return null;
    }

    public static void renderAttachmentIcons(MatrixStack matrixStack, IGenericGun gun, GunAttachmentSlot selectSlot) {
        List<GunAttachmentSlot> slots = gun.getAllSlots();
        if (slots != null) {
            for (GunAttachmentSlot slot : slots) {
                if (slot != null) {
                    boolean selected = false;
                    if (selectSlot != null && slot == selectSlot) {
                        selected = true;
                    }
                    slot.renderIcon(matrixStack, selected, false);
                }
            }
        }
    }


}
