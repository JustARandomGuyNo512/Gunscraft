// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports
package sheridan.gunscraft.model.guns;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelMp5 extends EntityModel<Entity> implements IGunModel {
    private final ModelRenderer slide;
    private final ModelRenderer cube_r1;
    private final ModelRenderer barrel;
    private final ModelRenderer cube_r2;
    private final ModelRenderer mag;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer stock;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer muzzel;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer aim;
    private final ModelRenderer cube_r62;
    private final ModelRenderer handguard;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;

    public ModelMp5() {
        textureWidth = 512;
        textureHeight = 512;

        slide = new ModelRenderer(this);
        slide.setRotationPoint(0.0F, 24.0F, 0.0F);
        slide.setTextureOffset(36, 147).addBox(-1.6232F, 4.2553F, 66.7F, 3.0F, 6.0F, 13.0F, 0.0F, false, true, false, true, false, false, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-1.5232F, 8.0553F, 66.7F);
        slide.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.6109F);
        cube_r1.setTextureOffset(122, 161).addBox(0.0F, 0.0F, 0.0F, 3.0F, 4.0F, 13.0F, 0.0F, false, true, false, false, false, false, true);

        barrel = new ModelRenderer(this);
        barrel.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-0.7F, 15.1F, -9.0F);
        barrel.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
        cube_r2.setTextureOffset(142, 273).addBox(-2.0F, -3.0F, 0.0F, 3.0F, 3.0F, 65.0F, 0.0F, false, false, false, true, true, true, true);

        mag = new ModelRenderer(this);
        mag.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-3.4232F, 55.4577F, 60.403F);
        mag.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(112, 56).addBox(0.0F, 0.0F, -10.0F, 7.0F, 24.0F, 10.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-4.0232F, 36.6639F, 67.2434F);
        mag.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(158, 144).addBox(0.6F, 0.0F, -10.0F, 7.0F, 20.0F, 10.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-3.4232F, 20.1553F, 60.0F);
        mag.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(168, 0).addBox(0.0F, 0.0F, 0.0F, 7.0F, 15.0F, 10.0F, 0.0F, false, true, true, false, false, true, true);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 82).addBox(-4.2321F, -5.366F, -3.3F, 1.0F, 5.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(0, 0).addBox(3.4282F, -5.366F, -3.3F, 1.0F, 5.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(58, 26).addBox(-0.4019F, 1.834F, 55.9F, 1.0F, 1.0F, 24.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(137, 134).addBox(-0.9019F, 1.634F, 80.9F, 2.0F, 2.0F, 6.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(168, 25).addBox(-0.4019F, 1.834F, 87.5F, 1.0F, 1.0F, 15.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(112, 56).addBox(-3.8232F, 20.1553F, 73.7F, 8.0F, 6.0F, 45.0F, 0.0F, false, false, true, true, true, true, true);
        body.setTextureOffset(173, 74).addBox(-5.7911F, 12.3511F, 53.7F, 2.0F, 3.0F, 13.0F, 0.0F, false, true, true, false, true, false, true);
        body.setTextureOffset(21, 172).addBox(3.9089F, 12.3511F, 53.7F, 2.0F, 3.0F, 13.0F, 0.0F, false, true, true, false, true, true, false);
        body.setTextureOffset(177, 174).addBox(-5.7175F, 14.805F, 53.7F, 2.0F, 1.0F, 13.0F, 0.0F, false, true, true, false, false, false, true);
        body.setTextureOffset(98, 174).addBox(3.8825F, 14.805F, 53.7F, 2.0F, 1.0F, 13.0F, 0.0F, false, true, true, false, false, true, false);
        body.setTextureOffset(182, 131).addBox(-2.9232F, 8.2553F, 53.7F, 2.0F, 1.0F, 13.0F, 0.0F, false, true, true, true, false, false, false);
        body.setTextureOffset(271, 68).addBox(-2.9232F, 8.2553F, 78.7F, 2.0F, 1.0F, 41.0F, 0.0F, false, true, false, true, false, false, false);
        body.setTextureOffset(0, 268).addBox(1.0768F, 8.2553F, 53.7F, 2.0F, 1.0F, 67.0F, 0.0F, false, true, false, true, false, false, false);
        body.setTextureOffset(71, 269).addBox(1.0768F, 6.2553F, 53.9F, 1.0F, 2.0F, 67.0F, 0.0F, false, true, false, false, false, true, false);
        body.setTextureOffset(135, 35).addBox(-1.9232F, 6.2553F, 53.9F, 1.0F, 2.0F, 13.0F, 0.0F, false, true, true, false, false, false, true);
        body.setTextureOffset(213, 269).addBox(-1.9232F, 6.2553F, 78.9F, 1.0F, 2.0F, 41.0F, 0.0F, false, true, false, false, false, false, true);
        body.setTextureOffset(301, 265).addBox(-4.4232F, 12.4476F, 66.7F, 9.0F, 3.0F, 54.0F, 0.0F, false, false, false, false, false, true, true);
        body.setTextureOffset(112, 0).addBox(-3.8732F, 6.8476F, 118.9F, 8.0F, 19.0F, 11.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(304, 185).addBox(-2.9232F, 18.4476F, 66.7F, 6.0F, 6.0F, 54.0F, 0.0F, false, false, false, false, true, true, true);
        body.setTextureOffset(30, 54).addBox(-2.4232F, 23.7476F, 68.6F, 5.0F, 10.0F, 6.0F, 0.0F, false, false, false, false, true, true, true);
        body.setTextureOffset(224, 0).addBox(-3.4232F, 18.0816F, 53.7F, 7.0F, 1.0F, 67.0F, 0.0F, false, true, false, false, true, false, false);
        body.setTextureOffset(370, 125).addBox(-3.8232F, 26.1553F, 73.2F, 8.0F, 8.0F, 37.0F, 0.0F, false, false, true, false, true, true, true);
        body.setTextureOffset(56, 54).addBox(-4.3232F, 20.1553F, 73.2F, 9.0F, 14.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);
        body.setTextureOffset(84, 43).addBox(-2.3232F, 26.6553F, 70.2F, 7.0F, 3.0F, 2.0F, 0.0F, false, true, true, true, true, true, false);
        body.setTextureOffset(36, 39).addBox(-5.9232F, 21.4553F, 60.8F, 2.0F, 7.0F, 6.0F, 0.0F, false, true, false, false, false, true, true);
        body.setTextureOffset(115, 145).addBox(-1.8232F, 43.4316F, 80.6042F, 4.0F, 2.0F, 14.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(305, 0).addBox(-2.5F, 3.634F, 10.9F, 1.0F, 3.0F, 56.0F, 0.0F, false, true, true, false, false, false, true);
        body.setTextureOffset(372, 322).addBox(-2.5F, 3.634F, 78.9F, 1.0F, 3.0F, 40.0F, 0.0F, false, true, false, false, false, false, true);
        body.setTextureOffset(42, 166).addBox(0.6962F, 3.634F, 10.9F, 2.0F, 3.0F, 14.0F, 0.0F, false, true, true, false, false, true, false);
        body.setTextureOffset(153, 196).addBox(1.6962F, 3.634F, 48.9F, 1.0F, 3.0F, 70.0F, 0.0F, false, true, false, false, false, true, false);
        body.setTextureOffset(94, 92).addBox(-1.4F, 5.3F, 4.0F, 3.0F, 8.0F, 4.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(0, 54).addBox(-2.0F, 0.0F, -3.3F, 4.0F, 12.0F, 5.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(58, 26).addBox(6.6962F, 11.8942F, 118.9F, 1.0F, 6.0F, 11.0F, 0.0F, false, true, true, false, false, true, false);
        body.setTextureOffset(86, 54).addBox(-7.5F, 11.8942F, 118.9F, 1.0F, 6.0F, 11.0F, 0.0F, false, true, true, false, false, false, true);
        body.setTextureOffset(58, 0).addBox(-2.4019F, 9.5781F, 128.8583F, 5.0F, 12.0F, 4.0F, 0.0F, false, false, true, false, false, true, true);
        body.setTextureOffset(0, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(2.5981F, 18.0426F, 129.3228F);
        body.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(32, 96).addBox(-5.0F, 0.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-0.4019F, 16.2781F, 135.8583F);
        body.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.0F);
        cube_r7.setTextureOffset(46, 30).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 9.0F, 1.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(3.5981F, 14.5781F, 133.8583F);
        body.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
        cube_r8.setTextureOffset(0, 191).addBox(-5.0F, 0.0F, -4.0F, 5.0F, 5.0F, 9.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(2.5981F, 3.234F, 129.9F);
        body.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(79, 113).addBox(-5.0F, 0.0F, -4.0F, 5.0F, 7.0F, 4.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(7.6962F, 17.8942F, 118.9F);
        body.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 1.0472F);
        cube_r10.setTextureOffset(140, 19).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 11.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-7.5F, 17.8942F, 118.9F);
        body.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, -1.0472F);
        cube_r11.setTextureOffset(192, 69).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 11.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(7.6962F, 11.8942F, 118.9F);
        body.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.8727F);
        cube_r12.setTextureOffset(79, 174).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 11.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-7.5F, 11.8942F, 118.9F);
        body.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, -0.8727F);
        cube_r13.setTextureOffset(158, 174).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 11.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-2.5F, 3.234F, 118.9F);
        body.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, -1.1956F);
        cube_r14.setTextureOffset(0, 172).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 11.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0981F, 1.734F, 118.9F);
        body.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -0.5236F);
        cube_r15.setTextureOffset(190, 56).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 11.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0981F, 1.734F, 118.9F);
        body.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, -1.0472F);
        cube_r16.setTextureOffset(28, 191).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 3.0F, 11.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(2.6962F, 3.234F, 118.9F);
        body.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, -0.384F);
        cube_r17.setTextureOffset(84, 26).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 6.0F, 11.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(-0.7F, 16.5F, -3.8F);
        body.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
        cube_r18.setTextureOffset(29, 0).addBox(-4.0F, -5.0F, 0.0F, 5.0F, 5.0F, 6.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(-0.7F, 8.0F, -3.8F);
        body.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
        cube_r19.setTextureOffset(30, 82).addBox(-4.0F, -5.0F, 0.0F, 5.0F, 5.0F, 6.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(-0.7F, 7.3F, 4.0F);
        body.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
        cube_r20.setTextureOffset(138, 116).addBox(-3.0F, -4.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(-0.7F, 6.6F, -3.5F);
        body.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
        cube_r21.setTextureOffset(117, 116).addBox(-2.0F, -3.0F, 0.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(0.8301F, 4.866F, 49.9F);
        body.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, 0.5236F);
        cube_r22.setTextureOffset(77, 194).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 70.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(7.3301F, 4.166F, 24.5F);
        body.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.2182F, -0.1745F);
        cube_r23.setTextureOffset(86, 71).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(4.8301F, 4.166F, 25.9F);
        body.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.0F, -0.1745F);
        cube_r24.setTextureOffset(0, 10).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(0.8301F, 3.866F, 24.9F);
        body.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
        cube_r25.setTextureOffset(56, 54).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 24.0F, 0.0F, false, true, false, true, true, true, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(0.8301F, 4.866F, 11.9F);
        body.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, 0.5236F);
        cube_r26.setTextureOffset(0, 113).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 33.0F, 0.0F, false, true, true, true, false, true, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(-0.4019F, 7.2679F, 11.9F);
        body.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, 1.0472F);
        cube_r27.setTextureOffset(0, 0).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 110.0F, 0.0F, false, true, false, true, false, true, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(-1.134F, 6.2679F, 79.9F);
        body.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, -1.0472F);
        cube_r28.setTextureOffset(373, 245).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 40.0F, 0.0F, false, true, false, false, false, false, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.5981F, 7.2679F, 11.9F);
        body.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.0F, -1.0472F);
        cube_r29.setTextureOffset(387, 451).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 56.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(-2.8232F, 23.0553F, 112.2F);
        body.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.7854F, 0.0F, 0.0F);
        cube_r30.setTextureOffset(83, 81).addBox(-1.0F, 0.0F, 0.0F, 8.0F, 7.0F, 4.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(-1.8232F, 25.8837F, 100.0284F);
        body.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.7854F, 0.0F, 0.0F);
        cube_r31.setTextureOffset(0, 45).addBox(-4.0F, 0.0F, 0.0F, 12.0F, 2.0F, 5.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-1.8232F, 23.0553F, 97.2F);
        body.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.7854F, 0.0F, 0.0F);
        cube_r32.setTextureOffset(0, 96).addBox(-4.0F, 0.0F, 0.0F, 12.0F, 4.0F, 4.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-2.8232F, 33.2048F, 104.9241F);
        body.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.5672F, 0.0F, 0.0F);
        cube_r33.setTextureOffset(0, 113).addBox(-1.0F, 0.0F, 0.0F, 8.0F, 29.0F, 4.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(-2.8232F, 34.1553F, 95.3F);
        body.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.4363F, 0.0F, 0.0F);
        cube_r34.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 8.0F, 32.0F, 13.0F, 0.0F, false, true, false, false, true, true, true);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-1.8232F, 41.7741F, 99.4646F);
        body.addChild(cube_r35);
        setRotationAngle(cube_r35, -1.0908F, 0.0F, 0.0F);
        cube_r35.setTextureOffset(55, 147).addBox(0.0F, 0.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-2.7232F, 33.2553F, 91.9F);
        body.addChild(cube_r36);
        setRotationAngle(cube_r36, -0.3491F, 0.0F, 0.0F);
        cube_r36.setTextureOffset(42, 11).addBox(1.0F, 0.0F, 0.0F, 3.0F, 8.0F, 2.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(-1.8232F, 32.2553F, 69.9F);
        body.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.3927F, 0.0F, 0.0F);
        cube_r37.setTextureOffset(42, 21).addBox(0.0F, 0.0F, 0.0F, 4.0F, 8.0F, 1.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(-1.8232F, 34.1553F, 76.5F);
        body.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.3491F, 0.0F, 0.0F);
        cube_r38.setTextureOffset(117, 116).addBox(0.0F, 0.0F, 0.0F, 4.0F, 12.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(-2.3232F, 28.2553F, 57.8F);
        body.addChild(cube_r39);
        setRotationAngle(cube_r39, -0.3054F, 0.0F, 0.0F);
        cube_r39.setTextureOffset(0, 82).addBox(-2.0F, 0.0F, 0.0F, 9.0F, 2.0F, 12.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-2.8232F, 17.0553F, 60.2F);
        body.addChild(cube_r40);
        setRotationAngle(cube_r40, -0.1745F, 0.0F, 0.0F);
        cube_r40.setTextureOffset(56, 81).addBox(-1.0F, -1.0F, 0.0F, 8.0F, 14.0F, 11.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(-4.3232F, 26.4553F, 67.8F);
        body.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.1745F, 0.0F, 0.0F);
        cube_r41.setTextureOffset(56, 71).addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false, true, true, true, true, false, true);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(-2.3232F, 29.8553F, 73.2F);
        body.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.7854F, 0.0F, 0.0F);
        cube_r42.setTextureOffset(58, 43).addBox(-2.0F, 0.0F, 0.0F, 9.0F, 3.0F, 3.0F, 0.0F, false, true, false, false, true, true, true);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(-1.3762F, 11.5444F, 53.7F);
        body.addChild(cube_r43);
        setRotationAngle(cube_r43, 0.0F, 0.0F, 0.9599F);
        cube_r43.setTextureOffset(235, 116).addBox(1.0F, 4.0F, 0.0F, 4.0F, 2.0F, 67.0F, 0.0F, false, true, false, false, true, true, true);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(1.5297F, 11.5444F, 53.7F);
        body.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0F, 0.0F, 0.6109F);
        cube_r44.setTextureOffset(230, 265).addBox(4.0F, 1.0F, 0.0F, 2.0F, 4.0F, 67.0F, 0.0F, false, true, false, true, true, true, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(3.0768F, 8.2553F, 53.7F);
        body.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0F, 0.0F, 0.9599F);
        cube_r45.setTextureOffset(227, 196).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 67.0F, 0.0F, false, true, false, true, false, true, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(-2.9232F, 8.2553F, 78.7F);
        body.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.0F, 0.0F, 0.6109F);
        cube_r46.setTextureOffset(370, 179).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 41.0F, 0.0F, false, true, false, false, true, false, true);
        cube_r46.setTextureOffset(188, 38).addBox(0.0F, 3.0F, -12.0F, 2.0F, 2.0F, 12.0F, 0.0F, false, false, false, true, true, false, true);
        cube_r46.setTextureOffset(173, 56).addBox(0.0F, 0.0F, -25.0F, 2.0F, 5.0F, 13.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(-1.134F, 0.2679F, -3.3F);
        body.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.0F, 0.0F, -1.0472F);
        cube_r47.setTextureOffset(0, 147).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(1.3301F, 0.2679F, -3.3F);
        body.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0F, 0.0F, 1.0472F);
        cube_r48.setTextureOffset(36, 147).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(0.0981F, -7.866F, -3.3F);
        body.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, 0.0F, 1.0472F);
        cube_r49.setTextureOffset(137, 142).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(0.0981F, -7.866F, -3.3F);
        body.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, 0.0F, -1.0472F);
        cube_r50.setTextureOffset(79, 145).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(-2.0F, 4.5F, 11.9F);
        body.addChild(cube_r51);
        setRotationAngle(cube_r51, 0.0F, 0.0F, 1.0472F);
        cube_r51.setTextureOffset(112, 3).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 110.0F, 0.0F, false, true, false, true, true, false, true);

        stock = new ModelRenderer(this);
        stock.setRotationPoint(0.0F, 24.0F, 0.0F);
        stock.setTextureOffset(79, 116).addBox(-6.3F, 12.9F, 104.0F, 2.0F, 3.0F, 75.0F, 0.0F, false, true, false, true, false, true, true);
        stock.setTextureOffset(0, 113).addBox(4.5F, 12.9F, 103.0F, 2.0F, 3.0F, 75.0F, 0.0F, false, true, false, true, false, true, true);
        stock.setTextureOffset(58, 0).addBox(-2.4019F, 6.5781F, 165.8583F, 5.0F, 6.0F, 20.0F, 0.0F, false, true, true, true, false, false, false);
        stock.setTextureOffset(79, 145).addBox(0.2549F, 12.235F, 165.8583F, 8.0F, 9.0F, 20.0F, 0.0F, false, true, true, false, true, true, false);
        stock.setTextureOffset(79, 116).addBox(-8.0588F, 12.235F, 165.8583F, 9.0F, 9.0F, 20.0F, 0.0F, false, true, true, false, true, false, true);
        stock.setTextureOffset(158, 116).addBox(-5.0588F, 9.235F, 180.8583F, 10.0F, 20.0F, 8.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(5.5937F, 15.4774F, 104.0F);
        stock.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0F, 0.0F, 0.4363F);
        cube_r52.setTextureOffset(158, 119).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 75.0F, 0.0F, false, true, false, false, true, true, true);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(4.9412F, 32.4796F, 185.4922F);
        stock.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.1745F, 0.0F, 0.0F);
        cube_r53.setTextureOffset(39, 113).addBox(-10.0F, -4.0F, -4.0F, 10.0F, 23.0F, 8.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(6.1336F, 19.1137F, 184.8583F);
        stock.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 0.0F, -0.7854F);
        cube_r54.setTextureOffset(79, 124).addBox(-5.0F, 0.0F, -4.0F, 5.0F, 3.0F, 5.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(-2.4019F, 22.6492F, 184.8583F);
        stock.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, 0.0F, 0.7854F);
        cube_r55.setTextureOffset(136, 56).addBox(-5.0F, 0.0F, -4.0F, 5.0F, 3.0F, 5.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(4.9412F, 16.735F, 173.4583F);
        stock.addChild(cube_r56);
        setRotationAngle(cube_r56, 1.0036F, 0.0F, 0.0F);
        cube_r56.setTextureOffset(112, 30).addBox(-10.0F, 2.0F, -4.0F, 10.0F, 10.0F, 8.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(2.5981F, 6.5781F, 169.8583F);
        stock.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, 0.0F, -0.7854F);
        cube_r57.setTextureOffset(0, 54).addBox(-5.0F, 0.0F, -4.0F, 5.0F, 8.0F, 20.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(-2.4019F, 6.5781F, 169.8583F);
        stock.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, 0.0F, -0.7854F);
        cube_r58.setTextureOffset(0, 147).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 5.0F, 20.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(-6.3F, 15.9F, 105.0F);
        stock.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.0F, -0.4363F);
        cube_r59.setTextureOffset(0, 191).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 75.0F, 0.0F, false, true, false, false, true, true, true);

        muzzel = new ModelRenderer(this);
        muzzel.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-0.7F, 16.5F, -11.6F);
        muzzel.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.0F, 0.0F, 0.7854F);
        cube_r60.setTextureOffset(192, 145).addBox(-4.0F, -5.0F, 0.0F, 5.0F, 5.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(-0.7F, 15.8F, -19.6F);
        muzzel.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 0.0F, 0.7854F);
        cube_r61.setTextureOffset(192, 157).addBox(-3.0F, -4.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false, true, false, true, true, true, true);

        aim = new ModelRenderer(this);
        aim.setRotationPoint(0.0F, 24.0F, 0.0F);
        aim.setTextureOffset(185, 25).addBox(-2.4019F, 0.934F, 105.9F, 5.0F, 3.0F, 10.0F, 0.0F, false, true, true, true, false, true, true);
        aim.setTextureOffset(131, 90).addBox(-2.4019F, -2.066F, 109.9F, 5.0F, 3.0F, 6.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(2.1981F, -2.366F, 107.0F);
        aim.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.6346F, -0.678F, -0.4326F);
        cube_r62.setTextureOffset(115, 145).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, false, true, true, false, false, true, true);

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
        handguard.setTextureOffset(77, 194).addBox(1.8768F, 7.8553F, 3.7F, 2.0F, 5.0F, 9.0F, 0.0F, false, true, true, true, false, true, false);
        handguard.setTextureOffset(88, 0).addBox(-3.6232F, 7.8553F, 3.7F, 2.0F, 5.0F, 9.0F, 0.0F, false, true, true, true, false, false, true);
        handguard.setTextureOffset(224, 68).addBox(-4.0232F, 8.1553F, 12.7F, 2.0F, 2.0F, 43.0F, 0.0F, false, true, true, true, false, false, false);
        handguard.setTextureOffset(368, 59).addBox(2.1768F, 8.1553F, 12.7F, 2.0F, 2.0F, 43.0F, 0.0F, false, false, true, true, false, false, false);
        handguard.setTextureOffset(102, 436).addBox(-7.0F, 15.0F, 52.7F, 14.0F, 5.0F, 2.0F, 0.0F, false, false, true, false, false, false, false);
        handguard.setTextureOffset(167, 455).addBox(-5.0F, 16.3F, 52.7F, 10.0F, 6.0F, 2.0F, 0.0F, false, false, true, false, false, false, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(4.5768F, 8.3553F, 5.9F);
        handguard.addChild(cube_r63);
        setRotationAngle(cube_r63, -0.7854F, 0.0F, 0.0F);
        cube_r63.setTextureOffset(30, 70).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(-6.3844F, 13.8119F, 3.375F);
        handguard.addChild(cube_r64);
        setRotationAngle(cube_r64, -0.0722F, -0.0843F, -0.6541F);
        cube_r64.setTextureOffset(316, 322).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 52.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(-4.0684F, 7.7952F, 12.6986F);
        handguard.addChild(cube_r65);
        setRotationAngle(cube_r65, 0.0F, -0.0175F, 0.3927F);
        cube_r65.setTextureOffset(363, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 43.0F, 0.0F, false, true, true, true, false, false, true);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(-4.5502F, 8.9511F, 12.8622F);
        handguard.addChild(cube_r66);
        setRotationAngle(cube_r66, -0.0873F, -0.0175F, 0.3927F);
        cube_r66.setTextureOffset(108, 344).addBox(0.0F, 0.0F, 0.0F, 2.0F, 6.0F, 43.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(-6.3844F, 13.8119F, 3.375F);
        handguard.addChild(cube_r67);
        setRotationAngle(cube_r67, -0.0286F, -0.0843F, -0.6541F);
        cube_r67.setTextureOffset(226, 336).addBox(0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 52.0F, 0.0F, false, true, true, true, false, false, true);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(-3.2212F, 11.3869F, 3.7118F);
        handguard.addChild(cube_r68);
        setRotationAngle(cube_r68, -0.0286F, -0.0843F, -0.6541F);
        cube_r68.setTextureOffset(139, 0).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 9.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(-0.4378F, 15.5634F, 3.3875F);
        handguard.addChild(cube_r69);
        setRotationAngle(cube_r69, -0.1134F, 0.0F, 0.0F);
        cube_r69.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 2.0F, 52.0F, 0.0F, false, false, true, false, true, false, false);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(-3.9378F, 16.9634F, 3.0875F);
        handguard.addChild(cube_r70);
        setRotationAngle(cube_r70, -0.0009F, -0.1109F, -1.3552F);
        cube_r70.setTextureOffset(0, 54).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 52.0F, 0.0F, false, true, true, false, true, false, true);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(4.0914F, 16.9634F, 3.0875F);
        handguard.addChild(cube_r71);
        setRotationAngle(cube_r71, -0.1109F, -0.0009F, -0.2155F);
        cube_r71.setTextureOffset(310, 125).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 2.0F, 52.0F, 0.0F, false, true, true, false, true, false, true);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(6.5379F, 13.8119F, 3.375F);
        handguard.addChild(cube_r72);
        setRotationAngle(cube_r72, -0.0286F, 0.0843F, 0.6541F);
        cube_r72.setTextureOffset(0, 336).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 3.0F, 52.0F, 0.0F, false, false, true, false, false, true, false);
        cube_r72.setTextureOffset(112, 90).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 9.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(6.5379F, 13.8119F, 3.375F);
        handguard.addChild(cube_r73);
        setRotationAngle(cube_r73, -0.0722F, 0.0843F, 0.6541F);
        cube_r73.setTextureOffset(112, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 52.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(4.2219F, 7.7952F, 12.6986F);
        handguard.addChild(cube_r74);
        setRotationAngle(cube_r74, 0.0F, 0.0175F, -0.3927F);
        cube_r74.setTextureOffset(155, 350).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 5.0F, 43.0F, 0.0F, false, true, true, true, false, true, false);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setRotationPoint(4.7037F, 8.9511F, 12.8622F);
        handguard.addChild(cube_r75);
        setRotationAngle(cube_r75, -0.0873F, 0.0175F, -0.3927F);
        cube_r75.setTextureOffset(56, 338).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 6.0F, 43.0F, 0.0F, false, true, true, false, false, true, false);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){}

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer,  ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode, GunRenderContext context) {
        slide.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        barrel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        stock.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        muzzel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        aim.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        handguard.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}