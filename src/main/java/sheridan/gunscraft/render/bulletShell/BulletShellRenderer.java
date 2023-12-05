package sheridan.gunscraft.render.bulletShell;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.model.TransformationHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sheridan.gunscraft.animation.IAnimation;
import sheridan.gunscraft.animation.curve.Curve;
import sheridan.gunscraft.animation.curve.CurveAnimation;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class BulletShellRenderer {
    private static ModelBulletShell MODEL_BASIC = new ModelBulletShell();
    public static final int MAX_BULLET_MUN = 5;

    private static Deque<AnimationContext> animations = new LinkedList<>();
    private static PlayerEntity player;

    public static void push(MatrixStack matrixStack, float xSpeed, float ySpeed, float zSpeed, int rSpeed, float drop, float random, float length, String modelType, boolean mainHand) {
        float seed = (float) (random * Math.random());
        IAnimation animation = new CurveAnimation(new Curve[]{
                new Curve() {// x axis
                    @Override
                    public float getVal(float xVal) {
                        return - xVal * xSpeed * (1 + seed);
                    }
                }.setBound(0, 1),
                new Curve() {
                    @Override
                    public float getVal(float xVal) {
                        return (drop * xVal * xVal - xVal) * ySpeed;
                    }
                }.setBound(0, 1),
                new Curve() {// y axis
                    @Override
                    public float getVal(float xVal) {
                        return xVal * zSpeed;
                    }
                },
                new Curve() {
                    @Override
                    public float getVal(float xVal) {
                        return seed * 2.5f;
                    }
                },
                new Curve() {
                    @Override
                    public float getVal(float xVal) {
                        return xVal * 360 * rSpeed;
                }
             }.setBound(0, 1)
        }, length);
        AnimationContext context = new AnimationContext(matrixStack, System.currentTimeMillis(), animation, mainHand, modelType);
        if (animations.size() + 1 > MAX_BULLET_MUN) {
            animations.pollLast();
        }
        animations.offerFirst(context);
    }

    public static void play(int light, int overlay) {
        if (!animations.isEmpty()) {
            animations.removeIf(context -> context.handle(light, overlay));
        }
    }

    public static void clear() {
        animations.clear();
    }

    private static class AnimationContext {
        public long startTime;
        IAnimation animation;
        public MatrixStack matrixStack;
        boolean mainHand;
        public String modelType;

        public AnimationContext(MatrixStack matrixStack, long startTime, IAnimation animation, boolean mainHand, String modelType) {
            this.matrixStack = new MatrixStack();
            this.matrixStack.getLast().getMatrix().set(matrixStack.getLast().getMatrix());
            this.startTime = startTime;
            this.animation = animation;
            this.mainHand = mainHand;
            this.modelType = modelType;
        }

        public boolean handle(int light, int overlay) {
            matrixStack.push();
            animation.play(startTime, matrixStack, mainHand ? ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND : ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND);
            MODEL_BASIC.chooseToRender(matrixStack, light, overlay, modelType);
            matrixStack.pop();
            return animation.isCompleted();
        }
    }
}
