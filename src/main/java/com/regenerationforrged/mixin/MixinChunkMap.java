package com.regenerationforrged.mixin;

import net.minecraft.world.level.chunk.ChunkMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ChunkMap.class)
public class MixinChunkMap {

    @Redirect(method = "updateChunks", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/chunk/ChunkAccess;setBiome(Ljava/lang/Object;II)V"))
    private void redirectBiomePlacement(Object biome, int x, int z, Object chunk) {
        RegenerationForrgedBiome.placeBiome((ChunkAccess)chunk, x, z);
    }

    @Inject(method = "updateChunkTracking", at = @At("HEAD"))
    private void rgf$trackRGFChunks(ServerPlayer player, ChunkPos pos, CallBackInfo ci) {
        RGFDebugTracker.track(player, pos);
    }
}
