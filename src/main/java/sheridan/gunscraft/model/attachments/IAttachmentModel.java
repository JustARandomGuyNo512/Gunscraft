package sheridan.gunscraft.model.attachments;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ItemCameraTransforms;

public interface IAttachmentModel {
    void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType,
                int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft,
                long lastFireTime, boolean mainHand, int fireMode);
}
