package cn.zimzaza4.slimefunzt.World;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.lists.Items;
import cn.zimzaza4.slimefunzt.util.SchematicUtil;
import com.sk89q.worldedit.extent.clipboard.Clipboard;
import lombok.SneakyThrows;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class VoidPopulator extends BlockPopulator {

    @SneakyThrows
    @Override
    public void populate(@NotNull World world, @NotNull Random random, @NotNull Chunk chunk) {
        if (BlockStorage.getStorage(world) == null) {
            new BlockStorage(world);
        }
        Double canspawn = Math.random();
        int x = random.nextInt(16);
        int y = random.nextInt(10);
        int z = random.nextInt(16);
        Block chunkore1 = chunk.getBlock(x, y, z);

        if (canspawn > 0.96) {
            chunkore1.setType(Material.PURPLE_STAINED_GLASS);
            BlockStorage.addBlockInfo(chunkore1.getLocation(), "id", Items.Void_Ore_Ame.getItemId(), true);
        }

        x = random.nextInt(16);
        y = random.nextInt(150);
        z = random.nextInt(16);
        if (y > 70) {
            Block chunkblock1 = chunk.getBlock(x, y, z);
            if (chunkblock1.getType() == Material.AIR) {
                chunkblock1.setType(Material.GLOWSTONE);
                chunkblock1.getLocation().add(1, 0, 0).getBlock().setType(Material.BLACK_STAINED_GLASS);
                chunkblock1.getLocation().add(0, 0, 1).getBlock().setType(Material.BLACK_STAINED_GLASS);
                chunkblock1.getLocation().add(-1, 0, 0).getBlock().setType(Material.BLACK_STAINED_GLASS);
                chunkblock1.getLocation().add(0, 0, -1).getBlock().setType(Material.BLACK_STAINED_GLASS);
            }
        }

        canspawn = Math.random();
        x = random.nextInt(16);
        y = random.nextInt(70);
        z = random.nextInt(16);
        for (int i = 0; i < 9; i++) {
            if (chunk.getBlock(x, y, z).getType() == Material.BLACKSTONE) {
                Block chunkblockst = chunk.getBlock(x, y, z);
                chunkblockst.setType(Material.DEEPSLATE_IRON_ORE);

            }
        }
        for (int i = 0; i < 17; i++) {

            x = random.nextInt(16);
            z = random.nextInt(16);

            for (y = 180; y > 170; y--) {

                if (chunk.getBlock(x, y, z).getType() == Material.GRASS_BLOCK) {
                    chunk.getBlock(x, y + 1, z).setType(Material.GRASS);
                    break;
                }
            }
            for (y = 79; y > 70; y--) {

                if (chunk.getBlock(x, y, z).getType() == Material.STONE) {
                    Block b = chunk.getBlock(x, y + 1, z);




                    Clipboard cb = null;


                    Double rd = random.nextDouble();

                    if (rd > 0.99) {

                        cb = SlimefunZT.getInstance().void_tree_large;
                    } else if (rd > 0.93) {

                        cb = SlimefunZT.getInstance().void_tree;

                    } else if (rd > 0.90) {
                        cb = SlimefunZT.getInstance().stone_2;
                    } else if (rd > 0.87) {
                        cb = SlimefunZT.getInstance().stone_1;
                    }
                    if (SlimefunZT.inst.isDebug) {
                        System.out.println(rd);
                        System.out.println("Spawned?");
                    }
                    if (cb!=null) {
                        Location loc = b.getLocation();


                        SchematicUtil.SpawnSchmatic(cb, loc);

                    }
                }
            }
        }
    }
}
