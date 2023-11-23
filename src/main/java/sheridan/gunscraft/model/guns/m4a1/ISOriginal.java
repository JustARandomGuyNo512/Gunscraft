package sheridan.gunscraft.model.guns.m4a1;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.model.ModelRenderer;

public class ISOriginal extends EntityModel<Entity> {
private final ModelRenderer IS_original;
private final ModelRenderer cube_r1;
private final ModelRenderer cube_r2;
private final ModelRenderer cube_r3;
private final ModelRenderer cube_r4;
private final ModelRenderer cube_r5;
private final ModelRenderer cube_r6;
private final ModelRenderer cube_r7;
private final ModelRenderer cube_r8;
private final ModelRenderer cube_r9;
private final ModelRenderer cube_r10;
private final ModelRenderer cube_r11;
private final ModelRenderer cube_r12;
private final ModelRenderer cube_r13;
private final ModelRenderer cube_r14;
public final ResourceLocation texture;

public ISOriginal() {
        textureWidth = 256;
        textureHeight = 256;
        texture = new ResourceLocation(Gunscraft.MOD_ID, "textures/guns/m4a1/m4a1_is_original.png");
        IS_original = new ModelRenderer(this);
        IS_original.setRotationPoint(0.0F, 24.0F, 0.0F);
        IS_original.setTextureOffset(0, 0).addBox(-3.0F, 6.9F, 81.0F, 6.0F, 1.0F, 61.0F, 0.0F, false, true, true, true, true, true, true);
        IS_original.setTextureOffset(104, 51).addBox(-3.0F, -0.1F, 85.0F, 6.0F, 1.0F, 46.0F, 0.0F, false, false, false, true, true, true, true);
        IS_original.setTextureOffset(0, 115).addBox(-3.0F, -1.1F, 87.0F, 6.0F, 1.0F, 44.0F, 0.0F, false, false, false, false, false, true, true);
        IS_original.setTextureOffset(56, 116).addBox(-3.0F, -3.1F, 102.0F, 6.0F, 2.0F, 29.0F, 0.0F, false, false, false, false, false, true, true);
        IS_original.setTextureOffset(41, 8).addBox(-3.0F, 0.9F, 81.0F, 6.0F, 6.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);
        IS_original.setTextureOffset(0, 24).addBox(-3.0F, 0.9F, 126.0F, 6.0F, 6.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);
        IS_original.setTextureOffset(0, 0).addBox(-4.0F, -5.13F, 131.0F, 8.0F, 5.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);
        IS_original.setTextureOffset(32, 36).addBox(-5.0F, 6.9F, 123.0F, 2.0F, 3.0F, 6.0F, 0.0F, false, true, true, true, true, false, true);
        IS_original.setTextureOffset(0, 35).addBox(-5.0F, 6.9F, 81.1F, 2.0F, 3.0F, 6.0F, 0.0F, false, true, true, true, true, false, true);
        IS_original.setTextureOffset(0, 62).addBox(3.0F, 7.9F, 81.1F, 1.0F, 2.0F, 50.0F, 0.0F, false, true, true, false, false, true, true);
        IS_original.setTextureOffset(10, 35).addBox(-1.5F, -5.6F, 133.9F, 3.0F, 3.0F, 3.0F, 0.0F, false, true, false, false, true, false, false);
        IS_original.setTextureOffset(0, 12).addBox(-3.0F, 3.9F, 131.0F, 6.0F, 3.0F, 9.0F, 0.0F, false, false, false, true, false, true, true);
        IS_original.setTextureOffset(21, 12).addBox(-3.0F, -0.1F, 131.0F, 6.0F, 1.0F, 8.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(3.0F, -0.1F, 139.0F);
        IS_original.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(22, 32).addBox(-6.0F, 0.0F, -2.0F, 6.0F, 8.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.9F, 131.0F);
        IS_original.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        cube_r2.setTextureOffset(22, 24).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(4.0F, -5.1F, 135.9F);
        IS_original.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(23, 0).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 3.0F, 3.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(4.4F, -3.2787F, 133.7787F);
        IS_original.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(30, 6).addBox(-11.0F, 0.0F, 0.0F, 11.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(4.0F, 9.9F, 81.1F);
        IS_original.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
        cube_r5.setTextureOffset(52, 64).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 50.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(4.0F, 7.9F, 81.1F);
        IS_original.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
        cube_r6.setTextureOffset(73, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 50.0F, 0.0F, false, true, true, true, true, false, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(6.9F, 6.7F, 126.0F);
        IS_original.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(42, 36).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(6.9F, 6.7F, 85.0F);
        IS_original.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(45, 0).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-4.1F, -5.4F, 133.9F);
        IS_original.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(0, 44).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 4.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(3.0F, 0.9F, 124.6F);
        IS_original.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(38, 32).addBox(-6.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(3.0F, 6.9F, 124.6F);
        IS_original.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(41, 16).addBox(-6.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(3.0F, 6.9F, 81.5F);
        IS_original.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(14, 42).addBox(-6.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(3.0F, 0.9F, 81.0F);
        IS_original.addChild(cube_r13);
        setRotationAngle(cube_r13, -1.0734F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(37, 21).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 6.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(3.0F, -5.1F, 131.0F);
        IS_original.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0698F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(109, 98).addBox(-6.0F, 0.0F, -45.0F, 6.0F, 2.0F, 45.0F, 0.0F, false, false, false, true, false, true, true);
        }

@Override
public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
        }

@Override
public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        IS_original.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        }

public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
        }

}