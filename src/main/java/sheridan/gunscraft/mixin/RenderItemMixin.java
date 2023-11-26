package sheridan.gunscraft.mixin;


import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationHandler;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.render.GenericGunRenderer;
import sheridan.gunscraft.render.IGunRender;
import sheridan.gunscraft.render.TransformData;

import static net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType.GUI;


@Mixin(ItemRenderer.class)
public class RenderItemMixin {

    private final IGunRender renderer = ClientProxy.renderer;

    // all model, ground, gui, other
    @Inject(at = @At("HEAD"), method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/model/ItemCameraTransforms$TransformType;ZLcom/mojang/blaze3d/matrix/MatrixStack;Lnet/minecraft/client/renderer/IRenderTypeBuffer;IILnet/minecraft/client/renderer/model/IBakedModel;)V", cancellable = true)
    public void renderItem(ItemStack itemStackIn, ItemCameraTransforms.TransformType transformTypeIn, boolean leftHand, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, IBakedModel modelIn, CallbackInfo ci) {
        if (itemStackIn != null && itemStackIn.getItem() instanceof IGenericGun) {
            IGunModel model = ClientProxy.gunModelMap.get(itemStackIn.getItem());
            if (model != null) {
                TransformData data = ClientProxy.transformDataMap.get(itemStackIn.getItem());
                if (data != null) {
                    renderer.justRenderModel(itemStackIn, transformTypeIn, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, (IGenericGun) itemStackIn.getItem(), model, data);
                    ci.cancel();
                }
            }
        }
    }

    //first person, third person, frame(null), other entity
    @Inject(at = @At("HEAD"), method = "renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/model/ItemCameraTransforms$TransformType;ZLcom/mojang/blaze3d/matrix/MatrixStack;Lnet/minecraft/client/renderer/IRenderTypeBuffer;Lnet/minecraft/world/World;II)V", cancellable = true)
    public void renderItemHeld(LivingEntity livingEntityIn, ItemStack itemStackIn, ItemCameraTransforms.TransformType transformTypeIn, boolean leftHand, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, World worldIn, int combinedLightIn, int combinedOverlayIn, CallbackInfo ci) {
        if (itemStackIn != null) {
            RecoilAnimationHandler.checkShouldClear(itemStackIn, livingEntityIn, !leftHand);
            if (itemStackIn.getItem() instanceof IGenericGun) {
                IGunModel model = ClientProxy.gunModelMap.get(itemStackIn.getItem());
                if (model != null) {
                    TransformData data = ClientProxy.transformDataMap.get(itemStackIn.getItem());
                    if (data != null) {
                        renderer.renderWithLivingEntity(livingEntityIn,matrixStackIn,itemStackIn, transformTypeIn, bufferIn,(IGenericGun) itemStackIn.getItem(), combinedLightIn, combinedOverlayIn, leftHand, model, data);
                        ci.cancel();
                    }
                }
            }
        }
    }

}
