package regenerationforrged.mixin;

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
}
