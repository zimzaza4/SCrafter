package cn.zimzaza4.slimefunzt.items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class ElectricAxe extends SlimefunItem implements Rechargeable {

    public ElectricAxe(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

    }

    @Override
    public float getMaxItemCharge(ItemStack itemStack) {
        return 300;

    }

    @Nonnull
    protected ToolUseHandler getItemUseHandler() {
        return ((e, tool, f, d) -> {

            if (getItemCharge(tool) >= 5F) {
                removeItemCharge(tool, 5F);

            } else {
                e.getPlayer().sendMessage("§c电量不足");
                e.setCancelled(true);
            }

        });
    };

    @Override
    public void preRegister() {
        addItemHandler(getItemUseHandler());
    }

}
