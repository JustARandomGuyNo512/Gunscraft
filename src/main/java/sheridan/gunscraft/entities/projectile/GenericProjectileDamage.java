package sheridan.gunscraft.entities.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSource;

public class GenericProjectileDamage extends EntityDamageSource {
    public GenericProjectileDamage(String damageTypeIn, Entity damageSourceEntityIn) {
        super(damageTypeIn, damageSourceEntityIn);
    }

    @Override
    public boolean isCreativePlayer() {
        return false;
    }
}
