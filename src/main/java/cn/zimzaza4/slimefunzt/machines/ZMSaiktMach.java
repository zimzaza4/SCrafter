package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ZMSaiktMach extends AContainer {
    public ZMSaiktMach(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    public ZMSaiktMach(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, ItemStack recipeOutput ) {
        super(category, item, recipeType, recipe, recipeOutput);
    }
    public ZMSaiktMach(ItemGroup category, String id , ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, new SlimefunItemStack(id, item), recipeType, recipe);
    }
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BOW);
    }

    @Override
    public int getEnergyConsumption() {
        return 3;
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
        return 300;
    }


    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(2, new ItemStack(Material.COBBLESTONE, 5), new SlimefunItemStack(SlimefunItems.SIFTED_ORE, 5));
    }
}
