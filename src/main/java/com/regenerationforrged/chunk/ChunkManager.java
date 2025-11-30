package com.regenerationforrged.chunk;

import java.util.Map;
import java.util.HashMap;

import net.minecraft.world.chunk.Chunk;
import net.minecraft.util.math.BlockPos;

public class ChunkManager {

    private final Map<Long, Chunk> chunkCache = new HashMap<>();

    public Chunk getChunk(int x, int z) {
        long key = (((long)x) << 32) | (z & 0xFFFFFFFFL);
        return chunkCache.computeIfAbsent(key, k -> generateChunk(x, z));
    }

    private Chunk generateChunk(int x, int z) {
        Chunk chunk = new Chunk(x, z);
        BaseTerrain.generate(chunk);              // NoiseParameters amp per-octave
        StructureManager sm = new StructureManager();
        sm.generateStructuresAsync(chunk);        // Async structures
        BiomeAssigner.applyBiome(chunk);          // JSON biomes
        return chunk;
    }
}
