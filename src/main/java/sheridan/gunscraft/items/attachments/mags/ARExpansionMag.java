package sheridan.gunscraft.items.attachments.mags;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.items.attachments.GenericAttachment;
import sheridan.gunscraft.items.attachments.GenericMag;
import sheridan.gunscraft.items.attachments.IDIncrement;
import sheridan.gunscraft.tabs.CreativeTabs;

public class ARExpansionMag extends GenericMag {
    public ARExpansionMag() {
        super(new Properties().group(CreativeTabs.REGULAR_ATTACHMENTS).maxStackSize(1), IDIncrement.getID(),
                GenericAttachment.MAG, "ar_expansion_mag", 10, new ResourceLocation(Gunscraft.MOD_ID, "textures/attachments/mag/ar_expansion_mag.png"));
    }
}
