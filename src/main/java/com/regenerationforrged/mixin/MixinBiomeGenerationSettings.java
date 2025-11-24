package com.regenerationforrged.mixin;

import net.minecraft.world.level.levelgen.biome.BiomeGenerationSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BiomeGenerationSettings.class)
public class MixinBiomeGenerationSettings {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void injectCustomBiomeRules(CallbackInfo ci) {
        RegenerationForrgedBiome.applyBiomeMask(this);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void rgf$modifyBiomeSettings(HolderSet feature, HolderSet carvers, CallBackInfo ci) {
        RGFBiomeModifier.apply(this);
    }
}
