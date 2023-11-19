package sheridan.gunscraft.animation.recoilAnimation;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;

import java.util.Random;

public class RecoilAnimationState {
    public static final float BASE_FACTOR = 0.175f;
    public static final float Z_SPEED_FACTOR = 1.85f;
    public static final float RANDOM_FACTOR = 0.2f;
    public RecoilAnimationData data;
    public boolean isMainHand;
    public boolean enable = false;
    private long lastTickTime = 0;
    private long startTime = 0;

    private float rotateUpSpeed = 0;
    private float rotateUp = 0;

    private float moveUpSpeed = 0;
    private float moveUp = 0;

    private float moveBackSpeed = 0;
    private float moveBack = 0;

    private float randomRX = 0;
    private float randomRY = 0;
    private float randomRXSpeed = 0;
    private float randomRYSpeed = 0;

    public void update(RecoilAnimationData data, MatrixStack matrixStack) {
        if (!enable || lastTickTime == 0 || data == null) {
            return;
        }
        if (data != this.data) {
            clearAndDisable();
            enable = false;
        }
        long dis = System.currentTimeMillis() - lastTickTime;
        if (dis > 100 ) {
            clearAndDisable();
            return;
        }
        float timeDis = dis * data.timeSpeed;

        float r1 = rotateUp / data.maxRotateUp;
        rotateUpSpeed -=  (r1) * data.rotateDesc * timeDis;
        rotateUpSpeed *= (1 - data.rotateAttenuation * timeDis);
        rotateUp += rotateUpSpeed * timeDis;

        float m1 = moveUp / data.maxMoveUp;
        moveUpSpeed -= (m1) * data.moveUpDesc * timeDis;
        moveUpSpeed *= (1 - data.moveUpAttenuation * timeDis);
        moveUp += moveUpSpeed * timeDis;

        float m2 = moveBack / data.maxMoveBack;
        moveBackSpeed -= (Math.max(m2 > 0 ? 0.35 : -0.1, m2)) * data.moveBackDesc * timeDis;
        moveBackSpeed *= (1 - data.moveBackAttenuation * timeDis * Z_SPEED_FACTOR);
        moveBack += moveBackSpeed * timeDis * Z_SPEED_FACTOR;

        randomRX += randomRXSpeed * timeDis * RANDOM_FACTOR;
        randomRXSpeed *= (1 - 0.1f * timeDis);

        randomRY += randomRYSpeed * timeDis * RANDOM_FACTOR;
        randomRYSpeed *= (1 - 0.1f * timeDis);

        randomRX *= (1 - 0.1f * timeDis);
        randomRY *= (1 - 0.1f * timeDis);


        lastTickTime = System.currentTimeMillis();

        if (lastTickTime - startTime > data.length) {
            clear();
            return;
        }

        matrixStack.translate(0, -moveUp * BASE_FACTOR, moveBack * BASE_FACTOR + data.trimZLevel * rotateUp);
        matrixStack.rotate(new Quaternion(Vector3f.XP, - rotateUp * BASE_FACTOR, true));

        matrixStack.translate( - randomRY * data.rotateZLevel, randomRX * data.rotateZLevel,0);
        matrixStack.rotate(new Quaternion(randomRX, randomRY, 0, true));
    }

    public int randomIndex() {
        return Math.random() <= 0.5 ? 1 : -1;
    }

    public void onShoot(long lastFireTime, RecoilAnimationData data) {
        if (data != null) {
            startTime = lastFireTime;
            lastTickTime = lastFireTime;
            enable = true;
            rotateUpSpeed += data.rotateUp;
            moveBackSpeed += data.moveBack;
            moveUpSpeed += data.moveUp;
            randomRXSpeed += data.random * randomIndex();
            randomRYSpeed += data.random * randomIndex();
            this.data = data;
        } else {
            clear();
            enable = false;
        }
    }

    public void clear() {
        rotateUpSpeed = 0;
        rotateUp = 0;
        moveBackSpeed = 0;
        moveBack = 0;
        moveUpSpeed = 0;
        moveUp = 0;
        lastTickTime = 0;
        randomRYSpeed = 0;
        randomRY = 0;
        randomRXSpeed = 0;
        randomRX = 0;
    }

    public void clearAndDisable() {
        clear();
        enable = false;
    }
}
