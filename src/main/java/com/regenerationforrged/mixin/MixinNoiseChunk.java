package regenerationforrged.mixin;

import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.NoiseChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(NoiseChunk.class)
public class MixinNoiseChunk {
    @Shadow @Final
    private NoiseRouter router;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void rgf$injectCustomNoise(int x, int y, int z, NoiseRouter router, RandomState random, CallBackInfo ci) {
        
    }

    @Redirect(method = "sampleNoiseColumn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/levelgen/noise/NoiseSampler;sample(DD)D"))
    private double redirectSampleNoiseColumn(double x, double z, ChunkAccess chunk) {
        return RegenerationForrgedPipeline.getInstance().sample(x, z);
    }
}
