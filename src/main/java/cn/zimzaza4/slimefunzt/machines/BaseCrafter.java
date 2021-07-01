package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BaseCrafter extends MultiBlockMachine {
    public BaseCrafter(Category category, SlimefunItemStack item, ItemStack[] recipe, ItemStack[] machineRecipes, BlockFace trigger) {
        super(category, item, recipe, machineRecipes, trigger);
    }

    @Override
    public void onInteract(Player player, Block block) {

    }
}
