package sheridan.gunscraft.items.attachments.mags;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.items.attachments.AttachmentRegistry;
import sheridan.gunscraft.items.attachments.GenericAttachment;
import sheridan.gunscraft.items.attachments.GenericMag;
import sheridan.gunscraft.model.attachments.mags.ModelARExpansionMag;
import sheridan.gunscraft.tabs.CreativeTabs;

import java.util.ArrayList;
import java.util.Arrays;

public class ARExpansionMag extends GenericMag {
    public ARExpansionMag() {
        super(new Properties().group(CreativeTabs.REGULAR_ATTACHMENTS).maxStackSize(1), AttachmentRegistry.getID("ar_expansion_mag"),
                GenericAttachment.MAG, "ar_expansion_mag", 10);

        AttachmentRegistry.register(this.id, this);
        ArrayList<ResourceLocation> textures = new ArrayList<>(Arrays.asList(new ResourceLocation(Gunscraft.MOD_ID, "textures/attachments/mag/ar_expansion_mag/ar_expansion_mag.png")));
        AttachmentRegistry.registerModel(this.id, new ModelARExpansionMag(textures));
    }
}
