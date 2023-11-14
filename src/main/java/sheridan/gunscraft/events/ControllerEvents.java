package sheridan.gunscraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.keybind.KeyBinds;
import sheridan.gunscraft.network.PacketHandler;
import sheridan.gunscraft.network.packets.ReloadGunPacket;

@Mod.EventBusSubscriber
public class ControllerEvents {

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void MouseEvent(InputEvent.RawMouseEvent event) {
        if (Minecraft.getInstance().isGameFocused() && !Minecraft.getInstance().isGamePaused() && Minecraft.getInstance().currentScreen == null) {
            if (Minecraft.getInstance().player == Gunscraft.proxy.getClientPlayer()) {
                PlayerEntity player = Gunscraft.proxy.getClientPlayer();
                if (player != null && !player.isSwimming() && !player.isSpectator()) {
                    ItemStack stackMain = player.getHeldItemMainhand();
                    ItemStack stackOff = player.getHeldItemOffhand();

                    if (stackMain.getItem() instanceof IGenericGun) {
                        if (event.getButton() == 0) {
                            if (event.getAction() == 1) {
                                ClientProxy.leftDown.set(!(ClientTickEvents.reloadingHandler.getReloadTimer() > 0));
                            } else if (event.getAction() == 0) {
                                ClientProxy.leftDown.set(false);
                                ClientProxy.mainHandFireCount = 0;
                            }
                            event.setCanceled(true);
                        } else if (event.getButton() == 1) {
                            if (!shouldNotCancelRightClick()) {
                                if (event.getAction() == 1) {
                                    ClientProxy.rightDown.set(true);
                                } else if (event.getAction() == 0) {
                                    ClientProxy.rightDown.set(false);
                                }
                                event.setCanceled(true);
                            } else {
                                ClientProxy.equipDuration = 5;
                            }
                        }
                    }

                    if (stackOff.getItem() instanceof IGenericGun) {
                        if (event.getButton() == 1) {
                            if (event.getAction() == 1) {
                                ClientProxy.rightDown.set(!(ClientTickEvents.reloadingHandler.getReloadTimer() > 0));
                            } else if (event.getAction() == 0) {
                                ClientProxy.rightDown.set(false);
                                ClientProxy.offHandFireCount = 0;
                            }
                            event.setCanceled(true);
                        }
                    }

                }
            }
        }
    }

    private static boolean shouldNotCancelRightClick() {
        RayTraceResult result = Minecraft.getInstance().objectMouseOver;
        if (result != null && result.getType() == RayTraceResult.Type.ENTITY) {
            EntityRayTraceResult entityRayTraceResult = (EntityRayTraceResult) result;
            return entityRayTraceResult.getEntity() instanceof ItemFrameEntity;
        }
        return false;
    }

    @SubscribeEvent
    public static void onButtonPress(InputEvent.KeyInputEvent event) {
        if(Minecraft.getInstance().player != null) {
            if (KeyBinds.KEY_RELOAD.isKeyDown() && event.getAction() == 1) {
                PlayerEntity player = Minecraft.getInstance().player;
                if (ClientProxy.holdingGunMain.get()) {
                    handleReload(true, player);
                }
                if (ClientProxy.holdingGunOff.get()) {
                    handleReload(false, player);
                }
            }
        }
    }

    private static void handleReload(boolean isMainHand, PlayerEntity player) {
        ItemStack stack = isMainHand ? player.getHeldItemMainhand() : player.getHeldItemOffhand();
        if (stack.getItem() instanceof IGenericGun) {
            IGenericGun gun = (IGenericGun) stack.getItem();
            if (gun.getAmmoLeft(stack) < gun.getMagSize(stack)) {
                if (gun.preReload(stack, player,isMainHand)) {
                    if (isMainHand) {
                        ClientProxy.shouldHandleMain.set(false);
                        ClientProxy.leftDown.set(false);
                    } else {
                        ClientProxy.shouldHandleOff.set(false);
                        ClientProxy.rightDown.set(false);
                    }
                }
            }
        }
    }

}
