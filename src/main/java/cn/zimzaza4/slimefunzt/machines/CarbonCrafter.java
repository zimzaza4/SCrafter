package cn.zimzaza4.slimefunzt.machines;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class CarbonCrafter extends AContainer {

    public CarbonCrafter(Category category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, new SlimefunItemStack(id, item), recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.COAL);
    }

    @Override
    public int getEnergyConsumption() {
        return 90;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "ZMI_CARBON_CRAFTER";
    }

    @Override
    public int getCapacity() {
        return 200;

    }

    public void registerDefaultRecipes() {

        this.registerRecipe(8, new ItemStack[] { new ItemStack(Material.DIAMOND) },
                new ItemStack[] { new ItemStack(Material.COAL, 64), new ItemStack(Material.COAL, 64) });
    }
}
