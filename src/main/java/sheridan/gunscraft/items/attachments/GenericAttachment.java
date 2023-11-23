package sheridan.gunscraft.items.attachments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IAttachmentModel;

public class GenericAttachment extends Item implements IGenericAttachment{
    public static final String MUZZLE = "muzzle", GRIP = "grip", MAG = "mag", SCOPE = "scope", STOCK = "stock", HAND_GUARD = "hand_guard";
    public static final int NONE = -1;
    protected int id;
    protected String type;
    protected String name;
    protected IAttachmentModel model;

    public GenericAttachment(Properties properties, int id, String type, String name, IAttachmentModel model) {
        super(properties);
        this.id = id;
        this.type = type;
        this.name = name;
        this.model = model;
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
    public IAttachmentModel getModel() {
        return model;
    }
}
