package sheridan.gunscraft.render.fx;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import sheridan.gunscraft.Gunscraft;

import java.util.HashMap;
import java.util.Map;

public class FxRenderType extends RenderType {
    private static Map<String, RenderType> temp = new HashMap<>();


    public static RenderType create(ResourceLocation texture) {
        if (temp.containsKey(texture.toString())) {
            return temp.get(texture.toString());
        } else {
            RenderType type = RenderType.makeType(Gunscraft.MOD_ID + ":" + "muzzle_flash", DefaultVertexFormats.POSITION_COLOR_TEX_LIGHTMAP,
                    7, 256, true, false,
                    State.getBuilder().texture(new TextureState(texture, false, false))
                            .transparency(RenderState.TRANSLUCENT_TRANSPARENCY).alpha(new AlphaState(0.9f)).cull(CULL_DISABLED).build(true));

            temp.put(texture.toString(), type);
            return type;
        }
    }


    public FxRenderType(String nameIn, VertexFormat formatIn, int drawModeIn, int bufferSizeIn, boolean useDelegateIn, boolean needsSortingIn, Runnable setupTaskIn, Runnable clearTaskIn) {
        super(nameIn, formatIn, drawModeIn, bufferSizeIn, useDelegateIn, needsSortingIn, setupTaskIn, clearTaskIn);
    }
}
