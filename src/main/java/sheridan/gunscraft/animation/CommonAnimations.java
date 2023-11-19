package sheridan.gunscraft.animation;

import net.minecraft.client.renderer.model.ItemCameraTransforms;
import sheridan.gunscraft.animation.curve.Curve;
import sheridan.gunscraft.animation.curve.CurveAnimation;
import sheridan.gunscraft.animation.curve.ICurveAnimationProxy;

public class CommonAnimations {
    public static CurveAnimation createSingleAxisBlotBack(float length, float blotBack) {
        return new CurveAnimation(new Curve[]{
                null, null, new Curve() {
            @Override
            public float getVal(float xVal) {
                return (float) (Math.sin(xVal) * (blotBack / (xVal * xVal  + 1)));
            }
        }.setBound(0f, (float) Math.PI),
        }, length);
    }

}
