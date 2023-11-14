package sheridan.gunscraft;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import sheridan.gunscraft.items.guns.IGenericGun;

public interface IProxy {
    void perInit();
    void init();
    void postInit();

    @OnlyIn(Dist.CLIENT)
    void setUpClient(FMLClientSetupEvent event);

    @OnlyIn(Dist.CLIENT)
    boolean shouldRenderCustom(ItemStack stack, IGenericGun gun, LivingEntity entity, boolean isMainHand);
    PlayerEntity getClientPlayer();

}
