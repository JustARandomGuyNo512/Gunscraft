package sheridan.gunscraft.items.attachments.util;

import org.spongepowered.asm.mixin.injection.Inject;

public class GunAttachmentSlotEntry {
    public String name;
    public boolean empty;
    public Integer attachmentId;
    public GunAttachmentSlot slot;

    @Override
    public String toString() {
        return "GunAttachmentSlotEntry{" +
                "name='" + name + '\'' +
                ", empty=" + empty +
                ", attachmentId=" + attachmentId +
                ", slot=" + slot +
                '}';
    }
}
