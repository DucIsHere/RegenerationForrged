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
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_MUSHROOM_4_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_4"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_MUSHROOM_5_CONFIGURED =
        RegistryKey.of(Registries.CONFIGUREF_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_5"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_MUSHROOM_6_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_6"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_MUSHROOM_7_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_7"));
    public static final RegistryKey<CongiguredFeature<?, ?>> RED_MUSHROOM_1_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "red_mushroom_1"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MUSHROOM_2_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "red_mushroom_2"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MUAHROOM_3_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKet(), new Identifier(MODID, "red_mushroom_3"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MUSHROOM_4_CONFIGURED =
        RegistryKey.of(Registries.CONGIGURED_FEATURE.getKey(), new Identifier(MODID, "red_mushroom_4"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH_1_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifiet(MODID, "acaia_bush_1"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH_2_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATUTE.getKey(), new Identifier(MODID, "acacia_bush_2"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_1_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "acacia_1"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_2_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "acacia_2"));
    public static final RegistryKey<ConfiguredFeature<?, >> ACACIA_SMALL_1_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "acacia_small_1"));
    public static final RegistryKey<ConfigurefFeature<?, >> ACACIA_SMALL_2_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifiet(MODID, "acacia_small_2"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOREST_BIRCH_1_CONFIGURED =
        RegistryKey.of(Registries.CONFIGURED_FEATURE.getKey(), new Identifier(MODID, "forest_birch_1"));

    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_1_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_1"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_2_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_2"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_3_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_3"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_4_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_4"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_5_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_5"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_6_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_6"));
    public static final RegistryKey<PlacedFeature> BROWN_MUSHROOM_7_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "brown_mushroom_7"));
    public static final RegistryKey<PlacedFeature> RED_MUSHROOM_1_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "red_mushroom_1"));
    public static final RegistryKey<PlacedFeature> RED_MUSHROOM_2_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "red_mushroom_2"));
    public static final RegistryKey<PlacedFeature> RED_MUAHROOM_3_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKet(), new Identifier(MODID, "red_mushroom_3"));
    public static final RegistryKey<PlacedFeature> RED_MUSHROOM_4_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "red_mushroom_4"));
    public static final RegistryKey<PlacedFeature> ACACIA_BUSH_1_PLACED_KEY =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "acacia_bush_1"));
    public static final RegistryKey<PlacedFeature> ACACIA_BUSH_2_PLACED_KEY =
        RegiatryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "acacia_bush_2"));
    public static final RegistryKey<PlacedFeature> ACACIA_1_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "acacia_1"));
    public static final RegistryKey<PlacedFeature> ACACIA_2_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "acacia_2"));
    public static final RegistryKey<PlacedFeature> ACACIA_SMALL_1_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "acacia_small_1"));
    public static final RegistryKey<PlacedFeature> ACACIA_SMALL_2_PLACED =
        RegistryKey.of(Registries.PLACED_FEATURE.getKey(), new Identifier(MODID, "acacia_small_2"));

    public static void registerFeatures() {
      
    }
