package cn.zimzaza4.slimefunzt.World;

import cn.zimzaza4.slimefunzt.lists.Items;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class VoidPopulator extends BlockPopulator {
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
                chunkblock1.setType(Material.GLOWSTONE);
                chunkblock1.getLocation().add(1,0,0).getBlock().setType(Material.BLACK_STAINED_GLASS);
                chunkblock1.getLocation().add(0,0,1).getBlock().setType(Material.BLACK_STAINED_GLASS);
                chunkblock1.getLocation().add(-1,0,0).getBlock().setType(Material.BLACK_STAINED_GLASS);
                chunkblock1.getLocation().add(0,0,-1).getBlock().setType(Material.BLACK_STAINED_GLASS);

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
        for (int i = 0;i<15; i++){
        for (y=170;y<180; y++){

        x = random.nextInt(16);
        z = random.nextInt(16);
        if (chunk.getBlock(x, y, z).getType()==Material.GRASS_BLOCK) {

                chunk.getBlock(x, y + 1, z).setType(Material.GRASS);
                break;
        }}
    }
}}
