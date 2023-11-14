package sheridan.gunscraft.network;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import sheridan.gunscraft.capability.CapabilityHandler;
import sheridan.gunscraft.capability.CapabilityKey;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;

public class LoginPacks
{
    static class LoginIndexedMessage implements IntSupplier
    {
        private int loginIndex;

        void setLoginIndex(final int loginIndex)
        {
            this.loginIndex = loginIndex;
        }

        int getLoginIndex()
        {
            return loginIndex;
        }

        @Override
        public int getAsInt()
        {
            return getLoginIndex();
        }
    }

    static class C2SAcknowledge extends LoginIndexedMessage
    {
        void encode(PacketBuffer buf) {}

        static C2SAcknowledge decode(PacketBuffer buf)
        {
            return new C2SAcknowledge();
        }
    }

    public static class S2CSyncedPlayerData extends LoginIndexedMessage
    {
        private Map<ResourceLocation, Integer> keyMap;

        public S2CSyncedPlayerData()
        {
            this.keyMap = new HashMap<>();
            List<CapabilityKey<?>> keys = CapabilityHandler.instance().getKeys();
            keys.forEach(syncedDataKey -> this.keyMap.put(syncedDataKey.getKey(), syncedDataKey.getId()));
        }

        private S2CSyncedPlayerData(Map<ResourceLocation, Integer> keyMap)
        {
            this.keyMap = keyMap;
        }

        void encode(PacketBuffer output)
        {
            List<CapabilityKey<?>> keys = CapabilityHandler.instance().getKeys();
            keys.forEach(syncedDataKey -> {
                output.writeResourceLocation(syncedDataKey.getKey());
                output.writeVarInt(syncedDataKey.getId());
            });
        }

        static S2CSyncedPlayerData decode(PacketBuffer input)
        {
            Map<ResourceLocation, Integer> keyMap = new HashMap<>();
            List<CapabilityKey<?>> keys = CapabilityHandler.instance().getKeys();
            keys.forEach(syncedDataKey -> keyMap.put(input.readResourceLocation(), input.readVarInt()));
            return new S2CSyncedPlayerData(keyMap);
        }

        public Map<ResourceLocation, Integer> getKeyMap()
        {
            return keyMap;
        }
    }
}
