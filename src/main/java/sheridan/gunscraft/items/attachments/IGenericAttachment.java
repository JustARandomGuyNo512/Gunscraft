package sheridan.gunscraft.items.attachments;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.items.guns.IGenericGun;

public interface IGenericAttachment {
    void onAttach(ItemStack stack, IGenericGun gun);
    void onOff(ItemStack stack, IGenericGun gun);
    int getId();

    @OnlyIn(Dist.CLIENT)
    default void beforePreShoot() {}
    @OnlyIn(Dist.CLIENT)
    default void afterPreShoot() {}

    default void onAiming(ItemStack stack, IGenericGun gun, MatrixStack matrixStack) {}

    default void beforeShoot() {}
    default void afterShoot() {}

    @OnlyIn(Dist.CLIENT)
    default void beforeRenderGun() {}
    @OnlyIn(Dist.CLIENT)
    default void afterRenderGun() {}

    String getSlotType();
    int getID();
    String getAttachmentName();
    void handleParams(GunRenderContext params);
    int getItemId();
}
