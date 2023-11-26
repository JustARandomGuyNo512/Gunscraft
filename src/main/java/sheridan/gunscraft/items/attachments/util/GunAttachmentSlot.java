package sheridan.gunscraft.items.attachments.util;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Quaternion;
import sheridan.gunscraft.Gunscraft;

import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Set;

public class GunAttachmentSlot {
    public static final ResourceLocation EMPTY = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/icon/attachment_empty.png");
    public static final ResourceLocation EMPTY_SELECTED = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/icon/attachment_empty_selected.png");
    public static final ResourceLocation OCCUPIED = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/icon/attachment_occupied.png");
    public static final ResourceLocation OCCUPIED_SELECTED = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/icon/attachment_occupied_selected.png");
    public String name;
    public Set<Integer> acceptAttachments;
    public float[][] trans;

    public boolean accept(int id) {
        return acceptAttachments.contains(id);
    }

    public GunAttachmentSlot(String name, Set<Integer> acceptAttachments) {
        this.name = name;
        this.acceptAttachments = acceptAttachments;
    }

    public GunAttachmentSlot setTrans(float[][] trans) {
        this.trans = trans;
        return this;
    }

    public void renderIcon(MatrixStack matrixStack, boolean selected, boolean occupied) {
        if (trans != null) {
            matrixStack.push();
            applyTrans(matrixStack);
            ResourceLocation texture = chooseTexture(selected, occupied);
            // clear rotate factors...
            FloatBuffer buffer1 = FloatBuffer.allocate(16);
            matrixStack.getLast().getMatrix().write(buffer1);
            float scale = selected ? 5 * 1.2f : 5f;
            buffer1.put(0, scale);
            buffer1.put(4, 0);
            buffer1.put(8, 0);

            buffer1.put(1, 0);
            buffer1.put(5, scale);
            buffer1.put(9, 0);

            buffer1.put(2, 0);
            buffer1.put(6, 0);
            buffer1.put(10, scale);
            Matrix4f matrix4f1 = new Matrix4f(buffer1.array());
            matrix4f1.transpose();
            BufferBuilder buffer = Tessellator.getInstance().getBuffer();
            RenderSystem.enableBlend();
            Minecraft.getInstance().getTextureManager().bindTexture(texture);
            buffer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
            buffer.pos(matrix4f1, -1, 3,0).tex(0,1).color(1, 1, 1,1f).endVertex();
            buffer.pos(matrix4f1, 1, 3,0).tex(1,1).color(1, 1, 1,1f).endVertex();
            buffer.pos(matrix4f1, 1, 1,0).tex(1,0).color(1, 1, 1,1f).endVertex();
            buffer.pos(matrix4f1, -1, 1,0).tex(0,0).color(1, 1, 1,1f).endVertex();
            buffer.finishDrawing();
            WorldVertexBufferUploader.draw(buffer);
            RenderSystem.disableBlend();
            matrixStack.pop();
        }
    }

    private ResourceLocation chooseTexture(boolean selected, boolean occupied) {
        if (selected) {
            return occupied ? OCCUPIED_SELECTED : EMPTY_SELECTED;
        } else {
            return occupied ? OCCUPIED : EMPTY;
        }
    }

    public void applyTrans(MatrixStack matrixStack) {
        matrixStack.translate(trans[0][0], trans[0][1], trans[0][2]);
        matrixStack.rotate(new Quaternion(trans[1][0], trans[1][1] + 90, trans[1][2], true));
        matrixStack.scale(trans[2][0], trans[2][1], trans[2][2]);
    }
}
