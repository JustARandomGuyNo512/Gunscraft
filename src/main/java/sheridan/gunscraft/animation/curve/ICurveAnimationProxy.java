package sheridan.gunscraft.animation.curve;

import net.minecraft.client.renderer.model.ItemCameraTransforms;

public interface ICurveAnimationProxy {
    void beforeApplyTransform(CurveAnimation animation, ItemCameraTransforms.TransformType transforms);
}
