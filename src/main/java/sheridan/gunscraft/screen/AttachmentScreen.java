package sheridan.gunscraft.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.container.AttachmentContainer;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.mixin.RenderItemMixin;
import sheridan.gunscraft.model.IGunModel;

public class AttachmentScreen extends ContainerScreen<AttachmentContainer>  {
    public static final ResourceLocation BACK_GROUND = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/screen/attachment_screen.png");
    private final TranslationTextComponent title = new TranslationTextComponent("container.gunscraft.attachments");

    public AttachmentScreen(AttachmentContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    public void tick() {
        super.tick();

    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        super.render(matrixStack, mouseX, mouseY, partialTicks);

    }

    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mx, int my) {
        //super.drawGuiContainerForegroundLayer(matrixStack, x, y);
        if (this.minecraft != null) {
            this.minecraft.fontRenderer.drawText(matrixStack, title, 8, 8, 0xffffff);
        }
        //this.font.drawText(matrixStack, this.playerInventory.getDisplayName(), (float)this.playerInventoryTitleX, (float)this.playerInventoryTitleY + 19.0F, 4210752);

    }


    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        return super.mouseReleased(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mx, int my) {
        if (this.minecraft != null) {
            RenderSystem.color4f(1,1,1,1);
            this.minecraft.getTextureManager().bindTexture(BACK_GROUND);
            int startX = (this.width - this.xSize) / 2;
            int startY = (this.height - this.ySize) / 2;
            this.blit(matrixStack, startX, startY, 0, 0, this.xSize, this.ySize);
        }
    }


}
