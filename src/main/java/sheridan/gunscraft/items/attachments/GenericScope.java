package sheridan.gunscraft.items.attachments;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IAttachmentModel;

public class GenericScope extends GenericAttachment{
    public ResourceLocation scopeTexture;
    public float rate = 1.0f;

    public GenericScope(Properties properties, int id, String type, String name, IAttachmentModel model, ResourceLocation scopeTexture,
                        float rate) {
        super(properties, id, type, name, model);
        this.scopeTexture = scopeTexture;
        this.rate = rate;
    }

    @Override
    public void onAiming(ItemStack stack, IGenericGun gun, MatrixStack matrixStack) {

    }
}
