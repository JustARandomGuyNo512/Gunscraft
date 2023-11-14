//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sheridan.gunscraft.capability;

import java.util.UUID;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.ByteNBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.DoubleNBT;
import net.minecraft.nbt.FloatNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.IntNBT;
import net.minecraft.nbt.LongNBT;
import net.minecraft.nbt.ShortNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class Serializers
{
    public static final ISerializer<Boolean> BOOLEAN = new ISerializer<Boolean>()
    {
        @Override
        public void write(PacketBuffer buf, Boolean value)
        {
            buf.writeBoolean(value);
        }

        @Override
        public Boolean read(PacketBuffer buf)
        {
            return buf.readBoolean();
        }

        @Override
        public INBT write(Boolean value)
        {
            return ByteNBT.valueOf(value);
        }

        @Override
        public Boolean read(INBT nbt)
        {
            return ((ByteNBT) nbt).getByte() != 0;
        }
    };

    public static final ISerializer<Byte> BYTE = new ISerializer<Byte>()
    {
        @Override
        public void write(PacketBuffer buf, Byte value)
        {
            buf.writeByte(value);
        }

        @Override
        public Byte read(PacketBuffer buf)
        {
            return buf.readByte();
        }

        @Override
        public INBT write(Byte value)
        {
            return ByteNBT.valueOf(value);
        }

        @Override
        public Byte read(INBT nbt)
        {
            return ((ByteNBT) nbt).getByte();
        }
    };

    public static final ISerializer<Short> SHORT = new ISerializer<Short>()
    {
        @Override
        public void write(PacketBuffer buf, Short value)
        {
            buf.writeShort(value);
        }

        @Override
        public Short read(PacketBuffer buf)
        {
            return buf.readShort();
        }

        @Override
        public INBT write(Short value)
        {
            return ShortNBT.valueOf(value);
        }

        @Override
        public Short read(INBT nbt)
        {
            return ((ShortNBT) nbt).getShort();
        }
    };

    public static final ISerializer<Integer> INTEGER = new ISerializer<Integer>()
    {
        @Override
        public void write(PacketBuffer buf, Integer value)
        {
            buf.writeVarInt(value);
        }

        @Override
        public Integer read(PacketBuffer buf)
        {
            return buf.readVarInt();
        }

        @Override
        public INBT write(Integer value)
        {
            return IntNBT.valueOf(value);
        }

        @Override
        public Integer read(INBT nbt)
        {
            return ((IntNBT) nbt).getInt();
        }
    };

    public static final ISerializer<Long> LONG = new ISerializer<Long>()
    {
        @Override
        public void write(PacketBuffer buf, Long value)
        {
            buf.writeLong(value);
        }

        @Override
        public Long read(PacketBuffer buf)
        {
            return buf.readLong();
        }

        @Override
        public INBT write(Long value)
        {
            return LongNBT.valueOf(value);
        }

        @Override
        public Long read(INBT nbt)
        {
            return ((LongNBT) nbt).getLong();
        }
    };

    public static final ISerializer<Float> FLOAT = new ISerializer<Float>()
    {
        @Override
        public void write(PacketBuffer buf, Float value)
        {
            buf.writeFloat(value);
        }

        @Override
        public Float read(PacketBuffer buf)
        {
            return buf.readFloat();
        }

        @Override
        public INBT write(Float value)
        {
            return FloatNBT.valueOf(value);
        }

        @Override
        public Float read(INBT nbt)
        {
            return ((FloatNBT) nbt).getFloat();
        }
    };

    public static final ISerializer<Double> DOUBLE = new ISerializer<Double>()
    {
        @Override
        public void write(PacketBuffer buf, Double value)
        {
            buf.writeDouble(value);
        }

        @Override
        public Double read(PacketBuffer buf)
        {
            return buf.readDouble();
        }

        @Override
        public INBT write(Double value)
        {
            return DoubleNBT.valueOf(value);
        }

        @Override
        public Double read(INBT nbt)
        {
            return ((DoubleNBT) nbt).getDouble();
        }
    };

    public static final ISerializer<Character> CHARACTER = new ISerializer<Character>()
    {
        @Override
        public void write(PacketBuffer buf, Character value)
        {
            buf.writeChar(value);
        }

        @Override
        public Character read(PacketBuffer buf)
        {
            return buf.readChar();
        }

        @Override
        public INBT write(Character value)
        {
            return IntNBT.valueOf(value);
        }

        @Override
        public Character read(INBT nbt)
        {
            return (char) ((IntNBT) nbt).getInt();
        }
    };

    public static final ISerializer<String> STRING = new ISerializer<String>()
    {
        @Override
        public void write(PacketBuffer buf, String value)
        {
            buf.writeString(value);
        }

        @Override
        public String read(PacketBuffer buf)
        {
            return buf.readString();
        }

        @Override
        public INBT write(String value)
        {
            return StringNBT.valueOf(value);
        }

        @Override
        public String read(INBT nbt)
        {
            return nbt.getString();
        }
    };

    public static final ISerializer<CompoundNBT> TAG_COMPOUND = new ISerializer<CompoundNBT>()
    {
        @Override
        public void write(PacketBuffer buf, CompoundNBT value)
        {
            buf.writeCompoundTag(value);
        }

        @Override
        public CompoundNBT read(PacketBuffer buf)
        {
            return buf.readCompoundTag();
        }

        @Override
        public INBT write(CompoundNBT value)
        {
            return value;
        }

        @Override
        public CompoundNBT read(INBT nbt)
        {
            return (CompoundNBT) nbt;
        }
    };

    public static final ISerializer<BlockPos> BLOCK_POS = new ISerializer<BlockPos>()
    {
        @Override
        public void write(PacketBuffer buf, BlockPos value)
        {
            buf.writeBlockPos(value);
        }

        @Override
        public BlockPos read(PacketBuffer buf)
        {
            return buf.readBlockPos();
        }

        @Override
        public INBT write(BlockPos value)
        {
            return LongNBT.valueOf(value.toLong());
        }

        @Override
        public BlockPos read(INBT nbt)
        {
            return BlockPos.fromLong(((LongNBT) nbt).getLong());
        }
    };

    public static final ISerializer<UUID> UUID = new ISerializer<UUID>()
    {
        @Override
        public void write(PacketBuffer buf, UUID value)
        {
            buf.writeUniqueId(value);
        }

        @Override
        public UUID read(PacketBuffer buf)
        {
            return buf.readUniqueId();
        }

        @Override
        public INBT write(UUID value)
        {
            CompoundNBT compound = new CompoundNBT();
            compound.putLong("Most", value.getMostSignificantBits());
            compound.putLong("Least", value.getLeastSignificantBits());
            return compound;
        }

        @Override
        public UUID read(INBT nbt)
        {
            CompoundNBT compound = new CompoundNBT();
            return new UUID(compound.getLong("Most"), compound.getLong("Least"));
        }
    };

    public static final ISerializer<ItemStack> ITEM_STACK = new ISerializer<ItemStack>()
    {
        @Override
        public void write(PacketBuffer buf, ItemStack value)
        {
            buf.writeItemStack(value);
        }

        @Override
        public ItemStack read(PacketBuffer buf)
        {
            return buf.readItemStack();
        }

        @Override
        public INBT write(ItemStack value)
        {
            return value.write(new CompoundNBT());
        }

        @Override
        public ItemStack read(INBT nbt)
        {
            return ItemStack.read((CompoundNBT) nbt);
        }
    };

    public static final ISerializer<ResourceLocation> RESOURCE_LOCATION = new ISerializer<ResourceLocation>()
    {
        @Override
        public void write(PacketBuffer buf, ResourceLocation value)
        {
            buf.writeResourceLocation(value);
        }

        @Override
        public ResourceLocation read(PacketBuffer buf)
        {
            return buf.readResourceLocation();
        }

        @Override
        public INBT write(ResourceLocation value)
        {
            return StringNBT.valueOf(value.toString());
        }

        @Override
        public ResourceLocation read(INBT nbt)
        {
            return ResourceLocation.tryCreate(nbt.getString());
        }
    };
}