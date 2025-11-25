package com.regenerationforrged.data.worldgen.preset;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformFloat;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.WorldCarver;

public record CaveSettings(
        boolean cavesEnabled,
        float caveProbability,
        float caveYScale,
        float caveSize,
        float caveHorizontalStretch,
        float caveVerticalStretch,
        float caveFloorLevel
) {

    public static final ResourceKey<WorldCarver<?>> RGF_CAVES =
            ResourceKey.create(Registries.CARVER, new ResourceLocation("rgf", "caves"));

    public static CaveSettings defaults() {
        return new CaveSettings(
                true,          // cavesEnabled
                0.18F,         // caveProbability
                1.35F,         // yScale (RGF height cao hơn vanilla phải buff)
                0.5F,          // caveSize
                1.0F,          // horizontal stretch
                1.2F,          // vertical stretch
                -0.2F          // floorLevel (RGF depth sâu hơn → floor thấp)
        );
    }

    public CaveCarverConfiguration toConfig() {
        return new CaveCarverConfiguration(
                this.caveProbability,
                UniformFloat.of(-1.0F, 1.0F),
                UniformFloat.of(this.caveSize * 0.75F, this.caveSize * 1.25F),
                VerticalAnchor.absolute(-256),     // min RGF depth
                VerticalAnchor.absolute(720),      // max RGF height
                this.caveYScale,
                this.caveHorizontalStretch,
                this.caveVerticalStretch,
                this.caveFloorLevel
        );
    }
}


