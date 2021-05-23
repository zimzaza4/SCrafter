package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoGoldCrafter extends AContainer {

    public AutoGoldCrafter(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    public AutoGoldCrafter(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
            ItemStack recipeOutput) {
        super(category, item, recipeType, recipe, recipeOutput);
    }

    public AutoGoldCrafter(Category category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, new SlimefunItemStack(id, item), recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GOLD_INGOT);
    }

    @Override
    public int getEnergyConsumption() {
        return 50;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "ZIM_GOLD_CRAFTER";
    }

    @Override
    public int getCapacity() {
        return 200;
    }

    public void registerDefaultRecipes() {
        this.registerRecipe(6, new SlimefunItemStack(SlimefunItems.GOLD_DUST, 11), SlimefunItems.GOLD_24K);

    }
}
