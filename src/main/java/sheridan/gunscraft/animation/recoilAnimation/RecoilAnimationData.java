package sheridan.gunscraft.animation.recoilAnimation;

public class RecoilAnimationData {
    public float maxMoveBack;
    public float maxRotateUp;
    public float maxMoveUp;
    public float rotateAttenuation;
    public float moveBackAttenuation;
    public float moveUpAttenuation;
    public float rotateUp;
    public float moveBack;
    public float moveUp;
    public float rotateDesc;
    public float moveBackDesc;
    public float moveUpDesc;
    public float rotateZLevel;
    public float random;
    public float trimZLevel;
    public float timeSpeed;


    public RecoilAnimationData(float maxMoveBack, float maxRotateUp, float maxMoveUp,
                               float rotateAttenuation, float moveBackAttenuation, float moveUpAttenuation,
                               float rotateUp, float moveBack, float moveUp,
                               float rotateDesc, float moveBackDesc, float moveUpDesc,
                               float timeSpeed, float rotateZLevel, float trimZLevel, float random) {
        this.maxMoveBack  = maxMoveBack;
        this.maxRotateUp = maxRotateUp;
        this.maxMoveUp = maxMoveUp;
        this.moveBackAttenuation = moveBackAttenuation;
        this.rotateAttenuation = rotateAttenuation;
        this.moveUpAttenuation = moveUpAttenuation;
        this.rotateUp = rotateUp;
        this.moveBack = moveBack;
        this.moveUp = moveUp;
        this.rotateDesc = rotateDesc;
        this.moveBackDesc = moveBackDesc;
        this.moveUpDesc = moveUpDesc;
        this.timeSpeed = timeSpeed;
        this.rotateZLevel = rotateZLevel;
        this.random = random;
        this.trimZLevel = trimZLevel;
    }

}
