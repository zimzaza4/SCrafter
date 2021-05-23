package cn.zimzaza4.slimefunzt.util;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class SkUtils {
    public static void regitem(String id, ItemStack item, Category category, RecipeType rt, ItemStack[] recipe) {
        SlimefunItemStack sfi = new SlimefunItemStack(id, item);
        SlimefunItem snr = new SlimefunItem(category, sfi, rt, recipe);
        snr.register(SlimefunZT.getInstance());

    }
}
