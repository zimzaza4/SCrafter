package cn.zimzaza4.slimefunzt.World;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class VoidWorld extends ChunkGenerator {


    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        ChunkData data = createChunkData(world);
        data.setRegion(0, 255,0, 16,255, 16, Material.BEDROCK);
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                biome.setBiome(i, j, Biome.THE_VOID);
            }
        }

        return data;
    }
    @Override
    public List<BlockPopulator> getDefaultPopulators(@Nonnull World world){
        return Collections.singletonList(new VoidPopulator());
    }
}
