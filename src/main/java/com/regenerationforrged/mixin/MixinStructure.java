package regenerationforrged.mixin;

import net.minecraft.world.level.levelgen.structure.StructureFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StructureFeature.class)
public class MixinStructure {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void initCustomStructure(CallbackInfo ci) {
        RegenerationForrgedStructure.applyCustomPlacement(this);
    }
}
