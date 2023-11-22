package sheridan.gunscraft.items.attachments.util;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.vector.Quaternion;

import java.util.Set;

public class Slot {
    public String name;
    public Set<Integer> acceptAttachments;
    public float[][] trans;

    public boolean accept(int id) {
        return acceptAttachments.contains(id);
    }

    public Slot(String name, Set<Integer> acceptAttachments) {
        this.name = name;
        this.acceptAttachments = acceptAttachments;
    }

    public Slot setTrans(float[][] trans) {
        this.trans = trans;
        return this;
    }

    public void applyTrans(MatrixStack matrixStack) {
        matrixStack.translate(trans[0][0], trans[0][1], trans[0][2]);
        matrixStack.rotate(new Quaternion(trans[1][0], trans[1][1], trans[1][2], true));
        matrixStack.scale(trans[2][0], trans[2][1], trans[2][2]);
    }
}
