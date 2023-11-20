package sheridan.gunscraft.animation.recoilAnimation;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import sheridan.gunscraft.ClientProxy;

import java.util.concurrent.atomic.AtomicBoolean;

public class RecoilCameraHandler {
    private PlayerEntity player;
    private final float MIN_SPEED = 0.25f;
    public float upSpeed;
    public float randomSpeed;
    public float speedDec = 1f;
    public AtomicBoolean inModify = new AtomicBoolean(false);
    private boolean enable;

    public void handle(float timeDis) {
        if (player != null && player.getEntityId() == ClientProxy.clientPlayerId && enable) {
            player.rotationPitch -= upSpeed * upSpeed * timeDis;
            player.rotationYaw += randomSpeed * upSpeed * timeDis;
            upSpeed *= (1 - speedDec * timeDis);
            randomSpeed *= (1 - speedDec * timeDis);
            if (Math.abs(upSpeed) < MIN_SPEED && Math.abs(randomSpeed) < MIN_SPEED) {
                clear();
            }
        } else {
            player = Minecraft.getInstance().player;
        }
    }

    public void onShoot(float up, float random, int direction) {
        upSpeed = up;
        randomSpeed = random * direction;
        enable = true;
    }

    public boolean isEnable() {
        return enable;
    }

    public void clear() {
        upSpeed = 0;
        randomSpeed = 0;
        enable = false;
    }
}
