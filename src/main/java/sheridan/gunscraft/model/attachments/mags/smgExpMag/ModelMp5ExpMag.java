package sheridan.gunscraft.model.attachments.mags.smgExpMag;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelMp5ExpMag extends EntityModel<Entity> {
    private final ModelRenderer mag;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;

    public ModelMp5ExpMag() {
        textureWidth = 128;
        textureHeight = 128;

        mag = new ModelRenderer(this);
        mag.setRotationPoint(3.5768F, 24.1553F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-7.0F, 52.623F, -9.597F);
        mag.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -10.0F, 7.0F, 20.0F, 10.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-7.0F, 35.3025F, 0.403F);
        mag.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(24, 20).addBox(0.0F, 0.0F, -10.0F, 7.0F, 20.0F, 10.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-7.6F, 16.5086F, 7.2434F);
        mag.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(0, 40).addBox(0.6F, 0.0F, -10.0F, 7.0F, 20.0F, 10.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-7.0F, 0.0F, 0.0F);
        mag.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(48, 0).addBox(0.0F, 0.0F, 0.0F, 7.0F, 15.0F, 10.0F, 0.0F, false, true, true, false, false, true, true);

    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        mag.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }
}