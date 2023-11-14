package sheridan.gunscraft.render.fx.muzzleFlash;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.Gunscraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonMuzzleFlash {
    public static Map<String, MuzzleFlash> flashMap;

    public static ResourceLocation PISTOL_SIMPLE_0 = new ResourceLocation(Gunscraft.MOD_ID, "textures/fx/pistol_simple/texture0.png");
    public static ResourceLocation PISTOL_SIMPLE_1 = new ResourceLocation(Gunscraft.MOD_ID, "textures/fx/pistol_simple/texture1.png");


    static {
        flashMap = new HashMap<>();

        flashMap.put("pistol_simple", new MuzzleFlash().setSize(5).setRandomRotate(true).addTexture(new MuzzleFlashTexture(PISTOL_SIMPLE_0, 4)).addTexture(new MuzzleFlashTexture(PISTOL_SIMPLE_1, 4)).setLength(125));
    }

    public static void register(String name, MuzzleFlash flash) {
        if (!flashMap.containsKey(name)) {
            flashMap.put(name, flash);
        }
    }
}
