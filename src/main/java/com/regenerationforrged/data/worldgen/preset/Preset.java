package com.regenerationforrged.data.worldgen.preset;

public class Preset {
    private final MiscellaneousSettings misc;
    private final CaveSettings cave;
    private final RGFRiverSettings river;

    public Preset(MiscellaneousSettings misc, CaveSettings cave, RGFRiverSettings river) {
        this.misc = misc; this.cave = cave; this.river = river;
    }

    public MiscellaneousSettings miscellaneous() { return misc; }
    public CaveSettings cave() { return cave; }
    public RGFRiverSettings river() { return river; }
}
