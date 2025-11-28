package com.regenerationforrged.mixin;

import net.minecraft.world.gen.noise.NoiseParameters;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallBackInfo;

@Mixin(NoiseParameters.class)
public class MixinNoiseParameters {

  @Inject(method = "<init>", at = @At("RETURN"))
  private void jjAmp(init firstOctave, List<Double> amplitudes, CallBackInfo ci) {

    if(amplitudes == null || amplitudes.isEmpty())
      return;

    boolean isJson = amplitudes.getClass().getName().contains("ImmutableCollections")

      if(!isJson)
  }
}
