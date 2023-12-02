package sheridan.gunscraft.events;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.network.FMLConnectionData;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationHandler;
import sheridan.gunscraft.animation.recoilAnimation.RecoilCameraHandler;
import sheridan.gunscraft.items.guns.IGenericGun;


@Mod.EventBusSubscriber
public class PlayerEvents {
    public static final float OFF_HAND_SPREAD_FACTOR = 1.35f;
    public static final float CROUCHING_SPREAD_FACTOR = 0.5f;

    public static final int TWO_HAND_PISTOL = 0,
                            RIGHT_HAND_PISTOL = 1,
                            LEFT_HAND_PISTOL = 2,
                            DOUBLE_PISTOL = 3,
                            RIFLE = 4;


    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        if (player.getEntityId() == ClientProxy.clientPlayerId) {
            ItemStack stackMain = player.getHeldItemMainhand();
            ItemStack stackOff = player.getHeldItemOffhand();
            updateRecoilAnimationHandler(stackMain, stackOff);
            updateClientHoldingGun(stackMain, stackOff);
            updateClientArmPose(stackMain, stackOff);
            updateClientFireDelay(stackMain, stackOff);
            updateClientSpread(player, stackMain, stackOff);
        }
    }

    public static void updateRecoilAnimationHandler(ItemStack stackMain, ItemStack stackOff) {
        if (!(stackMain.getItem() instanceof IGenericGun)) {
            RecoilAnimationHandler.clear(true);
        }
        if (!(stackOff.getItem() instanceof IGenericGun)) {
            RecoilAnimationHandler.clear(false);
        }
    }

    @SubscribeEvent
    public static void playerJump(LivingEvent.LivingJumpEvent event) {
        if (event.getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntity();
            if (player.getEntityId() == ClientProxy.clientPlayerId) {
                ClientProxy.addSpread(0.5f);
            }
        }
    }

    public static void updateClientSpread(PlayerEntity entity, ItemStack stackMain, ItemStack stackOff) {
        float minSpread = 0;
        float maxSpread = 0;
        if (stackMain.getItem() instanceof IGenericGun) {
            IGenericGun gun = (IGenericGun) stackMain.getItem();
            minSpread += gun.getMinSpread(stackMain);
            maxSpread += gun.getMaxSpread(stackMain);
        }
        if (stackOff.getItem() instanceof IGenericGun) {
            IGenericGun gun = (IGenericGun) stackOff.getItem();
            minSpread += gun.getMinSpread(stackOff) * OFF_HAND_SPREAD_FACTOR;
            maxSpread += gun.getMaxSpread(stackOff) * OFF_HAND_SPREAD_FACTOR;
        }
        if (entity.isCrouching()) {
            minSpread *= CROUCHING_SPREAD_FACTOR;
            maxSpread *= CROUCHING_SPREAD_FACTOR;
        }
        if (entity.moveForward != 0 || entity.moveStrafing != 0 || entity.moveVertical != 0) {
            minSpread *= 1.5f;
            maxSpread *= 1.5f;
            minSpread += 0.2f;
            maxSpread += 0.2f;
        }
        float fallFactor = entity.fallDistance < 10 ? entity.fallDistance * 0.15f : 1.5f;
        if (entity.jumpMovementFactor > 0.02f) {
            minSpread *= 1.5f;
            maxSpread *= 1.5f;
        }
        minSpread += fallFactor;
        maxSpread += fallFactor;
        ClientProxy.minBulletSpread = minSpread;
        ClientProxy.maxBulletSpread = maxSpread;

    }

    public static void updateClientHoldingGun(ItemStack stackMain, ItemStack stackOff) {
        boolean isGunMain = stackMain.getItem() instanceof IGenericGun;
        boolean isGunOff = stackOff.getItem() instanceof IGenericGun;
        ClientProxy.mainHandStatus.holdingGun.set(isGunMain);
        IGenericGun gunMain = null;
        IGenericGun gunOff = null;
        if (isGunMain) {
            gunMain = (IGenericGun) stackMain.getItem();
            ClientProxy.mainHandStatus.shouldHandle.set(gunMain.getAmmoLeft(stackMain) - 1 >= 0);
            ClientProxy.mainHandStatus.aimingSpeed = gunMain.getAimingSpeed(stackMain);
            ClientProxy.mainHandStatus.isPistol = gunMain.isPistol();
        } else {
            ClientProxy.mainHandStatus.shouldHandle.set(false);
            ClientProxy.mainHandStatus.aiming = false;
            //RenderEvents.cameraHandler.clear();
        }
        if (isGunOff) {
            gunOff = (IGenericGun) stackOff.getItem();
            if (!gunOff.canHoldInOneHand()) {
                isGunOff = false;
            }
        }
        if (isGunOff && isGunMain) {
            gunMain = (IGenericGun) stackMain.getItem();
            if (!gunMain.canHoldInOneHand()) {
                isGunOff = false;
            }
        }
        if (isGunOff) {
            gunOff = (IGenericGun) stackOff.getItem();
            ClientProxy.offHandStatus.shouldHandle.set(gunOff.getAmmoLeft(stackOff) -1 >= 0);
            ClientProxy.offHandStatus.isPistol = gunOff.isPistol();
        } else {
            ClientProxy.offHandStatus.shouldHandle.set(false);

        }
        ClientProxy.offHandStatus.holdingGun.set(isGunOff);
        updateRecoil(gunMain, gunOff, stackMain, stackOff, isGunMain, isGunOff);
    }

    private static void updateRecoil(IGenericGun gun, IGenericGun gunOff, ItemStack stack, ItemStack stackOff, boolean holdingGunMain, boolean holdingGunOff) {
        RecoilCameraHandler handler = RenderEvents.cameraHandler;
        if (holdingGunMain || holdingGunOff) {
           if (holdingGunMain) {
               handler.speedDec = gun.getRecoilDec(stack);
           } else {
               handler.speedDec = gunOff.getRecoilDec(stackOff);
           }
            return;
        }
        handler.clear();
    }

    private static void updateClientFireDelay(ItemStack stackMain, ItemStack stackOff) {
        if (stackMain.getItem() instanceof IGenericGun) {
            IGenericGun gunMain = (IGenericGun) stackMain.getItem();
            int fireDelayMain = gunMain.getShootDelay();
            ClientProxy.mainHandStatus.shootDelay.set(fireDelayMain);
        }

        if (stackOff.getItem() instanceof IGenericGun) {
            IGenericGun gunOff = (IGenericGun) stackOff.getItem();
            int fireDelayOff = gunOff.getShootDelay();
            ClientProxy.offHandStatus.shootDelay.set(fireDelayOff);
        }
    }

    private static void updateClientArmPose(ItemStack stackMain, ItemStack stackOff) {
        int tempPose = PlayerEvents.TWO_HAND_PISTOL;
        int prevArmPose = ClientProxy.armPose;
        if (stackMain.getItem() instanceof IGenericGun && stackOff.getItem() instanceof IGenericGun) {
            IGenericGun gunMain = (IGenericGun) stackMain.getItem();
            if (!gunMain.canHoldInOneHand()) {
                tempPose = RIFLE;
            } else {
                IGenericGun gunOff = (IGenericGun) stackOff.getItem();
                if (gunOff.canHoldInOneHand()) {
                    tempPose = DOUBLE_PISTOL;
                }
            }
        } else if (stackMain.getItem() instanceof IGenericGun && !(stackOff.getItem() instanceof IGenericGun)) {
            IGenericGun gunMain = (IGenericGun) stackMain.getItem();
            if (!gunMain.canHoldInOneHand()) {
                tempPose = RIFLE;
            } else {
                if (stackOff.getItem() != Items.AIR) {
                    tempPose = RIGHT_HAND_PISTOL;
                }
            }
        } else if (!(stackMain.getItem() instanceof IGenericGun) && stackOff.getItem() instanceof IGenericGun) {
            IGenericGun gunOff = (IGenericGun) stackOff.getItem();
            if (gunOff.canHoldInOneHand()) {
                tempPose = LEFT_HAND_PISTOL;
            }
        }
        if (tempPose != prevArmPose) {
            ClientProxy.armPose = tempPose;
        }
    }

}
