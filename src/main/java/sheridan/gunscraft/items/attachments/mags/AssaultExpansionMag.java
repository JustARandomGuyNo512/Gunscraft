package sheridan.gunscraft.items.attachments.mags;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.items.attachments.AttachmentRegistry;
import sheridan.gunscraft.items.attachments.GenericAttachment;
import sheridan.gunscraft.items.attachments.GenericMag;
import sheridan.gunscraft.model.attachments.mags.ModelAssaultExpansionMag;
import sheridan.gunscraft.tabs.CreativeTabs;

import java.util.ArrayList;
import java.util.Arrays;

public class AssaultExpansionMag extends GenericMag {
    public AssaultExpansionMag() {
        super(new Properties().group(CreativeTabs.REGULAR_ATTACHMENTS).maxStackSize(1), AttachmentRegistry.getID("assault_expansion_mag"),
                GenericAttachment.MAG, "assault_expansion_mag", 10);

        AttachmentRegistry.register(this.id, this);
        ArrayList<ResourceLocation> textures = new ArrayList<>(Arrays.asList(new ResourceLocation(Gunscraft.MOD_ID, "textures/attachments/mag/assault_expansion_mag/ar_expansion_mag.png"),
                new ResourceLocation(Gunscraft.MOD_ID, "textures/attachments/mag/assault_expansion_mag/ak_expansion_mag.png")));
        AttachmentRegistry.registerModel(this.id, new ModelAssaultExpansionMag(textures));
    }
}
