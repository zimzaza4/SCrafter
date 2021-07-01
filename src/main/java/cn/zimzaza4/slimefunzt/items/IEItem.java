package cn.zimzaza4.slimefunzt.items;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.lists.Items;
import cn.zimzaza4.slimefunzt.machines.ie.NewSingConer;
import cn.zimzaza4.slimefunzt.util.SingCreater;
import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Categories;
import io.github.mooy1.infinityexpansion.items.Materials;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class IEItem {
    public static void setup(SlimefunZT zt) {
        System.out.println("Loading... ");

        new NewSingConer(Items.IE, IEItem.SingCrafter, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MAGSTEEL, Materials.MAGSTEEL,
                Materials.MACHINE_PLATE, Materials.MACHINE_CORE, Materials.MACHINE_PLATE,
                Items.GhostIngot, Items.GhostIngot, Items.GhostIngot

        }, 200, 2).register(SlimefunZT.getInstance());
        new SingCreater(Items.Ender_Singularity, Items.Ender_ingot, 600).register(SlimefunZT.getInstance());
        new SingCreater(Items.Nether_Singularity, Items.Nether_ingot, 600).register(SlimefunZT.getInstance());
        new SingCreater(Items.Soul_Singularity, Items.GhostIngot, 300).register(SlimefunZT.getInstance());
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

}
