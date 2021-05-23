package cn.zimzaza4.slimefunzt.util;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class RecipeTypes {

    public static final RecipeType KillEliteMobs = new RecipeType(
            new NamespacedKey(SlimefunZT.getInstance(), "KILL_EM_MOB"), new CustomItem(Material.IRON_SWORD, "&a击杀精英怪"));

}
