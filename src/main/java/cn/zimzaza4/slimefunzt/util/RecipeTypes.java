package cn.zimzaza4.slimefunzt.util;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.lists.Items;
import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class RecipeTypes {

    public static final RecipeType KillEliteMobs = new RecipeType(
            new NamespacedKey(SlimefunZT.getInstance(), "KILL_EM_MOB"), new CustomItemStack(Material.IRON_SWORD, "&a击杀精英怪"));
    public static final RecipeType KillBossMobs = new RecipeType(
            new NamespacedKey(SlimefunZT.getInstance(), "KILL_BOSS_MOB"), new CustomItemStack(Material.DIAMOND_SWORD, "&a击杀特殊精英怪"));
    public static final RecipeType Natural = new RecipeType(
            new NamespacedKey(SlimefunZT.getInstance(), "NATURAL_SPAWN"), new CustomItemStack(Material.IRON_ORE, "&a自然生成"));
    public static final RecipeType SoulCraft = new RecipeType(
            SlimefunZT.getKey("soul_crafter"),
            Items.AutoSoulCrafter);

}
