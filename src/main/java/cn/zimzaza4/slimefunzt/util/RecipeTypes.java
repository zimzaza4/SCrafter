package cn.zimzaza4.slimefunzt.util;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class RecipeTypes {

    public static final RecipeType KillEliteMobs = new RecipeType(
            new NamespacedKey(SlimefunZT.getInstance(), "KILL_EM_MOB"), new CustomItem(Material.IRON_SWORD, "&a击杀精英怪"));
    public static final RecipeType KillBossMobs = new RecipeType(
            new NamespacedKey(SlimefunZT.getInstance(), "KILL_BOSS_MOB"), new CustomItem(Material.DIAMOND_SWORD, "&a击杀特殊精英怪"));
    public static final RecipeType Natural = new RecipeType(
            new NamespacedKey(SlimefunZT.getInstance(), "NATURAL_SPAWN"), new CustomItem(Material.IRON_ORE, "&a自然生成"));

}
