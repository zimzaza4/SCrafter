package cn.zimzaza4.slimefunzt.items.gear;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public final class EnderGear extends SlimefunArmorPiece {

    public EnderGear(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                     PotionEffect[] effects) {
        super(category, item, recipeType, recipe, effects);
    }

}