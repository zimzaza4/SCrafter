package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class CarbonCrafterII extends AContainer {
    public CarbonCrafterII(ItemGroup category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, new SlimefunItemStack(id, item), recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.COAL);
    }

    @Override
    public int getEnergyConsumption() {
        return 100;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "ZMI_CARBON_CRAFTER_II";
    }

    @Override
    public int getCapacity() {
        return 400;

    }

    public void registerDefaultRecipes() {

        this.registerRecipe(8, new ItemStack(Material.DIAMOND), new SlimefunItemStack(SlimefunItems.CARBON, 12));
        this.registerRecipe(12, new ItemStack[] { new ItemStack(Material.COAL, 64), new ItemStack(Material.COAL, 64) },
                new ItemStack[] { new SlimefunItemStack(SlimefunItems.CARBON, 12) });
    }

}
