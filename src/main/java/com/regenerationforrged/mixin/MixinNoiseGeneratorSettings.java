package com.regenerationforrged.mixin;

import com.regenerationforrged.data.worldgen.RouterInjector;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseRouter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NoiseGeneratorSettings.class)
public class MixinNoiseGeneratorSettings {

    @Inject(method = "noiseRouter", at = @At("RETURN"), cancellable = true)
    private void injectRouter(CallbackInfoReturnable<NoiseRouter> cir) {
        cir.setReturnValue(RouterInjector.inject(cir.getReturnValue()));
    }
}
