package sheridan.gunscraft.items.guns;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.attachments.util.GunAttachmentSlot;

import java.util.List;

public interface IGenericGun {
    ResourceLocation getTexture(int index);
    int getCurrentTextureIndex(ItemStack stack);
    boolean preShoot(ItemStack stack, LivingEntity entity, boolean mainHand);
    void shoot(ItemStack stack, LivingEntity entity, boolean mainHand, float spread);
    boolean preReload(ItemStack stack, LivingEntity entity, boolean mainHand);
    void reload(ItemStack stack, LivingEntity entity, boolean mainHand);
    boolean canHoldInOneHand();
    int getMagSize(ItemStack stack);
    void setMagSize(ItemStack stack, int magSize);
    int getAmmoLeft(ItemStack stack);
    void setAmmoLeft(ItemStack stack, int count);
    int getFireMode(ItemStack stack);
    void setFireMode(ItemStack stack, int mode);
    void switchFireMode(ItemStack stack);
    int getShootDelay();
    float getMinSpread(ItemStack stack);
    float getMaxSpread(ItemStack stack);
    boolean isFreeBlot();
    boolean isPistol();
    int getReloadLength(ItemStack stack);
    String getMuzzleFlashState(ItemStack stack);
    int getBurstCount();
    float getAimingSpeed(ItemStack stack);
    float getRecoilUp(ItemStack stack);
    float getRecoilRandom(ItemStack stack);
    float getRecoilDec(ItemStack stack);
    GunAttachmentSlot getSlot(String name);
    List<GunAttachmentSlot> getAllSlots();
    String getSeriesName();
}
