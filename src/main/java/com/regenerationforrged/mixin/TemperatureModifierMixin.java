package com.regenerationforrged.mixin;

import net.minecraft.world.level.levelgen.temperature.TemperatureModifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(TemperatureModifier.class)
public class TemperatureModifierMixin {

    @Redirect(method = "modifyTemperature", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/levelgen/temperature/TemperatureSampler;sample(DD)D"))
    private double redirectTemperature(double x, double z) {
        return RegenerationForrgedPipeline.getInstance().temperatureSample(x, z);
    }

    @Inject(methoof = "modifyTemperature", at = @At("HEAD"), cancellable = true)
    private void rgf$overrideTemp(BlockPos pos, float base, CallBackInfoReturnable<Float> cir) {
        float t = RGFThermalHandler.get(pos, base);
        if (!Float.isNaN(t)) cir.getReturnValue(t);
    }
}
