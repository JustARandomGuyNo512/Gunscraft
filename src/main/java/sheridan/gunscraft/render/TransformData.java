package sheridan.gunscraft.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationData;
import sheridan.gunscraft.render.fx.muzzleFlash.MuzzleFlashTrans;

import java.util.HashMap;
import java.util.Map;

public class TransformData {
    public static final float BASE_SIZE = 0.09f;
    public static final float BASE_ARM_SIZE = 6f;
    public static final int RIGHT_SIDE_RIGHT_HAND = 0, RIGHT_SIDE_LEFT_HAND = 1, LEFT_SIDE = 2;

    public float[][][] FPTrans;
    public float[][][] TPTrans;
    public float[][] GUITrans;
    public float[][] FrameTrans;
    public float[][] GroundTrans;
    public float[][][] FPHandPoseTrans;
    public float[] aimingTrans;
    public MuzzleFlashFransEntry muzzleFlashTransEntry = new MuzzleFlashFransEntry();
    public RecoilAnimationData recoilAnimationData;

    public TransformData setRecoilAnimationData(RecoilAnimationData recoilAnimationData) {
        this.recoilAnimationData = recoilAnimationData;
        return this;
    }

    public RecoilAnimationData getRecoilAnimationData() {
        return recoilAnimationData;
    }

    public TransformData registerMuzzleFlash(String name, TransPair pair) {
        this.muzzleFlashTransEntry.register(name, pair);
        return this;
    }

    public TransformData setAimingTrans(float[] trans) {
        this.aimingTrans = trans;
        return this;
    }

    public MuzzleFlashTrans getMuzzleFlashTrans(String name) {
        return muzzleFlashTransEntry.getTrans(name);
    }

    public String getMuzzleFlashName(String name) {
        return muzzleFlashTransEntry.getName(name);
    }

    public TransformData() {
        FPTrans = new float[][][] {
            {// right hand | translate,rotate,scale
                {0,0,0}, {0,0,0}, {BASE_SIZE,BASE_SIZE,BASE_SIZE}
            }, {// left hand | translate,rotate,scale
                {0,0,0}, {0,0,0}, {BASE_SIZE,BASE_SIZE,BASE_SIZE}}};
        TPTrans = new float[][][] {
            {// right hand | translate,rotate,scale
                {0,0,0}, {0,0,0}, {BASE_SIZE,BASE_SIZE,BASE_SIZE}
            }, {// left hand | translate,rotate,scale
                {0,0,0}, {0,0,0}, {BASE_SIZE,BASE_SIZE,BASE_SIZE}}};
        GUITrans = new float[][] {{0, 0, 0},{0, 0, 0},{BASE_SIZE, BASE_SIZE, BASE_SIZE}};
        FrameTrans = new float[][] {{0, 0, 0},{0, 0, 0},{BASE_SIZE, BASE_SIZE, BASE_SIZE}};
        GroundTrans = new float[][] {{0, 0, 0},{0, 0, 0},{BASE_SIZE, BASE_SIZE, BASE_SIZE}};
        FPHandPoseTrans = new float[][][] {
                {// right side right hand trans
                    {0, 0, 0},{0, 0, 0},{BASE_ARM_SIZE, BASE_ARM_SIZE, BASE_ARM_SIZE}
                }, {// right side left hand trans
                    {0, 0, 0},{0, 0, 0},{BASE_ARM_SIZE, BASE_ARM_SIZE, BASE_ARM_SIZE}
                }, {//left side left hand trans
                    {0, 0, 0},{0, 0, 0},{BASE_ARM_SIZE, BASE_ARM_SIZE, BASE_ARM_SIZE}}};
    }

    public TransformData setFPRightHand(float[][] trans) {
        FPTrans[0] = trans;
        return this;
    }

    public TransformData setFPLeftHand(float[][] trans) {
        FPTrans[1] = trans;
        return this;
    }

    public TransformData setTPRightHand(float[][] trans) {
        TPTrans[0] = trans;
        return this;
    }

    public TransformData setTPLeftHand(float[][] trans) {
        TPTrans[1] = trans;
        return this;
    }

    public TransformData setGUITrans(float[][] trans) {
        GUITrans = trans;
        return this;
    }

    public TransformData setFrameTrans(float[][] trans) {
        FrameTrans = trans;
        return this;
    }

    public TransformData setGroundTrans(float[][] trans) {
        GroundTrans = trans;
        return this;
    }

    public TransformData setHandPoseRightSideRightHand(float[][] trans) {
        FPHandPoseTrans[0] = trans;
        return this;
    }

    public TransformData setHandPoseRightSideLeftHand(float[][] trans) {
        FPHandPoseTrans[1] = trans;
        return this;
    }

    public TransformData setHandPoseLeftSide(float[][] trans) {
        FPHandPoseTrans[2] = trans;
        return this;
    }



    public void applyFPArmPoseTransform(int type, MatrixStack stackIn, boolean isSlim, ModelRenderer armModel, boolean mainHand) {
        clear(armModel, mainHand);
        armModel.rotateAngleX = -90;
        stackIn.scale(BASE_ARM_SIZE, BASE_ARM_SIZE, BASE_ARM_SIZE);
        float armWidth = isSlim ? -0.018f : 0f;
        float armLength = isSlim ? 0.0625f : 0f;
        switch (type) {
            case RIGHT_SIDE_RIGHT_HAND:
                stackIn.translate(FPHandPoseTrans[0][0][0] + armWidth, FPHandPoseTrans[0][0][1], FPHandPoseTrans[0][0][2]);
                armModel.rotateAngleX = FPHandPoseTrans[0][1][0];
                armModel.rotateAngleY = FPHandPoseTrans[0][1][1];
                armModel.rotateAngleZ = FPHandPoseTrans[0][1][2];
                stackIn.scale(FPHandPoseTrans[0][2][0], FPHandPoseTrans[0][2][1] , FPHandPoseTrans[0][2][2] * 1.5f);
                break;
            case RIGHT_SIDE_LEFT_HAND:
                stackIn.translate(FPHandPoseTrans[1][0][0], FPHandPoseTrans[1][0][1], FPHandPoseTrans[1][0][2] + armLength);
                armModel.rotateAngleX = FPHandPoseTrans[1][1][0];
                armModel.rotateAngleY = FPHandPoseTrans[1][1][1];
                armModel.rotateAngleZ = FPHandPoseTrans[1][1][2];
                stackIn.scale(FPHandPoseTrans[1][2][0], FPHandPoseTrans[1][2][1] , FPHandPoseTrans[1][2][2] * 1.5f);
                break;
            case LEFT_SIDE:
                stackIn.translate(FPHandPoseTrans[2][0][0] - armWidth, FPHandPoseTrans[2][0][1], FPHandPoseTrans[2][0][2]);
                armModel.rotateAngleX = FPHandPoseTrans[2][1][0];
                armModel.rotateAngleY = FPHandPoseTrans[2][1][1];
                armModel.rotateAngleZ = FPHandPoseTrans[2][1][2];
                stackIn.scale(FPHandPoseTrans[2][2][0], FPHandPoseTrans[2][2][1] , FPHandPoseTrans[2][2][2] * 1.5f);
                break;
        }
    }

    private void clear(ModelRenderer model, boolean mainHand) {
        model.rotateAngleZ = 0;
        model.rotateAngleX = 0;
        model.rotateAngleY = 0;
        model.rotationPointY = 2.0f;
        model.rotationPointX = mainHand ? -5f : 5f;
        model.rotationPointZ = 0.0f;
        model.showModel = true;
    }

    public void applyTransform(ItemCameraTransforms.TransformType type, MatrixStack stackIn, boolean transAiming, float aimingProgress) {
        stackIn.scale(BASE_SIZE,BASE_SIZE,BASE_SIZE);
        stackIn.rotate(Vector3f.ZP.rotationDegrees(180f));
        switch (type) {
            case FIRST_PERSON_RIGHT_HAND:
                if (transAiming) {
                    aimingProgress = aimingProgress > 1 ? 1 : aimingProgress;
                    stackIn.translate(FPTrans[0][0][0] + aimingTrans[0] * aimingProgress + ClientProxy.debugX,
                            FPTrans[0][0][1] + aimingTrans[1] * aimingProgress + ClientProxy.debugY,
                            FPTrans[0][0][2] + aimingTrans[2] * aimingProgress  + ClientProxy.debugZ);
                } else {
                    stackIn.translate(FPTrans[0][0][0] + ClientProxy.debugX, FPTrans[0][0][1] + ClientProxy.debugY, FPTrans[0][0][2] + ClientProxy.debugZ);
                }
                stackIn.rotate(new Quaternion(FPTrans[0][1][0], FPTrans[0][1][1], FPTrans[0][1][2], true));
                stackIn.scale(FPTrans[0][2][0], FPTrans[0][2][1], FPTrans[0][2][2]);
                break;
            case FIRST_PERSON_LEFT_HAND:
                stackIn.translate(FPTrans[1][0][0], FPTrans[1][0][1], FPTrans[1][0][2]);
                stackIn.rotate(new Quaternion(FPTrans[1][1][0], FPTrans[1][1][1], FPTrans[1][1][2], true));
                stackIn.scale(FPTrans[1][2][0], FPTrans[1][2][1], FPTrans[1][2][2]);
                break;
            case THIRD_PERSON_RIGHT_HAND:
                stackIn.translate(TPTrans[0][0][0], TPTrans[0][0][1], TPTrans[0][0][2]);
                stackIn.rotate(new Quaternion(TPTrans[0][1][0], TPTrans[0][1][1], TPTrans[0][1][2], true));
                stackIn.scale(TPTrans[0][2][0], TPTrans[0][2][1], TPTrans[0][2][2]);
                break;
            case THIRD_PERSON_LEFT_HAND:
                stackIn.translate(TPTrans[1][0][0], TPTrans[1][0][1], TPTrans[1][0][2]);
                stackIn.rotate(new Quaternion(TPTrans[1][1][0], TPTrans[1][1][1], TPTrans[1][1][2], true));
                stackIn.scale(TPTrans[1][2][0], TPTrans[1][2][1], TPTrans[1][2][2]);
                break;
            case GUI:
                stackIn.translate(GUITrans[0][0], GUITrans[0][1], GUITrans[0][2]);
                stackIn.rotate(new Quaternion(GUITrans[1][0], GUITrans[1][1], GUITrans[1][2], true));
                stackIn.scale(GUITrans[2][0], GUITrans[2][1], GUITrans[2][2]);
                break;
            case GROUND:
                stackIn.translate(GroundTrans[0][0], GroundTrans[0][1], GroundTrans[0][2]);
                stackIn.rotate(new Quaternion(GroundTrans[1][0], GroundTrans[1][1], GroundTrans[1][2], true));
                stackIn.scale(GroundTrans[2][0], GroundTrans[2][1], GroundTrans[2][2]);
                break;
            case FIXED:
                stackIn.translate(FrameTrans[0][0], FrameTrans[0][1], FrameTrans[0][2]);
                stackIn.rotate(new Quaternion(FrameTrans[1][0], FrameTrans[1][1], FrameTrans[1][2], true));
                stackIn.scale(FrameTrans[2][0], FrameTrans[2][1], FrameTrans[2][2]);
                break;
        }
    }

    public static class MuzzleFlashFransEntry {
        private Map<String, TransPair> transMap = new HashMap<>();

        public MuzzleFlashFransEntry register(String key, TransPair trans) {
            if (!transMap.containsKey(key)) {
                transMap.put(key, trans);
            }
            return MuzzleFlashFransEntry.this;
        }

        public MuzzleFlashTrans getTrans(String key) {
            if (!transMap.containsKey(key)) {
                return null;
            }
            return transMap.get(key).trans;
        }

        public String getName(String key) {
            if (!transMap.containsKey(key)) {
                return null;
            }
            return transMap.get(key).name;
        }
    }

    public static class TransPair {
        public MuzzleFlashTrans trans;
        public String name;

        public TransPair setTrans(MuzzleFlashTrans trans) {
            this.trans = trans;
            return TransPair.this;
        }

        public TransPair setName(String name) {
            this.name = name;
            return TransPair.this;
        }
    }
}
