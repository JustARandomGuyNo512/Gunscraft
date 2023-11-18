package sheridan.gunscraft;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ClientStatus {
    public AtomicBoolean buttonDown = new AtomicBoolean(false);
    public AtomicBoolean holdingGun = new AtomicBoolean(false);
    public AtomicInteger shootDelay = new AtomicInteger(1);
    public AtomicBoolean shouldHandle = new AtomicBoolean(true);
    public boolean aiming = false;
    public float aimingSpeed = 0.1f;
    public float aimingProgress = 0;

    public int fireCount = 0;
    public volatile long lastShoot;
    public boolean hand;

    public ClientStatus(boolean hand) {
        this.hand = hand;
    }

    public void handleAiming() {
        if (hand) {
            if (aiming) {
                aimingProgress += aimingSpeed;
                if (aimingProgress > 1) {
                    aimingProgress = 1;
                }
            } else {
                aimingProgress -= 0.2f;
                if (aimingProgress < 0) {
                    aimingProgress = 0;
                }
            }
        }
    }
}
