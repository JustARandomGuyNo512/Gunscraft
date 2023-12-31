package sheridan.gunscraft.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.gui.screen.inventory.InventoryScreen;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.lwjgl.opengl.GL11;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.container.AttachmentContainer;
import sheridan.gunscraft.items.attachments.GenericAttachment;
import sheridan.gunscraft.items.attachments.IGenericAttachment;
import sheridan.gunscraft.items.attachments.util.GunAttachmentSlot;
import sheridan.gunscraft.items.attachments.util.NBTAttachmentsMap;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.network.PacketHandler;
import sheridan.gunscraft.network.packets.GiveBackItemPacket;
import sheridan.gunscraft.network.packets.SetAttachmentPacket;

import java.util.List;

public class AttachmentScreen extends ContainerScreen<AttachmentContainer> {
    public static final ResourceLocation BACK_GROUND = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/screen/attachment_screen.png");
    private static final ResourceLocation DRAG_BUTTON = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/screen/drag_button.png");
    private static final ResourceLocation RESET_BUTTON = new ResourceLocation(Gunscraft.MOD_ID, "textures/gui/screen/reset_button.png");
    private final TranslationTextComponent title = new TranslationTextComponent("container.gunscraft.attachments");

    private ItemStack heldStack;

    @Override
    public void onClose() {
        if (attachmentInventory != null) {
            ItemStack attachment = attachmentInventory.getStackInSlot(0);
            if (!attachment.isEmpty()) {
                PacketHandler.CommonChannel.sendToServer(new GiveBackItemPacket(Item.getIdFromItem(attachment.getItem()), attachment.getCount()));
            }
        }
        super.onClose();
    }

    private IInventory inventory;
    private IInventory attachmentInventory;
    private List<GunAttachmentSlot> slots;
    private int selectedIndex = 0;
    private GunAttachmentSlot selectedSlot;
    private IGenericGun gun;
    private int maxIndex;
    private AttachmentContainer container;

    private boolean isMouseDruggingModel = false;
    private float modelRX;
    private float modelRY;
    private float tempModelRX;
    private float tempModelRY;
    private float dragStartX;
    private float dragStartY;
    private float dragX;
    private float dragY;
    private float tempDragX;
    private float tempDragY;
    private float scaleZoom;
    private float zoomMax = 50f;
    private float zoomMin = -50f;
    private boolean isResetBtnDown = false;
    private boolean isDragBtnDown = false;

    public AttachmentScreen(AttachmentContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        this.inventory = screenContainer.playerInventory;
        this.attachmentInventory = screenContainer.attachmentInventory;
        this.container = screenContainer;
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double delta) {
        if (isMouseInModelArea(mouseX, mouseY)) {
            scaleZoom += delta;
            if (scaleZoom > zoomMax) {
                scaleZoom = zoomMax;
            }
            if (scaleZoom < zoomMin) {
                scaleZoom = zoomMin;
            }
            return false;
        }
        return super.mouseScrolled(mouseX, mouseY, delta);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (slots != null && slots.size() >= 1) {
            switch (keyCode) {
                case 263:
                    selectedIndex = selectedIndex - 1 < 0 ? maxIndex : selectedIndex - 1;
                    break;
                case 262:
                    selectedIndex ++;
                    break;
                case 265:
                    handleAttachmentChange(true);
                    break;
                case 264:
                    handleAttachmentChange(false);
                    break;
            }
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    private void handleAttachmentChange(boolean install) {
        if (install) {
            ItemStack stack = attachmentInventory.getStackInSlot(0);
            System.out.println("000");
            if (stack.getItem() instanceof IGenericAttachment) {
                System.out.println("111");
                IGenericAttachment attachment = (IGenericAttachment) stack.getItem();
                String slotName = selectedSlot.name;
                ItemStack gunStack = this.minecraft.player.getHeldItemMainhand();
                if (gunStack.getItem() instanceof IGenericGun) {
                    IGenericGun gun = (IGenericGun) gunStack.getItem();
                    if (NBTAttachmentsMap.set(slotName, attachment.getID(), gunStack, gun) != null) {
                        PacketHandler.CommonChannel.sendToServer(new SetAttachmentPacket(attachment.getID(), slotName));
                        attachmentInventory.setInventorySlotContents(0, ItemStack.EMPTY);
                        attachmentInventory.markDirty();
                    }
                }
            }
        } else {
            ItemStack gunStack = this.minecraft.player.getHeldItemMainhand();
            if (gunStack.getItem() instanceof IGenericGun) {
                IGenericGun gun = (IGenericGun) gunStack.getItem();
                IGenericAttachment attachment = NBTAttachmentsMap.set(selectedSlot.name, GenericAttachment.NONE, gunStack, gun);
                if (attachment != null) {
                    PacketHandler.CommonChannel.sendToServer(new SetAttachmentPacket(GenericAttachment.NONE, selectedSlot.name));
                    PacketHandler.CommonChannel.sendToServer(new GiveBackItemPacket(attachment.getItemId(), 1));
                }
            }
        }
    }

    @Override
    public void tick() {
        PlayerEntity player = this.minecraft.player;
        if (player == null) {
            this.closeScreen();
        }
        if (this.minecraft != null) {
            ItemStack stack = player.getHeldItemMainhand();
            if (!(stack.getItem() instanceof IGenericGun)) {
                this.closeScreen();
                super.closeScreen();
                this.minecraft.displayGuiScreen(null);
                return;
            } else {
                if (heldStack != stack) {
                    heldStack = stack;
                    clearData();
                }
                if (gun == null || slots == null) {
                    this.gun = (IGenericGun) stack.getItem();
                    slots = gun.getAllSlots();
                    if (slots != null && slots.size() >= 1) {
                        selectedSlot = slots.get(0);
                        maxIndex = slots.size() - 1;
                    }
                }
            }
            this.minecraft.displayGuiScreen(this);
        }
        if (slots != null && slots.size() >= 1) {
            selectedSlot = slots.get(selectedIndex % slots.size());
        }
        super.tick();
    }

    private void clearData() {
        gun = null;
        slots = null;
        selectedIndex = 0;
        maxIndex = 0;
        selectedSlot = null;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        renderHoveredTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double dragX, double dragY) {
        if (isMouseDruggingModel) {
            modelRY = tempModelRY + (float) (mouseX - dragStartX);
            modelRX = tempModelRX + (float) (mouseY - dragStartY);
            return false;
        }
        if (isDragBtnDown) {
            this.dragX = tempDragX + (float) (mouseX - dragStartX) * 0.5f;
            this.dragY = tempDragY + (float) (mouseY - dragStartY) * 0.5f;
            return false;
        } else {
            return super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
        }
    }

    private void renderGun(float posX, float posY, float scale, LivingEntity livingEntity) {
        ItemStack stack = livingEntity.getHeldItemMainhand();
        if (stack.getItem() instanceof IGenericGun) {
            IGenericGun gun = (IGenericGun) stack.getItem();
            RenderSystem.pushMatrix();
            GL11.glEnable(GL11.GL_SCISSOR_TEST);
            renderInWindow((this.width - this.xSize) / 2 + 7,
                    (this.height - this.ySize) / 2 + 7, 176 - 15, 79 - 7);
            RenderSystem.translatef(posX, posY, 1850.0F);
            RenderSystem.scalef(1.0F, 1.0F, -1.0F);
            MatrixStack matrixstack = new MatrixStack();
            matrixstack.translate(0.0D + dragX, 0.0D + dragY, 1050.0D);
            float scaleFactor = gun.isPistol() ? 1.5f : 1f;
            matrixstack.scale(scale * scaleFactor + scaleZoom, scale * scaleFactor + scaleZoom, scale * scaleFactor + scaleZoom);
            Quaternion rz = Vector3f.ZP.rotationDegrees(180.0F);
            Quaternion ry = Vector3f.YP.rotationDegrees(90F + modelRY);
            Quaternion rx = Vector3f.XP.rotationDegrees( - modelRX);
            rz.multiply(ry);
            matrixstack.rotate(rz);
            matrixstack.rotate(rx);
            IRenderTypeBuffer.Impl buffer = Minecraft.getInstance().getRenderTypeBuffers().getBufferSource();
            RenderSystem.color4f(1,1,1,1);
            ClientProxy.renderer.renderInGuiScreen(stack, matrixstack, gun, ClientProxy.gunModelMap.get(stack.getItem()), selectedSlot);
            buffer.finish();
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            RenderSystem.popMatrix();
        }
    }

    public static void renderInWindow(int x, int y, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        int scale = (int)mc.getMainWindow().getGuiScaleFactor();
        GL11.glScissor(x * scale, mc.getMainWindow().getHeight() - y * scale - height * scale,
                Math.max(0, width * scale), Math.max(0, height * scale));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mx, int my) {
        if (this.minecraft != null) {
            this.minecraft.fontRenderer.drawText(matrixStack, title, 8, 8, 0xffffff);
            PlayerEntity player = minecraft.player;
            if (player != null) {
                renderGun(175 / 2f, 42, 75f, this.minecraft.player);
            }
        }

    }


    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        if (isMouseDruggingModel) {
            isMouseDruggingModel = false;
            tempModelRY = modelRY % 360;
            tempModelRX = modelRX % 360;
            return false;
        }
        if (isResetBtnDown) {
            isResetBtnDown = false;
            if (isMouseInResetArea(mouseX, mouseY)) {
                clear();
            }
            return false;
        }
        if (isDragBtnDown) {
            tempDragX = dragX;
            tempDragY = dragY;
            isDragBtnDown = false;
            return false;
        }
        return super.mouseReleased(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (isMouseInModelArea(mouseX, mouseY)) {
            isMouseDruggingModel = true;
            dragStartX = (float) mouseX;
            dragStartY = (float) mouseY;
            return false;
        } else if (isMouseInResetArea( mouseX, mouseY)) {
            isResetBtnDown = true;
            return false;
        } else if (isMouseInDragArea(mouseX, mouseY)) {
            dragStartX = (float) mouseX;
            dragStartY = (float) mouseY;
            isDragBtnDown = true;
            return false;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    private void clear() {
        dragStartY = 0;
        dragStartX = 0;
        modelRY = 0;
        modelRX = 0;
        scaleZoom = 0;
        tempModelRX = 0;
        tempModelRY = 0;
        tempDragY = 0;
        tempDragX = 0;
        dragY = 0;
        dragX = 0;
    }

    private boolean isMouseInModelArea(double mx, double my) {
        if (isMouseInDragArea(mx, my) || isMouseInResetArea(mx, my) || isMouseInAttachmentSlotArea(mx, my)) {
            return false;
        }
        float sx = (this.width - this.xSize) / 2f;
        float sy = (this.height - this.ySize) / 2f;
        return mx > sx + 8 && mx < sx + 167 && my > sy + 8 && my < sy + 80;
    }

    private boolean isMouseInDragArea(double mx, double my) {
        float sx = (this.width - this.xSize) / 2f;
        float sy = (this.height - this.ySize) / 2f;
        return mx > sx + 150 && mx <  sx + 166 && my > sy + 8 && my < sy + 24;
    }

    private boolean isMouseInResetArea(double mx, double my) {
        float sx = (this.width - this.xSize) / 2f;
        float sy = (this.height - this.ySize) / 2f;
        return mx > sx + 150 && mx <  sx + 166 && my > sy + 32 && my < sy + 48;
    }

    private boolean isMouseInAttachmentSlotArea(double mx, double my) {
        float sx = (this.width - this.xSize) / 2f;
        float sy = (this.height - this.ySize) / 2f;
        return mx > sx + 152 && mx <  sx + 170 && my > sy + 63 && my < sy + 81;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mx, int my) {
        if (this.minecraft != null) {
            RenderSystem.color4f(1,1,1,1);
            this.minecraft.getTextureManager().bindTexture(BACK_GROUND);
            int startX = (this.width - this.xSize) / 2;
            int startY = (this.height - this.ySize) / 2;
            this.blit(matrixStack, startX, startY, 0, 0, this.xSize, this.ySize);

            if (isDragBtnDown) {
                RenderSystem.color4f(0.5f,1,1,1f);
            }
            this.minecraft.getTextureManager().bindTexture(DRAG_BUTTON);
            blit(matrixStack, startX + 150, startY + 8,16,16, 0, 0,32,32,32,32);
            RenderSystem.color4f(1,1,1,1f);


            this.minecraft.getTextureManager().bindTexture(RESET_BUTTON);
            if (isResetBtnDown) {
                RenderSystem.color4f(0.5f,1,1,1f);
            }
            blit(matrixStack, startX + 150, startY + 32,16,16, 0, 0,32,32,32,32);
            RenderSystem.color4f(1,1,1,1f);
        }
    }


}
