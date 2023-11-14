//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sheridan.gunscraft.capability;

import net.minecraft.nbt.INBT;
import net.minecraft.network.PacketBuffer;

public interface ISerializer<T> {
    void write(PacketBuffer var1, T var2);

    T read(PacketBuffer var1);

    INBT write(T var1);

    T read(INBT var1);
}
