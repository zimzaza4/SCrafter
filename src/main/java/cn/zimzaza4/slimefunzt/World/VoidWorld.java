package cn.zimzaza4.slimefunzt.World;

import cn.zimzaza4.slimefunzt.lists.Items;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class VoidWorld extends ChunkGenerator {
    private SimplexOctaveGenerator noise;

    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        ChunkData data = createChunkData(world);
        data.setRegion(0, 255,0, 16,255, 16, Material.BEDROCK);
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                biome.setBiome(i, j, Biome.THE_END);
            }
        }
        if (noise==null){
            noise = new SimplexOctaveGenerator(world.getSeed(), 1);
            noise.setScale(0.007D);

        }
        for (int x1 = 0; x1 < 16; x1++) {
            for (int z1 = 0; z1 < 16; z1++) {
                int realX = x * 16 + x1;
                int realZ = z * 16 + z1;
                double noiseValue = noise.noise(realX, realZ, 0.5D, 0.5D);
                int height = (int) (noiseValue * 40D + 100D);
                if (height<70) {
                for (int y =30; y > height - 10; y--) {
                    data.setBlock(x1, y, z1, Material.BLACKSTONE);
                    if (Math.random()>0.3)
                    BlockStorage.addBlockInfo(new Location(world, x1, y, z1), "id", Items.Void_Stone.getItemId(), true);
                    data.setBlock(x1, 71, z1, Material.DIRT_PATH);
                }
                }



            }
        }

        return data;
    }
    @Override
    public List<BlockPopulator> getDefaultPopulators(@Nonnull World world){
        return Collections.singletonList(new VoidPopulator());
    }
}
