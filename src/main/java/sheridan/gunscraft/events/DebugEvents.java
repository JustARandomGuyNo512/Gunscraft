package sheridan.gunscraft.events;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sheridan.gunscraft.items.guns.IGenericGun;

@Mod.EventBusSubscriber
public class DebugEvents {

    @SubscribeEvent
    public static void event(TickEvent.ServerTickEvent event) {

    }

    @SubscribeEvent
    public static void event1(TickEvent.ClientTickEvent event) {
//        if (Minecraft.getInstance().player != null) {
//            PlayerEntity entity = Minecraft.getInstance().player;
//            if (entity.getDataManager().get(PlayerEvents.TEST_PM)) {
//
//            }
//        }
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void debugInfo(RenderGameOverlayEvent event) {
        if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
            FontRenderer renderer = Minecraft.getInstance().fontRenderer;
            MatrixStack stack = event.getMatrixStack();
            Minecraft minecraft = Minecraft.getInstance();

            PlayerEntity player = minecraft.player;
            if (player != null) {
                ItemStack itemStack = player.getHeldItemMainhand();
                stack.push();
                if (itemStack.getItem() instanceof IGenericGun) {
                    IGenericGun gun = (IGenericGun) itemStack.getItem();
                    try {
                        renderer.drawString(stack, "ammo: " + gun.getAmmoLeft(itemStack), 100f, 100f, 0xffffff);
                    } catch (Exception ignored) {}

                }
                stack.pop();
            }
        }
    }



}
