package sheridan.gunscraft.keybind;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBinds {
    public static final KeyBinding KEY_RELOAD = new KeyBinding("key.gunscraft.reload", 82, "key.categories.gunscraft");
    public static final KeyBinding KEY_SWITCH_FIRE_MODE = new KeyBinding("key.gunscraft.switch_fire_mode", 84, "key.categories.gunscraft");

    static {
        ClientRegistry.registerKeyBinding(KEY_RELOAD);
        ClientRegistry.registerKeyBinding(KEY_SWITCH_FIRE_MODE);
    }


}
