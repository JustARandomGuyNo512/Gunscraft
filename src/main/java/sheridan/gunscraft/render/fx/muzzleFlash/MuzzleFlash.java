package sheridan.gunscraft.render.fx.muzzleFlash;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import sheridan.gunscraft.ClientProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MuzzleFlash {
    private List<MuzzleFlashTexture> textures = new ArrayList<>();
    public long length;
    public float size;
    public boolean randomRotate;

    public MuzzleFlash setSize(float size) {
        this.size = size;
        return this;
    }

    public MuzzleFlash setLength(long length) {
        this.length = length;
        return this;
    }

    public MuzzleFlash setRandomRotate(boolean randomRotate) {
        this.randomRotate = randomRotate;
        return this;
    }

    public MuzzleFlash() {}

    public List<MuzzleFlashTexture> getTextures() {
        return textures;
    }

    public MuzzleFlash addTexture(MuzzleFlashTexture texture) {
        this.textures.add(texture);
        return this;
    }

    public void play(long startTime, IRenderTypeBuffer buffer, MatrixStack stack, MuzzleFlashTrans trans, boolean firstPerson) {
        if (!textures.isEmpty()) {
            Random random = new Random();
            int texNum = textures.size();
            int texIndex = texNum > 1 ? Math.max(random.nextInt(), 0) % texNum : 0;
            MuzzleFlashTexture muzzleFlashTexture = textures.get(texIndex);
            long dis = System.currentTimeMillis() - startTime;
            float progress = (float) dis / (float) length;
            if (progress <= 1) {
                if (trans != null) {
                    trans.applyTrans(stack);
                }
                if (randomRotate) {
                    int seed = Math.max(0, random.nextInt()) % 4;
                    applyRotate(stack, seed);
                }
                muzzleFlashTexture.draw(progress, size, buffer, stack, firstPerson);
            }
        }
    }

    private void applyRotate(MatrixStack stack, int seed) {
        switch (seed) {
            case 0:
                return;
            case 1:
                stack.translate(size / 2, size / 2, 0);
                stack.rotate(new Quaternion(Vector3f.ZP, 90f, true));
                break;
            case 2:
                stack.rotate(new Quaternion(Vector3f.ZP, 180f, true));
                stack.translate(0, - size, 0);
                break;
            case 3:
                stack.rotate(new Quaternion(Vector3f.ZP, 270f, true));
                stack.translate(- size / 2,- size / 2,0);
                break;
        }
    }
}
