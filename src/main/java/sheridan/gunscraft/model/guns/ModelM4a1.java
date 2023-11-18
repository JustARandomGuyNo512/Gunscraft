package sheridan.gunscraft.model.guns;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import sheridan.gunscraft.animation.CommonAnimations;
import sheridan.gunscraft.animation.IAnimation;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelM4a1 extends EntityModel<Entity> implements IGunModel {
    private final ModelRenderer IS;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer muzzle;
    private final ModelRenderer cube_r5;
    private final ModelRenderer hand_guard;
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
    private final ModelRenderer ring;
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
    private final ModelRenderer stock;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer mag;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer charge;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer grip;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer safety;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer blotRelease;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer blot;
    private final ModelRenderer blot_r1;

    public static IAnimation slideRecoil;

    public ModelM4a1() {
        slideRecoil = CommonAnimations.createSingleAxisBlotBack(0.22f, 3.0f);

        textureWidth = 620;
        textureHeight = 620;

        IS = new ModelRenderer(this);
        IS.setRotationPoint(0.0F, 31.5F, 121.1F);
        IS.setTextureOffset(145, 0).addBox(-3.0F, -3.6408F, -0.1F, 6.0F, 4.0F, 21.0F, 0.0F, false, true, false, true, true, true, true);
        IS.setTextureOffset(0, 47).addBox(-5.0F, -1.2408F, -0.1F, 10.0F, 4.0F, 8.0F, 0.0F, false, true, true, true, true, true, true);
        IS.setTextureOffset(215, 63).addBox(-3.0F, -7.6408F, 3.9F, 6.0F, 4.0F, 15.0F, 0.0F, false, true, false, true, false, true, true);
        IS.setTextureOffset(0, 179).addBox(-1.5F, -13.1408F, 12.2F, 3.0F, 4.0F, 4.0F, 0.0F, false, true, false, false, true, false, false);
        IS.setTextureOffset(211, 213).addBox(-4.0F, -13.6608F, 3.9F, 8.0F, 6.0F, 13.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-3.0F, -7.6408F, 18.9F);
        IS.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.0908F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(29, 136).addBox(0.0F, 0.0F, 0.0F, 6.0F, 3.0F, 8.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.5F, -3.6408F, -0.1F);
        IS.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, false, true, false, true, false, true, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(2.4F, -9.1408F, 13.0F);
        IS.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(28, 47).addBox(-8.0F, 0.0F, -1.0F, 10.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, true, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-6.0F, -12.6408F, 12.2F);
        IS.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(175, 73).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 5.0F, 0.0F, false, true, true, true, true, true, true);

        muzzle = new ModelRenderer(this);
        muzzle.setRotationPoint(0.0F, 35.6F, -62.0F);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 4.0F, 0.0F);
        muzzle.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
        cube_r5.setTextureOffset(145, 25).addBox(-1.0F, -1.0F, -1.0F, 6.0F, 6.0F, 17.0F, 0.0F, false, true, true, true, true, true, true);

        hand_guard = new ModelRenderer(this);
        hand_guard.setRotationPoint(0.0F, 23.7F, 0.0F);
        hand_guard.setTextureOffset(145, 25).addBox(-6.9282F, 14.8F, 15.0F, 5.0F, 8.0F, 3.0F, 0.0F, false, true, true, false, false, false, true);
        hand_guard.setTextureOffset(145, 7).addBox(1.9282F, 14.8F, 15.0F, 5.0F, 8.0F, 3.0F, 0.0F, false, true, true, false, false, true, false);
        hand_guard.setTextureOffset(145, 137).addBox(-3.0F, 7.8592F, 18.0F, 6.0F, 22.0F, 54.0F, 0.0F, false, true, true, true, true, true, true);
        hand_guard.setTextureOffset(282, 137).addBox(-10.0F, 16.1716F, 18.0F, 20.0F, 6.0F, 54.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(3.0F, 11.3072F, 71.1F);
        hand_guard.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(112, 112).addBox(-6.0F, -0.048F, 0.0F, 6.0F, 3.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(7.8394F, 18.8394F, 19.0F);
        hand_guard.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -1.1781F);
        cube_r7.setTextureOffset(349, 277).addBox(-6.0F, -3.0F, -1.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-5.5433F, 13.2961F, 19.0F);
        hand_guard.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, -1.1781F);
        cube_r8.setTextureOffset(295, 377).addBox(-6.0F, 0.0F, -1.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-7.8394F, 18.8394F, 18.0F);
        hand_guard.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 1.1781F);
        cube_r9.setTextureOffset(145, 213).addBox(0.0F, -3.0F, 0.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(5.5433F, 13.2961F, 19.0F);
        hand_guard.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 1.1781F);
        cube_r10.setTextureOffset(350, 60).addBox(0.0F, 0.0F, -1.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 26.6788F, 18.0F);
        hand_guard.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
        cube_r11.setTextureOffset(344, 197).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, 11.0F, 19.0F);
        hand_guard.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.3927F);
        cube_r12.setTextureOffset(376, 117).addBox(0.0F, 0.0F, -1.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(5.1606F, 23.4588F, 19.0F);
        hand_guard.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3927F);
        cube_r13.setTextureOffset(350, 0).addBox(-6.0F, -2.0F, -1.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(3.495F, 8.3542F, 19.0F);
        hand_guard.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
        cube_r14.setTextureOffset(416, 3).addBox(-0.4F, 0.0F, -1.0F, 1.0F, 2.0F, 54.0F, 0.0F, false, true, true, true, false, true, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(3.7071F, 8.5663F, 19.0F);
        hand_guard.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
        cube_r15.setTextureOffset(444, 453).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-8.5858F, 22.1716F, 19.0F);
        hand_guard.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
        cube_r16.setTextureOffset(427, 341).addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 54.0F, 0.0F, false, true, true, false, true, true, false);
        cube_r16.setTextureOffset(170, 442).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(10.0F, 22.1716F, 19.0F);
        hand_guard.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
        cube_r17.setTextureOffset(112, 412).addBox(-2.0F, 0.3F, -1.0F, 2.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, true, true, false);
        cube_r17.setTextureOffset(416, 59).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(10.0F, 16.1716F, 19.0F);
        hand_guard.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
        cube_r18.setTextureOffset(415, 285).addBox(-1.3F, 0.0F, -1.0F, 1.0F, 2.0F, 54.0F, 0.0F, false, true, true, true, false, false, true);
        cube_r18.setTextureOffset(276, 434).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(-8.5858F, 16.1716F, 19.0F);
        hand_guard.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
        cube_r19.setTextureOffset(410, 174).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 54.0F, 0.0F, false, true, true, true, false, false, true);
        cube_r19.setTextureOffset(388, 452).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(3.9899F, 28.8693F, 19.0F);
        hand_guard.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
        cube_r20.setTextureOffset(218, 387).addBox(-2.0F, 0.1F, -1.0F, 2.0F, 1.0F, 54.0F, 0.0F, false, true, true, true, false, true, false);
        cube_r20.setTextureOffset(332, 437).addBox(-1.0F, 0.4F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(-2.0101F, 28.8693F, 19.0F);
        hand_guard.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
        cube_r21.setTextureOffset(415, 229).addBox(-1.3F, -0.6F, -1.0F, 1.0F, 2.0F, 54.0F, 0.0F, false, true, true, false, true, false, true);
        cube_r21.setTextureOffset(442, 114).addBox(-1.0F, 0.4F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-2.0808F, 8.3542F, 19.0F);
        hand_guard.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
        cube_r22.setTextureOffset(0, 412).addBox(-1.0F, 0.6F, -1.0F, 2.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, true, false, true);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-2.2929F, 8.5663F, 19.0F);
        hand_guard.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
        cube_r23.setTextureOffset(427, 397).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 54.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(3.0F, 22.1072F, 71.1F);
        hand_guard.addChild(cube_r24);
        setRotationAngle(cube_r24, -0.7854F, 0.0F, 0.0F);
        cube_r24.setTextureOffset(145, 137).addBox(-6.0F, -2.048F, 0.0F, 6.0F, 5.0F, 3.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(6.9282F, 14.8F, 16.0F);
        hand_guard.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, 0.5236F);
        cube_r25.setTextureOffset(72, 147).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(0.5F, 25.934F, 16.0F);
        hand_guard.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, 0.5236F);
        cube_r26.setTextureOffset(72, 155).addBox(-8.0F, -4.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(6.4282F, 21.934F, 16.0F);
        hand_guard.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, -0.5236F);
        cube_r27.setTextureOffset(107, 167).addBox(-8.0F, -4.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.0F, 10.8F, 16.0F);
        hand_guard.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, -0.5236F);
        cube_r28.setTextureOffset(72, 167).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.0F, 11.0F, 19.0F);
        hand_guard.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.0F, -0.3927F);
        cube_r29.setTextureOffset(361, 380).addBox(-6.0F, 0.0F, -1.0F, 6.0F, 3.0F, 54.0F, 0.0F, false, true, true, true, false, false, false);

        ring = new ModelRenderer(this);
        ring.setRotationPoint(0.0F, 39.0F, 74.5F);
        ring.setTextureOffset(82, 180).addBox(-7.7942F, -1.0F, 3.0F, 3.0F, 9.0F, 2.0F, 0.0F, false, true, true, false, false, false, true);
        ring.setTextureOffset(72, 180).addBox(4.7942F, -1.0F, 3.0F, 3.0F, 9.0F, 2.0F, 0.0F, false, true, true, false, false, true, false);
        ring.setTextureOffset(50, 182).addBox(-6.9282F, -0.5F, 1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false, true, false, false, false, false, true);
        ring.setTextureOffset(125, 11).addBox(3.9282F, -0.5F, 1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false, true, false, false, false, true, false);
        ring.setTextureOffset(11, 0).addBox(-6.0622F, 0.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false, true, false, false, false, false, true);
        ring.setTextureOffset(11, 72).addBox(3.0622F, 0.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false, true, false, false, false, true, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(6.0622F, 0.0F, 0.0F);
        ring.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.0F, 0.5236F);
        cube_r30.setTextureOffset(42, 177).addBox(-7.0F, 0.0F, -1.0F, 7.0F, 3.0F, 2.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.5F, 9.634F, 0.0F);
        ring.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, 0.0F, 0.5236F);
        cube_r31.setTextureOffset(178, 12).addBox(-7.0F, -2.0F, -1.0F, 7.0F, 3.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(5.5622F, 6.134F, 0.0F);
        ring.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, 0.0F, -0.5236F);
        cube_r32.setTextureOffset(24, 179).addBox(-7.0F, -2.0F, -1.0F, 7.0F, 3.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(0.0F, -3.5F, -1.0F);
        ring.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, 0.0F, -0.5236F);
        cube_r33.setTextureOffset(178, 7).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 3.0F, 2.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(6.9282F, -0.5F, 2.0F);
        ring.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 0.0F, 0.5236F);
        cube_r34.setTextureOffset(173, 158).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 3.0F, 2.0F, 0.0F, false, true, false, true, false, false, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(0.5F, 10.634F, 2.0F);
        ring.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, 0.5236F);
        cube_r35.setTextureOffset(174, 37).addBox(-8.0F, -2.0F, -1.0F, 8.0F, 3.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(7.7942F, -1.0F, 4.0F);
        ring.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, 0.0F, 0.5236F);
        cube_r36.setTextureOffset(29, 123).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 3.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(0.5F, 11.634F, 4.0F);
        ring.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, 0.0F, 0.5236F);
        cube_r37.setTextureOffset(74, 127).addBox(-9.0F, -2.0F, -1.0F, 9.0F, 3.0F, 2.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(7.2942F, 7.134F, 4.0F);
        ring.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 0.0F, -0.5236F);
        cube_r38.setTextureOffset(173, 137).addBox(-9.0F, -2.0F, -1.0F, 9.0F, 3.0F, 2.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(0.0F, -5.5F, 3.0F);
        ring.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, -0.5236F);
        cube_r39.setTextureOffset(96, 127).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 3.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(6.4282F, 6.634F, 2.0F);
        ring.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, 0.0F, -0.5236F);
        cube_r40.setTextureOffset(175, 68).addBox(-8.0F, -2.0F, -1.0F, 8.0F, 3.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(0.0F, -4.5F, 1.0F);
        ring.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, 0.0F, -0.5236F);
        cube_r41.setTextureOffset(175, 63).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 3.0F, 2.0F, 0.0F, false, true, false, true, false, false, false);

        stock = new ModelRenderer(this);
        stock.setRotationPoint(0.0F, 39.0F, 184.5F);
        stock.setTextureOffset(145, 63).addBox(-6.0378F, 0.0F, 56.0F, 12.0F, 41.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);
        stock.setTextureOffset(219, 20).addBox(-2.5F, 16.9592F, 17.5F, 5.0F, 6.0F, 14.0F, 0.0F, false, true, false, true, true, true, true);
        stock.setTextureOffset(58, 412).addBox(-1.5F, 13.9592F, 9.5F, 3.0F, 6.0F, 47.0F, 0.0F, false, true, false, false, true, true, true);
        stock.setTextureOffset(0, 47).addBox(-1.5F, 34.5396F, 55.0443F, 3.0F, 6.0F, 1.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(1.5F, 20.0072F, 30.5F);
        stock.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.6981F, 0.0F, 0.0F);
        cube_r42.setTextureOffset(137, 330).addBox(-3.0F, -6.048F, 0.0F, 3.0F, 6.0F, 32.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(2.5F, 21.5922F, 27.6124F);
        stock.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.6981F, 0.0F, 0.0F);
        cube_r43.setTextureOffset(219, 0).addBox(-5.0F, -6.048F, 0.0F, 5.0F, 6.0F, 14.0F, 0.0F, false, false, true, true, true, true, true);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(2.2F, 28.0072F, 24.5F);
        stock.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0F, -0.7854F, 0.0F);
        cube_r44.setTextureOffset(74, 102).addBox(-3.0F, -17.048F, 0.0F, 3.0F, 17.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(6.0622F, 0.0F, -1.0F);
        stock.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0F, 0.0F, 0.0873F);
        cube_r45.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 12.0F, 60.0F, 0.0F, false, true, false, false, false, true, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(-6.0622F, 0.0F, -1.0F);
        stock.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.0F, 0.0F, -0.0873F);
        cube_r46.setTextureOffset(0, 136).addBox(0.0F, 0.0F, 0.0F, 6.0F, 12.0F, 60.0F, 0.0F, false, true, false, false, false, false, true);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(6.0622F, 0.0F, 0.0F);
        stock.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.0F, 0.0F, 0.5236F);
        cube_r47.setTextureOffset(0, 72).addBox(-7.0F, 0.0F, -1.0F, 7.0F, 3.0F, 60.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(1.5459F, 14.5883F, 0.0F);
        stock.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0F, 0.0F, 0.5236F);
        cube_r48.setTextureOffset(0, 208).addBox(-7.0F, -2.0F, -1.0F, 5.0F, 3.0F, 60.0F, 0.0F, false, true, false, false, true, true, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(4.5163F, 11.0883F, 0.0F);
        stock.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, 0.0F, -0.5236F);
        cube_r49.setTextureOffset(0, 272).addBox(-5.0F, -2.0F, -1.0F, 5.0F, 3.0F, 60.0F, 0.0F, false, true, false, false, true, false, true);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(0.0F, -3.5F, -1.0F);
        stock.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, 0.0F, -0.5236F);
        cube_r50.setTextureOffset(145, 0).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 3.0F, 60.0F, 0.0F, false, true, true, true, false, false, false);

        mag = new ModelRenderer(this);
        mag.setRotationPoint(0.0F, 21.2F, 0.0F);
        mag.setTextureOffset(0, 72).addBox(-3.5F, 44.0592F, 85.1F, 7.0F, 9.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(3.5F, 53.0592F, 107.1F);
        mag.addChild(cube_r51);
        setRotationAngle(cube_r51, -0.1571F, 0.0F, 0.0F);
        cube_r51.setTextureOffset(74, 72).addBox(-7.0F, 0.0F, -22.0F, 7.0F, 8.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(3.5F, 61.0087F, 105.8485F);
        mag.addChild(cube_r52);
        setRotationAngle(cube_r52, -0.2967F, 0.0F, 0.0F);
        cube_r52.setTextureOffset(0, 0).addBox(-7.0F, -0.048F, -22.0F, 7.0F, 25.0F, 22.0F, 0.0F, false, true, true, false, true, true, true);

        charge = new ModelRenderer(this);
        charge.setRotationPoint(0.0F, 24.0F, -5.0F);
        charge.setTextureOffset(145, 137).addBox(-2.0F, 10.6592F, 124.2F, 4.0F, 1.0F, 20.0F, 0.0F, false, false, false, true, false, true, true);
        charge.setTextureOffset(175, 83).addBox(-2.5F, 10.1592F, 144.0F, 5.0F, 2.0F, 4.0F, 0.0F, false, true, false, true, true, true, true);
        charge.setTextureOffset(145, 48).addBox(-6.5F, 10.1592F, 148.0F, 13.0F, 2.0F, 4.0F, 0.0F, false, true, true, true, true, false, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(8.6213F, 10.2072F, 149.8787F);
        charge.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, -0.7854F, 0.0F);
        cube_r53.setTextureOffset(118, 127).addBox(-4.0F, -0.048F, 0.0F, 4.0F, 2.0F, 3.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(-4.3787F, 10.2072F, 149.8787F);
        charge.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, -0.7854F, 0.0F);
        cube_r54.setTextureOffset(11, 103).addBox(-3.0F, -0.048F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false, true, true, true, true, false, true);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(244, 277).addBox(-3.5F, 21.0592F, 109.0F, 7.0F, 15.0F, 32.0F, 0.0F, false, false, true, true, true, true, true);
        body.setTextureOffset(103, 208).addBox(-3.5F, 21.0592F, 141.0F, 7.0F, 9.0F, 9.0F, 0.0F, false, false, true, false, true, true, true);
        body.setTextureOffset(105, 136).addBox(3.3F, 22.7592F, 100.4F, 1.0F, 23.0F, 4.0F, 0.0F, false, true, true, true, false, true, false);
        body.setTextureOffset(84, 0).addBox(-2.0F, 10.7246F, 13.999F, 4.0F, 9.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(55, 47).addBox(-0.5F, -4.0F, 0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(36, 0).addBox(4.1962F, 15.5F, 72.0F, 1.0F, 6.0F, 9.0F, 0.0F, false, false, true, false, false, true, false);
        body.setTextureOffset(0, 0).addBox(-5.1962F, 15.5F, 72.0F, 1.0F, 6.0F, 9.0F, 0.0F, false, false, true, false, false, false, true);
        body.setTextureOffset(86, 102).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 21.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(72, 32).addBox(-2.0F, -4.5963F, -2.0F, 4.0F, 5.0F, 7.0F, 0.0F, false, true, false, true, true, true, true);
        body.setTextureOffset(219, 40).addBox(-1.0F, 11.6925F, -1.2865F, 2.0F, 4.0F, 16.0F, 0.0F, false, false, false, true, false, true, true);
        body.setTextureOffset(38, 182).addBox(-1.0F, 20.6925F, -1.2865F, 2.0F, 4.0F, 4.0F, 0.0F, false, true, true, false, true, true, true);
        body.setTextureOffset(47, 0).addBox(-1.0F, 20.6925F, 10.7135F, 2.0F, 4.0F, 4.0F, 0.0F, false, true, false, false, true, true, true);
        body.setTextureOffset(145, 183).addBox(-1.0F, 0.6925F, -1.2865F, 2.0F, 4.0F, 4.0F, 0.0F, false, false, true, true, true, true, true);
        body.setTextureOffset(0, 72).addBox(-0.5F, 4.6925F, -1.2865F, 1.0F, 7.0F, 2.0F, 0.0F, false, false, true, false, false, true, true);
        body.setTextureOffset(0, 179).addBox(-2.0F, 45.9733F, 109.2661F, 4.0F, 1.0F, 16.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(44, 147).addBox(-3.0F, 38.7592F, 125.2F, 6.0F, 7.0F, 2.0F, 0.0F, false, true, false, false, false, true, true);
        body.setTextureOffset(115, 147).addBox(-3.0F, 45.0875F, 123.8803F, 6.0F, 2.0F, 4.0F, 0.0F, false, false, false, false, true, true, true);
        body.setTextureOffset(0, 15).addBox(-4.0F, 24.8592F, 81.6F, 8.0F, 4.0F, 3.0F, 0.0F, false, false, false, true, true, true, true);
        body.setTextureOffset(145, 63).addBox(-3.0F, 7.8592F, 81.0F, 6.0F, 10.0F, 58.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(115, 136).addBox(2.1F, 12.5592F, 91.6F, 2.0F, 4.0F, 7.0F, 0.0F, false, true, true, true, false, true, false);
        body.setTextureOffset(72, 44).addBox(-3.0F, 12.4592F, 139.0F, 6.0F, 3.0F, 6.0F, 0.0F, false, false, true, true, false, true, true);
        body.setTextureOffset(178, 0).addBox(-3.0F, 38.7592F, 107.4F, 6.0F, 5.0F, 2.0F, 0.0F, false, false, true, false, false, true, true);
        body.setTextureOffset(121, 175).addBox(-5.3284F, 15.8876F, 145.0F, 2.0F, 5.0F, 5.0F, 0.0F, false, true, true, false, false, false, true);
        body.setTextureOffset(244, 324).addBox(-4.0F, 21.0592F, 84.6F, 8.0F, 13.0F, 28.0F, 0.0F, false, true, true, true, false, true, true);
        body.setTextureOffset(36, 83).addBox(-3.0F, 7.8592F, 139.0F, 6.0F, 2.0F, 6.0F, 0.0F, false, false, true, true, true, true, true);
        body.setTextureOffset(72, 0).addBox(-4.0F, 34.0592F, 84.6F, 8.0F, 9.0F, 23.0F, 0.0F, false, true, true, false, false, true, true);
        body.setTextureOffset(50, 103).addBox(-6.9131F, 19.8296F, 112.0F, 4.0F, 3.0F, 1.0F, 0.0F, false, true, true, false, true, false, true);
        body.setTextureOffset(72, 0).addBox(3.4F, 28.5592F, 100.6F, 1.0F, 2.0F, 10.0F, 0.0F, false, true, true, true, false, true, false);
        body.setTextureOffset(107, 175).addBox(3.3284F, 15.8876F, 145.0F, 2.0F, 5.0F, 5.0F, 0.0F, false, true, true, false, false, true, false);
        body.setTextureOffset(0, 272).addBox(3.3301F, 16.0F, 81.0F, 1.0F, 5.0F, 135.0F, 0.0F, false, false, false, false, false, true, false);
        body.setTextureOffset(50, 107).addBox(-6.9131F, 19.8296F, 84.0F, 4.0F, 3.0F, 1.0F, 0.0F, false, true, true, false, true, false, true);
        body.setTextureOffset(137, 277).addBox(-4.3301F, 16.0F, 111.0F, 1.0F, 5.0F, 105.0F, 0.0F, false, false, false, false, false, false, true);
        body.setTextureOffset(48, 47).addBox(-4.3301F, 16.0F, 81.0F, 1.0F, 5.0F, 5.0F, 0.0F, false, false, true, false, false, false, true);
        body.setTextureOffset(72, 0).addBox(4.3301F, 15.4F, 150.2F, 1.0F, 6.0F, 4.0F, 0.0F, false, true, true, false, false, true, false);
        body.setTextureOffset(36, 15).addBox(-4.0F, 21.2592F, 81.0F, 8.0F, 2.0F, 4.0F, 0.0F, false, true, false, false, true, true, true);
        body.setTextureOffset(145, 0).addBox(-3.0F, 22.0592F, 81.0F, 6.0F, 3.0F, 4.0F, 0.0F, false, true, false, false, true, true, true);
        body.setTextureOffset(173, 163).addBox(-4.0F, 42.9592F, 105.6F, 8.0F, 3.0F, 2.0F, 0.0F, false, false, true, false, false, true, true);
        body.setTextureOffset(74, 72).addBox(-5.0622F, 15.4F, 150.2F, 1.0F, 6.0F, 4.0F, 0.0F, false, true, true, false, false, false, true);
        body.setTextureOffset(137, 277).addBox(-1.5F, 22.0592F, 167.0F, 3.0F, 4.0F, 49.0F, 0.0F, false, true, false, false, true, true, true);
        body.setTextureOffset(0, 87).addBox(-4.0F, 34.0592F, 107.6F, 6.0F, 2.0F, 5.0F, 0.0F, false, false, true, false, true, false, true);
        body.setTextureOffset(28, 49).addBox(-4.9F, 28.6592F, 109.1F, 2.0F, 4.0F, 2.0F, 0.0F, false, true, true, true, true, false, true);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(2.0F, 35.0213F, 121.0661F);
        body.addChild(cube_r55);
        setRotationAngle(cube_r55, -0.2618F, 0.0F, 0.0F);
        cube_r55.setTextureOffset(24, 184).addBox(-3.0F, -0.048F, 0.0F, 3.0F, 9.0F, 1.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(4.0F, 34.1072F, 112.6F);
        body.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.5672F, 0.0F, 0.0F);
        cube_r56.setTextureOffset(44, 167).addBox(-2.0F, -3.048F, -6.0F, 2.0F, 3.0F, 6.0F, 0.0F, false, false, false, false, true, true, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(-3.6962F, 21.034F, 151.2F);
        body.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, 0.0F, 0.5236F);
        cube_r57.setTextureOffset(174, 25).addBox(-1.0F, 0.0F, -1.0F, 6.0F, 1.0F, 4.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(5.3301F, 21.4F, 151.2F);
        body.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, 0.0F, 1.0472F);
        cube_r58.setTextureOffset(86, 72).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 6.0F, 4.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(-3.3301F, 14.4F, 151.2F);
        body.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.0F, -0.5236F);
        cube_r59.setTextureOffset(115, 153).addBox(-2.0F, 0.0F, -1.0F, 6.0F, 1.0F, 4.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-10.6348F, 17.9927F, 137.0891F);
        body.addChild(cube_r60);
        setRotationAngle(cube_r60, -0.3185F, -0.3035F, 0.8345F);
        cube_r60.setTextureOffset(87, 32).addBox(1.0F, -2.048F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(-2.3815F, 20.8281F, 124.0F);
        body.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, -0.4363F, 0.0F);
        cube_r61.setTextureOffset(211, 171).addBox(0.0F, -3.048F, 0.0F, 6.0F, 3.0F, 17.0F, 0.0F, false, false, true, false, true, false, false);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(-7.0661F, 22.3047F, 98.6F);
        body.addChild(cube_r62);
        setRotationAngle(cube_r62, -0.7854F, 0.0F, -0.9599F);
        cube_r62.setTextureOffset(48, 57).addBox(-5.0F, -0.048F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false, true, false, true, false, true, true);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(1.0F, 12.9F, 151.2F);
        body.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0F, 0.0F, 0.5236F);
        cube_r63.setTextureOffset(173, 142).addBox(-1.0F, 0.0F, -1.0F, 6.0F, 1.0F, 4.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(-3.0661F, 11.6931F, 84.0F);
        body.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, 0.0F, -1.1345F);
        cube_r64.setTextureOffset(112, 120).addBox(-9.0F, -0.048F, 0.0F, 9.0F, 3.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);
        cube_r64.setTextureOffset(72, 167).addBox(-4.0F, -0.048F, 1.0F, 4.0F, 2.0F, 27.0F, 0.0F, false, false, false, true, false, false, true);
        cube_r64.setTextureOffset(72, 53).addBox(-9.0F, -0.048F, 28.0F, 9.0F, 3.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(-3.4641F, 15.5F, 82.0F);
        body.addChild(cube_r65);
        setRotationAngle(cube_r65, 0.0F, 0.0F, -0.5236F);
        cube_r65.setTextureOffset(0, 136).addBox(-1.0F, 0.0F, -1.0F, 5.0F, 1.0F, 135.0F, 0.0F, false, false, false, true, false, false, false);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(-1.617F, 17.6855F, 112.5355F);
        body.addChild(cube_r66);
        setRotationAngle(cube_r66, 0.0F, 0.0F, 0.0F);
        cube_r66.setTextureOffset(109, 42).addBox(-2.0F, -6.048F, 0.0F, 2.0F, 6.0F, 7.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(-4.9131F, 22.3776F, 86.0F);
        body.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.0F, 0.0F, 0.7854F);
        cube_r67.setTextureOffset(0, 103).addBox(-2.0F, -1.048F, 0.0F, 2.0F, 2.0F, 25.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(5.1962F, 20.5F, 82.0F);
        body.addChild(cube_r68);
        setRotationAngle(cube_r68, 0.0F, 0.0F, 1.0472F);
        cube_r68.setTextureOffset(145, 137).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 5.0F, 135.0F, 0.0F, false, false, false, false, false, true, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(-4.3348F, 18.6927F, 123.0891F);
        body.addChild(cube_r69);
        setRotationAngle(cube_r69, -0.3185F, -0.3035F, 0.8345F);
        cube_r69.setTextureOffset(215, 82).addBox(0.0F, -3.048F, 0.0F, 3.0F, 3.0F, 17.0F, 0.0F, false, false, true, false, true, false, true);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(-4.9131F, 21.5776F, 83.0F);
        body.addChild(cube_r70);
        setRotationAngle(cube_r70, 0.0F, 0.0F, 0.7854F);
        cube_r70.setTextureOffset(70, 208).addBox(-1.0F, -0.048F, 0.0F, 1.0F, 1.0F, 31.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(-6.1661F, 22.3047F, 86.0F);
        body.addChild(cube_r71);
        setRotationAngle(cube_r71, 0.0F, 0.0F, -0.9599F);
        cube_r71.setTextureOffset(72, 32).addBox(-6.0F, -0.048F, 0.0F, 6.0F, 1.0F, 25.0F, 0.0F, false, true, true, true, true, false, true);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(-3.8301F, 20.134F, 82.0F);
        body.addChild(cube_r72);
        setRotationAngle(cube_r72, 0.0F, 0.0F, 0.5236F);
        cube_r72.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -1.0F, 5.0F, 1.0F, 135.0F, 0.0F, false, false, false, false, true, false, true);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(0.0F, 13.5F, 82.0F);
        body.addChild(cube_r73);
        setRotationAngle(cube_r73, 0.0F, 0.0F, 0.5236F);
        cube_r73.setTextureOffset(145, 1).addBox(0.0F, 0.0F, -1.0F, 5.0F, 1.0F, 135.0F, 0.0F, false, false, false, true, false, false, false);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(-2.6F, 34.8072F, 105.6F);
        body.addChild(cube_r74);
        setRotationAngle(cube_r74, 0.0F, -0.7854F, 0.0F);
        cube_r74.setTextureOffset(127, 42).addBox(-2.0F, -8.048F, 0.0F, 2.0F, 11.0F, 2.0F, 0.0F, false, false, true, false, true, false, true);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setRotationPoint(4.5F, 44.5072F, 83.3F);
        body.addChild(cube_r75);
        setRotationAngle(cube_r75, -0.1309F, 0.0F, 0.0F);
        cube_r75.setTextureOffset(349, 334).addBox(-9.0F, -2.048F, 0.0F, 9.0F, 2.0F, 26.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setRotationPoint(4.0F, 43.1072F, 84.6F);
        body.addChild(cube_r76);
        setRotationAngle(cube_r76, -0.1309F, 0.0F, 0.0F);
        cube_r76.setTextureOffset(74, 102).addBox(-8.0F, -3.048F, 0.0F, 8.0F, 3.0F, 22.0F, 0.0F, false, false, false, false, false, true, true);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setRotationPoint(-11.6348F, 18.6927F, 139.0891F);
        body.addChild(cube_r77);
        setRotationAngle(cube_r77, -0.3185F, -0.3035F, 0.8345F);
        cube_r77.setTextureOffset(29, 103).addBox(0.0F, -3.048F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r78 = new ModelRenderer(this);
        cube_r78.setRotationPoint(-4.2917F, 19.4583F, 112.5355F);
        body.addChild(cube_r78);
        setRotationAngle(cube_r78, 0.0F, 0.0F, 0.4363F);
        cube_r78.setTextureOffset(0, 103).addBox(-2.0F, -6.048F, 0.0F, 2.0F, 6.0F, 7.0F, 0.0F, false, false, true, false, true, false, false);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setRotationPoint(-0.0815F, 17.6855F, 116.0F);
        body.addChild(cube_r79);
        setRotationAngle(cube_r79, 0.0F, -0.7854F, 0.0F);
        cube_r79.setTextureOffset(74, 83).addBox(-5.0F, -6.048F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, false, true, true, true, false, false, true);

        cube_r80 = new ModelRenderer(this);
        cube_r80.setRotationPoint(-2.6F, 26.8072F, 83.6F);
        body.addChild(cube_r80);
        setRotationAngle(cube_r80, 0.0F, 0.0F, 0.7854F);
        cube_r80.setTextureOffset(72, 136).addBox(-2.0F, -0.048F, 0.0F, 2.0F, 2.0F, 29.0F, 0.0F, false, true, true, false, true, false, true);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setRotationPoint(3.0F, 36.1072F, 112.0F);
        body.addChild(cube_r81);
        setRotationAngle(cube_r81, 0.7854F, 0.0F, 0.0F);
        cube_r81.setTextureOffset(72, 136).addBox(-6.0F, -3.048F, -8.0F, 6.0F, 3.0F, 8.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setRotationPoint(4.0F, 26.0072F, 138.2F);
        body.addChild(cube_r82);
        setRotationAngle(cube_r82, -0.7854F, 0.0F, 0.0F);
        cube_r82.setTextureOffset(145, 54).addBox(-8.0F, -3.048F, 0.0F, 8.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setRotationPoint(3.4326F, 20.2487F, 145.0F);
        body.addChild(cube_r83);
        setRotationAngle(cube_r83, 0.0F, 0.0F, 0.3491F);
        cube_r83.setTextureOffset(44, 156).addBox(0.0F, -0.048F, 0.0F, 2.0F, 6.0F, 5.0F, 0.0F, false, false, true, false, false, true, false);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setRotationPoint(-5.3101F, 20.932F, 145.0F);
        body.addChild(cube_r84);
        setRotationAngle(cube_r84, 0.0F, 0.0F, -0.3491F);
        cube_r84.setTextureOffset(145, 158).addBox(0.0F, -0.048F, 0.0F, 2.0F, 6.0F, 5.0F, 0.0F, false, false, true, false, false, false, true);

        cube_r85 = new ModelRenderer(this);
        cube_r85.setRotationPoint(3.495F, 8.3542F, 82.0F);
        body.addChild(cube_r85);
        setRotationAngle(cube_r85, 0.0F, 0.0F, 0.7854F);
        cube_r85.setTextureOffset(290, 0).addBox(-0.4F, 0.0F, -1.0F, 1.0F, 2.0F, 58.0F, 0.0F, false, true, true, true, false, true, false);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setRotationPoint(-2.3815F, 20.5855F, 124.0F);
        body.addChild(cube_r86);
        setRotationAngle(cube_r86, 0.0F, -0.4363F, 0.0F);
        cube_r86.setTextureOffset(145, 213).addBox(0.0F, -4.048F, 0.0F, 6.0F, 2.0F, 17.0F, 0.0F, false, false, true, true, false, false, false);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setRotationPoint(3.7071F, 8.5663F, 82.0F);
        body.addChild(cube_r87);
        setRotationAngle(cube_r87, 0.0F, 0.0F, 0.7854F);
        cube_r87.setTextureOffset(290, 60).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 58.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setRotationPoint(-2.0808F, 8.3542F, 82.0F);
        body.addChild(cube_r88);
        setRotationAngle(cube_r88, 0.0F, 0.0F, 0.7854F);
        cube_r88.setTextureOffset(282, 197).addBox(-1.0F, 0.6F, -1.0F, 2.0F, 1.0F, 58.0F, 0.0F, false, true, true, false, true, false, true);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setRotationPoint(-2.2929F, 8.5663F, 82.0F);
        body.addChild(cube_r89);
        setRotationAngle(cube_r89, 0.0F, 0.0F, 0.7854F);
        cube_r89.setTextureOffset(0, 335).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 58.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setRotationPoint(4.0F, 26.9145F, 79.4447F);
        body.addChild(cube_r90);
        setRotationAngle(cube_r90, -0.7854F, 0.0F, 0.0F);
        cube_r90.setTextureOffset(167, 54).addBox(-8.0F, -3.048F, 0.0F, 8.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r91 = new ModelRenderer(this);
        cube_r91.setRotationPoint(-2.9F, 20.1072F, 116.0F);
        body.addChild(cube_r91);
        setRotationAngle(cube_r91, 0.0F, -0.7854F, 0.4363F);
        cube_r91.setTextureOffset(110, 72).addBox(-5.0F, -6.048F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, false, false, true, false, true, false, true);

        cube_r92 = new ModelRenderer(this);
        cube_r92.setRotationPoint(3.0F, 22.5072F, 144.7F);
        body.addChild(cube_r92);
        setRotationAngle(cube_r92, -0.0436F, 0.0F, 0.0F);
        cube_r92.setTextureOffset(0, 116).addBox(-6.0F, -10.048F, 0.0F, 6.0F, 3.0F, 5.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r93 = new ModelRenderer(this);
        cube_r93.setRotationPoint(3.4374F, 20.2355F, 144.9661F);
        body.addChild(cube_r93);
        setRotationAngle(cube_r93, -0.7854F, 0.0F, 0.3491F);
        cube_r93.setTextureOffset(121, 0).addBox(0.0F, -0.048F, 0.0F, 2.0F, 6.0F, 5.0F, 0.0F, false, true, false, false, false, true, false);

        cube_r94 = new ModelRenderer(this);
        cube_r94.setRotationPoint(3.0F, 45.7072F, 111.4F);
        body.addChild(cube_r94);
        setRotationAngle(cube_r94, 0.7854F, 0.0F, 0.0F);
        cube_r94.setTextureOffset(145, 145).addBox(-6.0F, -5.048F, -3.0F, 6.0F, 5.0F, 3.0F, 0.0F, false, false, true, false, true, true, true);

        cube_r95 = new ModelRenderer(this);
        cube_r95.setRotationPoint(3.5F, 45.7072F, 122.5F);
        body.addChild(cube_r95);
        setRotationAngle(cube_r95, 0.7854F, 0.0F, 0.0F);
        cube_r95.setTextureOffset(110, 158).addBox(-6.5F, -0.048F, 0.0F, 6.0F, 2.0F, 5.0F, 0.0F, false, true, false, true, false, true, true);

        cube_r96 = new ModelRenderer(this);
        cube_r96.setRotationPoint(3.5F, 36.3072F, 122.7F);
        body.addChild(cube_r96);
        setRotationAngle(cube_r96, 0.7854F, 0.0F, 0.0F);
        cube_r96.setTextureOffset(112, 102).addBox(-6.5F, -1.048F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r97 = new ModelRenderer(this);
        cube_r97.setRotationPoint(-5.3149F, 20.9188F, 144.9661F);
        body.addChild(cube_r97);
        setRotationAngle(cube_r97, -0.7854F, 0.0F, -0.3491F);
        cube_r97.setTextureOffset(0, 136).addBox(0.0F, -0.048F, 0.0F, 2.0F, 6.0F, 5.0F, 0.0F, false, true, false, false, false, false, true);

        cube_r98 = new ModelRenderer(this);
        cube_r98.setRotationPoint(6.0016F, 16.6287F, 145.0F);
        body.addChild(cube_r98);
        setRotationAngle(cube_r98, 0.0F, 0.0F, 0.7854F);
        cube_r98.setTextureOffset(174, 30).addBox(-5.0F, -0.048F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r99 = new ModelRenderer(this);
        cube_r99.setRotationPoint(4.7F, 25.5072F, 109.6F);
        body.addChild(cube_r99);
        setRotationAngle(cube_r99, 0.0F, 0.0F, 0.7854F);
        cube_r99.setTextureOffset(29, 107).addBox(-1.0F, -0.048F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false, true, true, true, false, true, false);

        cube_r100 = new ModelRenderer(this);
        cube_r100.setRotationPoint(3.5F, 34.1072F, 141.0F);
        body.addChild(cube_r100);
        setRotationAngle(cube_r100, 0.7243F, 0.0F, 0.0F);
        cube_r100.setTextureOffset(109, 32).addBox(-7.0F, -4.048F, 0.0F, 7.0F, 4.0F, 6.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r101 = new ModelRenderer(this);
        cube_r101.setRotationPoint(0.0F, 15.6F, 11.0F);
        body.addChild(cube_r101);
        setRotationAngle(cube_r101, 0.0F, 0.0F, 0.7854F);
        cube_r101.setTextureOffset(72, 12).addBox(-1.0F, -1.0F, -1.0F, 6.0F, 6.0F, 5.0F, 0.0F, false, true, false, true, true, true, true);
        cube_r101.setTextureOffset(36, 72).addBox(-1.0F, -1.0F, -13.0F, 6.0F, 6.0F, 5.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r102 = new ModelRenderer(this);
        cube_r102.setRotationPoint(0.0F, 15.7F, -45.0F);
        body.addChild(cube_r102);
        setRotationAngle(cube_r102, 0.0F, 0.0F, 0.7854F);
        cube_r102.setTextureOffset(60, 335).addBox(0.0F, 0.0F, -1.0F, 4.0F, 4.0F, 32.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r103 = new ModelRenderer(this);
        cube_r103.setRotationPoint(0.0F, 15.0F, -38.0F);
        body.addChild(cube_r103);
        setRotationAngle(cube_r103, 0.0F, 0.0F, 0.7854F);
        cube_r103.setTextureOffset(159, 91).addBox(0.0F, 0.0F, -1.0F, 5.0F, 5.0F, 16.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r103.setTextureOffset(244, 277).addBox(0.0F, 0.0F, 24.0F, 5.0F, 5.0F, 95.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r104 = new ModelRenderer(this);
        cube_r104.setRotationPoint(-2.0F, 0.0F, 6.0F);
        body.addChild(cube_r104);
        setRotationAngle(cube_r104, 0.6981F, 0.0F, 0.0F);
        cube_r104.setTextureOffset(111, 0).addBox(0.0F, -6.0F, -1.0F, 4.0F, 20.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r105 = new ModelRenderer(this);
        cube_r105.setRotationPoint(-3.8301F, 21.134F, 77.0F);
        body.addChild(cube_r105);
        setRotationAngle(cube_r105, 0.0F, 0.0F, 0.5236F);
        cube_r105.setTextureOffset(29, 113).addBox(-1.0F, 0.0F, -5.0F, 6.0F, 1.0F, 9.0F, 0.0F, false, false, true, false, true, false, false);

        cube_r106 = new ModelRenderer(this);
        cube_r106.setRotationPoint(5.1962F, 21.5F, 77.0F);
        body.addChild(cube_r106);
        setRotationAngle(cube_r106, 0.0F, 0.0F, 1.0472F);
        cube_r106.setTextureOffset(0, 72).addBox(-1.0F, 0.0F, -5.0F, 1.0F, 6.0F, 9.0F, 0.0F, false, false, true, false, false, true, false);

        cube_r107 = new ModelRenderer(this);
        cube_r107.setRotationPoint(-3.4641F, 14.5F, 77.0F);
        body.addChild(cube_r107);
        setRotationAngle(cube_r107, 0.0F, 0.0F, -0.5236F);
        cube_r107.setTextureOffset(27, 50).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 1.0F, 9.0F, 0.0F, false, false, true, true, false, false, false);

        cube_r108 = new ModelRenderer(this);
        cube_r108.setRotationPoint(0.866F, 13.0F, 77.0F);
        body.addChild(cube_r108);
        setRotationAngle(cube_r108, 0.0F, 0.0F, 0.5236F);
        cube_r108.setTextureOffset(29, 103).addBox(-1.0F, 0.0F, -5.0F, 6.0F, 1.0F, 9.0F, 0.0F, false, false, true, true, false, false, false);

        cube_r109 = new ModelRenderer(this);
        cube_r109.setRotationPoint(-2.6F, 34.6072F, 105.6F);
        body.addChild(cube_r109);
        setRotationAngle(cube_r109, 0.0F, 0.0F, 0.7854F);
        cube_r109.setTextureOffset(114, 14).addBox(-2.0F, -0.048F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, false, false, true, false, true, false, true);

        cube_r110 = new ModelRenderer(this);
        cube_r110.setRotationPoint(0.0F, 11.8426F, 72.0F);
        body.addChild(cube_r110);
        setRotationAngle(cube_r110, 0.0F, 0.0F, 0.7854F);
        cube_r110.setTextureOffset(74, 72).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r111 = new ModelRenderer(this);
        cube_r111.setRotationPoint(-2.4661F, 13.0931F, 145.0F);
        body.addChild(cube_r111);
        setRotationAngle(cube_r111, 0.0F, 0.0F, -0.7854F);
        cube_r111.setTextureOffset(173, 147).addBox(-4.0F, -0.048F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false, true, true, true, false, false, false);

        grip = new ModelRenderer(this);
        grip.setRotationPoint(0.0F, 24.0F, 0.0F);
        grip.setTextureOffset(145, 158).addBox(-3.5F, 36.0592F, 127.0F, 7.0F, 11.0F, 14.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r112 = new ModelRenderer(this);
        cube_r112.setRotationPoint(3.5F, 67.968F, 141.5357F);
        grip.addChild(cube_r112);
        setRotationAngle(cube_r112, 0.192F, 0.0F, 0.0F);
        cube_r112.setTextureOffset(0, 208).addBox(-7.0F, -0.048F, 0.0F, 7.0F, 2.0F, 17.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r113 = new ModelRenderer(this);
        cube_r113.setRotationPoint(3.5F, 70.8626F, 144.2337F);
        grip.addChild(cube_r113);
        setRotationAngle(cube_r113, 0.6109F, 0.0F, 0.0F);
        cube_r113.setTextureOffset(72, 175).addBox(-7.0F, -0.048F, 8.0F, 7.0F, 2.0F, 3.0F, 0.0F, false, false, false, false, false, true, true);
        cube_r113.setTextureOffset(145, 112).addBox(-7.0F, -2.048F, 4.0F, 7.0F, 2.0F, 7.0F, 0.0F, false, false, false, false, false, true, true);
        cube_r113.setTextureOffset(110, 83).addBox(-7.0F, -2.048F, 11.0F, 7.0F, 5.0F, 4.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r114 = new ModelRenderer(this);
        cube_r114.setRotationPoint(3.5F, 47.1072F, 127.6F);
        grip.addChild(cube_r114);
        setRotationAngle(cube_r114, 0.6109F, 0.0F, 0.0F);
        cube_r114.setTextureOffset(0, 136).addBox(-7.0F, -1.048F, 0.0F, 7.0F, 28.0F, 15.0F, 0.0F, false, true, true, false, false, true, true);

        safety = new ModelRenderer(this);
        safety.setRotationPoint(0.0F, 55.0F, 130.5F);


        cube_r115 = new ModelRenderer(this);
        cube_r115.setRotationPoint(4.0F, 0.7072F, 0.8F);
        safety.addChild(cube_r115);
        setRotationAngle(cube_r115, 0.0F, 0.0F, 0.7854F);
        cube_r115.setTextureOffset(145, 36).addBox(-1.0F, -1.048F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r116 = new ModelRenderer(this);
        cube_r116.setRotationPoint(4.0F, 0.0072F, -2.3F);
        safety.addChild(cube_r116);
        setRotationAngle(cube_r116, -0.7854F, 0.0F, 0.0F);
        cube_r116.setTextureOffset(166, 112).addBox(-8.0F, -3.048F, 0.0F, 8.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        blotRelease = new ModelRenderer(this);
        blotRelease.setRotationPoint(4.0F, 49.0F, 110.0F);
        blotRelease.setTextureOffset(5, 0).addBox(-0.3F, 1.9592F, -1.4F, 1.0F, 2.0F, 1.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r117 = new ModelRenderer(this);
        cube_r117.setRotationPoint(0.7F, 2.3072F, -0.4F);
        blotRelease.addChild(cube_r117);
        setRotationAngle(cube_r117, 0.0F, 0.0F, 0.1309F);
        cube_r117.setTextureOffset(56, 8).addBox(-1.0F, -5.048F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r118 = new ModelRenderer(this);
        cube_r118.setRotationPoint(1.3526F, -2.65F, -1.4F);
        blotRelease.addChild(cube_r118);
        setRotationAngle(cube_r118, 0.0F, 0.0F, 0.0873F);
        cube_r118.setTextureOffset(36, 0).addBox(-1.0F, -4.048F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, false, true, true, true, true, true, false);

        blot = new ModelRenderer(this);
        blot.setRotationPoint(0.0F, 24.0F, 0.0F);


        blot_r1 = new ModelRenderer(this);
        blot_r1.setRotationPoint(-2.1553F, 20.3126F, 84.0F);
        blot.addChild(blot_r1);
        setRotationAngle(blot_r1, 0.0F, 0.0F, 0.7854F);
        blot_r1.setTextureOffset(211, 137).addBox(-3.0F, -6.048F, 0.0F, 6.0F, 6.0F, 28.0F, 0.0F, false, false, false, false, true, false, true);

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
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode) {
        IS.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        muzzle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        hand_guard.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        ring.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        stock.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        charge.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        grip.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        safety.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        blotRelease.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        //bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.push();
        slideRecoil.play(lastFireTime, matrixStack, transformType);
        blot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.pop();
    }
}