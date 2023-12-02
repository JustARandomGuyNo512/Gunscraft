package sheridan.gunscraft.model.guns;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.EntityModel;
//import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import sheridan.gunscraft.animation.CommonAnimations;
import sheridan.gunscraft.animation.curve.CurveAnimation;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelPistol_9mm extends EntityModel<Entity> implements IGunModel {
	public final ModelRenderer mag;
	public final ModelRenderer slide;
	public final ModelRenderer grid;
	public final ModelRenderer barrel;

	private static CurveAnimation slideBlotBack;

	public final ModelRenderer Slide_04_r1;
	public final ModelRenderer Slide_08_r1;
	public final ModelRenderer Slide_13_r1;
	public final ModelRenderer Slide_011_r1;
	public final ModelRenderer Slide_010_r1;
	public final ModelRenderer Slide_14_r1;
	public final ModelRenderer IS_3_r1;
	public final ModelRenderer Grid_05_r1;
	public final ModelRenderer Grid_04_r1;
	public final ModelRenderer Grid_46_r1;
	public final ModelRenderer magRelease_r1;
	public final ModelRenderer hang_r1;
	public final ModelRenderer Grid_03_r1;
	public final ModelRenderer Grid_02_r1;
	public final ModelRenderer Grid_01_r1;
	public final ModelRenderer Grid_45_r1;
	public final ModelRenderer Grid_44_r1;
	public final ModelRenderer Grid_39_r1;
	public final ModelRenderer SlideLock_r1;
	public final ModelRenderer Grid_040_r1;
	public final ModelRenderer Grid_039_r1;
	public final ModelRenderer Grid_07_r1;
	public final ModelRenderer Grid_038_r1;
	public final ModelRenderer Grid_013_r1;
	public final ModelRenderer Grid_037_r1;
	public final ModelRenderer Grid_036_r1;
	public final ModelRenderer Grid_035_r1;
	public final ModelRenderer Grid_034_r1;
	public final ModelRenderer Grid_033_r1;
	public final ModelRenderer Grid_032_r1;
	public final ModelRenderer Grid_031_r1;
	public final ModelRenderer Grid_030_r1;
	public final ModelRenderer Grid_029_r1;
	public final ModelRenderer Grid_011_r1;
	public final ModelRenderer Grid_028_r1;
	public final ModelRenderer Trigger_01_r1;
	public final ModelRenderer Trigger_00_r1;
	public final ModelRenderer Grid_027_r1;
	public final ModelRenderer Grid_026_r1;
	public final ModelRenderer Grid_025_r1;
	public final ModelRenderer Grid_024_r1;
	public final ModelRenderer Grid_023_r1;
	public final ModelRenderer Grid_022_r1;
	public final ModelRenderer Grid_021_r1;
	public final ModelRenderer Grid_020_r1;
	public final ModelRenderer Grid_019_r1;
	public final ModelRenderer Grid_045_r1;
	public final ModelRenderer Grid_044_r1;
	public final ModelRenderer Grid_043_r1;
	public final ModelRenderer Grid_018_r1;
	public final ModelRenderer Grid_010_r1;
	public final ModelRenderer Grid_012_r1;
	public final ModelRenderer Grid_017_r1;
	public final ModelRenderer Grid_016_r1;
	public final ModelRenderer Grid_015_r1;
	public final ModelRenderer Grid_014_r1;
	public final ModelRenderer Grid_06_r1;
	public final ModelRenderer Grid_00_r1;
	public final ModelRenderer barrel_02_r1;
	public final ModelRenderer barrel_01_r1;
	public final ModelRenderer barrel_00_r1;
	public final ModelRenderer mag_00_r1;
	public final ModelRenderer mag_01_r1;
	public final ModelRenderer mag_02_r1;

	public ModelPistol_9mm() {
		slideBlotBack = CommonAnimations.createSingleAxisBlotBack(0.21f, 1.15f);

		textureWidth = 256;
		textureHeight = 256;

		slide = new ModelRenderer(this);
		slide.setRotationPoint(0.0F, 24.0F, 0.0F);


		Slide_04_r1 = new ModelRenderer(this);
		Slide_04_r1.setRotationPoint(3.0F, 1.4142F, -3.0F);
		slide.addChild(Slide_04_r1);
		setRotationAngle(Slide_04_r1, 0.0F, 0.0F, 0.7854F);
		Slide_04_r1.setTextureOffset(85, 67).addBox(-1.0F, -1.0F, 29.0F, 1.0F, 1.0F, 22.0F, 0.0F, false, true, true, true, false, false, true);
		Slide_04_r1.setTextureOffset(109, 44).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 20.0F, 0.0F, false, true, true, true, false, false, false);

		Slide_08_r1 = new ModelRenderer(this);
		Slide_08_r1.setRotationPoint(-3.0F, 1.4142F, -3.0F);
		slide.addChild(Slide_08_r1);
		setRotationAngle(Slide_08_r1, 0.0F, 0.0F, 0.7854F);
		Slide_08_r1.setTextureOffset(85, 44).addBox(-1.0F, -1.0F, 29.0F, 1.0F, 1.0F, 22.0F, 0.0F, false, true, true, true, false, false, true);
		Slide_08_r1.setTextureOffset(107, 90).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 20.0F, 0.0F, false, true, true, false, false, false, true);

		Slide_13_r1 = new ModelRenderer(this);
		Slide_13_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		slide.addChild(Slide_13_r1);
		setRotationAngle(Slide_13_r1, 0.0F, 0.0F, 0.0F);
		Slide_13_r1.setTextureOffset(0, 36).addBox(-2.0F, 1.0F, -3.0F, 4.0F, 8.0F, 1.0F, 0.0F, false, true, false, false, true, true, true);
		Slide_13_r1.setTextureOffset(0, 0).addBox(1.7071F, 0.7071F, -3.0F, 2.0F, 6.0F, 51.0F, 0.0F, false, true, true, true, true, true, false);
		Slide_13_r1.setTextureOffset(82, 23).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 1.0F, 20.0F, 0.0F, false, true, true, true, false, false, false);
		Slide_13_r1.setTextureOffset(8, 87).addBox(-2.5F, 1.8F, 47.2F, 5.0F, 5.0F, 1.0F, 0.0F, false, false, true, true, true, true, true);
		Slide_13_r1.setTextureOffset(27, 57).addBox(-3.0F, 0.0F, 27.0F, 6.0F, 2.0F, 21.0F, 0.0F, false, true, true, true, false, false, false);

		Slide_011_r1 = new ModelRenderer(this);
		Slide_011_r1.setRotationPoint(-1.7071F, 4.0392F, 16.0144F);
		slide.addChild(Slide_011_r1);
		setRotationAngle(Slide_011_r1, -0.5236F, 0.0F, 0.0F);
		Slide_011_r1.setTextureOffset(40, 19).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, false, false, false, true, false, false, true);

		Slide_010_r1 = new ModelRenderer(this);
		Slide_010_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		slide.addChild(Slide_010_r1);
		setRotationAngle(Slide_010_r1, 0.0F, 0.0F, 0.0F);
		Slide_010_r1.setTextureOffset(28, 0).addBox(-3.7071F, 3.7071F, 17.0F, 2.0F, 3.0F, 9.0F, 0.0F, false, false, false, true, true, false, true);
		Slide_010_r1.setTextureOffset(59, 58).addBox(-3.7071F, 0.7071F, 26.0F, 2.0F, 6.0F, 22.0F, 0.0F, false, true, true, false, true, false, true);
		Slide_010_r1.setTextureOffset(0, 84).addBox(-3.7071F, 0.7071F, -3.0F, 2.0F, 6.0F, 20.0F, 0.0F, false, true, true, false, true, true, true);

		Slide_14_r1 = new ModelRenderer(this);
		Slide_14_r1.setRotationPoint(0.0F, 8.3F, -3.6F);
		slide.addChild(Slide_14_r1);
		setRotationAngle(Slide_14_r1, 0.0F, 0.0F, 0.7854F);
		Slide_14_r1.setTextureOffset(23, 104).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 21.0F, 0.0F, false, true, false, true, true, true, true);

		IS_3_r1 = new ModelRenderer(this);
		IS_3_r1.setRotationPoint(0.0F, 0.3F, 0.0F);
		slide.addChild(IS_3_r1);
		setRotationAngle(IS_3_r1, 0.0F, 0.0F, 0.0F);
		IS_3_r1.setTextureOffset(45, 39).addBox(-0.5F, -0.9F, 44.0F, 1.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, false, false);
		IS_3_r1.setTextureOffset(28, 5).addBox(-2.5F, -1.6F, 44.0F, 2.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, false, true, true);
		IS_3_r1.setTextureOffset(41, 5).addBox(0.5F, -1.6F, 44.0F, 2.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, false, true, true);
		IS_3_r1.setTextureOffset(40, 29).addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false, true, true, true, false, true, true);

		grid = new ModelRenderer(this);
		grid.setRotationPoint(0.0F, 24.0F, 0.0F);


		Grid_05_r1 = new ModelRenderer(this);
		Grid_05_r1.setRotationPoint(2.8528F, 11.0F, 6.9617F);
		grid.addChild(Grid_05_r1);
		setRotationAngle(Grid_05_r1, 0.0F, 0.6109F, 0.0F);
		Grid_05_r1.setTextureOffset(27, 36).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false, true, false, true, true, true, false);

		Grid_04_r1 = new ModelRenderer(this);
		Grid_04_r1.setRotationPoint(-2.0337F, 11.0F, 7.5353F);
		grid.addChild(Grid_04_r1);
		setRotationAngle(Grid_04_r1, 0.0F, -0.6109F, 0.0F);
		Grid_04_r1.setTextureOffset(45, 34).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false, true, true, true, true, false, true);

		Grid_46_r1 = new ModelRenderer(this);
		Grid_46_r1.setRotationPoint(-3.2937F, 13.5774F, 32.2F);
		grid.addChild(Grid_46_r1);
		setRotationAngle(Grid_46_r1, 0.0F, 0.0F, 0.7854F);
		Grid_46_r1.setTextureOffset(0, 87).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false, true, true, false, true, false, true);

		magRelease_r1 = new ModelRenderer(this);
		magRelease_r1.setRotationPoint(4.4F, 15.6F, 28.3F);
		grid.addChild(magRelease_r1);
		setRotationAngle(magRelease_r1, 0.3665F, 0.0F, 0.0F);
		magRelease_r1.setTextureOffset(28, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false, true, true, true, true, true, false);

		hang_r1 = new ModelRenderer(this);
		hang_r1.setRotationPoint(4.4F, 6.6F, 32.0F);
		grid.addChild(hang_r1);
		setRotationAngle(hang_r1, 0.0F, 0.0F, 0.0F);
		hang_r1.setTextureOffset(40, 24).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, false, true, true, true, false, true, false);

		Grid_03_r1 = new ModelRenderer(this);
		Grid_03_r1.setRotationPoint(0.0F, -0.02F, 0.2F);
		grid.addChild(Grid_03_r1);
		setRotationAngle(Grid_03_r1, -0.0052F, 0.0F, 0.0F);
		Grid_03_r1.setTextureOffset(91, 0).addBox(-3.0F, 10.0F, -1.1F, 6.0F, 1.0F, 18.0F, 0.0F, false, true, false, true, true, true, true);

		Grid_02_r1 = new ModelRenderer(this);
		Grid_02_r1.setRotationPoint(0.0F, 0.3F, -0.2F);
		grid.addChild(Grid_02_r1);
		setRotationAngle(Grid_02_r1, 0.0F, 0.0F, 0.0F);
		Grid_02_r1.setTextureOffset(114, 30).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 2.0F, 11.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_01_r1 = new ModelRenderer(this);
		Grid_01_r1.setRotationPoint(0.0F, -0.2F, 0.0F);
		grid.addChild(Grid_01_r1);
		setRotationAngle(Grid_01_r1, 0.0F, 0.0F, 0.0F);
		Grid_01_r1.setTextureOffset(0, 110).addBox(-3.5F, 7.0F, -2.9F, 7.0F, 2.0F, 12.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_45_r1 = new ModelRenderer(this);
		Grid_45_r1.setRotationPoint(4.7063F, 13.5774F, 32.2F);
		grid.addChild(Grid_45_r1);
		setRotationAngle(Grid_45_r1, 0.0F, 0.0F, 0.7854F);
		Grid_45_r1.setTextureOffset(91, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false, true, true, true, false, true, false);

		Grid_44_r1 = new ModelRenderer(this);
		Grid_44_r1.setRotationPoint(3.1063F, 6.5774F, 8.6F);
		grid.addChild(Grid_44_r1);
		setRotationAngle(Grid_44_r1, 0.0F, 0.0F, -1.1345F);
		Grid_44_r1.setTextureOffset(55, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 9.0F, 0.0F, false, true, true, true, false, true, false);
		Grid_44_r1.setTextureOffset(55, 23).addBox(-1.0F, 0.0F, 14.0F, 1.0F, 1.0F, 25.0F, 0.0F, false, true, true, true, true, true, false);

		Grid_39_r1 = new ModelRenderer(this);
		Grid_39_r1.setRotationPoint(-3.0937F, 6.5774F, 22.6F);
		grid.addChild(Grid_39_r1);
		setRotationAngle(Grid_39_r1, 0.0F, 0.0F, -0.4363F);
		Grid_39_r1.setTextureOffset(0, 57).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 25.0F, 0.0F, false, true, true, true, false, true, false);
		Grid_39_r1.setTextureOffset(55, 10).addBox(-1.0F, 0.0F, -14.0F, 1.0F, 1.0F, 9.0F, 0.0F, false, true, true, true, false, true, false);

		SlideLock_r1 = new ModelRenderer(this);
		SlideLock_r1.setRotationPoint(4.0F, 7.8849F, 18.9148F);
		grid.addChild(SlideLock_r1);
		setRotationAngle(SlideLock_r1, 0.2618F, 0.0F, 0.0F);
		SlideLock_r1.setTextureOffset(82, 40).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 2.0F, 1.0F, 0.0F, false, true, true, true, true, true, true);

		Grid_040_r1 = new ModelRenderer(this);
		Grid_040_r1.setRotationPoint(4.0F, 8.7365F, 22.281F);
		grid.addChild(Grid_040_r1);
		setRotationAngle(Grid_040_r1, -0.3491F, 0.0F, 0.0F);
		Grid_040_r1.setTextureOffset(55, 49).addBox(-8.0F, 1.0F, 0.0F, 8.0F, 1.0F, 1.0F, 0.0F, false, false, false, false, true, true, true);

		Grid_039_r1 = new ModelRenderer(this);
		Grid_039_r1.setRotationPoint(4.0F, 6.7522F, 20.5617F);
		grid.addChild(Grid_039_r1);
		setRotationAngle(Grid_039_r1, 0.2618F, 0.0F, 0.0F);
		Grid_039_r1.setTextureOffset(27, 57).addBox(-8.0F, 1.0F, 0.0F, 8.0F, 3.0F, 2.0F, 0.0F, false, true, false, true, false, true, true);

		Grid_07_r1 = new ModelRenderer(this);
		Grid_07_r1.setRotationPoint(4.0F, 6.2517F, 16.4093F);
		grid.addChild(Grid_07_r1);
		setRotationAngle(Grid_07_r1, 0.2618F, 0.0F, 0.0F);
		Grid_07_r1.setTextureOffset(0, 83).addBox(-8.0F, 1.0F, 0.0F, 8.0F, 3.0F, 1.0F, 0.0F, false, false, true, false, true, true, true);

		Grid_038_r1 = new ModelRenderer(this);
		Grid_038_r1.setRotationPoint(3.0F, 6.0997F, 17.192F);
		grid.addChild(Grid_038_r1);
		setRotationAngle(Grid_038_r1, -0.0698F, 0.0F, 0.0F);
		Grid_038_r1.setTextureOffset(27, 36).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 5.0F, 6.0F, 0.0F, false, false, false, true, true, true, true);

		Grid_013_r1 = new ModelRenderer(this);
		Grid_013_r1.setRotationPoint(3.0F, 10.5348F, 23.0585F);
		grid.addChild(Grid_013_r1);
		setRotationAngle(Grid_013_r1, -0.3491F, 0.0F, 0.0F);
		Grid_013_r1.setTextureOffset(85, 67).addBox(-6.0F, -1.0F, -0.2F, 6.0F, 2.0F, 5.0F, 0.0F, false, false, false, false, true, true, true);

		Grid_037_r1 = new ModelRenderer(this);
		Grid_037_r1.setRotationPoint(2.5F, 8.6862F, 48.5305F);
		grid.addChild(Grid_037_r1);
		setRotationAngle(Grid_037_r1, -2.7925F, 0.0F, 0.0F);
		Grid_037_r1.setTextureOffset(0, 8).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false, false, false, true, false, true, true);

		Grid_036_r1 = new ModelRenderer(this);
		Grid_036_r1.setRotationPoint(2.5F, 6.7199F, 47.4658F);
		grid.addChild(Grid_036_r1);
		setRotationAngle(Grid_036_r1, -0.6109F, 0.0F, 0.0F);
		Grid_036_r1.setTextureOffset(77, 86).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 1.0F, 2.0F, 0.0F, false, true, true, true, false, true, true);

		Grid_035_r1 = new ModelRenderer(this);
		Grid_035_r1.setRotationPoint(3.0F, 7.0199F, 47.7658F);
		grid.addChild(Grid_035_r1);
		setRotationAngle(Grid_035_r1, -1.4399F, 0.0F, 0.0F);
		Grid_035_r1.setTextureOffset(0, 94).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, false, true, true, true, false, true, true);

		Grid_034_r1 = new ModelRenderer(this);
		Grid_034_r1.setRotationPoint(3.0F, 7.1199F, 45.5658F);
		grid.addChild(Grid_034_r1);
		setRotationAngle(Grid_034_r1, -1.0036F, 0.0F, 0.0F);
		Grid_034_r1.setTextureOffset(60, 71).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 5.0F, 2.0F, 0.0F, false, false, true, false, false, true, true);

		Grid_033_r1 = new ModelRenderer(this);
		Grid_033_r1.setRotationPoint(3.0F, 10.0199F, 41.8658F);
		grid.addChild(Grid_033_r1);
		setRotationAngle(Grid_033_r1, -0.2182F, 0.0F, 0.0F);
		Grid_033_r1.setTextureOffset(82, 34).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 4.0F, 2.0F, 0.0F, false, false, true, false, false, true, true);

		Grid_032_r1 = new ModelRenderer(this);
		Grid_032_r1.setRotationPoint(3.0F, 29.0199F, 49.8658F);
		grid.addChild(Grid_032_r1);
		setRotationAngle(Grid_032_r1, -1.4835F, 0.0F, 0.0F);
		Grid_032_r1.setTextureOffset(82, 23).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 3.0F, 0.0F, false, false, true, true, false, true, true);

		Grid_031_r1 = new ModelRenderer(this);
		Grid_031_r1.setRotationPoint(3.0F, 24.4005F, 47.9524F);
		grid.addChild(Grid_031_r1);
		setRotationAngle(Grid_031_r1, -1.1781F, 0.0F, 0.0F);
		Grid_031_r1.setTextureOffset(0, 74).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 5.0F, 0.0F, false, false, false, true, false, true, true);

		Grid_030_r1 = new ModelRenderer(this);
		Grid_030_r1.setRotationPoint(3.0F, 18.4005F, 44.4524F);
		grid.addChild(Grid_030_r1);
		setRotationAngle(Grid_030_r1, -1.0472F, 0.0F, 0.0F);
		Grid_030_r1.setTextureOffset(24, 83).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 7.0F, 0.0F, false, false, false, true, false, true, true);

		Grid_029_r1 = new ModelRenderer(this);
		Grid_029_r1.setRotationPoint(3.0F, 13.5005F, 42.7524F);
		grid.addChild(Grid_029_r1);
		setRotationAngle(Grid_029_r1, -1.2217F, 0.0F, 0.0F);
		Grid_029_r1.setTextureOffset(24, 92).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 7.0F, 0.0F, false, false, false, true, false, true, true);

		Grid_011_r1 = new ModelRenderer(this);
		Grid_011_r1.setRotationPoint(3.0F, 12.1005F, 26.7524F);
		grid.addChild(Grid_011_r1);
		setRotationAngle(Grid_011_r1, 0.3665F, 0.0F, 0.0F);
		Grid_011_r1.setTextureOffset(55, 23).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 24.0F, 1.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_028_r1 = new ModelRenderer(this);
		Grid_028_r1.setRotationPoint(2.0F, 7.9901F, 15.4956F);
		grid.addChild(Grid_028_r1);
		setRotationAngle(Grid_028_r1, -0.9163F, 0.0F, 0.0F);
		Grid_028_r1.setTextureOffset(60, 64).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, false, false, true, false, false, true, true);

		Trigger_01_r1 = new ModelRenderer(this);
		Trigger_01_r1.setRotationPoint(1.0F, 14.2294F, 23.001F);
		grid.addChild(Trigger_01_r1);
		setRotationAngle(Trigger_01_r1, -0.6545F, 0.0F, 0.0F);
		Trigger_01_r1.setTextureOffset(0, 139).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, false, true, true, false, true, true, true);

		Trigger_00_r1 = new ModelRenderer(this);
		Trigger_00_r1.setRotationPoint(1.0F, 11.1901F, 23.3956F);
		grid.addChild(Trigger_00_r1);
		setRotationAngle(Trigger_00_r1, -0.1745F, 0.0F, 0.0F);
		Trigger_00_r1.setTextureOffset(0, 130).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, false, true, true, false, true, true, true);

		Grid_027_r1 = new ModelRenderer(this);
		Grid_027_r1.setRotationPoint(2.0F, 8.4901F, 12.2956F);
		grid.addChild(Grid_027_r1);
		setRotationAngle(Grid_027_r1, -0.5672F, 0.0F, 0.0F);
		Grid_027_r1.setTextureOffset(27, 70).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, false, false, false, false, true, true, true);

		Grid_026_r1 = new ModelRenderer(this);
		Grid_026_r1.setRotationPoint(2.0F, 11.8901F, 13.8956F);
		grid.addChild(Grid_026_r1);
		setRotationAngle(Grid_026_r1, -0.0873F, 0.0F, 0.0F);
		Grid_026_r1.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 6.0F, 2.0F, 0.0F, false, true, true, false, false, true, true);

		Grid_025_r1 = new ModelRenderer(this);
		Grid_025_r1.setRotationPoint(2.0F, 16.6901F, 13.5956F);
		grid.addChild(Grid_025_r1);
		setRotationAngle(Grid_025_r1, -0.4538F, 0.0F, 0.0F);
		Grid_025_r1.setTextureOffset(82, 28).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 4.0F, 0.0F, false, true, false, true, false, true, true);

		Grid_024_r1 = new ModelRenderer(this);
		Grid_024_r1.setRotationPoint(2.0F, 18.1901F, 12.6956F);
		grid.addChild(Grid_024_r1);
		setRotationAngle(Grid_024_r1, -0.0436F, 0.0F, 0.0F);
		Grid_024_r1.setTextureOffset(58, 86).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 11.0F, 0.0F, false, true, false, true, true, true, true);

		Grid_023_r1 = new ModelRenderer(this);
		Grid_023_r1.setRotationPoint(2.0F, 18.8554F, 22.7526F);
		grid.addChild(Grid_023_r1);
		setRotationAngle(Grid_023_r1, 0.4363F, 0.0F, 0.0F);
		Grid_023_r1.setTextureOffset(60, 57).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false, false, false, true, true, true, true);

		Grid_022_r1 = new ModelRenderer(this);
		Grid_022_r1.setRotationPoint(2.0F, 14.5554F, 27.7526F);
		grid.addChild(Grid_022_r1);
		setRotationAngle(Grid_022_r1, -0.3491F, 0.0F, 0.0F);
		Grid_022_r1.setTextureOffset(27, 62).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_021_r1 = new ModelRenderer(this);
		Grid_021_r1.setRotationPoint(4.0F, 29.4554F, 45.5526F);
		grid.addChild(Grid_021_r1);
		setRotationAngle(Grid_021_r1, 0.0F, 0.0F, 0.0F);
		Grid_021_r1.setTextureOffset(85, 57).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 4.0F, 3.0F, 0.0F, false, false, true, false, true, true, true);

		Grid_020_r1 = new ModelRenderer(this);
		Grid_020_r1.setRotationPoint(4.0F, 26.6838F, 47.4046F);
		grid.addChild(Grid_020_r1);
		setRotationAngle(Grid_020_r1, -1.1781F, 0.0F, 0.0F);
		Grid_020_r1.setTextureOffset(85, 74).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 2.0F, 3.0F, 0.0F, false, false, false, true, false, true, true);

		Grid_019_r1 = new ModelRenderer(this);
		Grid_019_r1.setRotationPoint(4.0F, 20.6216F, 43.9046F);
		grid.addChild(Grid_019_r1);
		setRotationAngle(Grid_019_r1, -1.0472F, 0.0F, 0.0F);
		Grid_019_r1.setTextureOffset(109, 81).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 1.0F, 7.0F, 0.0F, false, false, false, true, false, true, true);

		Grid_045_r1 = new ModelRenderer(this);
		Grid_045_r1.setRotationPoint(3.0F, 31.7743F, 34.6211F);
		grid.addChild(Grid_045_r1);
		setRotationAngle(Grid_045_r1, -0.5236F, 0.0F, 0.0F);
		Grid_045_r1.setTextureOffset(91, 13).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_044_r1 = new ModelRenderer(this);
		Grid_044_r1.setRotationPoint(2.0F, 26.3064F, 32.9532F);
		grid.addChild(Grid_044_r1);
		setRotationAngle(Grid_044_r1, -0.5236F, 0.0F, 0.0F);
		Grid_044_r1.setTextureOffset(91, 7).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_043_r1 = new ModelRenderer(this);
		Grid_043_r1.setRotationPoint(2.0F, 21.2064F, 30.9532F);
		grid.addChild(Grid_043_r1);
		setRotationAngle(Grid_043_r1, -0.5236F, 0.0F, 0.0F);
		Grid_043_r1.setTextureOffset(0, 98).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_018_r1 = new ModelRenderer(this);
		Grid_018_r1.setRotationPoint(4.0F, 31.5064F, 36.4532F);
		grid.addChild(Grid_018_r1);
		setRotationAngle(Grid_018_r1, 0.0873F, 0.0F, 0.0F);
		Grid_018_r1.setTextureOffset(109, 67).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 3.0F, 11.0F, 0.0F, false, false, false, false, true, true, true);

		Grid_010_r1 = new ModelRenderer(this);
		Grid_010_r1.setRotationPoint(4.0F, 12.1005F, 27.8524F);
		grid.addChild(Grid_010_r1);
		setRotationAngle(Grid_010_r1, 0.3665F, 0.0F, 0.0F);
		Grid_010_r1.setTextureOffset(0, 0).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 24.0F, 12.0F, 0.0F, false, true, true, false, false, true, true);

		Grid_012_r1 = new ModelRenderer(this);
		Grid_012_r1.setRotationPoint(4.0F, 8.1005F, 23.1524F);
		grid.addChild(Grid_012_r1);
		setRotationAngle(Grid_012_r1, -0.2182F, 0.0F, 0.0F);
		Grid_012_r1.setTextureOffset(0, 36).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 4.0F, 11.0F, 0.0F, false, true, false, false, true, true, true);

		Grid_017_r1 = new ModelRenderer(this);
		Grid_017_r1.setRotationPoint(4.0F, 9.9141F, 39.5913F);
		grid.addChild(Grid_017_r1);
		setRotationAngle(Grid_017_r1, -0.1745F, 0.0F, 0.0F);
		Grid_017_r1.setTextureOffset(0, 57).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 6.0F, 3.0F, 0.0F, false, false, true, false, false, true, true);

		Grid_016_r1 = new ModelRenderer(this);
		Grid_016_r1.setRotationPoint(4.0F, 9.1005F, 42.6524F);
		grid.addChild(Grid_016_r1);
		setRotationAngle(Grid_016_r1, 0.3927F, 0.0F, 0.0F);
		Grid_016_r1.setTextureOffset(82, 44).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 3.0F, 0.0F, false, false, false, false, false, true, true);

		Grid_015_r1 = new ModelRenderer(this);
		Grid_015_r1.setRotationPoint(4.0F, 10.0005F, 42.6524F);
		grid.addChild(Grid_015_r1);
		setRotationAngle(Grid_015_r1, 0.3927F, 0.0F, 0.0F);
		Grid_015_r1.setTextureOffset(98, 90).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 5.0F, 0.0F, false, false, true, false, true, true, true);

		Grid_014_r1 = new ModelRenderer(this);
		Grid_014_r1.setRotationPoint(4.0F, 7.0005F, 22.7524F);
		grid.addChild(Grid_014_r1);
		setRotationAngle(Grid_014_r1, 0.0F, 0.0F, 0.0F);
		Grid_014_r1.setTextureOffset(121, 11).addBox(-8.0F, 0.0F, 20.0F, 8.0F, 1.0F, 5.0F, 0.0F, false, false, true, false, true, true, true);
		Grid_014_r1.setTextureOffset(55, 0).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 3.0F, 20.0F, 0.0F, false, false, false, false, false, true, true);

		Grid_06_r1 = new ModelRenderer(this);
		Grid_06_r1.setRotationPoint(0.0F, -0.0199F, -0.9675F);
		grid.addChild(Grid_06_r1);
		setRotationAngle(Grid_06_r1, -0.0175F, 0.0F, 0.0F);
		Grid_06_r1.setTextureOffset(114, 19).addBox(-4.0F, 8.3513F, 9.7584F, 8.0F, 2.0F, 9.0F, 0.0F, false, true, true, false, true, true, true);

		Grid_00_r1 = new ModelRenderer(this);
		Grid_00_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grid.addChild(Grid_00_r1);
		setRotationAngle(Grid_00_r1, 0.0F, 0.0F, 0.0F);
		Grid_00_r1.setTextureOffset(121, 0).addBox(-4.0F, 7.0F, 8.6F, 8.0F, 2.0F, 9.0F, 0.0F, false, false, false, false, false, true, true);

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);


		barrel_02_r1 = new ModelRenderer(this);
		barrel_02_r1.setRotationPoint(0.0F, 4.5858F, -4.01F);
		barrel.addChild(barrel_02_r1);
		setRotationAngle(barrel_02_r1, 0.0F, 0.0F, 0.7854F);
		barrel_02_r1.setTextureOffset(45, 29).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false, true, false, true, true, true, true);

		barrel_01_r1 = new ModelRenderer(this);
		barrel_01_r1.setRotationPoint(0.0F, 5.3F, -4.0F);
		barrel.addChild(barrel_01_r1);
		setRotationAngle(barrel_01_r1, 0.0F, 0.0F, 0.7854F);
		barrel_01_r1.setTextureOffset(31, 80).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 3.0F, 21.0F, 0.0F, false, true, false, true, true, true, true);

		barrel_00_r1 = new ModelRenderer(this);
		barrel_00_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(barrel_00_r1);
		setRotationAngle(barrel_00_r1, 0.0F, 0.0F, 0.0F);
		barrel_00_r1.setTextureOffset(46, 104).addBox(-2.5F, 0.0F, 17.0F, 5.0F, 8.0F, 10.0F, 0.0F, false, false, true, true, false, true, true);

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);


		mag_00_r1 = new ModelRenderer(this);
		mag_00_r1.setRotationPoint(3.5F, 35.0F, 36.4F);
		mag.addChild(mag_00_r1);
		setRotationAngle(mag_00_r1, 0.1309F, 0.0F, 0.0F);
		mag_00_r1.setTextureOffset(107, 111).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 2.0F, 11.0F, 0.0F, false, true, true, true, true, true, true);

		mag_01_r1 = new ModelRenderer(this);
		mag_01_r1.setRotationPoint(2.5F, 7.8597F, 26.9657F);
		mag.addChild(mag_01_r1);
		setRotationAngle(mag_01_r1, 0.3665F, 0.0F, 0.0F);
		mag_01_r1.setTextureOffset(79, 90).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 30.0F, 9.0F, 0.0F, false, true, true, false, false, true, true);

		mag_02_r1 = new ModelRenderer(this);
		mag_02_r1.setRotationPoint(2.5F, 34.2F, 40.3F);
		mag.addChild(mag_02_r1);
		setRotationAngle(mag_02_r1, 0.3665F, 0.0F, 0.0F);
		mag_02_r1.setTextureOffset(0, 66).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 6.0F, 0.0F, false, false, true, false, false, true, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode, GunRenderContext context, long fireDis) {
		matrixStack.push();
		slideBlotBack.play(lastFireTime, matrixStack, transformType);
		slide.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		matrixStack.pop();
		grid.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		if (!slideBlotBack.completed) {
			matrixStack.push();
			if (slideBlotBack.getProgress() > 0.1f && slideBlotBack.getProgress() < 0.9f) {
				matrixStack.rotate(new Quaternion(Vector3f.XP, -4f, true));
				matrixStack.translate(0,-0.055f,0.15f);
				barrel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			} else {
				matrixStack.translate(0,0.01f,0);
				barrel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			}
			matrixStack.pop();
		} else {
			barrel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}
		mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		slide.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		grid.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		barrel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}


}