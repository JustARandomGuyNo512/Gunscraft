package sheridan.gunscraft.entities;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.entities.projectile.GenericProjectile;
import sheridan.gunscraft.render.entities.GenericProjectileRenderer;

public class EntityRegister {
    public static final DeferredRegister<EntityType<?>> ENTITIES;
    //public static final EntityType<GenericProjectile> GENERIC_PROJECTILE = EntityType.Builder.createGenericRecoil(GenericProjectile::new, EntityClassification.MISC).size(0.25f, 0.5f).updateInterval(1).build(new ResourceLocation(Gunscraft.MOD_ID ,"generic_projectile").toString());

    public static final RegistryObject<EntityType<GenericProjectile>> GENERIC_PROJECTILE;

    static {
        ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Gunscraft.MOD_ID);
        GENERIC_PROJECTILE = ENTITIES.register("generic_projectile", () -> EntityType.Builder.create(GenericProjectile::new, EntityClassification.MISC).size(0.3f, 0.3f).immuneToFire().updateInterval(1).setUpdateInterval(1).build(new ResourceLocation(Gunscraft.MOD_ID ,"generic_projectile").toString()));
    }

    public EntityRegister() {}

    public static void registerRenderer() {
        RenderingRegistry.registerEntityRenderingHandler(GENERIC_PROJECTILE.get(), GenericProjectileRenderer::new);
    }
}
