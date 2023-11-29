package sheridan.gunscraft.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.IGenericGun;

public interface IAttachmentModel {
    void render(MatrixStack matrixStack, ItemCameraTransforms.TransformType transformType,
                int packedLight, int packedOverlay, int bulletLeft,
                long lastFireTime, boolean mainHand, int fireMode, IGenericGun gun);
}
