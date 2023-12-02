package sheridan.gunscraft.items.attachments.mags;

import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.items.attachments.AttachmentRegistry;
import sheridan.gunscraft.items.attachments.GenericAttachment;
import sheridan.gunscraft.items.attachments.GenericMag;
import sheridan.gunscraft.model.attachments.mags.ModelAssaultExpansionMag;
import sheridan.gunscraft.model.attachments.mags.smgExpMag.ModelSmgExpMag;
import sheridan.gunscraft.tabs.CreativeTabs;

import java.util.ArrayList;
import java.util.Arrays;

public class SmgExpMag extends GenericMag {
    public SmgExpMag() {
        super(new Properties().group(CreativeTabs.REGULAR_ATTACHMENTS).maxStackSize(1), AttachmentRegistry.getID("smg_expansion_mag"),
                GenericAttachment.MAG, "smg_expansion_mag", 20);

        AttachmentRegistry.register(this.id, this);
        ArrayList<ResourceLocation> textures = new ArrayList<>(Arrays.asList(new ResourceLocation(Gunscraft.MOD_ID, "textures/attachments/mag/smg_exp_mag/smg_exp_mag_mp5.png")));
        AttachmentRegistry.registerModel(this.id, new ModelSmgExpMag(textures));
    }
}
