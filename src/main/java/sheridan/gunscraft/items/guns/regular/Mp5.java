package sheridan.gunscraft.items.guns.regular;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.tabs.CreativeTabs;

public class Mp5 extends GenericGun {
    public Mp5() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),30, false,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/mp5/mp5_basic.png")},
                new int[] {SEMI, BURST, AUTO}, 0.6f, 1.8f, 0.7f, 3.75f, 7f,
                5f, 30, 8, "item.mp5.fire", new float[] {0.6f, 1f, 1f, 1f},
                false, false, (int) (3.2f * 20), 3,4.5f,1.6f, 0.35f,
                2.4f);

    }
}
