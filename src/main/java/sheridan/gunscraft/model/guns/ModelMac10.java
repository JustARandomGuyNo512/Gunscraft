package sheridan.gunscraft.model.guns;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import sheridan.gunscraft.animation.CommonAnimations;
import sheridan.gunscraft.animation.IAnimation;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelMac10 extends EntityModel<Entity> implements IGunModel {
    private final ModelRenderer barrel;
    private final ModelRenderer mag;
    private final ModelRenderer stock;
    private final ModelRenderer slide2;
    private final ModelRenderer safety;
    private final ModelRenderer body2;
    private final ModelRenderer charge;


    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer IS_2_r1;
    private final ModelRenderer IS_1_r1;
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

    public static IAnimation slideRecoil;

    public ModelMac10() {
        slideRecoil = CommonAnimations.createSingleAxisBlotBack(0.1f, -1.5f);

        textureWidth = 512;
        textureHeight = 512;

        barrel = new ModelRenderer(this);
        barrel.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 6.5071F, -17.0F);
        barrel.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
        cube_r1.setTextureOffset(34, 101).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 10.0F, 0.0F, false, true, false, true, true, true, true);

        mag = new ModelRenderer(this);
        mag.setRotationPoint(0.0F, 24.0F, 0.0F);
        mag.setTextureOffset(90, 26).addBox(-3.5F, 45.0F, 36.8F, 7.0F, 27.0F, 10.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(3.0F, 72.6F, 37.0F);
        mag.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(91, 109).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 11.0F, 0.0F, false, true, true, true, true, true, true);

        stock = new ModelRenderer(this);
        stock.setRotationPoint(-4.5F, 43.8F, 73.0F);
        stock.setTextureOffset(40, 36).addBox(8.5F, -4.8F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false, false, false, true, true, true, true);
        stock.setTextureOffset(90, 63).addBox(2.4981F, -20.3639F, -25.6415F, 4.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);
        stock.setTextureOffset(0, 0).addBox(8.0F, -20.3639F, -24.1415F, 1.0F, 1.0F, 8.0F, 0.0F, false, false, false, true, true, true, true);
        stock.setTextureOffset(0, 9).addBox(0.0F, -20.3639F, -24.1415F, 1.0F, 1.0F, 8.0F, 0.0F, false, false, false, true, true, true, true);
        stock.setTextureOffset(40, 11).addBox(-0.5F, -4.8F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false, false, false, true, true, true, true);
        stock.setTextureOffset(40, 0).addBox(-1.5F, -5.8F, -3.0F, 12.0F, 10.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);
        stock.setTextureOffset(125, 92).addBox(9.5F, -5.8F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, false, false, true, true, true, true, true);
        stock.setTextureOffset(50, 115).addBox(-1.5F, -5.8F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, false, false, true, true, true, true, true);
        stock.setTextureOffset(62, 32).addBox(8.0F, -22.0F, -1.0F, 1.0F, 25.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);
        stock.setTextureOffset(58, 32).addBox(0.0F, -22.0F, -1.0F, 1.0F, 25.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(9.0F, -25.5355F, -3.5355F);
        stock.addChild(cube_r3);
        setRotationAngle(cube_r3, -1.1868F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(124, 32).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 14.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);
        cube_r3.setTextureOffset(128, 32).addBox(-9.0F, 0.0F, 0.0F, 1.0F, 14.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(9.0F, -24.8284F, -4.2426F);
        stock.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(90, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);
        cube_r4.setTextureOffset(94, 0).addBox(-9.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        stock.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);
        cube_r5.setTextureOffset(0, 9).addBox(8.0F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(11.0F, 1.2F, 0.0F);
        stock.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(34, 64).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(9.0F, -20.3639F, -24.1415F);
        stock.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -0.5236F, 0.0F);
        cube_r7.setTextureOffset(10, 6).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, -20.3639F, -24.1415F);
        stock.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        cube_r8.setTextureOffset(0, 6).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, false, false);

        slide2 = new ModelRenderer(this);
        slide2.setRotationPoint(4.3F, 25.0F, 48.1F);
        slide2.setTextureOffset(155, 491).addBox(-10.0F, 1.0F, -21.0F, 11.0F, 1.0F, 20.0F, 0.0F, false, false, false, true, false, false, false);
        slide2.setTextureOffset(347, 494).addBox(-10.0F, 1.0F, -1.0F, 11.0F, 10.0F, 8.0F, 0.0F, false, true, false, true, false, false, true);

        IS_2_r1 = new ModelRenderer(this);
        IS_2_r1.setRotationPoint(-3.2F, -2.0F, -18.1F);
        slide2.addChild(IS_2_r1);
        setRotationAngle(IS_2_r1, 0.0F, -0.7854F, 0.0F);
        IS_2_r1.setTextureOffset(25, 112).addBox(-2.5F, -1.6F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);

        IS_1_r1 = new ModelRenderer(this);
        IS_1_r1.setRotationPoint(-4.6F, -0.1F, -18.1F);
        slide2.addChild(IS_1_r1);
        setRotationAngle(IS_1_r1, 0.0F, -0.7854F, 0.0F);
        IS_1_r1.setTextureOffset(58, 58).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-8.0F, 0.2F, -21.0F);
        slide2.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.6109F);
        cube_r9.setTextureOffset(262, 482).addBox(0.0F, 1.0F, 0.0F, 1.0F, 12.0F, 20.0F, 0.0F, false, true, true, false, false, true, true);

        safety = new ModelRenderer(this);
        safety.setRotationPoint(-4.1F, 46.0F, 19.1F);
        safety.setTextureOffset(52, 137).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, 0.0F, 3.0F);
        safety.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(42, 137).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, false, false, false, false, true, true, true);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        safety.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.8727F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(0, 83).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false, true, false, false, false, true, true);

        body2 = new ModelRenderer(this);
        body2.setRotationPoint(0.5929F, 24.6F, -3.0F);
        body2.setTextureOffset(91, 17).addBox(-5.8858F, 0.0F, -1.0F, 4.0F, 1.0F, 66.0F, 0.0F, false, true, false, true, false, true, false);
        body2.setTextureOffset(88, 88).addBox(0.7F, 0.0F, -1.0F, 4.0F, 1.0F, 66.0F, 0.0F, false, true, false, true, false, false, true);
        body2.setTextureOffset(183, 177).addBox(5.1071F, 3.7071F, 7.0F, 1.0F, 1.0F, 45.0F, 0.0F, false, true, true, false, false, true, false);
        body2.setTextureOffset(78, 496).addBox(-6.2929F, 2.7F, 29.1F, 11.0F, 10.0F, 8.0F, 0.0F, false, true, true, true, false, true, true);
        body2.setTextureOffset(165, 0).addBox(5.1071F, 8.7071F, 7.0F, 1.0F, 1.0F, 45.0F, 0.0F, false, true, true, false, false, true, false);
        body2.setTextureOffset(20, 41).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 1.0F, 20.0F, 0.0F, false, true, true, true, false, false, false);
        body2.setTextureOffset(0, 26).addBox(-5.5929F, 19.4F, 40.1F, 10.0F, 25.0F, 10.0F, 0.0F, false, false, true, false, true, true, true);
        body2.setTextureOffset(25, 122).addBox(-5.0929F, 36.2313F, 49.4309F, 9.0F, 8.0F, 7.0F, 0.0F, false, false, true, false, true, true, true);
        body2.setTextureOffset(90, 26).addBox(4.1071F, 36.7F, 43.1F, 1.0F, 7.0F, 3.0F, 0.0F, false, true, true, true, true, true, false);
        body2.setTextureOffset(44, 91).addBox(-6.2929F, 36.7F, 43.1F, 1.0F, 7.0F, 3.0F, 0.0F, false, true, true, true, true, false, true);
        body2.setTextureOffset(132, 26).addBox(-3.4716F, 17.4F, 37.9787F, 4.0F, 27.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);
        body2.setTextureOffset(46, 32).addBox(-1.7142F, 17.4F, 37.9787F, 4.0F, 27.0F, 2.0F, 0.0F, false, true, false, false, true, false, false);
        body2.setTextureOffset(91, 135).addBox(-2.5929F, 19.1092F, 20.3546F, 4.0F, 7.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);
        body2.setTextureOffset(0, 26).addBox(-2.5929F, 19.0F, 37.0F, 4.0F, 8.0F, 1.0F, 0.0F, false, true, false, false, false, true, true);
        body2.setTextureOffset(106, 84).addBox(-7.5929F, 13.4F, -0.9F, 14.0F, 6.0F, 2.0F, 0.0F, false, true, false, false, true, true, true);
        body2.setTextureOffset(32, 137).addBox(-7.0131F, 13.504F, -2.0F, 4.0F, 5.0F, 1.0F, 0.0F, false, true, false, false, false, false, true);
        body2.setTextureOffset(52, 104).addBox(1.8273F, 13.504F, -2.0F, 4.0F, 5.0F, 1.0F, 0.0F, false, true, false, false, false, true, false);
        body2.setTextureOffset(0, 0).addBox(-6.5929F, 0.7071F, -1.0F, 12.0F, 17.0F, 66.0F, 0.0F, false, true, false, false, false, true, true);
        body2.setTextureOffset(0, 83).addBox(-7.5929F, 11.4F, 1.1F, 14.0F, 8.0F, 63.0F, 0.0F, false, false, false, true, true, true, true);
        body2.setTextureOffset(52, 83).addBox(-2.5929F, 24.1071F, -2.2F, 4.0F, 20.0F, 1.0F, 0.0F, false, true, true, false, true, true, true);
        body2.setTextureOffset(0, 154).addBox(-3.5929F, 4.1071F, -2.0F, 6.0F, 20.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);
        body2.setTextureOffset(0, 83).addBox(-7.5929F, -0.6F, 64.0F, 14.0F, 20.0F, 8.0F, 0.0F, false, false, true, true, true, true, true);
        body2.setTextureOffset(58, 17).addBox(-2.0929F, -4.4F, 71.0F, 3.0F, 4.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);
        body2.setTextureOffset(104, 93).addBox(-2.0F, 0.0F, 49.0F, 3.0F, 1.0F, 15.0F, 0.0F, false, true, false, true, false, false, false);
        body2.setTextureOffset(488, 0).addBox(-4.0929F, -3.9F, -1.0F, 7.0F, 4.0F, 5.0F, 0.0F, false, true, true, true, false, true, true);
        body2.setTextureOffset(58, 22).addBox(-1.0929F, -2.9F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false, true, true, true, false, true, true);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(6.9071F, 14.4F, 34.1F);
        body2.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(0, 62).addBox(-15.0F, 0.0F, 0.0F, 15.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(0.4071F, 19.0092F, 34.2546F);
        body2.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(132, 55).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 7.0F, 1.0F, 0.0F, false, true, true, false, true, true, true);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(6.9071F, 13.4F, 63.1F);
        body2.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(32, 62).addBox(-15.0F, 1.0F, 0.0F, 15.0F, 1.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(6.9071F, 14.4F, 5.1F);
        body2.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(118, 112).addBox(-15.0F, 0.0F, 0.0F, 15.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-4.7608F, 1.7549F, 72.0F);
        body2.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 2.4435F);
        cube_r16.setTextureOffset(30, 32).addBox(-6.0F, 0.0F, -1.0F, 6.0F, 3.0F, 1.0F, 0.0F, false, true, true, false, true, false, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(5.5034F, -0.5433F, 72.0F);
        body2.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, 0.6981F);
        cube_r17.setTextureOffset(7, 129).addBox(-6.0F, 0.0F, -1.0F, 6.0F, 3.0F, 1.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(6.4071F, -0.6F, 64.0F);
        body2.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.7418F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(90, 0).addBox(-14.0F, 0.0F, 0.0F, 14.0F, 17.0F, 9.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(-1.5929F, 22.1071F, -1.6F);
        body2.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(106, 92).addBox(-1.0F, 0.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(-0.5929F, 7.3071F, -4.0F);
        body2.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
        cube_r20.setTextureOffset(36, 83).addBox(-2.0F, -2.0F, 0.0F, 6.0F, 6.0F, 2.0F, 0.0F, false, true, false, true, true, true, true);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(-1.3517F, 5.4752F, -1.0F);
        body2.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
        cube_r21.setTextureOffset(91, 84).addBox(0.0F, 0.0F, -1.0F, 4.0F, 10.0F, 1.0F, 0.0F, false, true, false, false, false, true, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-3.5929F, 4.1071F, -1.0F);
        body2.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, 0.3491F);
        cube_r22.setTextureOffset(91, 108).addBox(0.0F, 0.0F, -1.0F, 4.0F, 10.0F, 1.0F, 0.0F, false, true, false, false, false, false, true);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(2.9989F, 15.6756F, -1.0F);
        body2.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
        cube_r23.setTextureOffset(10, 0).addBox(1.0F, 0.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-7.0131F, 18.504F, -1.0F);
        body2.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
        cube_r24.setTextureOffset(10, 9).addBox(0.0F, 0.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false, true, true, false, false, false, true);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(6.4071F, 11.4F, 1.1F);
        body2.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(0, 137).addBox(-14.0F, 0.0F, 0.0F, 14.0F, 3.0F, 2.0F, 0.0F, false, true, false, false, false, true, true);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(0.4071F, 26.1092F, 21.7688F);
        body2.addChild(cube_r26);
        setRotationAngle(cube_r26, -0.7854F, 0.0F, 0.0F);
        cube_r26.setTextureOffset(114, 26).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 1.0F, 5.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(0.4071F, 28.1223F, 35.8351F);
        body2.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        cube_r27.setTextureOffset(112, 51).addBox(-3.0F, 0.0F, -12.0F, 4.0F, 1.0F, 12.0F, 0.0F, false, false, false, true, true, true, true);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.4071F, 27.0F, 38.0F);
        body2.addChild(cube_r28);
        setRotationAngle(cube_r28, -0.7854F, 0.0F, 0.0F);
        cube_r28.setTextureOffset(114, 32).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false, true, true, false, false, true, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(-3.4716F, 36.4F, 37.9787F);
        body2.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, -0.7854F, 0.0F);
        cube_r29.setTextureOffset(140, 84).addBox(0.0F, -17.0F, 0.0F, 3.0F, 25.0F, 3.0F, 0.0F, false, false, false, false, true, false, true);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(2.2858F, 36.4F, 37.9787F);
        body2.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, -0.7854F, 0.0F);
        cube_r30.setTextureOffset(142, 0).addBox(0.0F, -17.0F, 0.0F, 3.0F, 25.0F, 3.0F, 0.0F, false, true, false, false, true, false, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(-5.0929F, 27.538F, 54.1015F);
        body2.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.2618F, 0.0F, 0.0F);
        cube_r31.setTextureOffset(0, 111).addBox(0.0F, -2.0F, -7.0F, 9.0F, 11.0F, 7.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-7.0929F, 42.8163F, 58.1296F);
        body2.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.7854F, 0.0F, 0.0F);
        cube_r32.setTextureOffset(37, 115).addBox(4.0F, 0.0603F, -2.342F, 5.0F, 2.0F, 2.0F, 0.0F, false, false, true, true, false, true, true);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-5.0929F, 22.6139F, 54.2698F);
        body2.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.1745F, 0.0F, 0.0F);
        cube_r33.setTextureOffset(117, 130).addBox(0.0F, 0.0F, -6.0F, 9.0F, 5.0F, 6.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(-5.0929F, 19.4F, 58.1F);
        body2.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.8727F, 0.0F, 0.0F);
        cube_r34.setTextureOffset(123, 116).addBox(0.0F, 0.0F, -6.0F, 9.0F, 8.0F, 6.0F, 0.0F, false, false, true, false, false, true, true);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(5.4F, 9.0F, 8.0F);
        body2.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, 0.7854F);
        cube_r35.setTextureOffset(136, 155).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 45.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(5.4F, 8.0F, 8.0F);
        body2.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, 0.0F, 0.7854F);
        cube_r36.setTextureOffset(162, 84).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 45.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(5.4F, 4.0F, 8.0F);
        body2.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, 0.0F, 0.7854F);
        cube_r37.setTextureOffset(183, 130).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 45.0F, 0.0F, false, true, true, false, false, true, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(5.4F, 3.0F, 8.0F);
        body2.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 0.0F, 0.7854F);
        cube_r38.setTextureOffset(209, 46).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 45.0F, 0.0F, false, true, true, true, false, false, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(3.9929F, 0.7071F, -1.0F);
        body2.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, -0.7854F);
        cube_r39.setTextureOffset(0, 154).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 66.0F, 0.0F, false, true, false, false, false, true, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-6.5929F, 0.7071F, -1.0F);
        body2.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, 0.0F, -0.7854F);
        cube_r40.setTextureOffset(68, 155).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 66.0F, 0.0F, false, true, false, true, false, false, false);

        charge = new ModelRenderer(this);
        charge.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(7.5F, 13.4F, 13.1F);
        charge.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.7854F, 0.0F, 0.0F);
        cube_r41.setTextureOffset(30, 26).addBox(-15.0F, -1.0F, 0.0F, 15.0F, 3.0F, 3.0F, 0.0F, false, true, true, true, true, true, true);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(8.2F, 14.8F, 14.2F);
        charge.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.0F, 0.0F, 0.7854F);
        cube_r42.setTextureOffset(101, 135).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false, true, true, true, true, true, true);


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
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode, GunRenderContext context) {
        barrel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        stock.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.push();
        slideRecoil.play(lastFireTime, matrixStack, transformType);
        slide2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.pop();
        safety.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        charge.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}