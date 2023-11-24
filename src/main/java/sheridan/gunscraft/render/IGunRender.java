package sheridan.gunscraft.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IGunModel;

public interface IGunRender {
    void renderWithLivingEntity(LivingEntity entityIn, MatrixStack stackIn,
                                ItemStack itemStackIn, ItemCameraTransforms.TransformType type, IRenderTypeBuffer bufferIn, IGenericGun gun,
                                int combinedLightIn, int combinedOverlayIn, boolean leftHand, IGunModel model, TransformData transformData);

    void renderInGuiScreen(ItemStack itemStack, MatrixStack matrixStack, IGenericGun gun, IGunModel model);

    void justRenderModel(ItemStack itemStackIn, ItemCameraTransforms.TransformType transformTypeIn,
                         MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, IGenericGun gun, IGunModel model, TransformData transformData);
}
