package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ZmDiamondMach extends AContainer {

    public ZmDiamondMach(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    public ZmDiamondMach(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
            ItemStack recipeOutput) {
        super(category, item, recipeType, recipe, recipeOutput);
    }

    public ZmDiamondMach(ItemGroup category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
