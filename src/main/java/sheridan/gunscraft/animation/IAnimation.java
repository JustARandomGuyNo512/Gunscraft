package sheridan.gunscraft.animation;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.model.ItemCameraTransforms;

public interface IAnimation {
    void play(float delta, MatrixStack matrixStackIn, ItemCameraTransforms.TransformType transformType);
    void play(long beginTime, MatrixStack matrixStackIn, ItemCameraTransforms.TransformType transformType);
    float getProgress();
    void setProgress(float progress);
    boolean isCompleted();
    void reset();
}
