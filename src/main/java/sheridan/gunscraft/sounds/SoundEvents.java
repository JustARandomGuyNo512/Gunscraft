package sheridan.gunscraft.sounds;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sheridan.gunscraft.Gunscraft;

import java.util.HashMap;
import java.util.Map;

public class SoundEvents {
    public static final DeferredRegister<SoundEvent> MOD_SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Gunscraft.MOD_ID);
    public static Map<String, RegistryObject<SoundEvent>> sound = new HashMap<>();

    public static final RegistryObject<SoundEvent> PISTOL_9MM_FIRE = registerSoundEvent("item.pistol_9mm.fire");
    public static final RegistryObject<SoundEvent> AKM_FIRE = registerSoundEvent("item.akm.fire");
    public static final RegistryObject<SoundEvent> MP5_FIRE = registerSoundEvent("item.mp5.fire");
    public static final RegistryObject<SoundEvent> MAC10_FIRE = registerSoundEvent("item.mac10.fire");

    public static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        RegistryObject<SoundEvent> soundEvent = MOD_SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Gunscraft.MOD_ID, name)));
        sound.put(name, soundEvent);
        return soundEvent;
    }

    public static void playSound(String name, LivingEntity entity, float vol, float pit) {
        World world = entity.world;
        if (world != null) {
            RegistryObject<SoundEvent> soundEvent = sound.get(name);
            if (soundEvent != null && soundEvent.get() != null) {
                world.playSound(entity.getPosX(), entity.getPosY(), entity.getPosZ(), soundEvent.get(), SoundCategory.PLAYERS, vol, pit, false);
            }
        }
    }

    public static void register(IEventBus bus) {
        MOD_SOUNDS.register(bus);
    }
}
