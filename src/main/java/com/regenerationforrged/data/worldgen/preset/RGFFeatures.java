package com.regenerationforrged.data.worldgen.preset;

import java.util.Map;

public final class RGFPreset {
    private final MiscellaneousSettings miscellaneous;
    private final CaveSettings cave;
    private final RiverSettings river;

    public Preset(MiscellaneousSettings misc, CaveSettings cave, RiverSettings river) {
    this.miscellaneous = misc;
    this.cave = cave;
    this.river = river;
    }

    public MiscellaneousSettings miscellaneous() { return miscellaneous; }
    public CaveSettings cave() { return cave; }
    public RiverSettings river() { return river; }

// TODO: implement JSON loader if you want to load presets from data packs
}
