package sheridan.gunscraft.animation.curve;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.util.math.vector.Quaternion;
import sheridan.gunscraft.animation.IAnimation;

public class CurveAnimation implements IAnimation {
    private float progress;
    public float length;
    public float timer;
    public boolean completed;

    public Curve[] curves;
    public float tempTX, tempTY,tempTZ, tempRX, tempRY, tempRZ, tempSX, tempSY, tempSZ;
    public ICurveAnimationProxy animationProxy;

    public CurveAnimation(Curve[] ICurves, float length) {
        this.curves = ICurves;
        this.length = length;
    }

    @Override
    public void play(float delta, MatrixStack matrixStackIn, ItemCameraTransforms.TransformType transformType) {
        update(delta);
        if (!completed) {
            computing(matrixStackIn, transformType);
        }
    }

    @Override
    public void play(long beginTime, MatrixStack matrixStackIn, ItemCameraTransforms.TransformType transformType) {
        long dis = System.currentTimeMillis() - beginTime;
        float delta = (float) dis / 1000f;
        reset();
        update(delta);
        if (!completed) {
            computing(matrixStackIn, transformType);
        }
    }

    private void update(float delta) {
        timer += delta;
        progress = timer / length;
        completed = false;
        if (progress >= 1) {
            progress = 0;
            timer = 0;
            completed = true;
        }
    }

    private void computing(MatrixStack matrixStack, ItemCameraTransforms.TransformType transformType) {

        tempTX = curves.length > 0 && curves[0] != null ? curves[0].play(progress) : 0;
        tempTY = curves.length > 1 && curves[1] != null ? curves[1].play(progress) : 0;
        tempTZ = curves.length > 2 && curves[2] != null ? curves[2].play(progress) : 0;

        tempRX = curves.length > 3 && curves[3] != null ? curves[3].play(progress) : 0;
        tempRY = curves.length > 4 && curves[4] != null ? curves[4].play(progress) : 0;
        tempRZ = curves.length > 5 && curves[5] != null ? curves[5].play(progress) : 0;

        tempSX = curves.length > 6 && curves[6] != null ? curves[6].play(progress) : 1;
        tempSY = curves.length > 7 && curves[7] != null ? curves[7].play(progress) : 1;
        tempSZ = curves.length > 8 && curves[8] != null ? curves[8].play(progress) : 1;

        if (animationProxy != null) {
            animationProxy.beforeApplyTransform(this, transformType);
        }
        applyTransform(matrixStack);
    }

    private void applyTransform(MatrixStack matrixStack) {
        if (tempTX != 0 || tempTY != 0 || tempTZ != 0) {
            matrixStack.translate(tempTX, tempTY, tempTZ);
        }

        if (tempRX != 0 || tempRY != 0 || tempRZ != 0) {
            matrixStack.rotate(new Quaternion(tempRX, tempRY, tempRZ, true));
        }

        if (tempSX != 1 || tempSY != 1 || tempSZ != 1) {
            matrixStack.scale(tempSX, tempSY, tempSZ);
        }
    }

    @Override
    public float getProgress() {
        return progress;
    }

    @Override
    public void setProgress(float progress) {
        this.progress = progress;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public void reset() {
        completed = false;
        progress = 0f;
        timer = 0f;
    }

}
