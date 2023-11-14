package sheridan.gunscraft.entities.projectile;

import net.minecraft.block.BellBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class GenericProjectile extends Entity implements IProjectile, IEntityAdditionalSpawnData {
    public static final float BASE_SPEED_INDEX = 1.4f;
    public static final float BASE_SPREAD_INDEX = 0.008f;
    public LivingEntity shooter;
    public float speed;
    public float spread;
    public float damage;
    public int lifeLength;

    private static final Predicate<Entity> PROJECTILE_TARGETS =
            (input) -> input != null && input.canBeCollidedWith() && !input.isSpectator();


    public GenericProjectile(EntityType<?> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);
    }

    @Override
    public void init(LivingEntity shooter, float speed, float spread, float damage, int lifeLength) {
        this.shooter = shooter;


        this.setPosition(shooter.getPosX(), shooter.getPosY() + shooter.getEyeHeight(shooter.getPose()), shooter.getPosZ());
        this.speed = speed * BASE_SPEED_INDEX;
        this.spread = spread * BASE_SPREAD_INDEX;

        this.setRotation(shooter.rotationYaw, shooter.rotationPitch);

        double sx = rand.nextGaussian() * this.spread;
        double sy = rand.nextGaussian() * this.spread;
        double sz = rand.nextGaussian() * this.spread;
        double vp = Math.cos(this.rotationPitch * 0.017453292519943295);
        Vector3d motionVec = new Vector3d(
                - Math.sin(this.rotationYaw * 0.017453292519943295) * vp + sx,
                Math.sin(-this.rotationPitch * 0.017453292519943295) + sy,
                Math.cos(this.rotationYaw * 0.017453292519943295) * vp + sz
        );
        motionVec.normalize();
        this.setMotion(motionVec.mul(this.speed, this.speed, this.speed));
        this.damage = damage;
        this.lifeLength = lifeLength;
    }


    @Override
    protected void registerData() {

    }

    @Override
    public void tick() {
        if (!this.world.isRemote) {
            if (this.ticksExisted >= lifeLength) {
                this.setDead();
            }
            Vector3d prevPos = this.getPositionVec();
            Vector3d nextPos = prevPos.add(this.getMotion());
            BlockRayTraceResult resultBlock = this.world.rayTraceBlocks(new RayTraceContext(prevPos, nextPos, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this));
            Vector3d tempEndPos = null;
            boolean mightHitBlock = false;
            if (resultBlock.getType() != RayTraceResult.Type.MISS) {
                tempEndPos = resultBlock.getHitVec();
                mightHitBlock = true;
            }
            EntityRayTraceResult entityResult = tempEndPos == null ? ProjectileHelper.rayTraceEntities(this.world, this, prevPos, nextPos, this.getBoundingBox().expand(this.getMotion()).grow(1.0D), PROJECTILE_TARGETS)
                    : ProjectileHelper.rayTraceEntities(this.world, this, prevPos, tempEndPos, this.getBoundingBox().expand(this.getMotion()).grow(1.0D), PROJECTILE_TARGETS);
            if (entityResult != null) {
                if (onHitEntity(entityResult)) {
                    this.setDead();
                }
            } else if (mightHitBlock) {
                if (onHitBlock(resultBlock)) {
                    this.setDead();
                }
            }

            this.setPosition(nextPos.x, nextPos.y, nextPos.z);
        }
    }

    public boolean onHitBlock(BlockRayTraceResult result) {
        BlockState state = this.world.getBlockState(result.getPos());
        if (state.getBlock() == Blocks.BELL && this.shooter instanceof PlayerEntity) {
            BellBlock bell = (BellBlock) state.getBlock();
            bell.attemptRing(this.world, state, result, (PlayerEntity) this.shooter, true);
        }
        return !(state.getBlock() instanceof LeavesBlock);
    }

    public boolean onHitEntity(EntityRayTraceResult result) {
        if (result.getEntity() == this.shooter) {
            return false;
        }
        Entity entity = result.getEntity();
        entity.hurtResistantTime = 0;
        GenericProjectileDamage source = new GenericProjectileDamage("projectile", this.shooter);
        source.setProjectile();
        return entity.attackEntityFrom(source,damage);
    }

    @Override
    public void readAdditional(CompoundNBT compound) {

    }

    @Override
    public void writeAdditional(CompoundNBT compound) {

    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public void writeSpawnData(PacketBuffer buffer) {
        buffer.writeInt(this.lifeLength);
        buffer.writeFloat(this.speed);
    }

    @Override
    public void readSpawnData(PacketBuffer additionalData) {
        this.lifeLength = additionalData.readInt();
        this.speed = additionalData.readFloat();
    }

}
