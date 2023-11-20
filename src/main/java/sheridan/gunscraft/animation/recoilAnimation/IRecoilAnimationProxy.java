package sheridan.gunscraft.animation.recoilAnimation;

public interface IRecoilAnimationProxy {
    default void beforeShoot(long lastFireTime, RecoilAnimationData data, RecoilAnimationState state) {}
    default void afterShoot(long lastFireTime, RecoilAnimationData data, RecoilAnimationState state) {}
    default void beforeUpdate(float timeDis) {}
}
