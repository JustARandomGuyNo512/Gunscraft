package sheridan.gunscraft.model.attachments.mags.smgExpMag;

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

public class ModelSmgExpMag extends EntityModel<Entity> implements IAttachmentModel {
    private ModelMp5ExpMag mp5StyleMag;
    private ArrayList<ResourceLocation> textures;

    public ModelSmgExpMag(ArrayList<ResourceLocation> textures) {
        mp5StyleMag = new ModelMp5ExpMag();
        this.textures = textures;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public void render(MatrixStack matrixStack, ItemCameraTransforms.TransformType transformType, int packedLight, int packedOverlay, int bulletLeft, long lastFireTime, boolean mainHand, int fireMode, IGenericGun gun) {
        IRenderTypeBuffer.Impl buffer = Minecraft.getInstance().getRenderTypeBuffers().getBufferSource();
        if (gun.getSeriesName().equals("mp5")) {
            mp5StyleMag.render(matrixStack, buffer.getBuffer(RenderType.getArmorCutoutNoCull(textures.get(0))), packedLight, packedOverlay, 1,1,1,1);
        }
        buffer.finish();
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

    }
}
