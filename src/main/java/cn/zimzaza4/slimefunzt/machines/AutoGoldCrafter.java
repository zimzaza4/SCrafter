package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoGoldCrafter extends AContainer {

    public AutoGoldCrafter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    public AutoGoldCrafter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
            ItemStack recipeOutput) {
        super(category, item, recipeType, recipe, recipeOutput);
    }

    public AutoGoldCrafter(ItemGroup category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
