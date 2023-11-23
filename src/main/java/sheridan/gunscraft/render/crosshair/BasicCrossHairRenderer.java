package sheridan.gunscraft.render.crosshair;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;
import sheridan.gunscraft.Gunscraft;

public class BasicCrossHairRenderer {
    public static final ResourceLocation BLANK = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/crosshair/blank.png");
    public static final int WHITE = 0, GREEN = 1;
    private static final float SPREAD_FACTOR = 5.75f;
    private static final float CROSS_STICK_LEN = 5f;
    private float[][] rgbs = new float[][] {
            {1,1,1},
            {0,1,0},
            {1,0,0},
            {0,0,1}};

    public BasicCrossHairRenderer() {

    }

    public void render(MatrixStack matrixStackIn, float spread, MainWindow window, int color) {
        matrixStackIn.push();
        RenderSystem.enableBlend();
        RenderSystem.enableAlphaTest();

        matrixStackIn.translate(0.5f * (window.getScaledWidth()), 0.5f * (window.getScaledHeight()), 0.0D);

        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
                GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
                GlStateManager.SourceFactor.ONE,
                GlStateManager.DestFactor.ZERO);

        Matrix4f matrix = matrixStackIn.getLast().getMatrix();
        renderCross(matrix, color, spread);
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
        matrixStackIn.pop();
    }

    private void renderCross(Matrix4f matrix, int color, float spread) {
        renderColorRect(matrix, color, 0, 0, 1, 1);
        renderColorRect(matrix, color, 0, 1 + spread * SPREAD_FACTOR, 1, 1 + spread * SPREAD_FACTOR + CROSS_STICK_LEN);
        renderColorRect(matrix, color, 0, - spread * SPREAD_FACTOR - CROSS_STICK_LEN, 1, - spread * SPREAD_FACTOR);
        renderColorRect(matrix, color, 1 + spread * SPREAD_FACTOR, 0, 1 + spread * SPREAD_FACTOR + CROSS_STICK_LEN, 1);
        renderColorRect(matrix, color, - spread * SPREAD_FACTOR - CROSS_STICK_LEN, 0, - spread * SPREAD_FACTOR, 1);
    }

    private void renderColorRect(Matrix4f matrix, int color,float xStart, float yStart, float xEnd, float yEnd) {
        BufferBuilder buffer = Tessellator.getInstance().getBuffer();
        Minecraft.getInstance().getTextureManager().bindTexture(BLANK);
        buffer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        buffer.pos(matrix, xStart, yEnd,0).tex(0,1).color(rgbs[color][0], rgbs[color][1], rgbs[color][2],1f).endVertex();
        buffer.pos(matrix, xEnd, yEnd,0).tex(1,1).color(rgbs[color][0], rgbs[color][1], rgbs[color][2],1f).endVertex();
        buffer.pos(matrix, xEnd, yStart,0).tex(1,0).color(rgbs[color][0], rgbs[color][1], rgbs[color][2],1f).endVertex();
        buffer.pos(matrix, xStart, yStart,0).tex(0,0).color(rgbs[color][0], rgbs[color][1], rgbs[color][2],1f).endVertex();
        buffer.finishDrawing();
        WorldVertexBufferUploader.draw(buffer);
    }

}
