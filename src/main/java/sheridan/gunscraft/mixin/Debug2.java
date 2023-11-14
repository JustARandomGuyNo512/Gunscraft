package sheridan.gunscraft.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class Debug2 {

//    @Inject(at = @At("HEAD"), method = "isRenderOnThread", cancellable = true)
//    public void irt(CallbackInfoReturnable<Boolean> cir) {
//        cir.cancel();
//        cir.setReturnValue(true);
//    }

}
