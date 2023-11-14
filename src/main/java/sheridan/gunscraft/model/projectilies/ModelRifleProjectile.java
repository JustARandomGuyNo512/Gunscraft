package sheridan.gunscraft.model.projectilies;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import sheridan.gunscraft.entities.projectile.GenericProjectile;

public class ModelRifleProjectile extends EntityModel<GenericProjectile> {
    private final ModelRenderer bb_main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;

    public ModelRifleProjectile() {
        textureWidth = 128;
        textureHeight = 128;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -24.0F, 35.0F);
        bb_main.addChild(cube_r1);
        setRotationAngle(cube_r1, 3.1416F, 0.0F, 0.7854F);
        cube_r1.setTextureOffset(0, 0).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 35.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -24.0F, 35.0F);
        bb_main.addChild(cube_r2);
        setRotationAngle(cube_r2, 3.1416F, 0.0F, -0.7854F);
        cube_r2.setTextureOffset(0, 0).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 35.0F, 0.0F, false);



    }

    @Override
    public void setRotationAngles(GenericProjectile entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


}