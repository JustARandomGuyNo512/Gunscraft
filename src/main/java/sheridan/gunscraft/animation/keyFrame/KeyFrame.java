package sheridan.gunscraft.animation.keyFrame;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;

public class KeyFrame {
    public Vector3f translate = new Vector3f(0,0,0);
    public Vector3f rotate = new Vector3f(0,0,0);
    public Vector3f scale = new Vector3f(1,1,1);

    public KeyFrame() {}

    public KeyFrame setTranslate(Vector3f translate) {
        this.translate = translate.copy();
        return this;
    }

    public KeyFrame setRotate(Vector3f rotate) {
        this.rotate = rotate.copy();
        return this;
    }
    public KeyFrame setScale(Vector3f scale) {
        this.scale = scale.copy();
        return this;
    }


    public static void doLinear(KeyFrame front, KeyFrame back, float localProgress, MatrixStack stackIn) {
        stackIn.translate(MathHelper.lerp(localProgress, front.translate.getX(), back.translate.getX()),
                MathHelper.lerp(localProgress, front.translate.getY(), back.translate.getY()),
                MathHelper.lerp(localProgress, front.translate.getZ(), back.translate.getZ()));

        stackIn.rotate(new Quaternion(MathHelper.lerp(localProgress, front.rotate.getX(), back.rotate.getX()),
                MathHelper.lerp(localProgress, front.rotate.getY(), back.rotate.getY()),
                MathHelper.lerp(localProgress, front.rotate.getZ(), back.rotate.getZ()), true));

        stackIn.scale(MathHelper.lerp(localProgress, front.scale.getX(), back.scale.getX()),
                MathHelper.lerp(localProgress, front.scale.getY(), back.scale.getY()),
                MathHelper.lerp(localProgress, front.scale.getZ(), back.scale.getZ()));
    }
}
