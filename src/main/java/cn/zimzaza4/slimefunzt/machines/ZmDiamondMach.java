package cn.zimzaza4.slimefunzt.machines;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ZmDiamondMach extends AContainer {

    public ZmDiamondMach(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    public ZmDiamondMach(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
            ItemStack recipeOutput) {
        super(category, item, recipeType, recipe, recipeOutput);
    }

    public ZmDiamondMach(Category category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, new SlimefunItemStack(id, item), recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.REDSTONE_BLOCK);
    }

    @Override
    public int getEnergyConsumption() {
        return 30;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "ZIM_DIA_MACH";
    }

    @Override
    public int getCapacity() {
        return 300;
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(5, new ItemStack(Material.APPLE), new ItemStack(Material.SUGAR));

    }

}
