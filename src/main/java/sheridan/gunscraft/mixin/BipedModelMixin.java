package sheridan.gunscraft.mixin;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sheridan.gunscraft.items.guns.IGenericGun;

@Mixin(BipedModel.class)
public class BipedModelMixin {

    @Inject(at = @At("TAIL"), method = "setRotationAngles(Lnet/minecraft/entity/LivingEntity;FFFFF)V")
    public void setUpAngles(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo ci) {
        if (entityIn instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityIn;
            Item itemMain = player.getHeldItemMainhand().getItem();
            Item itemOff = player.getHeldItemOffhand().getItem();
            boolean holdGunMain = itemMain instanceof IGenericGun;
            boolean holdGunOff = itemOff instanceof IGenericGun;
            IGenericGun gunMain = holdGunMain ? (IGenericGun) itemMain : null;
            IGenericGun gunOff = holdGunOff ? (IGenericGun) itemOff : null;
            if (holdGunMain && holdGunOff) {
                if (gunMain.canHoldInOneHand() && gunOff.canHoldInOneHand()) {
                    ((BipedModel)(Object)this).bipedRightArm.rotateAngleY = -0.1F + ((BipedModel)(Object)this).bipedHead.rotateAngleY;
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleY = 0.1F + ((BipedModel)(Object)this).bipedHead.rotateAngleY;
                    ((BipedModel)(Object)this).bipedRightArm.rotateAngleX = (-(float)Math.PI / 2F) + ((BipedModel)(Object)this).bipedHead.rotateAngleX;
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleX = (-(float)Math.PI / 2F) + ((BipedModel)(Object)this).bipedHead.rotateAngleX;
                } else {
                    ((BipedModel)(Object)this).bipedRightArm.rotateAngleY = -0.1F + ((BipedModel)(Object)this).bipedHead.rotateAngleY;
                    ((BipedModel)(Object)this).bipedRightArm.rotateAngleX = (-(float)Math.PI / 2F) + ((BipedModel)(Object)this).bipedHead.rotateAngleX;
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleY = 0.1F + ((BipedModel)(Object)this).bipedHead.rotateAngleY + 0.675f;
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleX = (-(float)Math.PI / 2F) + ((BipedModel)(Object)this).bipedHead.rotateAngleX;
                }
            }
            else if (holdGunMain) {
                ((BipedModel)(Object)this).bipedRightArm.rotateAngleY = -0.1F + ((BipedModel)(Object)this).bipedHead.rotateAngleY;
                ((BipedModel)(Object)this).bipedRightArm.rotateAngleX = (-(float)Math.PI / 2F) + ((BipedModel)(Object)this).bipedHead.rotateAngleX;
                //if (player.getHeldItemOffhand().getItem() == Items.AIR) {
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleY = 0.1F + ((BipedModel)(Object)this).bipedHead.rotateAngleY + 0.675f;
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleX = (-(float)Math.PI / 2F) + ((BipedModel)(Object)this).bipedHead.rotateAngleX;
                //}
            }
            else if (holdGunOff) {
                if (gunOff.canHoldInOneHand()) {
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleY = 0.1F + ((BipedModel)(Object)this).bipedHead.rotateAngleY;
                    ((BipedModel)(Object)this).bipedLeftArm.rotateAngleX = (-(float)Math.PI / 2F) + ((BipedModel)(Object)this).bipedHead.rotateAngleX;
                }
            }
        }
    }


}
