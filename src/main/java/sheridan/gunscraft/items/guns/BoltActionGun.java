package sheridan.gunscraft.items.guns;

import net.minecraft.util.ResourceLocation;

public class BoltActionGun extends GenericGun{
    public BoltActionGun(Properties properties, int baseMagSize, boolean canHoldInOneHand, ResourceLocation[] textures, int[] fireModes, float baseSpread, float maxSpread, float spreadPreShoot, float bulletSpeed, float baseDamage, float minDamage, int bulletLifeLength, int shootDelay, String normalFireSound, float[] soundArgs, boolean isFreeBlot, boolean isPistol, int reloadLength, int burstCount, float aimingSpeed) {
        super(properties, baseMagSize, canHoldInOneHand, textures, fireModes, baseSpread, maxSpread, spreadPreShoot, bulletSpeed, baseDamage, minDamage, bulletLifeLength, shootDelay, normalFireSound, soundArgs, isFreeBlot, isPistol, reloadLength, burstCount, aimingSpeed);
    }
}
