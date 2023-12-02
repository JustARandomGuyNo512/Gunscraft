package sheridan.gunscraft.items.guns.regular;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.tabs.CreativeTabs;

public class MiniM249 extends GenericGun {
    public MiniM249() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),150, false,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/mini_m249/mini_m249_basic.png")},
                new int[] {AUTO}, 0.8f, 2.1f, 1.1f, 9.5f, 10.5f,
                7f, 25, 8, "item.mini_m249.fire", new float[] {1f, 1f, 1f, 1f},
                true, false, (int) (6.5 * 20), 0,2.5f,2.8f, 0.65f,
                2.0f, "lmg");
    }
}
