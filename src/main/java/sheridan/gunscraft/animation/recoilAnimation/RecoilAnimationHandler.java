package sheridan.gunscraft.animation.recoilAnimation;

import com.mojang.blaze3d.matrix.MatrixStack;
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
    }

    public static void update(RecoilAnimationData data, MatrixStack matrixStack, boolean isMainHand) {
        if (isMainHand) {
            stateMain.update(data, matrixStack);
        } else {
            stateOff.update(data, matrixStack);
        }
    }

    public static void onShoot(long lastFireTime, RecoilAnimationData data, boolean isMainHand) {
        if (isMainHand) {
            stateMain.onShoot(lastFireTime, data);
        } else {
            stateOff.onShoot(lastFireTime, data);
        }
    }

    public static void clearAll() {
        clear(true);
        clear(false);
    }

    public static void clear(boolean isMainHand) {
        if (isMainHand) {
            stateMain.clear();
            stateMain.enable = false;
        } else {
            stateOff.clear();
            stateOff.enable = false;
        }
    }

    public static boolean getIsEnable(boolean isMainHand) {
        return isMainHand ? stateMain.enable : stateOff.enable;
    }

    public static void checkShouldClear(ItemStack stack, boolean isMainHand) {
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
