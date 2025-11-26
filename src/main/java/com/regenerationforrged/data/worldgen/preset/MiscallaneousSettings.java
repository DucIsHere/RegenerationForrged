package com.regenerationforrged.data.worldgen.preset;

public record MiscellaneousSettings(
    boolean erosionDecorator,
    boolean naturalSnowDecorator,
    boolean smoothLayerDecorator,
    boolean strataDecorator,
    boolean customBiomeFeatures,
    boolean vanillaSprings,
    boolean vanillaLavaSprings,
    boolean vanillaLavaLakes
) {
    public static MiscellaneousSettings defaults() {
        return new MiscellaneousSettings(true, true, true, true, true, false, false, false);
    }
}
