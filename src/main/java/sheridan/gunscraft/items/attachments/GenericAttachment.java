package sheridan.gunscraft.items.attachments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IAttachmentModel;

public class GenericAttachment extends Item implements IGenericAttachment{
    public static final String MUZZLE = "muzzle", GRIP = "grip", MAG = "mag", SCOPE = "scope", STOCK = "stock", HAND_GUARD = "hand_guard";
    public static final int NONE = -1;
    protected int id;
    protected String type;
    protected String name;
    public ResourceLocation texture;

    public GenericAttachment(Properties properties, int id, String type, String name, ResourceLocation texture) {
        super(properties);
        this.id = id;
        this.type = type;
        this.texture = texture;
        this.name = name;
    }

    @Override
    public void onAttach(ItemStack stack, IGenericGun gun) {

    }

    @Override
    public void onOff(ItemStack stack, IGenericGun gun) {

    }

    @Override
    public String getSlotType() {
        return type;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getAttachmentName() {
        return name;
    }

    @Override
    public ResourceLocation getTexture() {
        return texture;
    }

}
