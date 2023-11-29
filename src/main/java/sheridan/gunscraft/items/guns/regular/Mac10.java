package sheridan.gunscraft.items.guns.regular;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.tabs.CreativeTabs;

public class Mac10 extends GenericGun {
    public Mac10() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),30, false,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/mac10/mac10_basic.png")},
                new int[] {SEMI, AUTO}, 1.15f, 2.8f, 0.8f, 2.8f, 9f,
                5f, 25, 7, "item.mac10.fire", new float[] {1f, 1f, 1f, 1f},
                true, false, (int) (2.8 * 20), 1,4.3f,5f, 2f,
                2.8f, "uzi");
    }
}
