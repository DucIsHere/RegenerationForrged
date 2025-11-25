package com.regenerationforrged.data.worldgen.preset;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public record RGFRiverSettings(
    double riverWeight,
    double riverRarity,
    double riverDepth,
    double riverWidth,
    double meanderAmount,
    double valleyFactor
) {
    public static final ResourceKey<RGFRiverSettings> KEY = ResourceKey.create(
        Registries.OTHER, // custom registry or use dummy
        new ResourceLocation("rgf", "river_settings")
    );

    public static RGFRiverSettings defaults() {
        return new RGFRiverSettings(
            1.0,   // riverWeight
            0.5,   // riverRarity
            2.0,   // riverDepth
            3.0,   // riverWidth
            1.5,   // meanderAmount
            0.7    // valleyFactor
        );
    }
}
