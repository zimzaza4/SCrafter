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
        if (BlockStorage.getStorage(world) == null){
            new BlockStorage(world);
        }
        Double canspawn = Math.random();
        int x = random.nextInt(16);
        int y = random.nextInt(10);
        int z = random.nextInt(16);
        Block chunkore1 = chunk.getBlock(x, y, z);

        if (canspawn>0.96){
            chunkore1.setType(Material.PURPLE_STAINED_GLASS);
            BlockStorage.addBlockInfo(chunkore1.getLocation(), "id", Items.Void_Ore_Ame.getItemId(), true);
        }

            x = random.nextInt(16);
            y = random.nextInt(150);
            z = random.nextInt(16);
            if (y>70) {
                Block chunkblock1 = chunk.getBlock(x, y, z);
                if (chunkblock1.getType()==Material.AIR) {
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
        for (int i = 0; i<9 ;i++){
            if (chunk.getBlock(x, y, z).getType()==Material.BLACKSTONE){
                Block chunkblockst = chunk.getBlock(x, y, z);
                chunkblockst.setType(Material.DEEPSLATE_IRON_ORE);

            }
        }
        for (int i = 0;i<17; i++) {

            x = random.nextInt(16);
            z = random.nextInt(16);

            for (y = 180; y > 170; y--) {

                if (chunk.getBlock(x, y, z).getType() == Material.GRASS_BLOCK) {
                    chunk.getBlock(x, y + 1, z).setType(Material.GRASS);
                    break;
                }
            }
            for (y=79;y>70;y--){

                if (chunk.getBlock(x, y, z).getType() == Material.STONE) {
                    Block b = chunk.getBlock(x, y + 1, z);
                    /*b.setType(Material.DEAD_BUBBLE_CORAL);
                    Waterlogged data = (Waterlogged) b.getBlockData();
                    data.setWaterlogged(false);
                    b.setBlockData(data);*/
                    Clipboard cb = null;
                    Boolean isTree = false;
                    if (x>2&&x<13&&z>2&&z<13){
                    if (Math.random()>0.87){

                         cb = SlimefunZT.getInstance().stone_1;
                    }else if (Math.random()>0.9) {
                         cb = SlimefunZT.getInstance().stone_2;
                    }else if (Math.random()>0.93){
                        isTree = true;
                        cb = SlimefunZT.getInstance().void_tree;
                    }else if (Math.random()>0.99){
                        isTree = true;
                        cb = SlimefunZT.getInstance().void_tree_large;
                    }
                    if (cb!=null) {

                            Location loc = b.getLocation();
                            if (isTree) {
                                loc.add(0, -random.nextInt(2), 0);
                            }else {
                                loc.add(0, -1 , 0);
                            }
                        SchematicUtil.SpawnSchmatic(cb, loc);
                    }
                    break;
                }}
            }
        }




    }
}
