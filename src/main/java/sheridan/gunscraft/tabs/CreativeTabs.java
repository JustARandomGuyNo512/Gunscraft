package sheridan.gunscraft.tabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import sheridan.gunscraft.items.ModItems;

public class CreativeTabs {
    public static final ItemGroup REGULAR_GUNS = new ItemGroup("guns") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack((IItemProvider) ModItems.PISTOL_9_MM.get());
        }
    };
    public static final ItemGroup REGULAR_ATTACHMENTS = new ItemGroup("attachments") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack((IItemProvider) ModItems.AR_EXPANSION_MAG.get());
        }
    };
}
