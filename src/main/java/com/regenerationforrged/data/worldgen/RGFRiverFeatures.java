package your.package.rgf.worldgen.feature;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.FeatureConfiguration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import com.regenerationforrged.data.worldgen.preset.RiverSettings;
import java.util.Random;

public class RGFRiverFeatures extends Feature<RGFRiverFeature.Config> {

    public record Config(RGFRiverSettings settings) implements FeatureConfiguration {}

    public RGFRiverFeatures() {
        super(Config.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<Config> context) {
        LevelAccessor world = context.level();
        BlockPos origin = context.origin();
        Random rand = context.random();
        RGFRiverSettings s = context.config().settings();

        // tạm thời skeleton, fill river along XZ plane using noise/meander
        int width = (int) s.riverWidth();
        int depth = (int) s.riverDepth();

        // ví dụ carve một “line” ngang X
        for (int dx = -width; dx <= width; dx++) {
            for (int dz = -width; dz <= width; dz++) {
                int dy = world.getHeight() + origin.getY() - depth; // simple carve
                BlockPos pos = origin.offset(dx, dy, dz);
                world.setBlock(pos, net.minecraft.world.level.block.Blocks.WATER.defaultBlockState(), 3);
            }
        }

        return true;
    }
}
