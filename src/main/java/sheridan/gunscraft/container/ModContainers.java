package sheridan.gunscraft.container;

import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS;
    public static final RegistryObject<ContainerType<AttachmentContainer>> ATTACHMENTS;



    private static <T extends Container> RegistryObject<ContainerType<T>> register(String id, ContainerType.IFactory<T> factory) {
        return CONTAINERS.register(id, () -> new ContainerType(factory));
    }

    static {
        CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, "cgm");

        ATTACHMENTS = register("attachments", AttachmentContainer::new);
    }
}
