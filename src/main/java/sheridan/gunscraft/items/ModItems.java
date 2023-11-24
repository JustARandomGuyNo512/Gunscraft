package sheridan.gunscraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sheridan.gunscraft.items.attachments.mags.ARExpansionMag;
import sheridan.gunscraft.items.guns.regular.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "gunscraft");

    public static final RegistryObject<Pistol_9mm> PISTOL_9_MM = ITEMS.register("pistol_9mm", Pistol_9mm::new);
    public static final RegistryObject<Akm> AKM = ITEMS.register("akm", Akm::new);
    public static final RegistryObject<M4a1> M4A1 = ITEMS.register("m4a1", M4a1::new);
    public static final RegistryObject<Mp5> MP5 = ITEMS.register("mp5", Mp5::new);
    public static final RegistryObject<Mac10> MAC10 = ITEMS.register("mac10", Mac10::new);

    public static final RegistryObject<ARExpansionMag> AR_EXPANSION_MAG = ITEMS.register("ar_expansion_mag", ARExpansionMag::new);
}
