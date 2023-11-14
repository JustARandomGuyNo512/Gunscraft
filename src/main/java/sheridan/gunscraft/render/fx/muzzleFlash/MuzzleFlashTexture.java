package sheridan.gunscraft.render.fx.muzzleFlash;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import org.lwjgl.opengl.GL11;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.render.fx.FxRenderType;

import static net.minecraft.client.renderer.RenderState.*;

public class MuzzleFlashTexture {
    public ResourceLocation texture;
    public RenderType renderType;
    public int frameCount;
    private float quadSize;

    public MuzzleFlashTexture(ResourceLocation texture, int frameCount) {
        this.texture = texture;
        this.frameCount = frameCount;
        this.quadSize = 1f / frameCount;
        renderType = FxRenderType.create(texture);
    }


    public void draw(float progress, float size, IRenderTypeBuffer buffer, MatrixStack matrixStack) {
        int index = (int) (progress * frameCount);
        IVertexBuilder builder = buffer.getBuffer(FxRenderType.create(texture));

        matrixStack.push();
        matrixStack.rotate(new Quaternion(Vector3f.XP, -90, true));
        matrixStack.translate(- size / 2 , 0 , size / 2 );
        drawQuad(2, index, size,  matrixStack, builder);
        matrixStack.pop();

        matrixStack.push();
        matrixStack.rotate(new Quaternion(-90, - 90 , 0, true));
        matrixStack.translate(0,0, 0 );
        drawQuad(1, index,size, matrixStack, builder);
        matrixStack.pop();


        matrixStack.push();
        matrixStack.rotate(new Quaternion(Vector3f.XP, 180, true));
        matrixStack.translate(- size / 2 , - size , 0);
        drawQuad(0, index,size, matrixStack, builder);
        matrixStack.pop();

    }

    private void drawQuad(int axis, int index, float size, MatrixStack stack, IVertexBuilder builder) {
        float[] uv = getUV(index, axis);
        if (uv != null) {
            drawQuad(builder, stack.getLast().getMatrix(), uv[0], uv[1],uv[2], uv[3], size);
        }
    }

    private float[] getUV(int index, int axis) {
        switch (axis) {
            case 0:
                return new float[] {quadSize * index, 0f , quadSize * (index + 1), quadSize};
            case 1:
                return new float[] {quadSize * index, quadSize, quadSize * (index + 1), quadSize * 2};
            case 2:
                return new float[] {quadSize * index, quadSize * 2, quadSize * (index + 1), quadSize * 3};
        }
        return null;
    }

    private void drawQuad(IVertexBuilder builder, Matrix4f matrix, float u1, float v1, float u2, float v2, float size) {
        builder.pos(matrix, 0.0F, 0.0F, 0.0F).color(1.0F, 1.0F, 1.0F, 1F).tex(u2, v2).lightmap(15728880).endVertex();
        builder.pos(matrix, size, 0.0F, 0.0F).color(1.0F, 1.0F, 1.0F, 1F).tex(u1, v2).lightmap(15728880).endVertex();
        builder.pos(matrix, size, size, 0.0F).color(1.0F, 1.0F, 1.0F, 1F).tex(u1, v1).lightmap(15728880).endVertex();
        builder.pos(matrix, 0.0F, size, 0.0F).color(1.0F, 1.0F, 1.0F, 1F).tex(u2, v1).lightmap(15728880).endVertex();
    }
}
