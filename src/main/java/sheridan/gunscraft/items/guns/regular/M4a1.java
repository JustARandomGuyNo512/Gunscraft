package sheridan.gunscraft.items.guns.regular;

import net.minecraft.util.ResourceLocation;
import org.lwjgl.system.CallbackI;
import sheridan.gunscraft.items.attachments.AttachmentRegistry;
import sheridan.gunscraft.items.attachments.util.GunAttachmentSlot;
import sheridan.gunscraft.items.guns.GenericGun;
import sheridan.gunscraft.tabs.CreativeTabs;

import java.util.*;

public class M4a1 extends GenericGun {
    public M4a1() {
        super(new Properties().group(CreativeTabs.REGULAR_GUNS).maxStackSize(1),35, false,
                new ResourceLocation[]{new ResourceLocation("gunscraft","textures/guns/m4a1/m4a1_basic.png")},
                new int[] {SEMI, AUTO}, 0.75f, 1.85f, 1.0f, 9.5f, 10.5f,
                7f, 25, 9, "item.m4a1.fire", new float[] {0.75f, 1f, 1f, 1f},
                false,false,3 * 20, 1, 3.5f,3f, 0.5f,
                2.2f);
        Map<String, GunAttachmentSlot> slotMap = new HashMap<>();

        GunAttachmentSlot muzzleSlot = new GunAttachmentSlot("muzzle", new HashSet<>(Arrays.asList(999)));
        muzzleSlot.setTrans(new float[][]{{0,0,0},{0,0,0},{1,1,1}});
        slotMap.put("muzzle", muzzleSlot);

        GunAttachmentSlot magSlot = new GunAttachmentSlot("mag", new HashSet<>(Arrays.asList(AttachmentRegistry.getIdByName("ar_expansion_mag"))));
        magSlot.setTrans(new float[][]{{0, 35f / 16f, 85f / 16f},{0,0,0},{1,1,1}});
        slotMap.put("mag", magSlot);

        GunAttachmentSlot scopeSlot = new GunAttachmentSlot("scope", new HashSet<>(Arrays.asList(999)));
        scopeSlot.setTrans(new float[][]{{0, -7.8592f / 16f, 120 / 16f},{0,0,0}, {1,1,1}});
        slotMap.put("scope", scopeSlot);

        this.slotMap = slotMap;
    }
}
