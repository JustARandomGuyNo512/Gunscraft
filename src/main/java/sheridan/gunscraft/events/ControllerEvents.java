package sheridan.gunscraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.Config;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.keybind.KeyBinds;
import sheridan.gunscraft.network.PacketHandler;
import sheridan.gunscraft.network.packets.AttachmentGuiPacket;
import sheridan.gunscraft.network.packets.ReloadGunPacket;
import sheridan.gunscraft.network.packets.SwitchFireModePacket;

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

                    boolean holdGunMain = stackMain.getItem() instanceof IGenericGun;
                    IGenericGun gunMain = holdGunMain ? (IGenericGun) stackMain.getItem() : null;
                    boolean holdGunOff = stackOff.getItem() instanceof IGenericGun;
                    if (holdGunMain) {
                        if (!gunMain.canHoldInOneHand()) {
                            holdGunOff = false;
                        }
                    }
                    IGenericGun gunOff = holdGunOff ? (IGenericGun) stackOff.getItem() : null;

                    if (event.getButton() == 0) {
                        if (event.getAction() == 1) {
                            if (holdGunMain) {
                                ClientProxy.mainHandStatus.buttonDown.set(!(ClientTickEvents.reloadingHandler.getReloadTimer() > 0));
                            }
                        } else if (event.getAction() == 0) {
                            ClientProxy.mainHandStatus.buttonDown.set(false);
                            ClientProxy.mainHandStatus.fireCount = 0;
                        }
                        if (holdGunMain) {
                            event.setCanceled(true);
                        }
                    }
                    if (event.getButton() == 1) {
                        if (!shouldNotCancelRightClick()) {
                            if (event.getAction() == 1) {
                               if (holdGunOff) {
                                   ClientProxy.offHandStatus.buttonDown.set(!(ClientTickEvents.reloadingHandler.getReloadTimer() > 0));
                               } else {
                                   if (holdGunMain) {
                                       // System.out.println("main hand start aiming");
                                       ClientProxy.mainHandStatus.aiming = true;
                                       event.setCanceled(true);
                                   }
                               }
                            } else if (event.getAction() == 0) {
                                if (holdGunOff) {
                                    ClientProxy.offHandStatus.buttonDown.set(false);
                                    ClientProxy.offHandStatus.fireCount = 0;
                                } else {
                                    if (holdGunMain) {
                                        // System.out.println("main hand stop aiming");
                                        ClientProxy.mainHandStatus.aiming = false;
                                        event.setCanceled(true);
                                    }
                                }
                            }
                            if (holdGunOff) {
                                event.setCanceled(true);
                            }
                        } else {
                            ClientProxy.equipDuration = 5;
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
            PlayerEntity player = Minecraft.getInstance().player;
            if (KeyBinds.KEY_RELOAD.isKeyDown() && event.getAction() == 1) {
                if (ClientProxy.mainHandStatus.holdingGun.get()) {
                    handleReload(true, player);
                }
                if (ClientProxy.offHandStatus.holdingGun.get()) {
                    handleReload(false, player);
                }
            }
            if (KeyBinds.KEY_SWITCH_FIRE_MODE.isKeyDown() && event.getAction() == 1) {
                boolean playSound = false;
                if (player.getHeldItemMainhand().getItem() instanceof IGenericGun) {
                    ClientProxy.offHandStatus.buttonDown.set(false);
                    ClientProxy.mainHandStatus.shouldHandle.set(false);
                    PacketHandler.CommonChannel.sendToServer(new SwitchFireModePacket(true));
                    playSound = true;
                } else {
                    if (ClientProxy.offHandStatus.holdingGun.get()) {
                        ClientProxy.mainHandStatus.buttonDown.set(false);
                        ClientProxy.offHandStatus.shouldHandle.set(false);
                        PacketHandler.CommonChannel.sendToServer(new SwitchFireModePacket(false));
                        playSound = true;
                    }
                }
                if (playSound) {
                    if (player.world != null) {
                       player.world.playSound(player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.PLAYERS, 0.8f, 1.37f, false);
                    }
                }
            }

            if (KeyBinds.KEY_SHOW_ATTACHMENTS_GUI.isKeyDown() && event.getAction() == 1 && Minecraft.getInstance().currentScreen == null) {
                System.out.println("key pressed");
                PacketHandler.CommonChannel.sendToServer(new AttachmentGuiPacket());
            }

            if (Config.isInDebug) {
                handleDebugKeys(event);
            }

        }
    }

    private static void handleDebugKeys(InputEvent.KeyInputEvent event) {
        if (KeyBinds.KEY_DEBUG_X_ADD.isKeyDown()) {
            ClientProxy.debugX += ClientProxy.debugAccuracy;
            System.out.println(ClientProxy.debugX);
        }
        if (KeyBinds.KEY_DEBUG_X_DEC.isKeyDown()) {
            ClientProxy.debugX -= ClientProxy.debugAccuracy;
            System.out.println(ClientProxy.debugX);
        }
        if (KeyBinds.KEY_DEBUG_Y_ADD.isKeyDown()) {
            ClientProxy.debugY += ClientProxy.debugAccuracy;
            System.out.println(ClientProxy.debugY);
        }
        if (KeyBinds.KEY_DEBUG_Y_DEC.isKeyDown()) {
            ClientProxy.debugY -= ClientProxy.debugAccuracy;
            System.out.println(ClientProxy.debugY);
        }

        if (KeyBinds.KEY_DEBUG_Z_ADD.isKeyDown()) {
            ClientProxy.debugZ += ClientProxy.debugAccuracy;
            System.out.println(ClientProxy.debugZ);
        }
        if (KeyBinds.KEY_DEBUG_Z_DEC.isKeyDown()) {
            ClientProxy.debugZ -= ClientProxy.debugAccuracy;
            System.out.println(ClientProxy.debugZ);
        }

        if (KeyBinds.KEY_DEBUG_HIGH_ACCURACY.isKeyDown() && event.getAction() == 1) {
            float acc = ClientProxy.debugAccuracy;
            ClientProxy.debugAccuracy = acc == 0.01f ? 0.001f : 0.01f;
        }

        if (KeyBinds.KEY_DEBUG_TRANS_CLEAR.isKeyDown() && event.getAction() == 1) {
            ClientProxy.debugY = 0;
            ClientProxy.debugX = 0;
            ClientProxy.debugZ = 0;
        }

        if (KeyBinds.KEY_DEBUG_PRINT_TRANS.isKeyDown() && event.getAction() == 1) {
            System.out.println(ClientProxy.debugX + " " + ClientProxy.debugY + " " + ClientProxy.debugZ + " " + ClientProxy.debugAccuracy);
        }
    }



    private static void handleReload(boolean isMainHand, PlayerEntity player) {
        ItemStack stack = isMainHand ? player.getHeldItemMainhand() : player.getHeldItemOffhand();
        if (stack.getItem() instanceof IGenericGun) {
            IGenericGun gun = (IGenericGun) stack.getItem();
            if (gun.getAmmoLeft(stack) < gun.getMagSize(stack)) {
                if (gun.preReload(stack, player,isMainHand)) {
                    if (isMainHand) {
                        ClientProxy.mainHandStatus.shouldHandle.set(false);
                        ClientProxy.mainHandStatus.buttonDown.set(false);
                    } else {
                        ClientProxy.offHandStatus.shouldHandle.set(false);
                        ClientProxy.offHandStatus.buttonDown.set(false);
                    }
                }
            }
        }
    }

}
