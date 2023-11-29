package sheridan.gunscraft.items.attachments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.attachments.util.GunRenderContext;
import sheridan.gunscraft.items.guns.IGenericGun;

public class GenericAttachment extends Item implements IGenericAttachment{
    public static final String MUZZLE = "muzzle", GRIP = "grip", MAG = "mag", SCOPE = "scope", STOCK = "stock", HAND_GUARD = "hand_guard";
    public static final int NONE = -1;
    protected int id;
    protected String type;
    protected String name;

    public String getType() {
        return type;
    }

    public GenericAttachment(Properties properties, int id, String type, String name) {
        super(properties);
        this.id = id;
        this.type = type;
        this.name = name;
    }

    @Override
    public void onAttach(ItemStack stack, IGenericGun gun) {

    }

    @Override
    public void onOff(ItemStack stack, IGenericGun gun) {

    }

    @Override
    public int getId() {
        return this.id;
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
    public void handleParams(GunRenderContext params) {
        switch (this.type) {
            case MUZZLE:
                params.occupiedMuzzle = true;
                break;
            case HAND_GUARD:
                params.occupiedHandGuard = true;
                break;
            case MAG:
                params.occupiedMag = true;
                break;
            case SCOPE:
                params.occupiedIS = true;
                break;
            case STOCK:
                params.occupiedStock = true;
                break;
            case GRIP:
                params.occupiedGrip = true;
                break;
        }
    }

    @Override
    public int getItemId() {
        return Item.getIdFromItem(this);
    }

}
