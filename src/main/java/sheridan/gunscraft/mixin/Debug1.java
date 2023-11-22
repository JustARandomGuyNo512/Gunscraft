package sheridan.gunscraft.mixin;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public class Debug1 {
    @Inject(at = @At("HEAD"), method = "getSkinType", cancellable = true)
    private void debug1(CallbackInfoReturnable<String> cir) {
//        cir.setReturnValue("slim");
//        cir.cancel();
    }
}
