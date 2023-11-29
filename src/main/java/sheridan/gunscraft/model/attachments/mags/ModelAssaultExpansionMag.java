package sheridan.gunscraft.model.attachments.mags;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IAttachmentModel;
import sheridan.gunscraft.model.ModelRenderer;

import java.util.ArrayList;

public class ModelAssaultExpansionMag extends EntityModel<Entity> implements IAttachmentModel {
    private final ModelRenderer mag_ar;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;


    private final ModelRenderer mag_ak;
    private final ModelRenderer ak_cube_r1;
    private final ModelRenderer ak_cube_r2;
    private final ModelRenderer ak_cube_r3;
    private final ModelRenderer ak_cube_r4;
    private final ModelRenderer ak_cube_r5;
    private final ModelRenderer ak_cube_r6;
    private final ModelRenderer ak_cube_r7;
    private final ModelRenderer ak_cube_r8;
    private final ModelRenderer ak_cube_r9;
    private final ModelRenderer ak_cube_r10;


    private ArrayList<ResourceLocation> textures;

    public ModelAssaultExpansionMag(ArrayList<ResourceLocation> textures) {
        textureWidth = 128;
        textureHeight = 128;
        this.textures = textures;
        mag_ar = new ModelRenderer(this);
        mag_ar.setRotationPoint(3.5F, 24.0F, 0.1F);
        mag_ar.setTextureOffset(44, 22).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 9.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-8.0F, 31.6F, -7.8F);
        mag_ar.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.384F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 9.0F, 20.0F, 24.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 9.0F, 22.0F);
        mag_ar.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.1571F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(58, 53).addBox(-7.0F, 0.0F, -22.0F, 7.0F, 8.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 16.9474F, 20.7345F);
        mag_ar.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(0, 44).addBox(-7.0F, -0.048F, -22.0F, 7.0F, 25.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);


        mag_ak = new ModelRenderer(this);
        mag_ak.setRotationPoint(0.0F, 24.0F, 5.0F);


        ak_cube_r1 = new ModelRenderer(this);
        ak_cube_r1.setRotationPoint(1.9F, 56.1423F, -19.2898F);
        mag_ak.addChild(ak_cube_r1);
        setRotationAngle(ak_cube_r1, -1.0472F, 0.0F, 0.0F);
        ak_cube_r1.setTextureOffset(0, 77).addBox(-5.0F, 0.5F, -16.2F, 6.0F, 19.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r2 = new ModelRenderer(this);
        ak_cube_r2.setRotationPoint(2.9F, 60.6423F, -16.3898F);
        mag_ak.addChild(ak_cube_r2);
        setRotationAngle(ak_cube_r2, -1.0472F, 0.0F, 0.0F);
        ak_cube_r2.setTextureOffset(0, 0).addBox(-7.0F, 0.0F, -17.0F, 8.0F, 20.0F, 17.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r3 = new ModelRenderer(this);
        ak_cube_r3.setRotationPoint(1.9F, 43.2865F, -3.9689F);
        mag_ak.addChild(ak_cube_r3);
        setRotationAngle(ak_cube_r3, -0.829F, 0.0F, 0.0F);
        ak_cube_r3.setTextureOffset(83, 29).addBox(-5.0F, 1.1F, -16.8F, 6.0F, 19.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r4 = new ModelRenderer(this);
        ak_cube_r4.setRotationPoint(1.9F, 28.1035F, 5.8027F);
        mag_ak.addChild(ak_cube_r4);
        setRotationAngle(ak_cube_r4, -0.5672F, 0.0F, 0.0F);
        ak_cube_r4.setTextureOffset(26, 87).addBox(-5.0F, 1.0F, -17.0F, 6.0F, 15.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r5 = new ModelRenderer(this);
        ak_cube_r5.setRotationPoint(1.9F, 3.1172F, -3.8964F);
        mag_ak.addChild(ak_cube_r5);
        setRotationAngle(ak_cube_r5, -0.3054F, 0.0F, 0.0F);
        ak_cube_r5.setTextureOffset(93, 87).addBox(-5.0F, 5.0F, 0.0F, 6.0F, 14.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r6 = new ModelRenderer(this);
        ak_cube_r6.setRotationPoint(1.9F, -1.4F, -5.0F);
        mag_ak.addChild(ak_cube_r6);
        setRotationAngle(ak_cube_r6, -0.0436F, 0.0F, 0.0F);
        ak_cube_r6.setTextureOffset(33, 0).addBox(-5.0F, 1.0F, 0.0F, 6.0F, 10.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r7 = new ModelRenderer(this);
        ak_cube_r7.setRotationPoint(2.9F, 47.7865F, -1.0689F);
        mag_ak.addChild(ak_cube_r7);
        setRotationAngle(ak_cube_r7, -0.8727F, 0.0F, 0.0F);
        ak_cube_r7.setTextureOffset(33, 20).addBox(-7.0F, 0.0F, -17.0F, 8.0F, 20.0F, 17.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r8 = new ModelRenderer(this);
        ak_cube_r8.setRotationPoint(3.0F, 31.4035F, 10.4027F);
        mag_ak.addChild(ak_cube_r8);
        setRotationAngle(ak_cube_r8, -0.6109F, 0.0F, 0.0F);
        ak_cube_r8.setTextureOffset(0, 40).addBox(-7.1F, 0.0F, -17.0F, 8.0F, 20.0F, 17.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r9 = new ModelRenderer(this);
        ak_cube_r9.setRotationPoint(2.9F, 7.2172F, 0.2036F);
        mag_ak.addChild(ak_cube_r9);
        setRotationAngle(ak_cube_r9, -0.3054F, 0.0F, 0.0F);
        ak_cube_r9.setTextureOffset(50, 57).addBox(-7.0F, 0.0F, 0.0F, 8.0F, 20.0F, 17.0F, 0.0F, false, true, true, true, true, true, true);

        ak_cube_r10 = new ModelRenderer(this);
        ak_cube_r10.setRotationPoint(2.9F, -1.4F, 0.0F);
        mag_ak.addChild(ak_cube_r10);
        setRotationAngle(ak_cube_r10, -0.0436F, 0.0F, 0.0F);
        ak_cube_r10.setTextureOffset(66, 0).addBox(-7.0F, 1.0F, 0.0F, 8.0F, 12.0F, 17.0F, 0.0F, false, true, true, true, true, true, true);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mag_ar.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


    @Override
    public void render(MatrixStack matrixStack, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode, IGenericGun gun) {
        IRenderTypeBuffer.Impl buffer = Minecraft.getInstance().getRenderTypeBuffers().getBufferSource();
        if (gun.getSeriesName().equals("ar")) {
            IVertexBuilder builder = buffer.getBuffer(RenderType.getArmorCutoutNoCull(textures.get(0)));
            mag_ar.render(matrixStack, builder, packedLight, packedOverlay, 1, 1, 1, 1);
        } else if (gun.getSeriesName().equals("ak")) {
            IVertexBuilder builder = buffer.getBuffer(RenderType.getArmorCutoutNoCull(textures.get(1)));
            mag_ak.render(matrixStack, builder, packedLight, packedOverlay, 1, 1, 1, 1);
        }
        buffer.finish();
    }
}