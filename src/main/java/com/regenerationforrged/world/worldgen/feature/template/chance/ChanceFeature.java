package com.regenerationforrged.world.worldgen.feature.chance;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class ChanceFeature extends Feature<ChanceFeature.Config> {
    public static record Config(float chance) implements FeatureConfiguration {}

    public static final Codec<Config> CODEC = Codec.FLOAT.fieldOf("chance").xmap(Config::new, c -> c.chance()).codec();

    public ChanceFeature() { super(CODEC); }

    @Override
    public boolean place(FeaturePlaceContext<Config> context) {
        if (context.random().nextFloat() <= context.config().chance()) {
            // place underlying feature logic
            return true;
        }
        return false;
    }
}
