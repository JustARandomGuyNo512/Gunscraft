package sheridan.gunscraft.mixin;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sheridan.gunscraft.ClientProxy;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    @Inject(at = @At("HEAD"), method = "applyBobbing", cancellable = true)
    private void onAiming(MatrixStack matrixStackIn, float partialTicks, CallbackInfo ci) {
        PlayerEntity player = Minecraft.getInstance().player;
        if (player == null) {
            return;
        }
        if (ClientProxy.mainHandStatus.aiming) {
            ci.cancel();
            applyBobbing(matrixStackIn, player, partialTicks, 0.06f);
        } else {
            if (ClientProxy.offHandStatus.holdingGun.get() || ClientProxy.mainHandStatus.holdingGun.get()) {
                ci.cancel();
                float scale = player.jumpMovementFactor > 0.02f ? 1f : 0.5f;
                applyBobbing(matrixStackIn, player, partialTicks, scale);
            }
        }
    }

    private void applyBobbing(MatrixStack matrixStackIn, PlayerEntity player, float partialTicks, float scale) {
        PlayerEntity playerentity = (PlayerEntity)Minecraft.getInstance().getRenderViewEntity();
        if (playerentity != null && player.getEntityId() == playerentity.getEntityId()) {
            float f = playerentity.distanceWalkedModified - playerentity.prevDistanceWalkedModified;
            float f1 = -(playerentity.distanceWalkedModified + f * partialTicks);
            float f2 = MathHelper.lerp(partialTicks, playerentity.prevCameraYaw, playerentity.cameraYaw) * scale;
            matrixStackIn.translate((MathHelper.sin(f1 * (float)Math.PI) * f2 * 0.5F), (-Math.abs(MathHelper.cos(f1 * (float)Math.PI) * f2)), 0.0D);
            matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(MathHelper.sin(f1 * (float)Math.PI) * f2 * 3.0F));
            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(Math.abs(MathHelper.cos(f1 * (float)Math.PI - 0.2F) * f2) * 5.0F));
        }
    }

}
