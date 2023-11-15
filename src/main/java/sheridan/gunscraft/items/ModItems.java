package sheridan.gunscraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sheridan.gunscraft.items.guns.regular.Akm;
import sheridan.gunscraft.items.guns.regular.Mac10;
import sheridan.gunscraft.items.guns.regular.Mp5;
import sheridan.gunscraft.items.guns.regular.Pistol_9mm;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "gunscraft");

    public static final RegistryObject<Pistol_9mm> PISTOL_9_MM = ITEMS.register("pistol_9mm", Pistol_9mm::new);
    public static final RegistryObject<Akm> AKM = ITEMS.register("akm", Akm::new);
    public static final RegistryObject<Mp5> MP5 = ITEMS.register("mp5", Mp5::new);
    public static final RegistryObject<Mac10> MAC10 = ITEMS.register("mac10", Mac10::new);
    
}
