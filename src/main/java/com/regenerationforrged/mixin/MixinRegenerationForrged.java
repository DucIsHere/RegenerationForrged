package com.regenerationforrged.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Aquifer;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallBackInfoReturnable;

@Mixin(RegenerationForrged.class)
public class MixinRegenerationForrged {
	@Inject(at = @At("HEAD"), method = "loadLevel")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadLevel()V
    }

    @Inject(method = "createFliudPicker", at = @At("HEAD"), cancellable = true)
    private static void createFliudPicker(NoiseGeneratorSettings settings, 
        CallBackInfoReturnable<Aquifer.FluidPicker> ci) {
        var lavaSeaLevel = settings.noiseSettings().minY() + 10;
        Aquifer.FluidStatus lavaFluidStatus = new Aquifer.FluidStatus(lavaSeaLevel, Blocks.LAVA.defaultBlockState());
        int i = settings.seaLevel();
        Aquifer.FluidStatus defaultFluidStatus = new Aquifer.FluidStatus(i, settings.defaultFluid());
        ci.setReturnValue((x, y, z) -> y < Math.min(lavaSeaLevel, i) ? lavaFluidStatus : defaultFluidStatus);
    }
}
