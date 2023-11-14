package sheridan.gunscraft.animation.keyFrame;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import sheridan.gunscraft.animation.IAnimation;

import java.util.ArrayList;

public class FrameAnimation implements IAnimation {
    private float progress;
    public float length;
    public ArrayList<KeyFrame> keyFrames;
    private float intervalLen;

    public FrameAnimation(float length) {
        this.keyFrames = new ArrayList<>();
        this.length = length;
    }

    public void addKeyFrame(KeyFrame frame) {
        this.keyFrames.add(frame);
        if (keyFrames.size() > 1) {
            intervalLen = length / ((float) keyFrames.size() - 1.0f);
        }
    }

    @Override
    public void play(float delta, MatrixStack matrixStackIn, ItemCameraTransforms.TransformType transformType) {
        this.progress += delta;
    }

    @Override
    public void play(long beginTime, MatrixStack matrixStackIn, ItemCameraTransforms.TransformType transformType) {

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
        return false;
    }

    @Override
    public void reset() {

    }
}
