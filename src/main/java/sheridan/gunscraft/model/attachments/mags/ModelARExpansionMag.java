package sheridan.gunscraft.model.attachments.mags;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import sheridan.gunscraft.model.IAttachmentModel;
import sheridan.gunscraft.model.ModelRenderer;

public class ModelARExpansionMag extends EntityModel<Entity> implements IAttachmentModel {
private final ModelRenderer mag;
private final ModelRenderer cube_r1;
private final ModelRenderer cube_r2;
private final ModelRenderer cube_r3;

public ModelARExpansionMag() {
        //<
    textureWidth = 128;
    textureHeight = 128;

    mag = new ModelRenderer(this);
    mag.setRotationPoint(3.5F, 24.0F, 0.1F);
    mag.setTextureOffset(44, 22).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 9.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);

    cube_r1 = new ModelRenderer(this);
    cube_r1.setRotationPoint(-8.0F, 31.6F, -7.8F);
    mag.addChild(cube_r1);
    setRotationAngle(cube_r1, -0.384F, 0.0F, 0.0F);
    cube_r1.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 9.0F, 20.0F, 24.0F, 0.0F, false, true, true, true, true, true, true);

    cube_r2 = new ModelRenderer(this);
    cube_r2.setRotationPoint(0.0F, 9.0F, 22.0F);
    mag.addChild(cube_r2);
    setRotationAngle(cube_r2, -0.1571F, 0.0F, 0.0F);
    cube_r2.setTextureOffset(58, 53).addBox(-7.0F, 0.0F, -22.0F, 7.0F, 8.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);

    cube_r3 = new ModelRenderer(this);
    cube_r3.setRotationPoint(0.0F, 16.9474F, 20.7345F);
    mag.addChild(cube_r3);
    setRotationAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
    cube_r3.setTextureOffset(0, 44).addBox(-7.0F, -0.048F, -22.0F, 7.0F, 25.0F, 22.0F, 0.0F, false, true, true, false, false, true, true);

    //>
        }

@Override
public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
        }

@Override
public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        mag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        }

public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
        }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode) {
        mag.render(matrixStack,buffer,packedLight,packedOverlay,red,green,blue,alpha);
    }
}