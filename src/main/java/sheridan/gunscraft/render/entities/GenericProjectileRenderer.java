package sheridan.gunscraft.render.entities;


import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import sheridan.gunscraft.entities.projectile.GenericProjectile;
import sheridan.gunscraft.model.projectilies.ModelRifleProjectile;


public class GenericProjectileRenderer extends EntityRenderer<GenericProjectile> {
    public static ResourceLocation RIFLE = new ResourceLocation("gunscraft","textures/projectile/generic_projectile.png");
    public static final float BASE_SCALE = 0.2f;
    public static ModelRifleProjectile modelGenericProjectile = new ModelRifleProjectile();

    public GenericProjectileRenderer(EntityRendererManager renderManager) {
        super(renderManager);
        this.shadowSize = 0.0f;
    }

    @Override
    public ResourceLocation getEntityTexture(GenericProjectile entity) {
        return RIFLE;
    }


    @Override
    public void render(GenericProjectile entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light) {
        if (entity.ticksExisted < 2) {
            return;
        }
        matrixStack.push();
        matrixStack.scale(BASE_SCALE, BASE_SCALE, BASE_SCALE);
        matrixStack.rotate(new Quaternion(Vector3f.YP, -entityYaw, true));
        matrixStack.rotate(new Quaternion(Vector3f.XP, entity.rotationPitch, true));
        modelGenericProjectile.render(matrixStack, renderTypeBuffer.getBuffer(RenderType.getArmorCutoutNoCull(this.getEntityTexture(entity))),light,655360,1,1,1,1);
        matrixStack.pop();

        super.render(entity, entityYaw, partialTicks, matrixStack, renderTypeBuffer, light);
    }
}
