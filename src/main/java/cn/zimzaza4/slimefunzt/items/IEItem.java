package cn.zimzaza4.slimefunzt.items;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Categories;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class IEItem {
    public static void setup(SlimefunZT zt) {
        System.out.println("Loading... ");
    }

    public static SlimefunItemStack SingCrafter = new SlimefunItemStack("ZIM_SING_CRAFTER", Material.GRAY_STAINED_GLASS,
            "&cSC奇点构造器", "", "&c疯狂, 更加疯狂", ""
    );

    public static void register(SlimefunItemStack itemStack, RecipeType type, ItemStack[] recipe) {
        register(Categories.MAIN_MATERIALS, itemStack, type, recipe);
    }

    public static void register(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        new SlimefunItem(category, item, recipeType, recipe).register(InfinityExpansion.inst());
    }

    public static ItemStack[] makeRecipe(ItemStack item, int amount) {

        List<ItemStack> recipe = new ArrayList<>();

        int stacks = (int) Math.floor(amount / 64D);
        int extra = amount % 64;

        for (int i = 0; i < stacks; i++) {
            recipe.add(new CustomItem(item, 64));
        }

        recipe.add(new CustomItem(item, extra));

        while (recipe.size() < 9) {
            recipe.add(null);
        }

        return recipe.toArray(new ItemStack[9]);
    }
}
