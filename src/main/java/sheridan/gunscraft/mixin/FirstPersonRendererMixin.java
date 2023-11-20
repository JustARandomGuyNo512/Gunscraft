package sheridan.gunscraft.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.renderer.FirstPersonRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.items.guns.IGenericGun;

@Mixin(FirstPersonRenderer.class)
public abstract class FirstPersonRendererMixin {


    @Accessor("prevEquippedProgressMainHand")
    abstract void setPrevEquippedProgressMainHand(float prevEquippedProgressMainHand);

    @Accessor("equippedProgressMainHand")
    abstract float getEquippedProgressMainHand();

    @Accessor("equippedProgressMainHand")
    abstract void setEquippedProgressMainHand(float equippedProgressMainHand);

    @Accessor("prevEquippedProgressOffHand")
    abstract void setPrevEquippedProgressOffHand(float prevEquippedProgressOffHand);

    @Accessor("equippedProgressOffHand")
    abstract float getEquippedProgressOffHand();

    @Accessor("equippedProgressOffHand")
    abstract void setEquippedProgressOffHand(float equippedProgressOffHand);

    @Accessor("itemStackMainHand")
    abstract ItemStack getItemStackMainHand();

    @Accessor("itemStackOffHand")
    abstract ItemStack getItemStackOffHand();

    @Accessor("itemStackMainHand")
    abstract void setItemStackMainHand(ItemStack itemStackMainHand);

    @Accessor("itemStackOffHand")
    abstract void setItemStackOffHand(ItemStack itemStackOffHand);

    //Basically a copy of "tick" method, for handling gun's equip duration
    @Inject(at = @At("HEAD"), method = "tick", cancellable = true)
    private void gunEquipProgressHandler(CallbackInfo ci) {
        ClientPlayerEntity clientplayerentity = Minecraft.getInstance().player;
        if (clientplayerentity != null && clientplayerentity.getEntityId() == ClientProxy.clientPlayerId) {
            ItemStack stackMain = clientplayerentity.getHeldItemMainhand();
            ItemStack stackOff = clientplayerentity.getHeldItemOffhand();
            if (stackMain.getItem() instanceof IGenericGun || stackOff.getItem() instanceof IGenericGun
            || getItemStackMainHand().getItem() instanceof IGenericGun || getItemStackOffHand().getItem() instanceof  IGenericGun) {
                ci.cancel();
                setPrevEquippedProgressMainHand(getEquippedProgressMainHand());
                setPrevEquippedProgressOffHand(getEquippedProgressOffHand());
                if (ItemStack.areItemStacksEqual(getItemStackMainHand(), stackMain)) {
                    setItemStackMainHand(stackMain);
                }

                if (ItemStack.areItemStacksEqual(getItemStackOffHand(), stackOff)) {
                    setItemStackOffHand(stackOff);
                }

                if (clientplayerentity.isRowingBoat()) {
                    setEquippedProgressMainHand(MathHelper.clamp(getEquippedProgressMainHand() - 0.4F, 0.0F, 1.0F));
                    setEquippedProgressOffHand(MathHelper.clamp(getEquippedProgressOffHand() - 0.4F, 0.0F, 1.0F));
                } else {
                    float f = clientplayerentity.getCooledAttackStrength(1.0F);
                    boolean equipMain = net.minecraftforge.client.ForgeHooksClient.shouldCauseReequipAnimation(getItemStackMainHand(), stackMain, clientplayerentity.inventory.currentItem);
                    boolean equipOff = net.minecraftforge.client.ForgeHooksClient.shouldCauseReequipAnimation(getItemStackOffHand(), stackOff, -1);

                    if (!equipMain && getItemStackMainHand() != stackMain)
                        setItemStackMainHand(stackMain);
                    if (!equipOff && getItemStackOffHand() != stackOff)
                        setItemStackOffHand(stackOff);

                    setEquippedProgressMainHand(getEquippedProgressMainHand() + MathHelper.clamp((!equipMain ? f * f * f : 0.0F) - getEquippedProgressMainHand(), -0.4F, 0.4F));
                    setEquippedProgressOffHand( getEquippedProgressOffHand() + MathHelper.clamp((float)(!equipOff ? 1 : 0) - getEquippedProgressOffHand(), -0.4F, 0.4F));
                }

                if (getEquippedProgressMainHand() < 0.1F) {
                    setItemStackMainHand(stackMain);
                }

                if (getEquippedProgressOffHand() < 0.1F) {
                    setItemStackOffHand(stackOff);
                }
            }
        }
    }
}
