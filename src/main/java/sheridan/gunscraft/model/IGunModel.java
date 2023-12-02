package sheridan.gunscraft.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;

public interface IGunModel {
    void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType,
                int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft,
                long lastFireTime, boolean mainHand, int fireMode, GunRenderContext context, long fireDis);
}
