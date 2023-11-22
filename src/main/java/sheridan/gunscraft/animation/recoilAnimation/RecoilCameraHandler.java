package sheridan.gunscraft.animation.recoilAnimation;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import sheridan.gunscraft.ClientProxy;

import java.util.concurrent.atomic.AtomicBoolean;

public class RecoilCameraHandler {
    private PlayerEntity player;
    private final float MIN_SPEED = 0.25f;
    private final float TIME_FACTOR = 2.463f;
    public float upSpeed;
    public float randomSpeed;
    public float speedDec = 1f;
    public AtomicBoolean inModify = new AtomicBoolean(false);
    private boolean enable;

    private float tempUpDec = 0f;
    private float tempRandomDec = 0f;

    public void handle(float timeDis) {
        if (player != null && player.getEntityId() == ClientProxy.clientPlayerId && enable) {
            timeDis *= 2.463f;
            player.rotationPitch -= upSpeed * timeDis;
            player.rotationYaw += randomSpeed * timeDis;
            upSpeed -= tempUpDec * timeDis;
            randomSpeed -= tempRandomDec * timeDis;
            if (upSpeed < MIN_SPEED && Math.abs(randomSpeed) < MIN_SPEED) {
                clear();
            }
        } else {
            player = Minecraft.getInstance().player;
        }
    }

    public void onShoot(float up, float random, int direction) {
        upSpeed = up;
        randomSpeed = random * direction;
        tempUpDec = upSpeed * speedDec;
        tempRandomDec = randomSpeed * speedDec;
        enable = true;
    }

    public boolean isEnable() {
        return enable;
    }

    public void clear() {
        upSpeed = 0;
        randomSpeed = 0;
        tempUpDec = 0f;
        tempRandomDec = 0f;
        enable = false;
    }
}
