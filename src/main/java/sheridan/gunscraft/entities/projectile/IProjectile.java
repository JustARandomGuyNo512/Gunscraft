package sheridan.gunscraft.entities.projectile;

import net.minecraft.entity.LivingEntity;

public interface IProjectile {
    void init(LivingEntity shooter, float speed, float spread, float damage, int lifeLength);
}
