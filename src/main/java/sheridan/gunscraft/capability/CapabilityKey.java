//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sheridan.gunscraft.capability;

import java.util.Objects;
import java.util.function.Supplier;
import net.minecraft.util.ResourceLocation;

public class CapabilityKey<T> {
    private ResourceLocation key;
    private ISerializer<T> serializer;
    private Supplier<T> defaultValueSupplier;
    private boolean save;
    private boolean shouldKeepAfterDeath;
    private boolean syncToClient;
    private boolean syncToAllPlayers;
    private int id;

    private CapabilityKey(ResourceLocation key, ISerializer<T> serializer, Supplier<T> defaultValueSupplier) {
        this.key = key;
        this.serializer = serializer;
        this.defaultValueSupplier = defaultValueSupplier;
    }

    public ResourceLocation getKey() {
        return this.key;
    }

    public ISerializer<T> getSerializer() {
        return this.serializer;
    }

    public Supplier<T> getDefaultValueSupplier() {
        return this.defaultValueSupplier;
    }

    public boolean shouldSave() {
        return this.save;
    }

    public boolean isShouldKeepAfterDeath() {
        return this.shouldKeepAfterDeath;
    }

    public boolean shouldSyncToClient() {
        return this.syncToClient;
    }

    public boolean shouldSyncToAllPlayers() {
        return this.syncToAllPlayers;
    }

    public int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CapabilityKey<?> that = (CapabilityKey)o;
            return Objects.equals(this.key, that.key);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public static <T> CapabilityKey.Builder<T> builder(ISerializer<T> serializer) {
        return new CapabilityKey.Builder(serializer);
    }

    public static class Builder<T> {
        private ResourceLocation id;
        private ISerializer<T> serializer;
        private Supplier<T> defaultValueSupplier;
        private boolean save;
        private boolean persistent;
        private boolean syncToClient;
        private boolean syncToAllPlayers;

        private Builder(ISerializer<T> serializer) {
            this.save = false;
            this.persistent = true;
            this.syncToClient = true;
            this.syncToAllPlayers = true;
            this.serializer = serializer;
        }

        public CapabilityKey<T> build() {
            CapabilityKey<T> key = new CapabilityKey(this.id, this.serializer, this.defaultValueSupplier);
            key.save = this.save;
            key.shouldKeepAfterDeath = this.persistent;
            key.syncToClient = this.syncToClient;
            key.syncToAllPlayers = this.syncToAllPlayers;
            return key;
        }

        public CapabilityKey.Builder<T> setId(ResourceLocation id) {
            this.id = id;
            return this;
        }

        public CapabilityKey.Builder<T> defaultValue(Supplier<T> defaultValue) {
            this.defaultValueSupplier = defaultValue;
            return this;
        }

        public CapabilityKey.Builder<T> saveToFile() {
            this.save = true;
            return this;
        }

        public CapabilityKey.Builder<T> resetOnDeath() {
            this.persistent = false;
            return this;
        }

        public CapabilityKey.Builder<T> doNotSync() {
            this.syncToClient = false;
            return this;
        }

        public CapabilityKey.Builder<T> restrictSync() {
            this.syncToAllPlayers = false;
            return this;
        }
    }
}
