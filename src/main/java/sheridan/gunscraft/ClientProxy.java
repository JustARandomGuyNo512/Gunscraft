package sheridan.gunscraft;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationData;
import sheridan.gunscraft.capability.CapabilityHandler;
import sheridan.gunscraft.capability.Serializers;
import sheridan.gunscraft.capability.CapabilityKey;
import sheridan.gunscraft.items.ModItems;
import sheridan.gunscraft.items.guns.IGenericGun;
import sheridan.gunscraft.model.IGunModel;
import sheridan.gunscraft.model.guns.ModelAKM;
import sheridan.gunscraft.model.guns.ModelMac10;
import sheridan.gunscraft.model.guns.ModelMp5;
import sheridan.gunscraft.model.guns.ModelPistol_9mm;
import sheridan.gunscraft.network.PacketHandler;
import sheridan.gunscraft.network.packets.GunFirePacket;
import sheridan.gunscraft.render.TransformData;
import sheridan.gunscraft.render.fx.muzzleFlash.MuzzleFlashTrans;

import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ClientProxy extends CommonProxy{

    public static HashMap<Item, TransformData> transformDataMap = new HashMap<>();
    public static HashMap<Item, IGunModel> modelMap = new HashMap<>();
    public static int equipDuration = 0;
    @OnlyIn(Dist.CLIENT)
    public static Timer timer;
    public static int clientPlayerId;

    public static AtomicBoolean leftDown = new AtomicBoolean(false);
    public static AtomicBoolean rightDown = new AtomicBoolean(false);
    public static AtomicBoolean holdingGunMain = new AtomicBoolean(false);
    public static AtomicBoolean holdingGunOff = new AtomicBoolean(false);
    public static AtomicInteger mainHandShootDelay = new AtomicInteger(1);
    public static AtomicInteger offHandShootDelay = new AtomicInteger(1);
    public static AtomicBoolean shouldHandleMain = new AtomicBoolean(true);
    public static AtomicBoolean shouldHandleOff = new AtomicBoolean(true);
    public static int mainHandFireCount = 0;
    public static int offHandFireCount = 0;

    public static volatile float bulletSpread = 0f;
    public static volatile float minBulletSpread = 0f;
    public static volatile float maxBulletSpread = 0f;

    public static volatile long FPRLastShoot;
    public static volatile long FPLLastShoot;
    public static volatile int armPose;


    public static final CapabilityKey<Boolean> AIMING;
    public static final CapabilityKey<Long> LAST_SHOOT_RIGHT;
    public static final CapabilityKey<Long> LAST_SHOOT_LEFT;


    public static void addSpread(float val) {
        synchronized (Object.class) {
            bulletSpread += val;
        }
    }

    static {
        AIMING = CapabilityKey.builder(Serializers.BOOLEAN).setId(new ResourceLocation(Gunscraft.MOD_ID, "aiming")).defaultValueSupplier(() -> false).resetOnDeath().build();
        LAST_SHOOT_RIGHT = CapabilityKey.builder(Serializers.LONG).setId(new ResourceLocation(Gunscraft.MOD_ID, "last_shoot_right")).defaultValueSupplier(() -> 0L).build();
        LAST_SHOOT_LEFT = CapabilityKey.builder(Serializers.LONG).setId(new ResourceLocation(Gunscraft.MOD_ID, "last_shoot_left")).defaultValueSupplier(() -> 0L).build();

    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void setUpClient(FMLClientSetupEvent event) {
        transformDataMap.put(ModItems.PISTOL_9_MM.get(), new TransformData()
                .setFPRightHand(new float[][]{{2.2f, -5.65f, -11.2f},{0, 0, 0},{2.15f, 2.15f, 2.15f}})
                .setFPLeftHand(new float[][]{{-1.6f, -5.65f, -11.2f},{0, 0, 0},{2.15f, 2.15f, 2.15f}})
                .setTPRightHand(new float[][]{{0f, -2.2f, -1.25f},{0, 0, 0},{1, 1, 1}})
                .setTPLeftHand(new float[][]{{0f, -2.2f, -1.25f},{0, 0, 0},{1, 1, 1}})
                .setFrameTrans(new float[][]{{3f, -5f, -0.25f},{0, -90, 0},{2, 2, 2}})
                .setGroundTrans(new float[][]{{0, -3, -1.5f},{0, 0, 0},{1, 1, 1}})
                .setGUITrans(new float[][]{{3, -5, -0.25f},{0, -90, 0},{2, 2, 2}})
                .setHandPoseRightSideRightHand(new float[][]{{0.325f, 0.37f, 1.09f},{-1.5707963267948966f, -0.049f, 0},{1, 1, 1}})
                .setHandPoseRightSideLeftHand(new float[][]{{-0.115f, 0.69f, 0.8f},{-2.08f, 0.5735987755982f, 0.165f},{1, 1, 1}})
                .setHandPoseLeftSide(new float[][]{{-0.35f, 0.37f, 1.09f},{-1.5707963267948966f, 0, 0},{1, 1, 1}})
                .registerMuzzleFlash("normal", new TransformData.TransPair().setTrans(new MuzzleFlashTrans().setScale(new float[] {0.75f, 0.75f, 0.75f}).setTranslate(new float[]{0, -0.2f, -0.5f})).setName("pistol_simple"))
                .setRecoilAnimationData(new RecoilAnimationData(12f,35f, 22f,
                        0.12f,0.095f,0.11f,
                        7.8f, 0.53f, 0.66f,
                        0.115f,0.095f,0.11f,
                        0.268f, 0.1f, 0.0142f, 0.75f))
        );
        modelMap.put(ModItems.PISTOL_9_MM.get(), new ModelPistol_9mm());

        transformDataMap.put(ModItems.AKM.get(), new TransformData()
                .setFPRightHand(new float[][]{{3.48f, -5.6f, -21.25f},{0, 0, 0},{1.8275f, 1.8275f, 1.8275f}})
                .setFPLeftHand(new float[][]{{0, 0, 0},{0, 0, 0},{0, 0, 0}})
                .setTPRightHand(new float[][]{{0f, -2.9f, -9f},{0, 0, 0},{0.85f, 0.85f, 0.85f}})
                .setTPLeftHand(new float[][]{{0f, -0, -0},{0, 0, 0},{0, 0, 0}})
                .setFrameTrans(new float[][]{{15f, -5f, -0.25f},{0, -90, 0},{1.7f, 1.7f, 1.7f}})
                .setGroundTrans(new float[][]{{0, -3, -6f},{0, 0, 0},{0.85f, 0.85f, 0.85f}})
                .setGUITrans(new float[][]{{6, -3, -0f},{0, -80, 0},{0.9f, 0.9f, 0.9f}})
                .setHandPoseRightSideRightHand(new float[][]{{0.325f, 0.6f, 2.5f},{-1.5707963267948966f, -0.049f, 0},{1.0f, 1.0f, 1.0f}})
                .setHandPoseRightSideLeftHand(new float[][]{{-0.162f, 0.49f, 1.7f},{-1.6580627893947f, 0.26179938779917f,  0.30543261909903f},{1.0f, 1.0f, 1.0f}})
                .setHandPoseLeftSide(new float[][]{{-0, 0, 0},{-0, 0, 0},{0, 0, 0}})
                .registerMuzzleFlash("normal", new TransformData.TransPair().setTrans(new MuzzleFlashTrans().setTranslate(new float[]{0, 0, -1})).setName("pistol_simple"))
                .setRecoilAnimationData(new RecoilAnimationData(20f,14.85f, 11.85f,
                        0.1f,0.0886f,0.1f,
                        1.48f, 0.61f, 0.3f,
                        0.1f,0.0875f,0.1f,
                        0.145f, 0.22f, 0.001f, 0.6f))
        );
        modelMap.put(ModItems.AKM.get(), new ModelAKM());

        transformDataMap.put(ModItems.MP5.get(), new TransformData()
                .setFPRightHand(new float[][]{{3.5f, -5.75f, -15f},{0, 0, 0},{1.892f, 1.892f, 1.892f}})
                .setFPLeftHand(new float[][]{{0, 0, 0},{0, 0, 0},{0, 0, 0}})
                .setTPRightHand(new float[][]{{0f, -3f, -9f},{0, 0, 0},{0.88f, 0.88f, 0.88f}})
                .setTPLeftHand(new float[][]{{0f, -0, -0},{0, 0, 0},{0, 0, 0}})
                .setFrameTrans(new float[][]{{7f, -5f, -0.25f},{0, -90, 0},{1.7f, 1.7f, 1.7f}})
                .setGroundTrans(new float[][]{{0, -3, -6f},{0, 0, 0},{0.88f, 0.88f, 0.88f}})
                .setGUITrans(new float[][]{{3, -3, -0f},{0, -90, 0},{0.9f, 0.9f, 0.9f}})
                .setHandPoseRightSideRightHand(new float[][]{{0.325f, 0.6f, 2.0f},{-1.5707963267948966f, -0.049f, 0},{1.0f, 1.0f, 1.0f}})
                .setHandPoseRightSideLeftHand(new float[][]{{-0.1f, 0.468f, 1.15f},{-1.6580627893947f, 0.26179938779917f,  0.34906585039889f},{1.0f, 1.0f, 1.0f}})
                .setHandPoseLeftSide(new float[][]{{-0, 0, 0},{-0, 0, 0},{0, 0, 0}})
                .registerMuzzleFlash("normal", new TransformData.TransPair().setTrans(new MuzzleFlashTrans().setTranslate(new float[]{0, 0, -1})).setName("pistol_simple"))
                .setRecoilAnimationData(new RecoilAnimationData(12f,12f, 10f,
                        0.1f,0.087f,0.1f,
                        1.2f, 0.41f, 0.18f,
                        0.1f,0.0867f,0.1f,
                        0.145f, 0.15f, 0.001f, 0.32f))
        );
        modelMap.put(ModItems.MP5.get(), new ModelMp5());

        transformDataMap.put(ModItems.MAC10.get(), new TransformData()
                .setFPRightHand(new float[][]{{2.1f, -5.7f, -11.8f},{0, 0, 0},{1.72f, 1.72f, 1.72f}})
                .setFPLeftHand(new float[][]{{0, -0, -0},{0, 0, 0},{0, 0, 0}})
                .setTPRightHand(new float[][]{{0f, -2.35f, -1.26f},{0, 0, 0},{0.8f, 0.8f, 0.8f}})
                .setTPLeftHand(new float[][]{{0f, -0, -0},{0, 0, 0},{0, 0, 0}})
                .setFrameTrans(new float[][]{{3f, -5f, -0.25f},{0, -90, 0},{1.6f, 1.6f, 1.6f}})
                .setGroundTrans(new float[][]{{0, -3, -1.5f},{0, 0, 0},{0.8f, 0.8f, 0.8f}})
                .setGUITrans(new float[][]{{3, -5, -0.25f},{0, -90, 0},{1.6f, 1.6f, 1.6f}})
                .setHandPoseRightSideRightHand(new float[][]{{0.325f, 0.49f, 1.2f},{-1.5707963267948966f, -0.049f, 0},{1, 1, 1}})
                .setHandPoseRightSideLeftHand(new float[][]{{-0.125f, 0.77f, 0.8f},{-2.08f, 0.5735987755982f, 0.165f},{1, 1, 1}})
                .setHandPoseLeftSide(new float[][]{{-0, 0, 0},{-0, 0, 0},{0, 0, 0}})
                .registerMuzzleFlash("normal", new TransformData.TransPair().setTrans(new MuzzleFlashTrans().setScale(new float[] {1f, 1f, 1f}).setTranslate(new float[]{0, -0.75f, -1f})).setName("pistol_simple"))
                .setRecoilAnimationData(new RecoilAnimationData(8f,14f, 8.5f,
                        0.11f,0.0885f,0.1f,
                        4.8f, 0.55f, 0.31f,
                        0.11f,0.088f,0.1f,
                        0.15f, 0.1f, 0.0087f, 0.52f))
        );
        modelMap.put(ModItems.MAC10.get(), new ModelMac10());


        timer = new Timer();
        timer.schedule(new ClientTicker(), 0, 10L);

        CapabilityHandler.instance().registerKey(AIMING);
        CapabilityHandler.instance().registerKey(LAST_SHOOT_RIGHT);
        CapabilityHandler.instance().registerKey(LAST_SHOOT_LEFT);
    }

    @Override
    public void perInit() {
        super.perInit();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean shouldRenderCustom(ItemStack stack, IGenericGun gun, LivingEntity entity, boolean isMainHand) {
        if (!modelMap.containsKey(stack.getItem())) {
            return false;
        }
        if (isMainHand) {
            return true;
        } else {
            if (!gun.canHoldInOneHand()) {
                return false;
            }
            if (entity != null && entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity) entity;
                ItemStack stackMain = player.getHeldItemMainhand();
                if (stackMain.getItem() instanceof IGenericGun) {
                    IGenericGun gunMain = (IGenericGun) stackMain.getItem();
                    return gunMain.canHoldInOneHand();
                } else {
                    return true;
                }
            }
        }
        return modelMap.containsKey(stack.getItem());
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }

    @OnlyIn(Dist.CLIENT)
    public static void tryFireMain() {
        tryFire(true, System.currentTimeMillis() - FPRLastShoot);
    }

    @OnlyIn(Dist.CLIENT)
    public static void tryFireOff() {
        tryFire(false, System.currentTimeMillis() - FPLLastShoot);
    }

    @OnlyIn(Dist.CLIENT)
    public static void tryFire(boolean mainHand, long dis) {
        Minecraft minecraft = Minecraft.getInstance();
        PlayerEntity player = minecraft.player;
        if (player != null) {
            ItemStack stack = mainHand? player.getHeldItemMainhand() : player.getHeldItemOffhand();
            if (stack.getItem() instanceof IGenericGun) {
                IGenericGun gun = (IGenericGun) stack.getItem();
                if (gun.preShoot(stack, player, mainHand)) {
                    int fireCount = mainHand ? mainHandFireCount : offHandFireCount;
                    float spread = ClientProxy.bulletSpread;
                    int fireDelay = mainHand ? mainHandShootDelay.get() : offHandShootDelay.get();
                    int fireFactor = fireDelay * 10 * (gun.isPistol() ? 4 : 8);
                    if (fireCount == 0 && !gun.isFreeBlot() && dis > fireFactor) {
                        spread *= 0.25f;
                    }
                    gun.shoot(stack, player, true, spread);
                    PacketHandler.CommonChannel.sendToServer(new GunFirePacket(mainHand, spread));
                    if (mainHand) {
                        mainHandFireCount ++;
                    } else {
                        offHandFireCount ++;
                    }
                }
            }
        }
    }

    public static void updatePlayerData(int entityId, List<CapabilityHandler.Pair<?>> pairs) {
        World world = Minecraft.getInstance().world;
        if(world != null) {
            Entity entity = world.getEntityByID(entityId);
            if(entity != null && entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity) entity;
                for (CapabilityHandler.Pair<?> pair : pairs) {
                    CapabilityHandler.instance().updateClientEntry(player, pair);
                }
            }
        }
    }

}
