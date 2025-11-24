package regenerationforrged.mixin;

import net.minecraft.world.level.levelgen.RandomState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RandomState.class)
public class MixinRandomState {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void initSeedSync(long seed, CallbackInfoReturnable<Void> cir) {
        RegenerationForrgedPipeline.getInstance().setSeed(seed);
    }

    @Inject(method = "create", at = @At("RETURN"))
    private void rgf$SafterRandomStateInit(HolderLookup registry, CallBackInfoReturnable<RandomState> cir) {
        
    }
}
