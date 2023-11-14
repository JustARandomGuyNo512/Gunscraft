package sheridan.gunscraft.items.guns;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import sheridan.gunscraft.ClientProxy;
import sheridan.gunscraft.animation.recoilAnimation.RecoilAnimationHandler;
import sheridan.gunscraft.capability.CapabilityHandler;
import sheridan.gunscraft.entities.EntityRegister;
import sheridan.gunscraft.entities.projectile.GenericProjectile;
import sheridan.gunscraft.events.ClientTickEvents;
import sheridan.gunscraft.items.BaseItem;
import sheridan.gunscraft.render.GenericGunRenderer;
import sheridan.gunscraft.render.TransformData;
import sheridan.gunscraft.sounds.SoundEvents;

public class GenericGun extends BaseItem implements IGenericGun{
    public static final int SEMI = 0, BURST = 1, AUTO = 2, CHARGE = 3;


    public int baseMagSize;
    public ResourceLocation[] textures;
    public boolean canHoldInOneHand;
    public int[] fireModes;
    public float baseSpread;
    public float maxSpread;
    public float spreadPreShoot;
    public float bulletSpeed;
    public float baseDamage;
    public float minDamage;
    public int bulletLifeLength;
    public int shootDelay;
    public String normalFireSound;
    public float[] soundArgs;
    public boolean isFreeBlot;
    public boolean isPistol;
    public int reloadLength;

    public GenericGun(Properties properties, int baseMagSize,boolean canHoldInOneHand,
                      ResourceLocation[] textures, int[] fireModes,
                      float baseSpread, float maxSpread, float spreadPreShoot, float bulletSpeed,
                      float baseDamage, float minDamage, int bulletLifeLength, int shootDelay, String normalFireSound,
                      float[] soundArgs, boolean isFreeBlot, boolean isPistol, int reloadLength) {
        super(properties);
        this.baseMagSize = baseMagSize;
        this.textures = textures;
        this.canHoldInOneHand = canHoldInOneHand;
        this.fireModes = fireModes;
        this.baseSpread = baseSpread;
        this.maxSpread = maxSpread;
        this.spreadPreShoot = spreadPreShoot;
        this.bulletSpeed = bulletSpeed;
        this.baseDamage = baseDamage;
        this.minDamage = minDamage;
        this.bulletLifeLength = bulletLifeLength;
        this.shootDelay = shootDelay;
        this.normalFireSound = normalFireSound;
        this.soundArgs = soundArgs;
        this.isFreeBlot = isFreeBlot;
        this.isPistol = isPistol;
        this.reloadLength = reloadLength;
    }

    @Override
    public ResourceLocation getTexture(int index) {
        return textures[index % textures.length];
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        ItemStack mainHandStack = Minecraft.getInstance().player != null ? Minecraft.getInstance().player.getHeldItemMainhand() : null;
        if (oldStack.getItem() != newStack.getItem() || slotChanged && (mainHandStack == newStack)) {
            ClientProxy.equipDuration = 5;
        }
        if (ClientProxy.equipDuration > 0) {
            ClientProxy.equipDuration --;
        }
        int reloadTick = ClientTickEvents.reloadingHandler.getReloadTimer();
        if (reloadTick > 0) {
            return true;
        }
        if (mainHandStack == newStack) {
            return ClientProxy.equipDuration > 0;
        }
        return oldStack.getItem() != newStack.getItem() || slotChanged;
    }

    @Override
    public int getCurrentTextureIndex(ItemStack stack) {
        return 0;
    }

    @Override
    public boolean preShoot(ItemStack stack, LivingEntity entity, boolean mainHand) {
        int ammoLeft = getAmmoLeft(stack);
        boolean canPass = ammoLeft > 0;
        if (canPass) {
            TransformData transformData = ClientProxy.transformDataMap.get(stack.getItem());
            if (mainHand) {
                CapabilityHandler.instance().set((PlayerEntity) entity, ClientProxy.LAST_SHOOT_RIGHT, System.currentTimeMillis());
                ClientProxy.FPRLastShoot = System.currentTimeMillis();
                //GenericGunRenderer.recoilAnimationState.onShoot(System.currentTimeMillis(), transformData.getRecoilAnimationData());
            } else {
                CapabilityHandler.instance().set((PlayerEntity) entity, ClientProxy.LAST_SHOOT_LEFT, System.currentTimeMillis());
                ClientProxy.FPLLastShoot = System.currentTimeMillis();
            }
            RecoilAnimationHandler.onShoot(System.currentTimeMillis(), transformData.getRecoilAnimationData(), mainHand);
            int fireMode = getFireMode(stack);
            if (fireMode == SEMI) {
                if (mainHand) {
                    ClientProxy.leftDown.set(false);
                    ClientProxy.mainHandFireCount = 0;
                } else {
                    ClientProxy.rightDown.set(false);
                    ClientProxy.offHandFireCount = 0;
                }
            }
            float shootSpread = entity.isCrouching() ? this.spreadPreShoot * 0.7f : this.spreadPreShoot;
            ClientProxy.addSpread(shootSpread);
            SoundEvents.playSound(normalFireSound, entity, soundArgs[0], soundArgs[1]);
        }
        return canPass;
    }

    @Override
    public void shoot(ItemStack stack, LivingEntity entity, boolean mainHand, float spread) {
        if (mainHand) {
            CapabilityHandler.instance().set((PlayerEntity) entity, ClientProxy.LAST_SHOOT_RIGHT, System.currentTimeMillis());
        } else {
            CapabilityHandler.instance().set((PlayerEntity) entity, ClientProxy.LAST_SHOOT_LEFT, System.currentTimeMillis());
        }
        this.setAmmoLeft(stack, this.getAmmoLeft(stack) - 1);
        if (!entity.world.isRemote) {
            World world = entity.world;
            GenericProjectile projectile = new GenericProjectile(EntityRegister.GENERIC_PROJECTILE.get(), world);
            projectile.init( entity, bulletSpeed, spread, baseDamage, bulletLifeLength);
            world.addEntity(projectile);
        }
    }

    @Override
    public boolean preReload(ItemStack stack, LivingEntity entity, boolean mainHand) {
        return ClientTickEvents.reloadingHandler.setTickingStack(stack, mainHand);
    }

    @Override
    public void reload(ItemStack stack, LivingEntity entity, boolean mainHand) {
        setAmmoLeft(stack, getMagSize(stack));
    }

    @Override
    public boolean canHoldInOneHand() {
        return canHoldInOneHand;
    }

    @Override
    public int getMagSize(ItemStack stack) {
        CompoundNBT nbt = checkAndGet(stack);
        return nbt.contains("mag_size") ? nbt.getInt("mag_size") : 0;
    }

    @Override
    public int getAmmoLeft(ItemStack stack) {
        CompoundNBT nbt = checkAndGet(stack);
        return nbt.contains("ammo_left") ? nbt.getInt("ammo_left") : 0;
    }

    @Override
    public void setAmmoLeft(ItemStack stack, int count) {
        CompoundNBT nbt = checkAndGet(stack);
        nbt.putInt("ammo_left", count);
    }

    @Override
    public int getFireMode(ItemStack stack) {
        return checkAndGet(stack).getInt("fire_mode");
    }

    @Override
    public void setFireMode(ItemStack stack, int mode) {
        CompoundNBT nbt = checkAndGet(stack);
        nbt.putInt("fire_mode", mode % this.fireModes.length);
    }

    @Override
    public int getShootDelay() {
        return this.shootDelay;
    }

    @Override
    public float getMinSpread(ItemStack stack) {
        CompoundNBT nbt = checkAndGet(stack);
        return nbt.getFloat("min_spread");
    }

    @Override
    public float getMaxSpread(ItemStack stack) {
        CompoundNBT nbt = checkAndGet(stack);
        return nbt.getFloat("max_spread");
    }

    @Override
    public boolean isFreeBlot() {
        return this.isFreeBlot;
    }

    @Override
    public boolean isPistol() {
        return isPistol;
    }

    @Override
    public int getReloadLength(ItemStack stack) {
        CompoundNBT nbt = checkAndGet(stack);
        return nbt.contains("base_reload_length") ? nbt.getInt("base_reload_length") : 0;
    }

    @Override
    public String getMuzzleFlashState(ItemStack stack) {
        CompoundNBT nbt = checkAndGet(stack);
        return nbt.contains("muzzle_flash_state") ? nbt.getString("muzzle_flash_state") : null;
    }

    private CompoundNBT checkAndGet(ItemStack stack) {
        CompoundNBT nbt = stack.getTag();
        if (nbt == null) {
            this.onCreated(stack, null, null);
            nbt = stack.getTag();
        }
        return nbt;
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
        CompoundNBT nbt = stack.getTag();
        if (nbt == null) {
            nbt = new CompoundNBT();
        }
        nbt.putInt("ammo_left", this.baseMagSize);
        nbt.putInt("mag_size", this.baseMagSize);
        nbt.putInt("fire_mode", this.fireModes[0]);
        nbt.putFloat("min_spread", this.baseSpread);
        nbt.putFloat("max_spread", this.maxSpread);
        nbt.putInt("base_reload_length", this.reloadLength);
        nbt.putString("muzzle_flash_state", "normal");
        stack.setTag(nbt);
    }
}
