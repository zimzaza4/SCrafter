
package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ZMSaiktMachII extends AContainer {
    
    public ZMSaiktMachII(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    public ZMSaiktMachII(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                         ItemStack recipeOutput) {
        super(category, item, recipeType, recipe, recipeOutput);
    }

    public ZMSaiktMachII(ItemGroup category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, new SlimefunItemStack(id, item), recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.CROSSBOW);
    }

    @Override
    public int getEnergyConsumption() {
        return 6;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "ZM_SAK_TMACH_I";
    }

    @Override
    public int getCapacity() {
        return 500;
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(1, new ItemStack(Material.COBBLESTONE, 10),
                new SlimefunItemStack(SlimefunItems.SIFTED_ORE, 10));
    }
}
