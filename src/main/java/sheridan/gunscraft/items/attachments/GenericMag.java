package sheridan.gunscraft.items.attachments;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.IGenericGun;

public class GenericMag extends GenericAttachment{
    public int ammoIncrement;

    public GenericMag(Properties properties, int id, String type, String name, int ammoIncrement, ResourceLocation texture) {
        super(properties, id, type, name, texture);
        this.ammoIncrement = ammoIncrement;
    }

    @Override
    public void onAttach(ItemStack stack, IGenericGun gun) {
        gun.setMagSize(stack, gun.getMagSize(stack) + ammoIncrement);
    }

    @Override
    public void onOff(ItemStack stack, IGenericGun gun) {
        gun.setMagSize(stack, gun.getMagSize(stack) - ammoIncrement);
    }
}
