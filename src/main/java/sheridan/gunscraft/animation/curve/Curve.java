package sheridan.gunscraft.animation.curve;

public abstract class Curve {
    public float minXVal, maxXVal;
    private float dis = 1;



    public Curve setBound(float minXVal, float maxXVal) {
        this.maxXVal = maxXVal;
        this.minXVal = minXVal;
        if (minXVal < maxXVal) {
            dis = maxXVal - minXVal;
        }
        return this;
    }

    public float play(float progress) {
        float xVal = minXVal + dis * progress;
        xVal = Math.min(xVal, maxXVal);
        return getVal(xVal);
    }

    public abstract float getVal(float xVal);

}
