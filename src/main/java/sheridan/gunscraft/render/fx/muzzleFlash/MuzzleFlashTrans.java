package sheridan.gunscraft.render.fx.muzzleFlash;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.vector.Quaternion;

public class MuzzleFlashTrans {
    public float[] translate = new float[]{0,0,0};
    public float[] scale = new float[]{1,1,1};
    public float[] rotate = new float[]{0,0,0};

    public MuzzleFlashTrans setTranslate(float[] translate) {
        this.translate = translate;
        return this;
    }

    public MuzzleFlashTrans setScale(float[] scale) {
        this.scale = scale;
        return this;
    }

    public MuzzleFlashTrans setRotate(float[] rotate) {
        this.rotate = rotate;
        return this;
    }

    public void applyTrans(MatrixStack stack) {
        stack.translate(translate[0], translate[1], translate[2]);
        stack.scale(scale[0], scale[1], scale[2]);
        stack.rotate(new Quaternion(rotate[0], rotate[1], rotate[2], true));
    }
}
