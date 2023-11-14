package sheridan.gunscraft.items.guns.regular;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.tabs.CreativeTabs;

public class Akms extends GenericGun {

    public Akms() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),30, false,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/akms/akms_basic.png")},
                new int[] {AUTO}, 0.92f, 2.5f, 1.5f, 7.2f, 14f,
                8f, 30, 12, "item.akms.fire", new float[] {0.6f, 1f, 1f, 1f},
                false,false,4 * 20);

    }

}
