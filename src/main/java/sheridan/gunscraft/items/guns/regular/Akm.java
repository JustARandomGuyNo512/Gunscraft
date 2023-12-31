package sheridan.gunscraft.items.guns.regular;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.items.attachments.util.GunAttachmentSlot;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.tabs.CreativeTabs;

import java.util.HashMap;

public class Akm extends GenericGun {

    public Akm() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),30, false,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/akm/akm_basic.png")},
                new int[] {SEMI, AUTO}, 0.95f, 2.5f, 1.5f, 7.2f, 14f,
                8f, 30, 12, "item.akm.fire", new float[] {0.6f, 1f, 1f, 1f},
                false,false,4 * 20, 1, 3.2f,4.3f,1.4f,
                1.85f, "ak", "rifle");

    }

}
