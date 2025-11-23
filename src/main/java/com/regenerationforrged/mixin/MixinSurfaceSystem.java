package regenerationforrged.mixin;

import net.minecraft.world.level.levelgen.SurfaceSystem;
import net.minecraft.world.level.levelgen.SurfaceRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SurfaceSystem.class)
public class MixinSurfaceSystem {

    @Redirect(method = "applySurfaceRules", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/levelgen/SurfaceRules$Context;apply()V"))
    private void redirectApplySurfaceRules(SurfaceRules.Context context) {
        RegenerationForrgedSurface.apply(context);
    }
}
