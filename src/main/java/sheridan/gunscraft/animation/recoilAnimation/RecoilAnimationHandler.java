package sheridan.gunscraft.animation.recoilAnimation;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.items.guns.IGenericGun;

public class RecoilAnimationHandler {
    public static RecoilAnimationState stateMain;
    public static RecoilAnimationState stateOff;

    static {
        stateMain = new RecoilAnimationState();
        stateMain.isMainHand = true;

        stateOff = new RecoilAnimationState();
        stateOff.isMainHand = true;

        stateMain.proxy = new IRecoilAnimationProxy() {
            @Override
            public void afterShoot(long lastFireTime, RecoilAnimationData data, RecoilAnimationState state) {
                if (ClientProxy.mainHandStatus.aiming) {
                    if (ClientProxy.mainHandStatus.isPistol) {
                        float back = state.getMoveBackSpeed() * 0.7f;
                        state.setMoveBackSpeed(Math.min(0.5f, back));
                        return;
                    }
                    float rotateUp = state.getRotateUpSpeed() * 0.25f;
                    float rx = state.getRandomRXSpeed() * 0.25f;
                    float ry = state.getRandomRYSpeed() * 0.25f;
                    float back = state.getMoveBackSpeed() * 0.65f;
                    float moveUp = state.getMoveUpSpeed() * 0.15f;
                    state.setRotateUpSpeed(Math.min(0.18f, rotateUp));
                    state.setRandomRXSpeed(Math.min(rx, 0.15f));
                    state.setRandomRYSpeed(Math.min(ry, 0.15f));
                    state.setMoveBackSpeed(Math.min(0.38f, back));
                    state.setMoveUpSpeed(Math.min(0.0275f, moveUp));
                }
            }
        };
    }

    public static void update(RecoilAnimationData data, MatrixStack matrixStack, boolean isMainHand) {
        if (isMainHand) {
            stateMain.update(data, matrixStack);

        } else {
            stateOff.update(data, matrixStack);
        }
    }

    public static void onShoot(long lastFireTime, RecoilAnimationData data, boolean isMainHand, int direction) {
        if (isMainHand) {
            stateMain.onShoot(lastFireTime, data, direction);
        } else {
            stateOff.onShoot(lastFireTime, data, direction);
        }
    }

    public static void clearAll() {
        clear(true);
        clear(false);
    }

    public static void clear(boolean isMainHand) {
        if (isMainHand) {
            stateMain.clearAndDisable();
        } else {
            stateOff.clearAndDisable();
        }
    }

    public static boolean getIsEnable(boolean isMainHand) {
        return isMainHand ? stateMain.enable : stateOff.enable;
    }

    public static void checkShouldClear(ItemStack stack, LivingEntity entityIn, boolean isMainHand) {
        if (entityIn instanceof PlayerEntity && entityIn.getEntityId() == ClientProxy.clientPlayerId) {
            if (stack.getItem() instanceof IGenericGun) {
                RecoilAnimationState state = isMainHand ? stateMain : stateOff;
                if (state.data != ClientProxy.transformDataMap.get(stack.getItem()).recoilAnimationData) {
                    clear(isMainHand);
                }
            } else {
                clear(isMainHand);
            }
        }

    }
}
