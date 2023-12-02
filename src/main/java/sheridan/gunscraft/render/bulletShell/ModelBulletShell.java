package sheridan.gunscraft.render.bulletShell;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import sheridan.gunscraft.model.ModelRenderer;

import java.util.HashMap;
import java.util.Map;

public class ModelBulletShell extends EntityModel<Entity> {
    private final ModelRenderer pistol;
    private final ModelRenderer cube_r1;
    private final ModelRenderer rifle;
    private final ModelRenderer cube_r2;
    private final ModelRenderer shotgun;
    private final ModelRenderer cube_r3;
    private final ModelRenderer grenade;
    private final ModelRenderer grenade_r1;

    public static Map<String, ModelRenderer> models = new HashMap<>();

    public ModelBulletShell() {
        textureWidth = 80;
        textureHeight = 80;

        pistol = new ModelRenderer(this);
        pistol.setRotationPoint(0.0F, 24.0F, 4.5F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, -4.5F);
        pistol.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
        cube_r1.setTextureOffset(31, 25).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 9.0F, 0.0F, false);

        rifle = new ModelRenderer(this);
        rifle.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 8.5F);
        rifle.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
        cube_r2.setTextureOffset(30, 0).addBox(-1.5F, -1.5F, -7.5F, 3.0F, 3.0F, 15.0F, 0.0F, false);
        cube_r2.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -9.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        shotgun = new ModelRenderer(this);
        shotgun.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 10.0F);
        shotgun.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
        cube_r3.setTextureOffset(0, 0).addBox(-2.5F, -2.5F, -11.0F, 5.0F, 5.0F, 20.0F, 0.0F, false);

        grenade = new ModelRenderer(this);
        grenade.setRotationPoint(0.0F, 24.0F, 0.0F);


        grenade_r1 = new ModelRenderer(this);
        grenade_r1.setRotationPoint(0.0F, 0.0F, 7.5F);
        grenade.addChild(grenade_r1);
        setRotationAngle(grenade_r1, 0.0F, 0.0F, 0.7854F);
        grenade_r1.setTextureOffset(0, 25).addBox(-4.0F, -4.0F, -8.5F, 8.0F, 8.0F, 15.0F, 0.0F, false);

        models.put("pistol", pistol);
        models.put("rifle", rifle);
        models.put("shotgun", shotgun);
        models.put("grenade",grenade);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        pistol.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        rifle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        shotgun.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        grenade.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


}