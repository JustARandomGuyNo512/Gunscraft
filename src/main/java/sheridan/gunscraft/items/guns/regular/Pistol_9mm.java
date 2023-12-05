package sheridan.gunscraft.items.guns.regular;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.sounds.SoundEvents;
import sheridan.gunscraft.tabs.CreativeTabs;

public class Pistol_9mm extends GenericGun {

    public Pistol_9mm() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),15, true,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/pistol_9mm/pistol_9mm_basic.png"),
                    new ResourceLocation("gunscraft","textures/guns/pistol_9mm/pistol_9mm_black.png")},
                new int[] {SEMI}, 0.5f, 1.5f, 1f, 3.5f, 7f,
                4f, 30, 18, "item.pistol_9mm.fire", new float[] {0.6f, 1f, 1f, 1f},
                false, true, (int) (2.2 * 20), 1, 5.8f, 2f,
                0.5f, 3.5f, "pistol_9mm", "pistol");

    }
}
