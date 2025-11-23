package regenerationforrged.mixin;

import net.minecraft.world.level.chunk.ChunkAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ChunkAccess.class)
public class SerializableDataChunkMixin {

    @Redirect(method = "saveChunkData", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/chunk/ChunkAccess;getHeightmap(Ljava/lang/String;)I"))
    private int redirectChunkHeight(String key) {
        return RegenerationForrgedPipeline.getInstance().getCachedHeight(key);
    }
}
