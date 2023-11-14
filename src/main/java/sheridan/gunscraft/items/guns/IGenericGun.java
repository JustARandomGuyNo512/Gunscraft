package sheridan.gunscraft.items.guns;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public interface IGenericGun {
    ResourceLocation getTexture(int index);
    int getCurrentTextureIndex(ItemStack stack);

    boolean preShoot(ItemStack stack, LivingEntity entity, boolean mainHand);

    void shoot(ItemStack stack, LivingEntity entity, boolean mainHand, float spread);

    boolean preReload(ItemStack stack, LivingEntity entity, boolean mainHand);


    void reload(ItemStack stack, LivingEntity entity, boolean mainHand);

    boolean canHoldInOneHand();
    int getMagSize(ItemStack stack);
    int getAmmoLeft(ItemStack stack);
    void setAmmoLeft(ItemStack stack, int count);
    int getFireMode(ItemStack stack);
    void setFireMode(ItemStack stack, int mode);
    int getShootDelay();
    float getMinSpread(ItemStack stack);
    float getMaxSpread(ItemStack stack);
    boolean isFreeBlot();
    boolean isPistol();
    int getReloadLength(ItemStack stack);
    String getMuzzleFlashState(ItemStack stack);
}
