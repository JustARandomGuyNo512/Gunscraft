package sheridan.gunscraft.items.guns.regular;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.tabs.CreativeTabs;

public class M4a1 extends GenericGun {
    public M4a1() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),30, false,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/m4a1/m4a1_basic.png")},
                new int[] {SEMI, AUTO}, 0.75f, 1.85f, 1.0f, 9.5f, 10.5f,
                7f, 25, 9, "item.m4a1.fire", new float[] {0.75f, 1f, 1f, 1f},
                false,false,3 * 20, 1, 3.5f,3f, 0.5f,
                2.2f);

    }
}
