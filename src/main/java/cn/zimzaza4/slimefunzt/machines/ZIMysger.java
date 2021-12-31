package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ZIMysger extends AGenerator {
    public ZIMysger(ItemGroup category, String id, ItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, new SlimefunItemStack(id, item), recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.STONE);
    }

    @Override
    public int getEnergyProduction() {
        return 9;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        this.registerFuel(new MachineFuel(1, new ItemStack(Material.SAND, 2)));
        this.registerFuel(new MachineFuel(1, new ItemStack(Material.OAK_LOG, 2)));
        this.registerFuel(new MachineFuel(1, new ItemStack(Material.STONE, 1)));
        this.registerFuel(new MachineFuel(1, new ItemStack(Material.COBBLESTONE, 2)));
        this.registerFuel(new MachineFuel(1, SlimefunItems.STONE_CHUNK));
        this.registerFuel(new MachineFuel(1, new ItemStack(Material.DIRT, 2)));
    }

    @Override
    public int getCapacity() {
        return 500;
    }
}
