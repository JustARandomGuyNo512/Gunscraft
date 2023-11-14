package sheridan.gunscraft.render.fx;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;

public interface IFx {
    void play(long startTime, IRenderTypeBuffer buffer, MatrixStack stack);
}
