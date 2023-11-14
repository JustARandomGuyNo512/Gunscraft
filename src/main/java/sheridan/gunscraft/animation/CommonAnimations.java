package sheridan.gunscraft.animation;

import net.minecraft.client.renderer.model.ItemCameraTransforms;
import sheridan.gunscraft.animation.curve.Curve;
import sheridan.gunscraft.animation.curve.CurveAnimation;
import sheridan.gunscraft.animation.curve.ICurveAnimationProxy;

public class CommonAnimations {
    public static CurveAnimation createGenericRecoil(float recoilRotateUp, float recoilUp, float recoilBack, float recoilShake, float seconds, float trimY, float trimZ) {
        CurveAnimation animation = new CurveAnimation(new Curve[]{
                null, null, new Curve() {
                    @Override
                    public float getVal(float xVal) {
                        return (float) (Math.sin(xVal) * (recoilBack / (xVal * xVal  + 1)));
                    }
                }.setBound(0f, (float) Math.PI),

                new Curve() {
                    @Override
                    public float getVal(float xVal) {
                        float val = (float) -(Math.sin(xVal) * ( recoilRotateUp / (xVal * xVal  + 1)));
                        if (val < 0) {
                            val *= 1f;
                        }
                        return  val;
                    }
                }.setBound(0f, (float) Math.PI * 3f)

        }, seconds);
        // Trim animation parameters...
        animation.animationProxy = (animationIn, transformType) -> {
            animationIn.tempTY = animationIn.tempRX * (recoilUp + trimY);
            animationIn.tempTZ -= animationIn.tempRX * trimZ;
        };
        return animation;
    }

    public static CurveAnimation createSingleAxisBlotBack(float length, float blotBack) {
        CurveAnimation animation = new CurveAnimation(new Curve[]{
                null, null, new Curve() {
            @Override
            public float getVal(float xVal) {
                return (float) (Math.sin(xVal) * (blotBack / (xVal * xVal  + 1)));
            }
        }.setBound(0f, (float) Math.PI),
        }, length);
        return animation;
    }

}
