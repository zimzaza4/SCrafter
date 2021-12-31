package cn.zimzaza4.slimefunzt.util;


import cn.zimzaza4.slimefunzt.SlimefunZT;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class SkUtils {
    public static void regitem(String id, ItemStack item, ItemGroup category, RecipeType rt, ItemStack[] recipe) {
        SlimefunItemStack sfi = new SlimefunItemStack(id, item);
        SlimefunItem snr = new SlimefunItem(category, sfi, rt, recipe);
        snr.register(SlimefunZT.getInstance());
    }
}
