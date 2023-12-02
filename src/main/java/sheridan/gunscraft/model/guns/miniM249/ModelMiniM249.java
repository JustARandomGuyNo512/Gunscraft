package sheridan.gunscraft.model.guns.miniM249;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelMiniM249 extends EntityModel<Entity> implements IGunModel {
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
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
    private final ModelRenderer cube_r76;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer muzzle;
    private final ModelRenderer cube_r85;
    private final ModelRenderer stock;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer charge;
    private final ModelRenderer move_part1;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer mag;
    private final ModelRenderer cube_r103;
    private final ModelRenderer bullet_1;
    private final ModelRenderer cube_r104;
    private final ModelRenderer bullet_2;
    private final ModelRenderer cube_r105;
    private final ModelRenderer bullet_3;
    private final ModelRenderer cube_r106;
    private final ModelRenderer bullet_4;
    private final ModelRenderer cube_r107;
    private final ModelRenderer bullet_5;
    private final ModelRenderer cube_r108;
    private final ModelRenderer bullet_6;
    private final ModelRenderer cube_r109;
    private final ModelRenderer bullet_7;
    private final ModelRenderer cube_r110;
    private final ModelRenderer bullet_8;
    private final ModelRenderer cube_r111;
    private final ModelRenderer bullet_9;
    private final ModelRenderer cube_r112;

    public ModelMiniM249() {
        //<
        textureWidth = 1024;
        textureHeight = 1024;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 22.0F, 0.0F);
        body.setTextureOffset(98, 118).addBox(-1.5F, -0.3F, 182.0F, 3.0F, 3.0F, 1.0F, 0.0F, false, false, true, false, false, true, true);
        body.setTextureOffset(297, 327).addBox(-7.5F, -3.0F, 178.0F, 15.0F, 3.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);
        body.setTextureOffset(87, 118).addBox(-7.5F, 0.0F, 167.0F, 15.0F, 7.0F, 20.0F, 0.0F, false, true, true, true, true, true, true);
        body.setTextureOffset(41, 150).addBox(-6.9282F, 13.0F, 90.0F, 6.0F, 3.0F, 3.0F, 0.0F, false, true, false, false, false, false, true);
        body.setTextureOffset(146, 145).addBox(0.9282F, 13.0F, 90.0F, 6.0F, 3.0F, 3.0F, 0.0F, false, true, false, false, false, true, false);
        body.setTextureOffset(0, 0).addBox(-6.0F, 17.3F, 17.0F, 12.0F, 15.0F, 165.0F, 0.0F, false, true, false, true, true, true, true);
        body.setTextureOffset(192, 180).addBox(-7.0F, 17.3F, 182.0F, 14.0F, 16.0F, 8.0F, 0.0F, false, true, false, false, true, true, true);
        body.setTextureOffset(122, 260).addBox(-6.0F, 32.3F, 130.0F, 12.0F, 5.0F, 6.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(441, 229).addBox(-4.5F, 32.3F, 130.0F, 9.0F, 8.0F, 42.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(0, 267).addBox(-4.0F, 40.3F, 150.0F, 8.0F, 8.0F, 18.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(16, 14).addBox(-2.5F, 40.3F, 130.0F, 5.0F, 9.0F, 1.0F, 0.0F, false, false, true, false, false, true, true);
        body.setTextureOffset(307, 296).addBox(-2.5F, 51.8355F, 133.5355F, 5.0F, 1.0F, 14.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(241, 20).addBox(-4.5F, 32.3F, 172.0F, 9.0F, 6.0F, 10.0F, 0.0F, false, false, false, false, true, true, true);
        body.setTextureOffset(339, 98).addBox(-5.5F, 33.3F, 182.0F, 11.0F, 6.0F, 6.0F, 0.0F, false, true, false, false, true, true, true);
        body.setTextureOffset(0, 180).addBox(-8.0F, 15.1F, 23.0F, 16.0F, 7.0F, 160.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(0, 0).addBox(-10.0F, 15.6F, 101.0F, 2.0F, 6.0F, 80.0F, 0.0F, false, true, true, true, true, false, true);
        body.setTextureOffset(194, 408).addBox(-6.0F, 14.1F, 128.0F, 2.0F, 1.0F, 54.0F, 0.0F, false, true, false, true, false, false, true);
        body.setTextureOffset(266, 125).addBox(-9.0F, 14.1F, 182.0F, 18.0F, 9.0F, 11.0F, 0.0F, false, true, false, true, true, true, true);
        body.setTextureOffset(189, 33).addBox(-8.0F, 19.1F, 19.0F, 16.0F, 3.0F, 4.0F, 0.0F, false, true, false, false, true, true, true);
        body.setTextureOffset(380, 305).addBox(-13.0F, 26.3F, 53.0F, 26.0F, 6.0F, 40.0F, 0.0F, false, true, true, true, true, true, true);
        body.setTextureOffset(89, 180).addBox(-6.3F, 22.3F, 101.0F, 1.0F, 8.0F, 30.0F, 0.0F, false, true, true, false, true, false, true);
        body.setTextureOffset(189, 0).addBox(-3.0F, 32.3F, 53.0F, 6.0F, 9.0F, 40.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(295, 180).addBox(-3.0F, 32.3F, 105.0F, 6.0F, 1.0F, 20.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(295, 201).addBox(-7.0F, 11.1F, 93.0F, 14.0F, 4.0F, 12.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(152, 90).addBox(7.0F, 11.1F, 104.0F, 5.0F, 4.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);
        body.setTextureOffset(189, 98).addBox(7.0F, 15.1F, 104.0F, 5.0F, 1.0F, 24.0F, 0.0F, false, true, true, true, true, false, false);
        body.setTextureOffset(42, 134).addBox(7.0F, 11.1F, 127.0F, 5.0F, 4.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);
        body.setTextureOffset(32, 17).addBox(-2.0F, 5.6858F, 96.4142F, 9.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, true, false, true);
        body.setTextureOffset(21, 0).addBox(8.1213F, 7.8071F, 96.4142F, 1.0F, 1.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(33, 86).addBox(-4.0F, 7.1F, 95.0F, 8.0F, 4.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);
        body.setTextureOffset(137, 126).addBox(-4.0F, 8.5142F, 93.5858F, 8.0F, 3.0F, 2.0F, 0.0F, false, true, false, false, false, true, true);
        body.setTextureOffset(33, 95).addBox(-4.5F, 7.1F, 99.5F, 9.0F, 4.0F, 4.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(68, 407).addBox(5.0F, 12.1F, 127.0F, 2.0F, 4.0F, 56.0F, 0.0F, false, true, false, true, false, true, true);
        body.setTextureOffset(100, 150).addBox(-8.0F, 8.1F, 182.0F, 16.0F, 6.0F, 8.0F, 0.0F, false, true, false, true, false, true, true);
        body.setTextureOffset(267, 278).addBox(-7.0F, 6.9F, 104.0F, 14.0F, 5.0F, 85.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(128, 41).addBox(-10.0F, 6.9F, 113.0F, 3.0F, 5.0F, 15.0F, 0.0F, false, true, true, true, false, false, true);
        body.setTextureOffset(189, 98).addBox(-4.0F, 5.9F, 106.0F, 8.0F, 1.0F, 61.0F, 0.0F, false, true, false, true, false, true, true);
        body.setTextureOffset(0, 67).addBox(-7.0F, 5.9F, 115.0F, 17.0F, 1.0F, 10.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(266, 99).addBox(-3.0F, 2.9F, 106.0F, 6.0F, 3.0F, 61.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(339, 121).addBox(7.0F, 6.9F, 104.0F, 7.0F, 4.0F, 24.0F, 0.0F, false, true, true, true, true, false, false);
        body.setTextureOffset(84, 12).addBox(-7.0F, 6.9F, 101.0F, 2.0F, 4.0F, 3.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(70, 0).addBox(5.0F, 6.9F, 101.0F, 2.0F, 4.0F, 3.0F, 0.0F, false, false, false, true, false, true, true);
        body.setTextureOffset(0, 67).addBox(10.0F, 6.9F, 101.0F, 2.0F, 4.0F, 3.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(63, 347).addBox(-3.0F, 6.7716F, 29.0F, 6.0F, 3.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);
        body.setTextureOffset(0, 180).addBox(-8.0F, 9.6F, 29.0F, 16.0F, 5.0F, 57.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(0, 86).addBox(-7.0F, 9.6F, 28.0F, 14.0F, 5.0F, 59.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(0, 242).addBox(-5.0F, 7.6F, 28.0F, 10.0F, 2.0F, 59.0F, 0.0F, false, true, true, true, false, false, false);
        body.setTextureOffset(79, 242).addBox(-3.5F, 10.7F, 0.0F, 7.0F, 4.0F, 29.0F, 0.0F, false, true, false, true, false, true, true);
        body.setTextureOffset(62, 51).addBox(-1.5F, 1.7F, -2.0F, 3.0F, 8.0F, 5.0F, 0.0F, false, true, false, false, false, true, true);
        body.setTextureOffset(60, 40).addBox(-1.5F, 30.7F, 10.0F, 3.0F, 4.0F, 7.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(0, 0).addBox(-3.5F, 34.7F, 10.0F, 7.0F, 7.0F, 7.0F, 0.0F, false, true, true, true, true, true, true);
        body.setTextureOffset(99, 86).addBox(-3.4641F, -3.3F, -2.0F, 1.0F, 4.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(96, 12).addBox(2.4641F, -3.3F, -2.0F, 1.0F, 4.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(32, 0).addBox(-2.5F, 4.0F, -2.0F, 5.0F, 11.0F, 6.0F, 0.0F, false, true, false, true, false, true, true);
        body.setTextureOffset(132, 0).addBox(-2.5F, 18.0F, -2.0F, 5.0F, 9.0F, 10.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(256, 368).addBox(2.1716F, 6.7716F, 29.0F, 3.0F, 4.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);
        body.setTextureOffset(362, 183).addBox(-5.1716F, 6.7716F, 29.0F, 3.0F, 4.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);
        body.setTextureOffset(124, 218).addBox(-2.5F, 2.7F, 171.0F, 5.0F, 1.0F, 12.0F, 0.0F, false, false, true, true, false, true, true);
        body.setTextureOffset(0, 97).addBox(-1.5F, 2.7F, 183.0F, 3.0F, 1.0F, 4.0F, 0.0F, false, false, true, true, false, true, true);
        body.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 14.5F, -6.0F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
        cube_r1.setTextureOffset(189, 63).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 13.8F, -22.0F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
        cube_r2.setTextureOffset(241, 0).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 16.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-8.0F, 9.6F, 29.0F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
        cube_r3.setTextureOffset(380, 244).addBox(0.0F, -4.0F, 0.0F, 2.0F, 4.0F, 57.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(8.0F, 9.6F, 29.0F);
        body.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
        cube_r4.setTextureOffset(319, 372).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 57.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(3.0F, 10.7F, 5.0F);
        body.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(354, 244).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 3.0F, 25.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-2.5F, 4.0F, 4.0F);
        body.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(60, 28).addBox(0.0F, 0.0F, -5.0F, 5.0F, 7.0F, 5.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(1.5F, 1.7F, 2.9F);
        body.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(0, 14).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 8.0F, 2.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(3.4641F, -3.3F, -2.0F);
        body.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.5236F);
        cube_r8.setTextureOffset(139, 96).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, 2.7F, -2.0F);
        body.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 0.5236F);
        cube_r9.setTextureOffset(139, 90).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(2.9641F, -0.166F, -2.0F);
        body.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5236F);
        cube_r10.setTextureOffset(37, 139).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, -5.3F, -2.0F);
        body.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, -0.5236F);
        cube_r11.setTextureOffset(139, 102).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(5.5F, 10.7F, 29.0F);
        body.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.1047F, 0.0F);
        cube_r12.setTextureOffset(113, 276).addBox(-2.0F, 0.0F, -20.0F, 2.0F, 4.0F, 20.0F, 0.0F, false, false, false, true, false, true, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-5.5F, 10.7F, 29.0F);
        body.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, -0.1047F, 0.0F);
        cube_r13.setTextureOffset(192, 299).addBox(0.0F, 0.0F, -20.0F, 2.0F, 4.0F, 20.0F, 0.0F, false, false, false, true, false, false, true);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(5.0F, 7.6F, 28.0F);
        body.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
        cube_r14.setTextureOffset(358, 121).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 3.0F, 59.0F, 0.0F, false, true, true, false, true, true, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(-5.0F, 7.6F, 28.0F);
        body.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
        cube_r15.setTextureOffset(189, 347).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 59.0F, 0.0F, false, true, true, true, false, false, true);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(9.0F, 4.4071F, 187.0213F);
        body.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(32, 26).addBox(-16.0F, 1.0F, -2.0F, 16.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(9.0F, 8.8071F, 186.2213F);
        body.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(189, 89).addBox(-18.0F, 0.0F, -2.0F, 18.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(5.0F, 35.1929F, 157.0071F);
        body.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(52, 76).addBox(-10.0F, 0.0F, 0.0F, 10.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(10.0F, 8.2F, 100.3F);
        body.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(87, 92).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(4.0F, 11.9F, 2.0F);
        body.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.7854F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(137, 131).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(13.0F, 8.2F, 101.0F);
        body.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.7854F, 0.0F, 0.0F);
        cube_r21.setTextureOffset(32, 24).addBox(-21.0F, 0.0F, 0.0F, 21.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(12.0F, 6.9F, 101.0F);
        body.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
        cube_r22.setTextureOffset(87, 86).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);
        cube_r22.setTextureOffset(132, 0).addBox(-7.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, false, true, false, false, true, true, true);
        cube_r22.setTextureOffset(0, 150).addBox(-19.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(16.1213F, 9.0213F, 104.0F);
        body.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
        cube_r23.setTextureOffset(266, 98).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 24.0F, 0.0F, false, true, true, true, false, true, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(11.0F, 7.9F, 128.0F);
        body.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, -0.2618F, 0.0F);
        cube_r24.setTextureOffset(192, 204).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 5.0F, 16.0F, 0.0F, false, false, false, true, true, true, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(8.0F, 8.1F, 189.8F);
        body.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.3054F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(52, 150).addBox(-16.0F, 0.0F, 0.0F, 16.0F, 6.0F, 8.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(9.1213F, 7.8071F, 96.6822F);
        body.addChild(cube_r26);
        setRotationAngle(cube_r26, -0.5236F, 0.0F, 0.0F);
        cube_r26.setTextureOffset(156, 24).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 11.0F, 2.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(7.0F, 5.6858F, 96.4142F);
        body.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
        cube_r27.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(2.0F, 7.1F, 95.0F);
        body.addChild(cube_r28);
        setRotationAngle(cube_r28, -0.7854F, 0.0F, 0.0F);
        cube_r28.setTextureOffset(152, 0).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, false, true, false, true, false, true, true);
        cube_r28.setTextureOffset(139, 86).addBox(-6.0F, 0.0F, 0.0F, 8.0F, 2.0F, 2.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(11.2929F, 11.1F, 104.2929F);
        body.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.7854F, 0.0F);
        cube_r29.setTextureOffset(152, 96).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, false, true, true, true, true, true, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(12.0F, 11.1F, 127.0F);
        body.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, -0.7854F, 0.0F);
        cube_r30.setTextureOffset(152, 102).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, false, true, true, true, true, true, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(12.0F, 15.1F, 104.0F);
        body.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
        cube_r31.setTextureOffset(0, 242).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 24.0F, 0.0F, false, true, true, true, true, true, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-9.0F, 32.3F, 53.0F);
        body.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, 0.0F, -0.7854F);
        cube_r32.setTextureOffset(257, 278).addBox(0.0F, 0.0F, 0.0F, 5.0F, 9.0F, 40.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(9.0F, 32.3F, 53.0F);
        body.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
        cube_r33.setTextureOffset(455, 351).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 9.0F, 40.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(-11.5858F, 26.3F, 53.0F);
        body.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 0.0F, 0.7854F);
        cube_r34.setTextureOffset(457, 423).addBox(-1.0F, -0.3F, 0.0F, 2.0F, 1.0F, 40.0F, 0.0F, false, true, true, true, false, false, true);
        cube_r34.setTextureOffset(476, 65).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 40.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-11.5858F, 32.3F, 53.0F);
        body.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, 0.7854F);
        cube_r35.setTextureOffset(186, 463).addBox(-0.7F, -1.0F, 0.0F, 1.0F, 2.0F, 40.0F, 0.0F, false, true, true, false, true, true, false);
        cube_r35.setTextureOffset(472, 279).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 40.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-2.2929F, 40.5929F, 53.0F);
        body.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, 0.0F, 0.7854F);
        cube_r36.setTextureOffset(0, 463).addBox(-1.3F, -1.0F, 0.0F, 1.0F, 2.0F, 40.0F, 0.0F, false, true, true, false, true, false, true);
        cube_r36.setTextureOffset(42, 467).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 40.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(3.7071F, 40.5929F, 53.0F);
        body.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, 0.0F, 0.7854F);
        cube_r37.setTextureOffset(295, 226).addBox(-2.0F, -0.3F, 0.0F, 2.0F, 1.0F, 40.0F, 0.0F, false, true, true, true, false, true, false);
        cube_r37.setTextureOffset(467, 464).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 40.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(13.0F, 32.3F, 53.0F);
        body.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 0.0F, 0.7854F);
        cube_r38.setTextureOffset(192, 228).addBox(-2.0F, 0.3F, 0.0F, 2.0F, 1.0F, 40.0F, 0.0F, false, true, true, false, true, true, false);
        cube_r38.setTextureOffset(84, 468).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 40.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(13.0F, 26.3F, 53.0F);
        body.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, 0.7854F);
        cube_r39.setTextureOffset(144, 461).addBox(-1.3F, 0.0F, 0.0F, 1.0F, 2.0F, 40.0F, 0.0F, false, true, true, true, false, false, true);
        cube_r39.setTextureOffset(472, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 40.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-2.2929F, 3.6071F, 106.0F);
        body.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, 0.0F, 0.7854F);
        cube_r40.setTextureOffset(192, 278).addBox(-1.0F, 0.3F, 0.0F, 2.0F, 1.0F, 61.0F, 0.0F, false, true, true, false, true, false, true);
        cube_r40.setTextureOffset(339, 59).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 61.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(3.7071F, 3.6071F, 106.0F);
        body.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, 0.0F, 0.7854F);
        cube_r41.setTextureOffset(295, 163).addBox(-0.7F, 0.0F, 0.0F, 1.0F, 2.0F, 61.0F, 0.0F, false, true, true, true, false, true, false);
        cube_r41.setTextureOffset(0, 347).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 61.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(8.0F, 15.1F, 23.0F);
        body.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.7854F, 0.0F, 0.0F);
        cube_r42.setTextureOffset(121, 201).addBox(-16.0F, 0.0F, 0.0F, 16.0F, 6.0F, 3.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(-7.0F, 17.1F, 24.0F);
        body.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.7854F, 0.0F, 0.0F);
        cube_r43.setTextureOffset(236, 257).addBox(-2.0F, 0.0F, 0.0F, 18.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(9.0F, 14.1F, 193.0F);
        body.addChild(cube_r44);
        setRotationAngle(cube_r44, -0.3054F, 0.0F, 0.0F);
        cube_r44.setTextureOffset(0, 132).addBox(-18.0F, 0.0F, 0.0F, 18.0F, 9.0F, 3.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(5.5F, 33.3F, 188.0F);
        body.addChild(cube_r45);
        setRotationAngle(cube_r45, -0.3054F, 0.0F, 0.0F);
        cube_r45.setTextureOffset(137, 118).addBox(-11.0F, 0.0F, 0.0F, 11.0F, 6.0F, 2.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(4.5F, 40.3F, 171.7F);
        body.addChild(cube_r46);
        setRotationAngle(cube_r46, -0.7854F, 0.0F, 0.0F);
        cube_r46.setTextureOffset(84, 0).addBox(-8.5F, 0.0F, -4.0F, 8.0F, 8.0F, 4.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(4.5F, 68.5869F, 176.8038F);
        body.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.6545F, 0.0F, 0.0F);
        cube_r47.setTextureOffset(84, 41).addBox(-8.5F, -23.0F, 0.0F, 8.0F, 23.0F, 6.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(4.5F, 48.3F, 150.0F);
        body.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.3927F, 0.0F, 0.0F);
        cube_r48.setTextureOffset(0, 86).addBox(-8.5F, 0.0F, 0.0F, 8.0F, 29.0F, 17.0F, 0.0F, false, true, false, false, true, true, true);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(2.5F, 49.3F, 130.0F);
        body.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.7854F, 0.0F, 0.0F);
        cube_r49.setTextureOffset(189, 98).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(2.5F, 48.5929F, 150.364F);
        body.addChild(cube_r50);
        setRotationAngle(cube_r50, -0.7854F, 0.0F, 0.0F);
        cube_r50.setTextureOffset(189, 104).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(1.5F, 39.3F, 146.0F);
        body.addChild(cube_r51);
        setRotationAngle(cube_r51, -0.3054F, 0.0F, 0.0F);
        cube_r51.setTextureOffset(50, 103).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 11.0F, 1.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(6.0F, 28.7645F, 130.8787F);
        body.addChild(cube_r52);
        setRotationAngle(cube_r52, -0.7854F, 0.0F, 0.0F);
        cube_r52.setTextureOffset(107, 323).addBox(-12.0F, 3.0F, 0.0F, 12.0F, 2.0F, 4.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(6.0F, 33.7645F, 133.8787F);
        body.addChild(cube_r53);
        setRotationAngle(cube_r53, -0.7854F, 0.0F, 0.0F);
        cube_r53.setTextureOffset(218, 139).addBox(-12.0F, 1.0F, 0.0F, 12.0F, 4.0F, 4.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(7.0F, 17.3F, 190.0F);
        body.addChild(cube_r54);
        setRotationAngle(cube_r54, -0.3054F, 0.0F, 0.0F);
        cube_r54.setTextureOffset(121, 180).addBox(-14.0F, 0.0F, 0.0F, 14.0F, 16.0F, 5.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(16.0F, 21.3F, 106.0F);
        body.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, 0.0F, 0.5672F);
        cube_r55.setTextureOffset(236, 228).addBox(0.0F, 0.0F, -1.0F, 1.0F, 7.0F, 22.0F, 0.0F, false, true, true, true, false, true, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(16.0F, 20.3F, 104.0F);
        body.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.0F, 0.0F, 1.3526F);
        cube_r56.setTextureOffset(189, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 25.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(6.0F, 15.3F, 104.0F);
        body.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, 0.0F, 0.5672F);
        cube_r57.setTextureOffset(87, 86).addBox(0.0F, 0.0F, 0.0F, 14.0F, 8.0F, 24.0F, 0.0F, false, true, true, true, true, true, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(0.0F, 21.4F, 9.0F);
        body.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, 0.0F, -0.7854F);
        cube_r58.setTextureOffset(218, 123).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(0.0F, 23.5F, -7.0F);
        body.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.0F, -0.7854F);
        cube_r59.setTextureOffset(189, 0).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 5.0F, 93.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(0.0F, 11.5F, 60.0F);
        body.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.0F, 0.0F, -0.7854F);
        cube_r60.setTextureOffset(84, 41).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 7.0F, 30.0F, 0.0F, false, false, false, true, false, true, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(0.0F, 12.3F, -2.0F);
        body.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 0.0F, -0.7854F);
        cube_r61.setTextureOffset(338, 59).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 6.0F, 10.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(0.0F, 13.0F, -9.0F);
        body.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, 0.0F, -0.7854F);
        cube_r62.setTextureOffset(149, 41).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r62.setTextureOffset(192, 180).addBox(-5.0F, 0.0F, 17.0F, 5.0F, 5.0F, 93.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(-15.6606F, -0.6182F, 65.2313F);
        body.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0F, -0.5236F, 0.7854F);
        cube_r63.setTextureOffset(70, 303).addBox(-4.0F, -4.0F, 0.0F, 5.0F, 5.0F, 27.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(-14.8439F, -2.5015F, 62.7738F);
        body.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, -0.5236F, 0.7854F);
        cube_r64.setTextureOffset(21, 3).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(-8.4353F, 3.9071F, 67.0F);
        body.addChild(cube_r65);
        setRotationAngle(cube_r65, 0.0F, -2.0071F, 0.7854F);
        cube_r65.setTextureOffset(84, 12).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(-9.1424F, 3.2F, 67.0F);
        body.addChild(cube_r66);
        setRotationAngle(cube_r66, 0.0F, 0.0F, 0.7854F);
        cube_r66.setTextureOffset(44, 51).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 16.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(-7.7282F, 4.6F, 83.0F);
        body.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.0F, 0.0F, 0.7854F);
        cube_r67.setTextureOffset(0, 14).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 10.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(0.0718F, 11.6F, 87.0F);
        body.addChild(cube_r68);
        setRotationAngle(cube_r68, 0.0F, 0.0F, 0.7854F);
        cube_r68.setTextureOffset(132, 19).addBox(-11.0F, 0.0F, 0.0F, 11.0F, 2.0F, 3.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(0.0F, 9.0F, 90.0F);
        body.addChild(cube_r69);
        setRotationAngle(cube_r69, 0.0F, 0.0F, -1.0472F);
        cube_r69.setTextureOffset(0, 86).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 8.0F, 3.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(0.0F, 9.0F, 90.0F);
        body.addChild(cube_r70);
        setRotationAngle(cube_r70, 0.0F, 0.0F, -0.5236F);
        cube_r70.setTextureOffset(58, 13).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(10.6F, 3.8071F, 170.0213F);
        body.addChild(cube_r71);
        setRotationAngle(cube_r71, -0.7854F, 0.0F, 0.0F);
        cube_r71.setTextureOffset(87, 128).addBox(-3.0F, -3.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, false, true, true, true, true, true, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(10.6F, 3.8071F, 182.0213F);
        body.addChild(cube_r72);
        setRotationAngle(cube_r72, -0.7854F, 0.0F, 0.0F);
        cube_r72.setTextureOffset(87, 99).addBox(-6.0F, -3.0F, -2.0F, 6.0F, 5.0F, 5.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r72.setTextureOffset(87, 118).addBox(-18.0F, -3.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, false, true, true, true, true, true, false);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(8.0F, 3.8071F, 172.2213F);
        body.addChild(cube_r73);
        setRotationAngle(cube_r73, -0.7854F, 0.0F, 0.0F);
        cube_r73.setTextureOffset(189, 160).addBox(-16.0F, 0.0F, -2.0F, 16.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, false, true);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(0.0F, -3.0F, 182.0F);
        body.addChild(cube_r74);
        setRotationAngle(cube_r74, 0.0F, 0.0F, -0.7854F);
        cube_r74.setTextureOffset(106, 41).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setRotationPoint(7.5F, -3.0F, 183.0F);
        body.addChild(cube_r75);
        setRotationAngle(cube_r75, -0.6545F, 0.0F, 0.0F);
        cube_r75.setTextureOffset(257, 327).addBox(-15.0F, 0.0F, 0.0F, 15.0F, 3.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setRotationPoint(7.5F, -3.0F, 178.0F);
        body.addChild(cube_r76);
        setRotationAngle(cube_r76, 0.2793F, 0.0F, 0.0F);
        cube_r76.setTextureOffset(0, 150).addBox(-15.0F, 0.0F, -11.0F, 15.0F, 3.0F, 11.0F, 0.0F, false, false, false, true, false, true, true);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(2.5F, 28.0F, 43.0F);
        body.addChild(bone4);
        bone4.setTextureOffset(339, 110).addBox(-10.0F, 4.6355F, -1.4645F, 15.0F, 5.0F, 3.0F, 0.0F, false, false, true, false, false, true, true);
        bone4.setTextureOffset(128, 61).addBox(-10.0F, 4.6355F, -10.5355F, 15.0F, 5.0F, 3.0F, 0.0F, false, true, false, false, false, true, true);
        bone4.setTextureOffset(192, 323).addBox(-10.0F, 1.1F, -7.0F, 15.0F, 3.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);
        bone4.setTextureOffset(0, 331).addBox(-10.0F, 10.1711F, -7.0F, 15.0F, 3.0F, 5.0F, 0.0F, false, false, false, false, true, true, true);
        bone4.setTextureOffset(189, 83).addBox(-11.5F, 2.3F, -6.6F, 18.0F, 2.0F, 4.0F, 0.0F, false, false, false, true, true, true, true);
        bone4.setTextureOffset(295, 267).addBox(-11.5F, 5.1284F, -1.7716F, 18.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);
        bone4.setTextureOffset(45, 321).addBox(-11.5F, 5.1284F, -9.4284F, 18.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);
        bone4.setTextureOffset(229, 85).addBox(-11.5F, 9.9569F, -6.6F, 18.0F, 2.0F, 4.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setRotationPoint(1.5F, 8.4213F, -10.1355F);
        bone4.addChild(cube_r77);
        setRotationAngle(cube_r77, 0.7854F, 0.0F, 0.0F);
        cube_r77.setTextureOffset(295, 217).addBox(-13.0F, 1.0F, 0.0F, 18.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r78 = new ModelRenderer(this);
        cube_r78.setRotationPoint(1.5F, 4.8858F, -2.6F);
        bone4.addChild(cube_r78);
        setRotationAngle(cube_r78, -0.7854F, 0.0F, 0.0F);
        cube_r78.setTextureOffset(307, 311).addBox(-13.0F, 1.0F, 3.0F, 18.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setRotationPoint(1.5F, 2.3F, -2.6F);
        bone4.addChild(cube_r79);
        setRotationAngle(cube_r79, -0.7854F, 0.0F, 0.0F);
        cube_r79.setTextureOffset(189, 150).addBox(-13.0F, 0.0F, 0.0F, 18.0F, 2.0F, 4.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r80 = new ModelRenderer(this);
        cube_r80.setRotationPoint(1.5F, 5.1284F, -9.4284F);
        bone4.addChild(cube_r80);
        setRotationAngle(cube_r80, 0.7854F, 0.0F, 0.0F);
        cube_r80.setTextureOffset(0, 229).addBox(-13.0F, 0.0F, 0.0F, 18.0F, 2.0F, 4.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setRotationPoint(0.0F, 9.6355F, -10.5355F);
        bone4.addChild(cube_r81);
        setRotationAngle(cube_r81, 0.7854F, 0.0F, 0.0F);
        cube_r81.setTextureOffset(44, 68).addBox(-10.0F, 0.0F, 0.0F, 15.0F, 5.0F, 3.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setRotationPoint(0.0F, 4.6355F, -10.5355F);
        bone4.addChild(cube_r82);
        setRotationAngle(cube_r82, 0.7854F, 0.0F, 0.0F);
        cube_r82.setTextureOffset(192, 331).addBox(-10.0F, 0.0F, 0.0F, 15.0F, 3.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setRotationPoint(0.0F, 6.1F, -2.0F);
        bone4.addChild(cube_r83);
        setRotationAngle(cube_r83, -0.7854F, 0.0F, 0.0F);
        cube_r83.setTextureOffset(338, 75).addBox(-10.0F, 0.0F, 2.0F, 15.0F, 5.0F, 3.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setRotationPoint(0.0F, 1.1F, -2.0F);
        bone4.addChild(cube_r84);
        setRotationAngle(cube_r84, -0.7854F, 0.0F, 0.0F);
        cube_r84.setTextureOffset(0, 293).addBox(-10.0F, 0.0F, 0.0F, 15.0F, 3.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);

        muzzle = new ModelRenderer(this);
        muzzle.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r85 = new ModelRenderer(this);
        cube_r85.setRotationPoint(0.0F, 11.0F, -33.0F);
        muzzle.addChild(cube_r85);
        setRotationAngle(cube_r85, 0.0F, 0.0F, -0.7854F);
        cube_r85.setTextureOffset(239, 180).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 5.0F, 18.0F, 0.0F, false, true, true, true, true, true, true);

        stock = new ModelRenderer(this);
        stock.setRotationPoint(0.0F, 24.0F, 0.0F);
        stock.setTextureOffset(189, 0).addBox(-5.0F, 12.0F, 189.0F, 10.0F, 25.0F, 8.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setRotationPoint(5.0F, 37.0F, 188.7F);
        stock.addChild(cube_r86);
        setRotationAngle(cube_r86, 0.9599F, 0.0F, 0.0F);
        cube_r86.setTextureOffset(89, 180).addBox(-10.0F, 0.0F, 0.0F, 10.0F, 7.0F, 5.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setRotationPoint(0.0F, 20.0F, 197.0F);
        stock.addChild(cube_r87);
        setRotationAngle(cube_r87, 0.0F, 0.0F, -0.7854F);
        cube_r87.setTextureOffset(324, 447).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 8.0F, 40.0F, 0.0F, false, true, false, true, true, true, true);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(6.9282F, 21.6F, 202.0F);
        stock.addChild(bone3);
        bone3.setTextureOffset(430, 171).addBox(-13.8564F, 0.0F, 0.0F, 4.0F, 8.0F, 50.0F, 0.0F, false, true, false, false, false, false, true);
        bone3.setTextureOffset(256, 429).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 8.0F, 50.0F, 0.0F, false, true, false, false, false, true, false);
        bone3.setTextureOffset(0, 180).addBox(-15.0F, -13.0F, 50.0F, 16.0F, 45.0F, 4.0F, 0.0F, false, true, true, true, true, true, true);
        bone3.setTextureOffset(402, 9).addBox(-12.0F, -6.0F, 0.0F, 10.0F, 6.0F, 50.0F, 0.0F, false, true, false, false, false, true, true);
        bone3.setTextureOffset(0, 303).addBox(-12.0F, -9.0F, 25.0F, 10.0F, 3.0F, 25.0F, 0.0F, false, false, false, false, false, true, true);
        bone3.setTextureOffset(128, 408).addBox(-12.0F, 12.0F, 0.0F, 10.0F, 3.0F, 50.0F, 0.0F, false, true, false, false, true, true, true);
        bone3.setTextureOffset(192, 278).addBox(-13.0F, 12.0F, 4.0F, 12.0F, 6.0F, 15.0F, 0.0F, false, true, false, false, true, true, true);
        bone3.setTextureOffset(192, 228).addBox(-12.0F, 15.0F, 40.0F, 10.0F, 12.0F, 10.0F, 0.0F, false, false, false, false, true, true, true);
        bone3.setTextureOffset(89, 218).addBox(-12.0F, 15.0F, 25.8F, 10.0F, 4.0F, 15.0F, 0.0F, false, false, false, false, false, true, true);
        bone3.setTextureOffset(339, 149).addBox(-12.0F, 19.0F, 33.2F, 10.0F, 4.0F, 7.0F, 0.0F, false, false, false, false, false, true, true);
        bone3.setTextureOffset(402, 65).addBox(-13.0F, 10.0F, 0.0F, 12.0F, 2.0F, 50.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setRotationPoint(-12.0F, 9.9153F, 7.1806F);
        bone3.addChild(cube_r88);
        setRotationAngle(cube_r88, -0.48F, 0.0F, 0.0F);
        cube_r88.setTextureOffset(292, 59).addBox(0.0F, -4.0F, 11.0F, 10.0F, 4.0F, 26.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setRotationPoint(-13.0F, 12.0F, 19.0F);
        bone3.addChild(cube_r89);
        setRotationAngle(cube_r89, -0.48F, 0.0F, 0.0F);
        cube_r89.setTextureOffset(79, 275).addBox(0.0F, 0.0F, 0.0F, 12.0F, 6.0F, 15.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setRotationPoint(-12.0F, -6.0F, 0.0F);
        bone3.addChild(cube_r90);
        setRotationAngle(cube_r90, 0.1309F, 0.0F, 0.0F);
        cube_r90.setTextureOffset(384, 368).addBox(0.0F, 0.0F, 0.0F, 10.0F, 4.0F, 51.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r91 = new ModelRenderer(this);
        cube_r91.setRotationPoint(-14.0F, -13.0F, 50.0F);
        bone3.addChild(cube_r91);
        setRotationAngle(cube_r91, 0.48F, 0.0F, 0.0F);
        cube_r91.setTextureOffset(266, 145).addBox(2.0F, 0.0F, 0.0F, 10.0F, 5.0F, 9.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r92 = new ModelRenderer(this);
        cube_r92.setRotationPoint(-4.8F, 14.0F, 17.0F);
        bone3.addChild(cube_r92);
        setRotationAngle(cube_r92, 0.0F, -0.7854F, 0.0F);
        cube_r92.setTextureOffset(128, 41).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r93 = new ModelRenderer(this);
        cube_r93.setRotationPoint(-3.0F, -12.0F, 54.0F);
        bone3.addChild(cube_r93);
        setRotationAngle(cube_r93, -0.096F, 0.0F, 0.0F);
        cube_r93.setTextureOffset(0, 347).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 41.0F, 5.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r94 = new ModelRenderer(this);
        cube_r94.setRotationPoint(-0.5F, 7.134F, 0.0F);
        bone3.addChild(cube_r94);
        setRotationAngle(cube_r94, 0.0F, 0.0F, -0.5236F);
        cube_r94.setTextureOffset(132, 347).addBox(-8.0F, -3.0F, 0.0F, 8.0F, 4.0F, 50.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r95 = new ModelRenderer(this);
        cube_r95.setRotationPoint(-13.3564F, 7.134F, 0.0F);
        bone3.addChild(cube_r95);
        setRotationAngle(cube_r95, 0.0F, 0.0F, 0.5236F);
        cube_r95.setTextureOffset(0, 409).addBox(0.0F, -3.0F, 0.0F, 8.0F, 4.0F, 50.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r96 = new ModelRenderer(this);
        cube_r96.setRotationPoint(-6.9282F, -4.0F, 0.0F);
        bone3.addChild(cube_r96);
        setRotationAngle(cube_r96, 0.0F, 0.0F, 0.5236F);
        cube_r96.setTextureOffset(421, 117).addBox(0.0F, 0.0F, 0.0F, 8.0F, 4.0F, 50.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r97 = new ModelRenderer(this);
        cube_r97.setRotationPoint(-6.9282F, -4.0F, 0.0F);
        bone3.addChild(cube_r97);
        setRotationAngle(cube_r97, 0.0F, 0.0F, -0.5236F);
        cube_r97.setTextureOffset(391, 423).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 4.0F, 50.0F, 0.0F, false, true, false, true, false, false, false);

        charge = new ModelRenderer(this);
        charge.setRotationPoint(0.0F, 24.0F, 0.0F);
        charge.setTextureOffset(295, 145).addBox(-22.0F, 15.0F, 105.0F, 13.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, false, true);
        charge.setTextureOffset(50, 115).addBox(-11.0F, 10.5F, 127.0F, 1.0F, 5.0F, 3.0F, 0.0F, false, true, true, true, false, false, true);
        charge.setTextureOffset(222, 161).addBox(-10.0F, 10.5F, 127.0F, 15.0F, 1.0F, 3.0F, 0.0F, false, true, true, true, false, false, false);
        charge.setTextureOffset(32, 0).addBox(-11.0F, 15.5F, 108.0F, 2.0F, 2.0F, 22.0F, 0.0F, false, false, true, true, true, false, true);

        move_part1 = new ModelRenderer(this);
        move_part1.setRotationPoint(0.0F, 24.0F, 0.0F);
        move_part1.setTextureOffset(192, 180).addBox(-8.0F, 9.0F, 136.0F, 1.0F, 3.0F, 45.0F, 0.0F, false, false, true, false, false, false, true);

        cube_r98 = new ModelRenderer(this);
        cube_r98.setRotationPoint(-8.0F, 7.7574F, 136.0F);
        move_part1.addChild(cube_r98);
        setRotationAngle(cube_r98, -0.7854F, 0.0F, 0.0F);
        cube_r98.setTextureOffset(58, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false, true, false, false, true, false, true);

        cube_r99 = new ModelRenderer(this);
        cube_r99.setRotationPoint(-8.0F, 8.9313F, 145.6593F);
        move_part1.addChild(cube_r99);
        setRotationAngle(cube_r99, -0.2618F, 0.0F, 0.0F);
        cube_r99.setTextureOffset(58, 0).addBox(0.0F, 0.0F, -10.0F, 1.0F, 3.0F, 10.0F, 0.0F, false, false, false, true, false, false, true);

        cube_r100 = new ModelRenderer(this);
        cube_r100.setRotationPoint(-8.0F, 6.3895F, 161.1711F);
        move_part1.addChild(cube_r100);
        setRotationAngle(cube_r100, 0.2618F, 0.0F, 0.0F);
        cube_r100.setTextureOffset(87, 86).addBox(0.0F, 0.0F, -10.0F, 1.0F, 3.0F, 10.0F, 0.0F, false, false, false, true, false, false, true);

        cube_r101 = new ModelRenderer(this);
        cube_r101.setRotationPoint(-8.0F, 9.0F, 181.0F);
        move_part1.addChild(cube_r101);
        setRotationAngle(cube_r101, -0.1309F, 0.0F, 0.0F);
        cube_r101.setTextureOffset(118, 300).addBox(0.0F, 0.0F, -20.0F, 1.0F, 3.0F, 20.0F, 0.0F, false, false, false, true, false, false, true);

        cube_r102 = new ModelRenderer(this);
        cube_r102.setRotationPoint(-7.9F, 9.0F, 139.0F);
        move_part1.addChild(cube_r102);
        setRotationAngle(cube_r102, 0.0F, 0.0F, 0.7854F);
        cube_r102.setTextureOffset(239, 203).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 21.0F, 0.0F, false, true, true, true, true, false, true);

        mag = new ModelRenderer(this);
        mag.setRotationPoint(0.0F, 24.0F, 1.0F);
        mag.setTextureOffset(292, 0).addBox(-14.0F, 31.0F, 103.0F, 40.0F, 35.0F, 24.0F, 0.0F, false, true, true, true, true, false, false);
        mag.setTextureOffset(84, 0).addBox(-26.0F, 49.0F, 103.0F, 12.0F, 17.0F, 24.0F, 0.0F, false, true, true, false, true, false, true);
        mag.setTextureOffset(0, 0).addBox(26.0F, 29.0F, 101.0F, 2.0F, 39.0F, 28.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r103 = new ModelRenderer(this);
        cube_r103.setRotationPoint(-14.0F, 31.0F, 104.0F);
        mag.addChild(cube_r103);
        setRotationAngle(cube_r103, 0.0F, 0.0F, -0.9861F);
        cube_r103.setTextureOffset(189, 49).addBox(-22.0F, 0.0F, -1.0F, 22.0F, 10.0F, 24.0F, 0.0F, false, true, true, true, false, false, false);

        bullet_1 = new ModelRenderer(this);
        bullet_1.setRotationPoint(22.0F, 59.0F, 107.9F);


        cube_r104 = new ModelRenderer(this);
        cube_r104.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_1.addChild(cube_r104);
        setRotationAngle(cube_r104, 0.0F, 0.0F, 0.7854F);
        cube_r104.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r104.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_2 = new ModelRenderer(this);
        bullet_2.setRotationPoint(22.0F, 54.0F, 107.9F);


        cube_r105 = new ModelRenderer(this);
        cube_r105.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_2.addChild(cube_r105);
        setRotationAngle(cube_r105, 0.0F, 0.0F, 0.7854F);
        cube_r105.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r105.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_3 = new ModelRenderer(this);
        bullet_3.setRotationPoint(20.9F, 50.3F, 107.9F);


        cube_r106 = new ModelRenderer(this);
        cube_r106.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_3.addChild(cube_r106);
        setRotationAngle(cube_r106, 0.0F, 0.0F, 0.7854F);
        cube_r106.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r106.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_4 = new ModelRenderer(this);
        bullet_4.setRotationPoint(20.1F, 46.4F, 107.9F);


        cube_r107 = new ModelRenderer(this);
        cube_r107.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_4.addChild(cube_r107);
        setRotationAngle(cube_r107, 0.0F, 0.0F, 0.7854F);
        cube_r107.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r107.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_5 = new ModelRenderer(this);
        bullet_5.setRotationPoint(18.8F, 42.8F, 107.9F);


        cube_r108 = new ModelRenderer(this);
        cube_r108.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_5.addChild(cube_r108);
        setRotationAngle(cube_r108, 0.0F, 0.0F, 0.7854F);
        cube_r108.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r108.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_6 = new ModelRenderer(this);
        bullet_6.setRotationPoint(17.1F, 39.9F, 107.9F);


        cube_r109 = new ModelRenderer(this);
        cube_r109.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_6.addChild(cube_r109);
        setRotationAngle(cube_r109, 0.0F, 0.0F, 0.7854F);
        cube_r109.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r109.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_7 = new ModelRenderer(this);
        bullet_7.setRotationPoint(14.8F, 37.6F, 107.9F);


        cube_r110 = new ModelRenderer(this);
        cube_r110.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_7.addChild(cube_r110);
        setRotationAngle(cube_r110, 0.0F, 0.0F, 0.7854F);
        cube_r110.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r110.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_8 = new ModelRenderer(this);
        bullet_8.setRotationPoint(12.4F, 35.2F, 107.9F);


        cube_r111 = new ModelRenderer(this);
        cube_r111.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_8.addChild(cube_r111);
        setRotationAngle(cube_r111, 0.0F, 0.0F, 0.7854F);
        cube_r111.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r111.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

        bullet_9 = new ModelRenderer(this);
        bullet_9.setRotationPoint(8.1F, 35.2F, 107.9F);


        cube_r112 = new ModelRenderer(this);
        cube_r112.setRotationPoint(0.0F, 0.0F, 4.0F);
        bullet_9.addChild(cube_r112);
        setRotationAngle(cube_r112, 0.0F, 0.0F, 0.7854F);
        cube_r112.setTextureOffset(295, 244).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 15.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r112.setTextureOffset(189, 49).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);

    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode, GunRenderContext context, long fireDis) {
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        muzzle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        stock.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        charge.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        move_part1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

        float shootProgress = (float) (System.currentTimeMillis() - lastFireTime) / (float) fireDis;
        if (shootProgress > 1f) {
            shootProgress = 0;
        }
        if (bulletLeft > 1 || bulletLeft == 1 && shootProgress < 0.9f) { bullet_9.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha); }
        if (bulletLeft > 2 || bulletLeft == 2 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_8, bullet_9, transformType); }
        if (bulletLeft > 3 || bulletLeft == 3 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_7, bullet_8, transformType); }
        if (bulletLeft > 4 || bulletLeft == 4 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_6, bullet_7, transformType); }
        if (bulletLeft > 5 || bulletLeft == 5 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_5, bullet_6, transformType); }
        if (bulletLeft > 6 || bulletLeft == 6 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_4, bullet_5, transformType); }
        if (bulletLeft > 7 || bulletLeft == 7 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_3, bullet_4, transformType); }
        if (bulletLeft > 8 || bulletLeft == 8 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_2, bullet_3, transformType); }
        if (bulletLeft > 9 || bulletLeft == 9 && shootProgress < 0.9f) { renderBullet(matrixStack, buffer, packedLight, packedOverlay, shootProgress, bullet_1, bullet_2, transformType); }
    }

    private void renderBullet(MatrixStack matrixStack, IVertexBuilder builder, int light, int overlay, float shootProgress,
                              ModelRenderer prevBulletModel, ModelRenderer nextBulletModel, ItemCameraTransforms.TransformType transformType) {
        if (transformType.isFirstPerson() || transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND ||
                transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND) {
            float x, y, z;
            x = (nextBulletModel.rotationPointX - prevBulletModel.rotationPointX) * shootProgress / 16;
            y = (nextBulletModel.rotationPointY - prevBulletModel.rotationPointY) * shootProgress / 16;
            z = (nextBulletModel.rotationPointZ - prevBulletModel.rotationPointZ) * shootProgress / 16;
            matrixStack.push();
            matrixStack.translate(x, y, z);
            prevBulletModel.render(matrixStack, builder, light, overlay, 1, 1, 1, 1);
            matrixStack.pop();
        } else {
            prevBulletModel.render(matrixStack, builder, light, overlay, 1, 1, 1, 1);
        }
    }
}