package com.regenerationforged.data.worldgen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.structure.Structure;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class RGFStructure {
    public static final String MODID = "regenerationforrged";

    // Registry Key cho từng mushroom
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_MUSHROOM_1_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_1"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_MUSHROOM_2_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_2"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_MUSHROOM_3_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_3"));
    public static final RegistryKey<ConfigurefFeature<?, ?>> BROWN_MUSHROOM_4_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_4"));
    public static final RegistryKey<ConfigurefFeature<?, ?>> BROWN_MUSHROOM_5_CONFIGURED =
        RegistryKey.of(Registries.CONFIGUREF_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_5"));

    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_1_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_1"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_2_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_2"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_3_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_3"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_4_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_4"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_5_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_5"));

    public static void registerFeatures() {
      
    }
