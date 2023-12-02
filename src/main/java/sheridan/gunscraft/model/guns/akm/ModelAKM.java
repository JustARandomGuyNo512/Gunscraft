package sheridan.gunscraft.model.guns.akm;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import sheridan.gunscraft.animation.CommonAnimations;
import sheridan.gunscraft.animation.IAnimation;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelAKM extends EntityModel<Entity> implements IGunModel {
    private final ModelRenderer barrel;
    private final ModelRenderer cube_r1;
    private final ModelRenderer slide;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer muzzle;
    private final ModelRenderer cube_r5;
    private final ModelRenderer handguard;
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
    private final ModelRenderer IS;
    private final ModelRenderer cube_r26;
    private final ModelRenderer dust_cover;
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
    private final ModelRenderer mag;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer grip;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer safety;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer stock;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;

    public static IAnimation slideRecoil;

    public ModelAKM() {
        slideRecoil = CommonAnimations.createSingleAxisBlotBack(0.15f, 3.5f);

        textureWidth = 512;
        textureHeight = 512;

        barrel = new ModelRenderer(this);
        barrel.setRotationPoint(0.0F, 36.2F, -3.2F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
        barrel.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
        cube_r1.setTextureOffset(82, 257).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 4.0F, 68.0F, 0.0F, false, false, false, true, true, true, true);

        slide = new ModelRenderer(this);
        slide.setRotationPoint(-5.3679F, 34.9189F, 141.1F);
        slide.setTextureOffset(204, 180).addBox(2.2679F, -7.7189F, -14.0F, 6.0F, 3.0F, 28.0F, 0.0F, false, false, false, false, false, false, true);
        slide.setTextureOffset(112, 33).addBox(-6.0F, 0.0F, -14.0F, 6.0F, 2.0F, 1.0F, 0.0F, false, true, true, true, true, false, false);
        slide.setTextureOffset(62, 113).addBox(0.0F, -1.0F, -14.0F, 1.0F, 3.0F, 13.0F, 0.0F, false, true, false, true, false, false, true);
        slide.setTextureOffset(197, 32).addBox(0.7371F, -1.0234F, -14.0F, 6.0F, 3.0F, 28.0F, 0.0F, false, false, false, false, false, false, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        slide.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        cube_r2.setTextureOffset(31, 47).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false, false, false, true, false, false, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-6.0F, 0.0F, -13.0F);
        slide.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.6109F, 0.0F);
        cube_r3.setTextureOffset(81, 15).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false, true, true, true, true, false, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(2.2679F, -4.7189F, -14.0F);
        slide.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -1.1781F);
        cube_r4.setTextureOffset(73, 268).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 28.0F, 0.0F, false, true, false, true, false, false, false);

        muzzle = new ModelRenderer(this);
        muzzle.setRotationPoint(0.0F, 35.5F, 16.0F);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 1.0F);
        muzzle.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
        cube_r5.setTextureOffset(0, 47).addBox(-5.0F, 0.0F, -33.1F, 5.0F, 5.0F, 13.0F, 0.0F, false, true, true, true, true, true, true);

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(-5.1787F, 43.3213F, 75.8F);
        handguard.setTextureOffset(280, 229).addBox(-0.4213F, -8.6213F, -10.0F, 11.0F, 8.0F, 53.0F, 0.0F, false, true, false, true, true, true, true);
        handguard.setTextureOffset(0, 47).addBox(-0.2213F, -8.2213F, -12.0F, 4.0F, 7.0F, 2.0F, 0.0F, false, true, false, true, false, false, true);
        handguard.setTextureOffset(150, 55).addBox(-0.4213F, -8.6213F, 41.0F, 11.0F, 13.0F, 3.0F, 0.0F, false, false, true, true, true, true, true);
        handguard.setTextureOffset(150, 117).addBox(-0.5213F, -1.1011F, 33.6969F, 11.0F, 8.0F, 4.0F, 0.0F, false, false, false, false, true, true, true);
        handguard.setTextureOffset(0, 194).addBox(-2.1213F, -4.8213F, -1.0F, 2.0F, 3.0F, 32.0F, 0.0F, false, true, true, false, false, false, true);
        handguard.setTextureOffset(192, 116).addBox(10.2787F, -4.8213F, -1.0F, 2.0F, 3.0F, 32.0F, 0.0F, false, true, true, false, false, true, false);
        handguard.setTextureOffset(76, 47).addBox(2.6071F, -2.3929F, -12.0F, 4.0F, 4.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);
        handguard.setTextureOffset(76, 53).addBox(3.6071F, -2.3929F, -12.0F, 4.0F, 4.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);
        handguard.setTextureOffset(64, 160).addBox(3.4355F, -8.2213F, -12.0F, 7.0F, 7.0F, 2.0F, 0.0F, false, true, false, true, false, true, false);
        handguard.setTextureOffset(332, 290).addBox(3.6071F, -19.3497F, -12.0F, 4.0F, 4.0F, 40.0F, 0.0F, false, true, true, true, false, false, false);
        handguard.setTextureOffset(284, 308).addBox(2.6071F, -19.3497F, -12.0F, 4.0F, 4.0F, 40.0F, 0.0F, false, true, true, true, false, false, false);
        handguard.setTextureOffset(158, 257).addBox(-0.4213F, -16.0213F, -10.0F, 11.0F, 7.0F, 36.0F, 0.0F, false, true, true, false, true, true, true);
        handguard.setTextureOffset(230, 301).addBox(3.4355F, -16.5213F, -12.0F, 7.0F, 7.0F, 40.0F, 0.0F, false, true, true, false, true, true, false);
        handguard.setTextureOffset(0, 0).addBox(-0.2213F, -16.5213F, -12.0F, 4.0F, 7.0F, 40.0F, 0.0F, false, true, true, false, true, false, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(10.1787F, -16.8213F, -10.0F);
        handguard.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(0, 339).addBox(-10.6F, 0.0F, 0.0F, 11.0F, 2.0F, 36.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(10.5787F, -16.8213F, -10.0F);
        handguard.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0123F, 0.0123F, -0.7853F);
        cube_r7.setTextureOffset(244, 352).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 36.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(4.7787F, -16.5213F, -12.0F);
        handguard.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
        cube_r8.setTextureOffset(102, 329).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 40.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-0.2213F, -16.5213F, -12.0F);
        handguard.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
        cube_r9.setTextureOffset(332, 334).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 40.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-0.4213F, -16.8213F, -10.0F);
        handguard.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0123F, 0.0123F, -0.7853F);
        cube_r10.setTextureOffset(154, 355).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 36.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(6.4071F, -19.6493F, -10.0494F);
        handguard.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0175F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(349, 62).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 36.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(7.7503F, -19.6493F, -10.0494F);
        handguard.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0175F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(112, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 36.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(4.7787F, -1.2213F, -12.0F);
        handguard.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
        cube_r13.setTextureOffset(76, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-0.2213F, -1.2213F, -12.0F);
        handguard.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
        cube_r14.setTextureOffset(76, 6).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, false, true, false, false, false, false, true);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, 0.3F, -1.0F);
        handguard.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
        cube_r15.setTextureOffset(112, 40).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 32.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, -6.9426F, -1.0F);
        handguard.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
        cube_r16.setTextureOffset(112, 100).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 32.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(12.2787F, -1.8213F, -1.0F);
        handguard.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
        cube_r17.setTextureOffset(112, 134).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 32.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(12.2787F, -4.8213F, -1.0F);
        handguard.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
        cube_r18.setTextureOffset(192, 82).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 32.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(9.6787F, -0.3588F, -9.9348F);
        handguard.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(347, 0).addBox(-10.1F, -2.0F, 0.0F, 11.0F, 2.0F, 33.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(8.4574F, 1.7596F, -10.0458F);
        handguard.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.0349F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(0, 100).addBox(-5.0F, -6.0F, 0.0F, 5.0F, 6.0F, 39.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(8.4574F, 1.7596F, -10.0458F);
        handguard.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.0247F, 0.0247F, 0.7851F);
        cube_r21.setTextureOffset(55, 339).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 3.0F, 39.0F, 0.0F, false, true, false, false, false, true, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(1.7F, 1.7596F, -10.0458F);
        handguard.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.0247F, 0.0247F, 0.7851F);
        cube_r22.setTextureOffset(0, 47).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 3.0F, 40.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(6.7F, 1.7596F, -10.0458F);
        handguard.addChild(cube_r23);
        setRotationAngle(cube_r23, -0.0349F, 0.0F, 0.0F);
        cube_r23.setTextureOffset(0, 145).addBox(-5.0F, -6.0F, 0.0F, 5.0F, 6.0F, 39.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(9.6787F, 6.8989F, 37.6969F);
        handguard.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.4363F, 0.0F, 0.0F);
        cube_r24.setTextureOffset(112, 0).addBox(-10.1F, -8.0F, 0.0F, 11.0F, 8.0F, 7.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(10.5787F, 6.8473F, 33.6916F);
        handguard.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.4974F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(158, 300).addBox(-11.0F, -7.0F, -14.0F, 11.0F, 7.0F, 14.0F, 0.0F, false, false, false, false, true, true, true);

        IS = new ModelRenderer(this);
        IS.setRotationPoint(1.4F, 21.5F, 109.1F);
        IS.setTextureOffset(0, 18).addBox(-3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 17.0F, 0.0F, false, false, false, true, false, true, true);
        IS.setTextureOffset(0, 56).addBox(-4.0F, -1.0F, 18.0F, 5.0F, 2.0F, 1.0F, 0.0F, false, true, true, true, false, true, true);
        IS.setTextureOffset(23, 0).addBox(-1.9F, -1.5F, -108.6F, 1.0F, 4.0F, 1.0F, 0.0F, false, true, true, true, false, false, true);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(1.5F, -0.9F, 15.0F);
        IS.addChild(cube_r26);
        setRotationAngle(cube_r26, -0.7854F, 0.0F, 0.0F);
        cube_r26.setTextureOffset(67, 26).addBox(-7.0F, 0.0F, 0.0F, 8.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        dust_cover = new ModelRenderer(this);
        dust_cover.setRotationPoint(-6.1F, 32.5F, 175.2F);
        dust_cover.setTextureOffset(128, 180).addBox(8.6213F, -5.4853F, -48.8853F, 1.0F, 3.0F, 74.0F, 0.0F, false, true, false, true, false, true, false);
        dust_cover.setTextureOffset(282, 156).addBox(2.3787F, -5.4853F, -22.8853F, 7.0F, 3.0F, 48.0F, 0.0F, false, true, false, true, false, false, true);
        dust_cover.setTextureOffset(112, 0).addBox(9.0F, 0.0F, -48.4F, 3.0F, 3.0F, 79.0F, 0.0F, false, true, false, true, true, true, false);
        dust_cover.setTextureOffset(0, 268).addBox(10.0F, 3.0F, -35.4F, 2.0F, 2.0F, 69.0F, 0.0F, false, true, true, false, true, true, false);
        dust_cover.setTextureOffset(0, 268).addBox(0.0F, 0.0F, 0.6F, 3.0F, 3.0F, 30.0F, 0.0F, false, false, false, true, false, false, true);
        dust_cover.setTextureOffset(0, 229).addBox(0.0F, 3.0F, 2.6F, 2.0F, 2.0F, 31.0F, 0.0F, false, false, true, false, true, false, true);
        dust_cover.setTextureOffset(26, 116).addBox(4.0F, -8.0066F, 5.3934F, 4.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);
        dust_cover.setTextureOffset(56, 15).addBox(9.1213F, -5.8853F, 5.3934F, 1.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, true, false);
        dust_cover.setTextureOffset(56, 0).addBox(1.8787F, -5.8853F, 5.3934F, 1.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, false, true);
        dust_cover.setTextureOffset(48, 15).addBox(1.8787F, -5.8853F, -17.6066F, 1.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, false, true);
        dust_cover.setTextureOffset(48, 0).addBox(9.1213F, -5.8853F, -17.6066F, 1.0F, 4.0F, 2.0F, 0.0F, false, true, true, false, false, true, false);
        dust_cover.setTextureOffset(204, 229).addBox(0.0F, 0.0F, -22.9F, 3.0F, 1.0F, 24.0F, 0.0F, false, true, false, false, true, false, true);
        dust_cover.setTextureOffset(76, 37).addBox(4.0F, -8.0066F, -40.6066F, 4.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);
        dust_cover.setTextureOffset(197, 0).addBox(4.5F, -7.6066F, -49.0066F, 3.0F, 1.0F, 72.0F, 0.0F, false, false, false, true, false, false, false);
        dust_cover.setTextureOffset(26, 107).addBox(4.0F, -8.0066F, -17.6066F, 4.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);
        dust_cover.setTextureOffset(0, 391).addBox(11.4F, 2.3F, -31.2F, 1.0F, 1.0F, 60.0F, 0.0F, false, true, true, true, true, true, false);
        dust_cover.setTextureOffset(427, 488).addBox(-0.3F, 2.3F, 4.8F, 1.0F, 1.0F, 23.0F, 0.0F, false, true, true, true, true, false, true);
        dust_cover.setTextureOffset(23, 47).addBox(9.1213F, -5.8853F, -40.6066F, 1.0F, 4.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(6.0F, -8.3066F, -12.2066F);
        dust_cover.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, 0.7854F);
        cube_r27.setTextureOffset(49, 145).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, false, true, true, true, false, false, true);
        cube_r27.setTextureOffset(77, 30).addBox(0.0F, 0.0F, -36.0F, 1.0F, 1.0F, 5.0F, 0.0F, false, false, true, true, false, false, true);
        cube_r27.setTextureOffset(0, 145).addBox(0.0F, 0.0F, -23.0F, 1.0F, 1.0F, 14.0F, 0.0F, false, true, true, true, false, false, true);
        cube_r27.setTextureOffset(121, 62).addBox(0.0F, 0.0F, 23.0F, 1.0F, 1.0F, 9.0F, 0.0F, false, true, true, true, false, false, true);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(8.0F, -8.0066F, -17.6066F);
        dust_cover.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, 0.7854F);
        cube_r28.setTextureOffset(30, 83).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);
        cube_r28.setTextureOffset(30, 36).addBox(0.0F, 0.0F, -23.0F, 3.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);
        cube_r28.setTextureOffset(0, 107).addBox(0.0F, 0.0F, 23.0F, 3.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(4.0F, -8.0066F, -17.6066F);
        dust_cover.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.0F, 0.7854F);
        cube_r29.setTextureOffset(81, 18).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false, true, true, false, false, false, true);
        cube_r29.setTextureOffset(34, 0).addBox(0.0F, 0.0F, -23.0F, 1.0F, 3.0F, 2.0F, 0.0F, false, true, true, false, true, false, true);
        cube_r29.setTextureOffset(82, 81).addBox(0.0F, 0.0F, 23.0F, 1.0F, 3.0F, 2.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(2.3787F, -5.4853F, -49.0066F);
        dust_cover.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.0F, -0.7854F);
        cube_r30.setTextureOffset(192, 82).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 72.0F, 0.0F, false, false, true, true, false, false, true);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(9.6213F, -5.4853F, -49.0066F);
        dust_cover.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
        cube_r31.setTextureOffset(0, 194).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 72.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(12.0F, 0.7071F, 31.3071F);
        dust_cover.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.7854F, 0.0F, 0.0F);
        cube_r32.setTextureOffset(112, 82).addBox(-12.0F, 0.0F, -1.0F, 12.0F, 3.0F, 5.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(0.0F, 0.0F, -1.0F);
        dust_cover.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.7854F, 0.0F, 0.0F);
        cube_r33.setTextureOffset(0, 76).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false, false, false, false, true, false, true);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.0F, 0.0F, 0.4F);
        dust_cover.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.7854F, 0.0F, 0.0F);
        cube_r34.setTextureOffset(152, 28).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 5.0F, 0.0F, false, false, false, false, true, false, true);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(3.3372F, -2.4214F, -17.9147F);
        dust_cover.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, 0.6981F);
        cube_r35.setTextureOffset(176, 301).addBox(-1.0F, 0.0F, -4.9706F, 2.0F, 4.0F, 50.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(5.6F, 0.1716F, 30.7716F);
        dust_cover.addChild(cube_r36);
        setRotationAngle(cube_r36, -0.7854F, 0.0F, 0.0F);
        cube_r36.setTextureOffset(67, 15).addBox(-3.2213F, 0.0F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false, false, false, true, false, false, true);
        cube_r36.setTextureOffset(16, 145).addBox(1.0213F, 0.0F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false, false, false, true, false, true, false);
        cube_r36.setTextureOffset(49, 160).addBox(-1.1F, 0.0F, -11.0F, 3.0F, 3.0F, 9.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(9.4288F, -3.0642F, -48.4F);
        dust_cover.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, 0.0F, -0.6981F);
        cube_r37.setTextureOffset(112, 100).addBox(-2.0F, 0.0F, -0.4853F, 2.0F, 4.0F, 76.0F, 0.0F, false, true, true, false, false, true, false);

        mag = new ModelRenderer(this);
        mag.setRotationPoint(1.9F, 91.2865F, 138.0311F);


        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(0.0F, 0.0F, -1.0F);
        mag.addChild(cube_r38);
        setRotationAngle(cube_r38, -0.829F, 0.0F, 0.0F);
        cube_r38.setTextureOffset(49, 100).addBox(-5.0F, 1.1F, -16.8F, 6.0F, 19.0F, 7.0F, 0.0F, false, true, false, false, true, true, true);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(0.0F, -15.183F, 8.7715F);
        mag.addChild(cube_r39);
        setRotationAngle(cube_r39, -0.5672F, 0.0F, 0.0F);
        cube_r39.setTextureOffset(112, 100).addBox(-5.0F, 1.0F, -17.0F, 6.0F, 15.0F, 7.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(0.0F, -40.1694F, -0.9275F);
        mag.addChild(cube_r40);
        setRotationAngle(cube_r40, -0.3054F, 0.0F, 0.0F);
        cube_r40.setTextureOffset(112, 134).addBox(-5.0F, 5.0F, 0.0F, 6.0F, 14.0F, 7.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(0.0F, -44.6865F, -2.0311F);
        mag.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.0436F, 0.0F, 0.0F);
        cube_r41.setTextureOffset(150, 100).addBox(-5.0F, 1.0F, 0.0F, 6.0F, 10.0F, 7.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(1.0F, 4.5F, 1.9F);
        mag.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.8727F, 0.0F, 0.0F);
        cube_r42.setTextureOffset(270, 73).addBox(-7.0F, 0.0F, -17.0F, 8.0F, 20.0F, 17.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(1.0F, -11.883F, 13.3715F);
        mag.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.6109F, 0.0F, 0.0F);
        cube_r43.setTextureOffset(275, 0).addBox(-7.0F, 0.0F, -17.0F, 8.0F, 20.0F, 17.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(1.0F, -36.0694F, 3.1725F);
        mag.addChild(cube_r44);
        setRotationAngle(cube_r44, -0.3054F, 0.0F, 0.0F);
        cube_r44.setTextureOffset(280, 229).addBox(-7.0F, 0.0F, 0.0F, 8.0F, 20.0F, 17.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(1.0F, -44.6865F, 2.9689F);
        mag.addChild(cube_r45);
        setRotationAngle(cube_r45, -0.0436F, 0.0F, 0.0F);
        cube_r45.setTextureOffset(349, 102).addBox(-7.0F, 1.0F, 0.0F, 8.0F, 12.0F, 17.0F, 0.0F, false, true, true, false, false, true, true);

        grip = new ModelRenderer(this);
        grip.setRotationPoint(2.4F, 58.3F, 182.8F);
        grip.setTextureOffset(216, 257).addBox(-7.0F, -9.0F, -1.0F, 9.0F, 4.0F, 22.0F, 0.0F, false, true, true, false, true, true, true);
        grip.setTextureOffset(73, 299).addBox(-6.0F, -5.0F, -1.0F, 7.0F, 6.0F, 18.0F, 0.0F, false, true, false, false, true, true, true);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(0.0F, 0.0F, 16.9F);
        grip.addChild(cube_r46);
        setRotationAngle(cube_r46, 1.0472F, 0.0F, 0.0F);
        cube_r46.setTextureOffset(112, 155).addBox(-6.0F, -3.0F, 0.0F, 7.0F, 3.0F, 6.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(0.0F, 1.0F, 2.0F);
        grip.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.3054F, 0.0F, 0.0F);
        cube_r47.setTextureOffset(78, 194).addBox(-6.0F, 0.0F, 0.0F, 7.0F, 31.0F, 15.0F, 0.0F, false, true, true, false, true, true, true);

        safety = new ModelRenderer(this);
        safety.setRotationPoint(-6.1679F, 42.3F, 185.8F);
        safety.setTextureOffset(282, 156).addBox(0.0F, -9.0428F, -35.887F, 1.0F, 4.0F, 23.0F, 0.0F, false, true, false, true, false, false, true);
        safety.setTextureOffset(65, 145).addBox(0.0F, -4.3428F, -10.887F, 1.0F, 2.0F, 11.0F, 0.0F, false, false, false, true, false, false, true);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(-0.2F, 0.4189F, 1.0F);
        safety.addChild(cube_r48);
        setRotationAngle(cube_r48, -0.7854F, 0.0F, 0.0F);
        cube_r48.setTextureOffset(23, 47).addBox(0.0F, -2.6993F, -3.9537F, 1.0F, 6.0F, 6.0F, 0.0F, false, true, true, true, true, false, true);
        cube_r48.setTextureOffset(84, 30).addBox(-1.0F, -0.6993F, -1.9537F, 1.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, false, true);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(0.0F, -8.5811F, -12.0F);
        safety.addChild(cube_r49);
        setRotationAngle(cube_r49, -0.7854F, 0.0F, 0.0F);
        cube_r49.setTextureOffset(16, 164).addBox(0.0F, 0.3007F, -0.9537F, 1.0F, 5.0F, 8.0F, 0.0F, false, false, true, true, true, false, true);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(-0.7F, 0.4189F, 1.0F);
        safety.addChild(cube_r50);
        setRotationAngle(cube_r50, -0.192F, 0.0F, 0.0F);
        cube_r50.setTextureOffset(344, 142).addBox(0.0F, -2.284F, -37.9588F, 1.0F, 4.0F, 39.0F, 0.0F, false, true, true, true, true, false, true);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(48, 15).addBox(2.9F, 8.2F, 125.1F, 2.0F, 5.0F, 15.0F, 0.0F, false, true, false, true, false, true, false);
        body.setTextureOffset(48, 0).addBox(-2.6F, -0.5416F, 120.9229F, 1.0F, 2.0F, 6.0F, 0.0F, false, false, true, true, false, true, true);
        body.setTextureOffset(0, 0).addBox(-5.6F, 12.9F, 119.8F, 11.0F, 10.0F, 90.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(48, 15).addBox(1.4F, -0.5416F, 120.9229F, 1.0F, 2.0F, 6.0F, 0.0F, false, false, true, true, false, true, true);
        body.setTextureOffset(164, 82).addBox(-2.5F, 11.3F, 60.8F, 5.0F, 4.0F, 3.0F, 0.0F, false, true, false, true, false, true, true);
        body.setTextureOffset(152, 12).addBox(-2.6F, 24.3F, 158.2F, 5.0F, 10.0F, 6.0F, 0.0F, false, false, true, false, true, true, true);
        body.setTextureOffset(143, 194).addBox(-3.6F, 1.5F, 105.1F, 7.0F, 10.0F, 22.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(48, 0).addBox(-3.6F, 0.5F, 105.1F, 7.0F, 1.0F, 14.0F, 0.0F, false, true, false, true, false, true, true);
        body.setTextureOffset(48, 23).addBox(-1.5F, 16.7F, 27.9F, 3.0F, 4.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(146, 82).addBox(-1.5F, 17.0F, -0.7F, 3.0F, 2.0F, 6.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(77, 100).addBox(-2.0F, -0.8F, -1.0F, 4.0F, 16.0F, 2.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(164, 134).addBox(-2.0F, 10.2F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);
        body.setTextureOffset(46, 47).addBox(-2.0F, -0.8F, 0.0F, 4.0F, 7.0F, 3.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(150, 329).addBox(-2.6F, 0.1F, 107.1F, 5.0F, 2.0F, 20.0F, 0.0F, false, false, true, true, false, true, true);
        body.setTextureOffset(77, 118).addBox(-1.5F, 18.0F, 2.3F, 3.0F, 2.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(0, 100).addBox(-5.1F, 8.2F, 125.1F, 3.0F, 5.0F, 2.0F, 0.0F, false, true, true, true, false, false, true);
        body.setTextureOffset(112, 122).addBox(-5.1F, 11.5F, 119.8F, 10.0F, 2.0F, 6.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(0.4F, 24.1161F, 178.3782F);
        body.addChild(cube_r51);
        setRotationAngle(cube_r51, -0.3054F, 0.0F, 0.0F);
        cube_r51.setTextureOffset(0, 65).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 10.0F, 1.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(5.4F, 9.1F, 119.6F);
        body.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0873F, 0.0F, 0.0F);
        cube_r52.setTextureOffset(49, 129).addBox(-10.0F, 0.0F, 0.0F, 9.0F, 3.0F, 6.0F, 0.0F, false, true, false, true, false, true, true);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(2.4F, 0.5F, 119.1F);
        body.addChild(cube_r53);
        setRotationAngle(cube_r53, -0.3491F, 0.0F, 0.0F);
        cube_r53.setTextureOffset(112, 74).addBox(-6.0F, 0.0F, 0.0F, 7.0F, 1.0F, 3.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(1.4F, -3.1F, 110.1F);
        body.addChild(cube_r54);
        setRotationAngle(cube_r54, -0.7854F, 0.0F, 0.0F);
        cube_r54.setTextureOffset(23, 73).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false, true, false, true, false, true, true);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(1.4F, -1.6858F, 108.6858F);
        body.addChild(cube_r55);
        setRotationAngle(cube_r55, -0.3491F, 0.0F, 0.0F);
        cube_r55.setTextureOffset(46, 57).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(2.7424F, -3.439F, -1.0F);
        body.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.0F, 0.0F, -0.2618F);
        cube_r56.setTextureOffset(26, 129).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(1.4F, 4.1F, 38.2F);
        body.addChild(cube_r57);
        setRotationAngle(cube_r57, -0.6981F, 0.0F, 0.0F);
        cube_r57.setTextureOffset(23, 0).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 12.0F, 5.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(-2.7424F, -3.439F, -1.0F);
        body.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, 0.0F, 0.2618F);
        cube_r58.setTextureOffset(73, 129).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(1.0F, -0.8F, -1.0F);
        body.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.0F, 0.2618F);
        cube_r59.setTextureOffset(26, 100).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-2.0F, -0.8F, 3.0F);
        body.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.2618F, 0.0F, 0.0F);
        cube_r60.setTextureOffset(23, 18).addBox(0.0F, 0.0F, -2.0F, 4.0F, 15.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(-1.0F, -0.8F, -1.0F);
        body.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 0.0F, -0.2618F);
        cube_r61.setTextureOffset(112, 15).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(0.0F, 11.5F, 31.0F);
        body.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, 0.0F, -0.7854F);
        cube_r62.setTextureOffset(150, 40).addBox(-5.0F, 0.0F, -33.1F, 5.0F, 5.0F, 10.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r62.setTextureOffset(23, 65).addBox(-5.0F, 0.0F, 29.8F, 5.0F, 5.0F, 3.0F, 0.0F, false, true, false, true, true, true, true);
        cube_r62.setTextureOffset(0, 65).addBox(-5.0F, 0.0F, -3.2F, 5.0F, 5.0F, 13.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(2.4F, -0.9142F, 106.5142F);
        body.addChild(cube_r63);
        setRotationAngle(cube_r63, -0.7854F, 0.0F, 0.0F);
        cube_r63.setTextureOffset(494, 68).addBox(-7.0F, -0.4F, 1.2F, 1.0F, 2.0F, 8.0F, 0.0F, false, true, true, true, true, false, true);
        cube_r63.setTextureOffset(0, 133).addBox(-6.0F, -1.0F, 0.0F, 7.0F, 3.0F, 3.0F, 0.0F, false, true, false, true, false, true, true);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(0.0F, 19.0F, 4.8F);
        body.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, 0.0F, -0.7854F);
        cube_r64.setTextureOffset(207, 229).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 71.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(0.4F, 36.7884F, 164.5282F);
        body.addChild(cube_r65);
        setRotationAngle(cube_r65, -0.0436F, 0.0F, 0.0F);
        cube_r65.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 1.0F, 17.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(0.4F, 34.4161F, 181.1782F);
        body.addChild(cube_r66);
        setRotationAngle(cube_r66, -0.1745F, 0.0F, 0.0F);
        cube_r66.setTextureOffset(67, 15).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 6.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(0.4F, 28.6F, 158.7F);
        body.addChild(cube_r67);
        setRotationAngle(cube_r67, -1.3963F, 0.0F, 0.0F);
        cube_r67.setTextureOffset(152, 0).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 1.0F, 11.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(0.4F, 32.7F, 164.2F);
        body.addChild(cube_r68);
        setRotationAngle(cube_r68, -1.309F, 0.0F, 0.0F);
        cube_r68.setTextureOffset(71, 81).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 1.0F, 5.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(6.4F, 19.3F, 138.7F);
        body.addChild(cube_r69);
        setRotationAngle(cube_r69, -0.7854F, 0.0F, 0.0F);
        cube_r69.setTextureOffset(0, 83).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(4.4F, 23.2849F, 119.712F);
        body.addChild(cube_r70);
        setRotationAngle(cube_r70, -0.0401F, 0.0F, 0.0F);
        cube_r70.setTextureOffset(0, 100).addBox(-10.0F, -4.0F, 0.0F, 11.0F, 4.0F, 90.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(6.4F, 20.3F, 192.7F);
        body.addChild(cube_r71);
        setRotationAngle(cube_r71, -0.7854F, 0.0F, 0.0F);
        cube_r71.setTextureOffset(0, 36).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(1.4F, -2.5F, 110.1F);
        body.addChild(cube_r72);
        setRotationAngle(cube_r72, -0.1641F, 0.0F, 0.0F);
        cube_r72.setTextureOffset(150, 149).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 12.0F, 0.0F, false, false, false, true, false, true, true);
        cube_r72.setTextureOffset(150, 134).addBox(-4.0F, 0.0F, 0.0F, 1.0F, 3.0F, 12.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(6.4F, 14.3F, 130.7F);
        body.addChild(cube_r73);
        setRotationAngle(cube_r73, -0.7854F, 0.0F, 0.0F);
        cube_r73.setTextureOffset(46, 81).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(0.0F, 2.2F, 39.3F);
        body.addChild(cube_r74);
        setRotationAngle(cube_r74, 0.0F, 0.0F, -0.7854F);
        cube_r74.setTextureOffset(204, 156).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 5.0F, 68.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setRotationPoint(-1.6F, 6.2F, 205.3F);
        body.addChild(cube_r75);
        setRotationAngle(cube_r75, -0.7854F, 0.0F, 0.0F);
        cube_r75.setTextureOffset(48, 8).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setRotationPoint(0.6F, 2.2F, 61.3F);
        body.addChild(cube_r76);
        setRotationAngle(cube_r76, 0.0F, 0.0F, -0.7854F);
        cube_r76.setTextureOffset(0, 160).addBox(-6.0F, -1.0F, -1.0F, 6.0F, 6.0F, 6.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setRotationPoint(6.4F, 14.3F, 123.7F);
        body.addChild(cube_r77);
        setRotationAngle(cube_r77, -0.7854F, 0.0F, 0.0F);
        cube_r77.setTextureOffset(112, 29).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r78 = new ModelRenderer(this);
        cube_r78.setRotationPoint(6.4F, 15.3F, 195.7F);
        body.addChild(cube_r78);
        setRotationAngle(cube_r78, -0.7854F, 0.0F, 0.0F);
        cube_r78.setTextureOffset(48, 35).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        stock = new ModelRenderer(this);
        stock.setRotationPoint(0.0F, 24.0F, 0.0F);
        stock.setTextureOffset(166, 432).addBox(-4.6F, 16.9F, 223.5209F, 9.0F, 12.0F, 68.0F, 0.0F, false, true, true, true, true, true, true);
        stock.setTextureOffset(488, 441).addBox(-3.6F, 15.7F, 288.9209F, 7.0F, 28.0F, 4.0F, 0.0F, false, false, true, true, true, true, true);
        stock.setTextureOffset(171, 473).addBox(-4.6F, 33.9F, 271.5209F, 9.0F, 5.0F, 18.0F, 0.0F, false, false, true, false, false, true, true);
        stock.setTextureOffset(262, 450).addBox(-4.6F, 28.9F, 248.5209F, 9.0F, 5.0F, 43.0F, 0.0F, false, false, true, false, false, true, true);
        stock.setTextureOffset(293, 385).addBox(-2.5928F, 13.4453F, 238.5209F, 5.0F, 3.0F, 53.0F, 0.0F, false, false, true, true, false, false, false);
        stock.setTextureOffset(0, 462).addBox(-2.5928F, 17.1453F, 210.2209F, 5.0F, 3.0F, 20.0F, 0.0F, false, false, false, true, false, false, false);
        stock.setTextureOffset(0, 416).addBox(-5.6F, 13.8968F, 209.6395F, 11.0F, 13.0F, 1.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setRotationPoint(1.4F, 27.0445F, 210.5111F);
        stock.addChild(cube_r79);
        setRotationAngle(cube_r79, -0.1745F, 0.0F, 0.0F);
        cube_r79.setTextureOffset(148, 422).addBox(-3.0F, -6.0456F, 0.0F, 3.0F, 6.0F, 14.0F, 0.0F, false, false, false, false, true, false, false);

        cube_r80 = new ModelRenderer(this);
        cube_r80.setRotationPoint(4.4F, 29.2445F, 223.5111F);
        stock.addChild(cube_r80);
        setRotationAngle(cube_r80, -0.2182F, 0.0F, 0.0F);
        cube_r80.setTextureOffset(351, 408).addBox(-9.0F, -6.0456F, 0.0F, 9.0F, 6.0F, 68.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setRotationPoint(-0.5247F, 15.8414F, 238.5209F);
        stock.addChild(cube_r81);
        setRotationAngle(cube_r81, 0.0F, 0.0F, 0.5236F);
        cube_r81.setTextureOffset(392, 211).addBox(-3.0F, -1.0456F, 0.0F, 3.0F, 4.0F, 53.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setRotationPoint(2.4072F, 13.4858F, 238.542F);
        stock.addChild(cube_r82);
        setRotationAngle(cube_r82, 0.48F, 0.0F, 0.0F);
        cube_r82.setTextureOffset(484, 3).addBox(-5.0F, -0.0456F, -8.0F, 5.0F, 3.0F, 8.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setRotationPoint(4.3678F, 16.9322F, 238.5209F);
        stock.addChild(cube_r83);
        setRotationAngle(cube_r83, 0.0F, 0.0F, 1.0472F);
        cube_r83.setTextureOffset(82, 392).addBox(-4.0F, -0.0456F, 0.0F, 4.0F, 3.0F, 53.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setRotationPoint(4.4F, 34.4653F, 289.4812F);
        stock.addChild(cube_r84);
        setRotationAngle(cube_r84, -0.0873F, 0.0F, 0.0F);
        cube_r84.setTextureOffset(256, 480).addBox(-9.0F, -1.0456F, -2.0F, 9.0F, 6.0F, 4.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r85 = new ModelRenderer(this);
        cube_r85.setRotationPoint(-3.5685F, 23.8456F, 210.1802F);
        stock.addChild(cube_r85);
        setRotationAngle(cube_r85, -0.1745F, 0.0698F, 0.0F);
        cube_r85.setTextureOffset(75, 418).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 19.0F, 0.0F, false, false, false, false, true, false, true);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setRotationPoint(-3.5685F, 13.9456F, 210.1802F);
        stock.addChild(cube_r86);
        setRotationAngle(cube_r86, -0.1745F, 0.0698F, 0.0F);
        cube_r86.setTextureOffset(73, 492).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 3.0F, 17.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setRotationPoint(3.3685F, 23.8456F, 210.1802F);
        stock.addChild(cube_r87);
        setRotationAngle(cube_r87, -0.1745F, -0.0698F, 0.0F);
        cube_r87.setTextureOffset(103, 462).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 19.0F, 0.0F, false, false, false, false, true, true, false);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setRotationPoint(3.3685F, 13.9456F, 210.1802F);
        stock.addChild(cube_r88);
        setRotationAngle(cube_r88, -0.1745F, -0.0698F, 0.0F);
        cube_r88.setTextureOffset(116, 492).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 3.0F, 17.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setRotationPoint(-5.6F, 19.9F, 209.8F);
        stock.addChild(cube_r89);
        setRotationAngle(cube_r89, 0.0F, 0.0698F, 0.0F);
        cube_r89.setTextureOffset(0, 487).addBox(0.0F, -3.0F, 0.0F, 2.0F, 10.0F, 15.0F, 0.0F, false, false, false, false, true, false, true);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setRotationPoint(5.4F, 19.9F, 209.8F);
        stock.addChild(cube_r90);
        setRotationAngle(cube_r90, 0.0F, -0.0698F, 0.0F);
        cube_r90.setTextureOffset(36, 487).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 10.0F, 15.0F, 0.0F, false, false, false, false, true, true, false);

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
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay,
                       float red, float green, float blue, float alpha, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode, GunRenderContext context, long fireDis) {
        barrel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.push();
        boolean nullFlag = context == null;
        if (slideRecoil != null) {
            slideRecoil.play(lastFireTime, matrixStack, transformType);
        }
        slide.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.pop();
        muzzle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

        handguard.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        IS.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        dust_cover.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        if (!nullFlag && !context.occupiedMag) {
            mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        }
        grip.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        safety.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        stock.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

    }
}
