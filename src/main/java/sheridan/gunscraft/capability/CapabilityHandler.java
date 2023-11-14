//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sheridan.gunscraft.capability;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.network.PacketDistributor;
import org.apache.commons.lang3.Validate;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.network.LoginPacks;
import sheridan.gunscraft.network.PacketHandler;
import sheridan.gunscraft.network.packets.SyncPlayerDataPacket;

public class CapabilityHandler
{
    @CapabilityInject(DataHolder.class)
    public static final Capability<DataHolder> CAPABILITY = null;

    public static CapabilityHandler INSTANCE;
    private static boolean init = false;

    private final Map<ResourceLocation, CapabilityKey<?>> registeredDataKeys = new HashMap<>();
    private final Map<Integer, CapabilityKey<?>> idToDataKey = new HashMap<>();
    private int nextKeyId = 0;

    //如果调用了setter改变了数据，dirty为true，在server tick时进行同步，并将dirty重新改为false
    private boolean dirty = false;

    private CapabilityHandler() {}

    public static CapabilityHandler instance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new CapabilityHandler();
        }
        return INSTANCE;
    }

    public static void init()
    {
        if(!init)
        {
            CapabilityManager.INSTANCE.register(DataHolder.class, new Storage(), DataHolder::new);
            MinecraftForge.EVENT_BUS.register(instance());
            init = true;
        }
    }

    public void registerKey(CapabilityKey<?> key)
    {
        if(!this.registeredDataKeys.containsKey(key.getKey()))
        {
            int nextId = this.nextKeyId++;
            key.setId(nextId);
            this.registeredDataKeys.put(key.getKey(), key);
            this.idToDataKey.put(nextId, key);
        }
    }

    public <T> void set(PlayerEntity player, CapabilityKey<T> key, T value)
    {
        if(this.registeredDataKeys.containsValue(key))
        {
            DataHolder holder = this.getDataHolder(player);
            if(holder != null && holder.set(player, key, value))
            {
                if(!player.world.isRemote)
                {
                    this.dirty = true;
                }
            }
        }
    }

    public <T> T get(PlayerEntity player, CapabilityKey<T> key)
    {
        if(this.registeredDataKeys.containsValue(key))
        {
            DataHolder holder = this.getDataHolder(player);
            return holder != null ? holder.get(key) : key.getDefaultValueSupplier().get();
        }
        return null;
    }

    @OnlyIn(Dist.CLIENT)
    public <T> void updateClientEntry(PlayerEntity player, Pair<T> entry)
    {
        CapabilityHandler.instance().set(player, entry.getKey(), entry.getValue());
    }

    @Nullable
    public CapabilityKey<?> getKey(int id)
    {
        return this.idToDataKey.get(id);
    }

    public List<CapabilityKey<?>> getKeys()
    {
        return ImmutableList.copyOf(this.registeredDataKeys.values());
    }

    @Nullable
    private DataHolder getDataHolder(PlayerEntity player)
    {
        return player.getCapability(CAPABILITY, null).orElse(null);
    }

    //forge event 设置capability
    @SubscribeEvent
    public void attachCapabilities(AttachCapabilitiesEvent<Entity> event)
    {
        if(event.getObject() instanceof PlayerEntity)
        {
            event.addCapability(new ResourceLocation(Gunscraft.MOD_ID, "sync_player_data"), new Provider());
        }
    }

    //需要同步给所有玩家
    @SubscribeEvent
    public void onStartTracking(PlayerEvent.StartTracking event)
    {
        if(event.getTarget() instanceof PlayerEntity && !event.getPlayer().world.isRemote)
        {
            PlayerEntity player = (PlayerEntity) event.getTarget();
            DataHolder holder = this.getDataHolder(player);
            if(holder != null)
            {
                List<Pair<?>> pairs = holder.gatherAll();
                pairs.removeIf(entry -> !entry.getKey().shouldSyncToAllPlayers());
                if(!pairs.isEmpty())
                {
                    PacketHandler.CommonChannel.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) player), new SyncPlayerDataPacket(player.getEntityId(), pairs));
                }
            }
        }
    }

    @SubscribeEvent
    public void onPlayerJoinWorld(EntityJoinWorldEvent event)
    {
        Entity entity = event.getEntity();
        if(entity instanceof PlayerEntity && !event.getWorld().isRemote)
        {
            PlayerEntity player = (PlayerEntity) entity;
            DataHolder holder = this.getDataHolder(player);
            if(holder != null)
            {
                List<Pair<?>> pairs = holder.gatherAll();
                if(!pairs.isEmpty())
                {
                    PacketHandler.CommonChannel.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) player), new SyncPlayerDataPacket(player.getEntityId(), pairs));
                }
            }
        }
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event)
    {
        PlayerEntity original = event.getOriginal();
        if(!original.world.isRemote)
        {
            PlayerEntity player = event.getPlayer();
            DataHolder oldHolder = this.getDataHolder(original);
            if(oldHolder != null)
            {
                DataHolder newHolder = this.getDataHolder(player);
                if(newHolder != null)
                {
                    Map<CapabilityKey<?>, Pair<?>> dataMap = new HashMap<>(oldHolder.dataMap);
                    if(event.isWasDeath())
                    {
                        dataMap.entrySet().removeIf(entry -> !entry.getKey().isShouldKeepAfterDeath());
                    }
                    newHolder.dataMap = dataMap;
                }
            }
        }
    }

    @SubscribeEvent
    public void onServerTick(TickEvent.PlayerTickEvent event)
    {
        if(event.phase == TickEvent.Phase.END)
        {
            if(this.dirty)
            {
                PlayerEntity player = event.player;
                if(!player.world.isRemote())
                {
                    DataHolder holder = this.getDataHolder(player);
                    if(holder != null && holder.isDirty())
                    {
                        List<Pair<?>> entries = holder.gatherDirty();
                        if(!entries.isEmpty())
                        {
                            PacketHandler.CommonChannel.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) player), new SyncPlayerDataPacket(player.getEntityId(), entries));
                            List<Pair<?>> pairs = entries.stream().filter(entry -> entry.getKey().shouldSyncToAllPlayers()).collect(Collectors.toList());
                            if(!pairs.isEmpty())
                            {
                                PacketHandler.CommonChannel.send(PacketDistributor.TRACKING_ENTITY.with(() -> player), new SyncPlayerDataPacket(player.getEntityId(), pairs));
                            }
                        }
                        holder.clean();
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event)
    {
        if(event.phase == TickEvent.Phase.END)
        {
            if(this.dirty)
            {
                this.dirty = false;
            }
        }
    }

    public static class DataHolder
    {
        private Map<CapabilityKey<?>, Pair<?>> dataMap = new HashMap<>();
        private boolean dirty = false;

        @SuppressWarnings("unchecked")
        public <T> boolean set(PlayerEntity player, CapabilityKey<T> key, T value)
        {
            Pair<T> entry = (Pair<T>) this.dataMap.computeIfAbsent(key, Pair::new);
            if(!entry.getValue().equals(value))
            {
                boolean dirty = !player.world.isRemote && entry.getKey().shouldSyncToClient();
                entry.setValue(value, dirty);
                this.dirty = dirty;
                return true;
            }
            return false;
        }

        @Nullable
        @SuppressWarnings("unchecked")
        public <T> T get(CapabilityKey<T> key)
        {
            return (T) this.dataMap.computeIfAbsent(key, Pair::new).getValue();
        }

        public boolean isDirty()
        {
            return this.dirty;
        }

        public void clean()
        {
            this.dirty = false;
            this.dataMap.forEach((key, entry) -> entry.clean());
        }

        public List<Pair<?>> gatherDirty()
        {
            return this.dataMap.values().stream().filter(Pair::isDirty).filter(entry -> entry.getKey().shouldSyncToClient()).collect(Collectors.toList());
        }

        public List<Pair<?>> gatherAll()
        {
            return this.dataMap.values().stream().filter(entry -> entry.getKey().shouldSyncToClient()).collect(Collectors.toList());
        }

        public DataHolder() {
        }
    }

    public static class Pair<T>
    {
        private CapabilityKey<T> key;
        private T value;
        private boolean dirty;

        private Pair(CapabilityKey<T> key)
        {
            this.key = key;
            this.value = key.getDefaultValueSupplier().get();
        }

        public CapabilityKey<T> getKey()
        {
            return this.key;
        }

        public T getValue()
        {
            return this.value;
        }

        public void setValue(T value, boolean dirty)
        {
            this.value = value;
            this.dirty = dirty;
        }

        public boolean isDirty()
        {
            return this.dirty;
        }

        public void clean()
        {
            this.dirty = false;
        }

        public void write(PacketBuffer buffer)
        {
            buffer.writeVarInt(this.key.getId());
            this.key.getSerializer().write(buffer, this.value);
        }

        public static Pair<?> read(PacketBuffer buffer)
        {
            CapabilityKey<?> key = CapabilityHandler.instance().getKey(buffer.readVarInt());
            Validate.notNull(key, "Synced key does not exist for setId");
            Pair<?> entry = new Pair<>(key);
            entry.readValue(buffer);
            return entry;
        }

        private void readValue(PacketBuffer buffer)
        {
            this.value = this.getKey().getSerializer().read(buffer);
        }

        private INBT writeValue()
        {
            return this.key.getSerializer().write(this.value);
        }

        private void readValue(INBT nbt)
        {
            this.value = this.key.getSerializer().read(nbt);
        }
    }

    public boolean updateMappings(LoginPacks.S2CSyncedPlayerData message)
    {
        this.idToDataKey.clear();
        Map<ResourceLocation, Integer> keyMappings = message.getKeyMap();
        for(ResourceLocation key : keyMappings.keySet())
        {
            CapabilityKey<?> syncedDataKey = this.registeredDataKeys.get(key);
            if(syncedDataKey == null) return false;
            int id = keyMappings.get(key);
            syncedDataKey.setId(id);
            this.idToDataKey.put(id, syncedDataKey);
        }
        return true;
    }

    public static class Storage implements Capability.IStorage<DataHolder>
    {
        @Nullable
        @Override
        public INBT writeNBT(Capability<DataHolder> capability, DataHolder instance, Direction side)
        {

            ListNBT list = new ListNBT();
            instance.dataMap.forEach((key, entry) ->
            {
                if(key.shouldSave())
                {
                    CompoundNBT keyTag = new CompoundNBT();
                    keyTag.putString("Key", key.getKey().toString());
                    keyTag.put("Value", entry.writeValue());
                    list.add(keyTag);
                }
            });
            return list;
        }

        @Override
        public void readNBT(Capability<DataHolder> capability, DataHolder instance, Direction side, INBT nbt)
        {
            ListNBT list = (ListNBT) nbt;
            list.forEach(entryTag ->
            {
                CompoundNBT keyTag = (CompoundNBT) entryTag;
                ResourceLocation key = ResourceLocation.tryCreate(keyTag.getString("Key"));
                INBT value = keyTag.get("Value");
                CapabilityKey<?> syncedDataKey = CapabilityHandler.instance().registeredDataKeys.get(key);
                if(syncedDataKey != null && syncedDataKey.shouldSave())
                {
                    Pair<?> entry = new Pair<>(syncedDataKey);
                    entry.readValue(value);
                    instance.dataMap.put(syncedDataKey, entry);
                }
            });
        }
    }

    public static class Provider implements ICapabilitySerializable<ListNBT>
    {
        final DataHolder INSTANCE = new DataHolder();

        @Override
        public ListNBT serializeNBT()
        {
            return (ListNBT) CAPABILITY.getStorage().writeNBT(CAPABILITY, INSTANCE, null);
        }

        @Override
        public void deserializeNBT(ListNBT compound)
        {
            CAPABILITY.getStorage().readNBT(CAPABILITY, INSTANCE, null, compound);
        }

        @Nonnull
        @Override
        public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
        {
            return CAPABILITY.orEmpty(cap, LazyOptional.of(() -> INSTANCE));
        }
    }
}