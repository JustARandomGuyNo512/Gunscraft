package sheridan.gunscraft;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import sheridan.gunscraft.items.guns.IGenericGun;

public class CommonProxy implements IProxy{
    @Override
    public void perInit() {

    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void setUpClient(FMLClientSetupEvent event) {

    }

    @Override
    public boolean shouldRenderCustom(ItemStack stack, IGenericGun gun, LivingEntity entity, boolean isMainHand) {
        return false;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return null;
    }

}
