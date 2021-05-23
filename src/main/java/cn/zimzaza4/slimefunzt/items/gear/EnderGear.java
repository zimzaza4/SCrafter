package cn.zimzaza4.slimefunzt.items.gear;

import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public final class EnderGear extends SlimefunArmorPiece {

    public EnderGear(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
            PotionEffect[] effects) {
        super(category, item, recipeType, recipe, effects);
    }

}