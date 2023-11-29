package sheridan.gunscraft.network;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.network.FMLHandshakeHandler;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import sheridan.gunscraft.Gunscraft;
import sheridan.gunscraft.capability.CapabilityHandler;
import sheridan.gunscraft.network.packets.*;

public class PacketHandler
{
    public static final String PROTOCOL_VERSION = Gunscraft.MOD_ID + "1.01";
    public static SimpleChannel loginChannel;
    public static SimpleChannel CommonChannel;
    private static int tempId;

    public static void register()
    {
        loginChannel = NetworkRegistry.newSimpleChannel(new ResourceLocation("gunscraft", "login"), ()-> PROTOCOL_VERSION,
                PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

        CommonChannel = NetworkRegistry.newSimpleChannel(new ResourceLocation("gunscraft", "common"), ()-> PROTOCOL_VERSION,
                (s) ->true, (s) ->true);

        loginChannel.messageBuilder(LoginPacks.C2SAcknowledge.class, 99)
                .loginIndex(LoginPacks.LoginIndexedMessage::getLoginIndex, LoginPacks.LoginIndexedMessage::setLoginIndex)
                .decoder(LoginPacks.C2SAcknowledge::decode)
                .encoder(LoginPacks.C2SAcknowledge::encode)
                .consumer(FMLHandshakeHandler.indexFirst((handler, msg, s) -> {
                    s.get().setPacketHandled(true);
                }))
                .add();

        loginChannel.messageBuilder(LoginPacks.S2CSyncedPlayerData.class, 1)
                .loginIndex(LoginPacks.LoginIndexedMessage::getLoginIndex, LoginPacks.LoginIndexedMessage::setLoginIndex)
                .decoder(LoginPacks.S2CSyncedPlayerData::decode)
                .encoder(LoginPacks.S2CSyncedPlayerData::encode)
                .consumer(FMLHandshakeHandler.biConsumerFor((handler, msg, supplier) -> {
                    supplier.get().setPacketHandled(true);
                    if(!CapabilityHandler.getInstance().updateMappings(msg))
                    {
                        supplier.get().getNetworkManager().closeChannel(new StringTextComponent("Connection refused - received unknown capability entry"));
                        return;
                    }
                    loginChannel.reply(new LoginPacks.C2SAcknowledge(), supplier.get());
                }))
                .markAsLoginPacket()
                .add();

        registerPacket(SyncPlayerDataPacket.class, new SyncPlayerDataPacket());
        registerPacket(GunFirePacket.class, new GunFirePacket());
        registerPacket(PlaySoundPacket.class, new PlaySoundPacket());
        registerPacket(ReloadGunPacket.class, new ReloadGunPacket());
        registerPacket(SwitchFireModePacket.class, new SwitchFireModePacket());
        registerPacket(AttachmentGuiPacket.class, new AttachmentGuiPacket());
        registerPacket(SetAttachmentPacket.class, new SetAttachmentPacket());
        registerPacket(GiveBackItemPacket.class, new GiveBackItemPacket());
    }

    private static <T> void registerPacket(Class<T> clazz, IPacket<T> message)
    {
        CommonChannel.registerMessage(tempId++, clazz, message::encode, message::decode, message::handle);
    }
}