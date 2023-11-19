package sheridan.gunscraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseItem extends Item{
    public BaseItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return false;
    }
}
