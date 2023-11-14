package sheridan.gunscraft.mixin;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public class Debug1 {

//    @Inject(at = @At("RETURN"), method = "getSkinType", cancellable = true)
//    public void getSkinType(CallbackInfoReturnable<String> cir) {
//        cir.setReturnValue("slim");
//    }
}
