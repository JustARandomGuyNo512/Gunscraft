package sheridan.gunscraft.keybind;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import sheridan.gunscraft.Config;

public class KeyBinds {
    public static final KeyBinding KEY_RELOAD = new KeyBinding("key.gunscraft.reload", 82, "key.categories.gunscraft");
    public static final KeyBinding KEY_SWITCH_FIRE_MODE = new KeyBinding("key.gunscraft.switch_fire_mode", 86, "key.categories.gunscraft");

    public static final KeyBinding KEY_DEBUG_X_ADD = new KeyBinding("key.gunscraft.debug_x_add", 72, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_X_DEC = new KeyBinding("key.gunscraft.debug_x_dec", 75, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_Y_ADD = new KeyBinding("key.gunscraft.debug_y_add", 85, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_Y_DEC = new KeyBinding("key.gunscraft.debug_y_dec", 74, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_Z_ADD = new KeyBinding("key.gunscraft.debug_z_add", 77, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_Z_DEC = new KeyBinding("key.gunscraft.debug_z_dec", 78, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_HIGH_ACCURACY = new KeyBinding("key.gunscraft.high_accuracy", 66, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_TRANS_CLEAR = new KeyBinding("key.gunscraft.debug_trans_clear", 73, "key.categories.gunscraft");
    public static final KeyBinding KEY_DEBUG_PRINT_TRANS = new KeyBinding("key.gunscraft.debug_print_trans", 80, "key.categories.gunscraft");


    static {
        ClientRegistry.registerKeyBinding(KEY_RELOAD);
        ClientRegistry.registerKeyBinding(KEY_SWITCH_FIRE_MODE);

        if (Config.isInDebug) {
            ClientRegistry.registerKeyBinding(KEY_DEBUG_X_ADD);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_X_DEC);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_Y_ADD);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_Y_DEC);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_Z_ADD);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_Z_DEC);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_HIGH_ACCURACY);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_TRANS_CLEAR);
            ClientRegistry.registerKeyBinding(KEY_DEBUG_PRINT_TRANS);
        }
    }


}
