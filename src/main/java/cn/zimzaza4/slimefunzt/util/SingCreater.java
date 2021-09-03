package cn.zimzaza4.slimefunzt.util;

import cn.zimzaza4.slimefunzt.lists.Items;
import cn.zimzaza4.slimefunzt.machines.ie.NewSingConer;
import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * Singularities and there recipe displays
 *
 * @author Mooy1
 */
public final class SingCreater extends UnplaceableBlock {

    private static final double COST_MULTIPLIER = 1.0;

    public SingCreater(SlimefunItemStack item, ItemStack it, int amount) {
        super(Items.IE, item, NewSingConer.TYPE, makeRecipe( it, (int) (amount * COST_MULTIPLIER)));
    }

    @Nonnull
    private static ItemStack[] makeRecipe(ItemStack item , int amount) {

        Validate.notNull(item, "Failed to make singularity recipe" );

        List<ItemStack> recipe = new ArrayList<>();

        int stacks = (int) Math.floor(amount / 64D);
        int extra = amount % 64;

        for (int i = 0 ; i < stacks ; i++) {
            recipe.add(new CustomItemStack(item, 64));
        }

        recipe.add(new CustomItemStack(item, extra));

        while (recipe.size() < 9) {
            recipe.add(null);
        }

        return recipe.toArray(new ItemStack[9]);
    }
}
