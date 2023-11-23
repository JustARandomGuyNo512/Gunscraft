package sheridan.gunscraft.model.guns.m4a1;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.vertex.VertexBuilderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeBuffers;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.model.ModelRenderer;

public class HandGuardOriginal extends EntityModel<Entity> {
    private final ModelRenderer hand_guard_original;
    private final ModelRenderer clienderA;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer clienderB;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer clienderC;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer clienderD;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer front_ring;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
public final ResourceLocation texture = new ResourceLocation(Gunscraft.MOD_ID, "textures/guns/m4a1/m4a1_hand_guard_original.png");

public HandGuardOriginal() {
    textureWidth = 512;
    textureHeight = 512;

    hand_guard_original = new ModelRenderer(this);
    hand_guard_original.setRotationPoint(0.0F, 43.5F, 19.0F);


    clienderA = new ModelRenderer(this);
    clienderA.setRotationPoint(-7.3973F, -8.4483F, 54.7167F);
    hand_guard_original.addChild(clienderA);
    setRotationAngle(clienderA, 0.0175F, -0.0175F, 0.0F);


    cube_r1 = new ModelRenderer(this);
    cube_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderA.addChild(cube_r1);
    setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
    cube_r1.setTextureOffset(0, 62).addBox(0.0F, 0.0F, -57.0F, 8.0F, 5.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);

    cube_r2 = new ModelRenderer(this);
    cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderA.addChild(cube_r2);
    setRotationAngle(cube_r2, 0.0F, 0.0F, -1.1781F);
    cube_r2.setTextureOffset(0, 0).addBox(-8.0F, 0.0F, -57.0F, 8.0F, 5.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);

    clienderB = new ModelRenderer(this);
    clienderB.setRotationPoint(7.3973F, -8.4483F, 54.7167F);
    hand_guard_original.addChild(clienderB);
    setRotationAngle(clienderB, 0.0175F, 0.0175F, 0.0F);


    cube_r3 = new ModelRenderer(this);
    cube_r3.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderB.addChild(cube_r3);
    setRotationAngle(cube_r3, 0.0F, 0.0F, 1.1781F);
    cube_r3.setTextureOffset(73, 5).addBox(0.0F, 0.0F, -57.0F, 8.0F, 5.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);

    cube_r4 = new ModelRenderer(this);
    cube_r4.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderB.addChild(cube_r4);
    setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
    cube_r4.setTextureOffset(73, 67).addBox(-8.0F, 0.0F, -57.0F, 8.0F, 5.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);

    clienderC = new ModelRenderer(this);
    clienderC.setRotationPoint(7.3973F, 6.3315F, 54.7167F);
    hand_guard_original.addChild(clienderC);
    setRotationAngle(clienderC, -0.0175F, 0.0175F, 0.0F);


    cube_r5 = new ModelRenderer(this);
    cube_r5.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderC.addChild(cube_r5);
    setRotationAngle(cube_r5, 0.0F, 0.0F, 1.1781F);
    cube_r5.setTextureOffset(124, 129).addBox(-5.0F, 0.0F, -57.0F, 5.0F, 8.0F, 57.0F, 0.0F, false, true, true, false, false, true, false);

    cube_r6 = new ModelRenderer(this);
    cube_r6.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderC.addChild(cube_r6);
    setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
    cube_r6.setTextureOffset(146, 10).addBox(-5.0F, -8.0F, -57.0F, 5.0F, 8.0F, 57.0F, 0.0F, false, true, true, false, false, true, false);

    clienderD = new ModelRenderer(this);
    clienderD.setRotationPoint(-7.3973F, 6.3315F, 54.7167F);
    hand_guard_original.addChild(clienderD);
    setRotationAngle(clienderD, -0.0175F, -0.0175F, 0.0F);


    cube_r7 = new ModelRenderer(this);
    cube_r7.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderD.addChild(cube_r7);
    setRotationAngle(cube_r7, 0.0F, 0.0F, -1.1781F);
    cube_r7.setTextureOffset(0, 189).addBox(0.0F, 0.0F, -57.0F, 5.0F, 8.0F, 57.0F, 0.0F, false, true, true, false, false, false, true);

    cube_r8 = new ModelRenderer(this);
    cube_r8.setRotationPoint(0.0F, 0.0F, 1.0F);
    clienderD.addChild(cube_r8);
    setRotationAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
    cube_r8.setTextureOffset(0, 124).addBox(0.0F, -8.0F, -57.0F, 5.0F, 8.0F, 57.0F, 0.0F, false, true, true, false, false, false, true);

    front_ring = new ModelRenderer(this);
    front_ring.setRotationPoint(0.0F, 0.0F, 0.0F);
    hand_guard_original.addChild(front_ring);
    front_ring.setTextureOffset(0, 24).addBox(-6.9282F, -5.0F, -4.0F, 5.0F, 8.0F, 3.0F, 0.0F, false, true, false, false, false, false, true);
    front_ring.setTextureOffset(22, 0).addBox(1.9282F, -5.0F, -4.0F, 5.0F, 8.0F, 3.0F, 0.0F, false, true, false, false, false, true, false);

    cube_r9 = new ModelRenderer(this);
    cube_r9.setRotationPoint(6.4282F, 2.134F, -3.0F);
    front_ring.addChild(cube_r9);
    setRotationAngle(cube_r9, 0.0F, 0.0F, -0.5236F);
    cube_r9.setTextureOffset(19, 21).addBox(-8.0F, -4.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, false, false, true, false, false);

    cube_r10 = new ModelRenderer(this);
    cube_r10.setRotationPoint(6.9282F, -5.0F, -3.0F);
    front_ring.addChild(cube_r10);
    setRotationAngle(cube_r10, 0.0F, 0.0F, 0.5236F);
    cube_r10.setTextureOffset(0, 0).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, false, true, false, false, false);

    cube_r11 = new ModelRenderer(this);
    cube_r11.setRotationPoint(0.5F, 6.134F, -3.0F);
    front_ring.addChild(cube_r11);
    setRotationAngle(cube_r11, 0.0F, 0.0F, 0.5236F);
    cube_r11.setTextureOffset(0, 8).addBox(-8.0F, -4.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, false, false, true, false, false);

    cube_r12 = new ModelRenderer(this);
    cube_r12.setRotationPoint(0.0F, -9.0F, -3.0F);
    front_ring.addChild(cube_r12);
    setRotationAngle(cube_r12, 0.0F, 0.0F, -0.5236F);
    cube_r12.setTextureOffset(0, 16).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, false, true, false, false, false);

    bone = new ModelRenderer(this);
    bone.setRotationPoint(0.0F, 0.0F, 0.0F);
    hand_guard_original.addChild(bone);


    cube_r13 = new ModelRenderer(this);
    cube_r13.setRotationPoint(-10.4998F, -2.5584F, 56.2917F);
    bone.addChild(cube_r13);
    setRotationAngle(cube_r13, 0.0F, -0.0262F, 0.0F);
    cube_r13.setTextureOffset(190, 136).addBox(0.0F, 0.0F, -58.0F, 6.0F, 3.0F, 58.0F, 0.0F, false, true, true, true, true, false, true);

    cube_r14 = new ModelRenderer(this);
    cube_r14.setRotationPoint(2.9936F, 9.4187F, 55.7919F);
    bone.addChild(cube_r14);
    setRotationAngle(cube_r14, -0.0262F, 0.0F, 0.0F);
    cube_r14.setTextureOffset(193, 197).addBox(-6.0F, -3.0F, -57.0F, 6.0F, 3.0F, 57.0F, 0.0F, false, true, true, false, true, true, true);

    cube_r15 = new ModelRenderer(this);
    cube_r15.setRotationPoint(10.4998F, -2.5584F, 56.2917F);
    bone.addChild(cube_r15);
    setRotationAngle(cube_r15, 0.0F, 0.0262F, 0.0F);
    cube_r15.setTextureOffset(191, 75).addBox(-6.0F, 0.0F, -58.0F, 6.0F, 3.0F, 58.0F, 0.0F, false, true, true, true, true, true, false);

    cube_r16 = new ModelRenderer(this);
    cube_r16.setRotationPoint(-3.0064F, -11.5355F, 55.7919F);
    bone.addChild(cube_r16);
    setRotationAngle(cube_r16, 0.0262F, 0.0F, 0.0F);
    cube_r16.setTextureOffset(67, 197).addBox(0.0F, 0.0F, -57.0F, 6.0F, 3.0F, 57.0F, 0.0F, false, true, true, true, false, true, true);
}

@Override
public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
        }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Minecraft.getInstance().getTextureManager().bindTexture(texture);
        hand_guard_original.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}