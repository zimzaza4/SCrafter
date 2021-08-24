package cn.zimzaza4.slimefunzt.machines;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Nonnull;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.lists.Items;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.InfinityCategory;
import io.github.mooy1.infinityexpansion.items.Blocks;
import io.github.mooy1.infinityexpansion.items.abstracts.AbstractEnergyCrafter;
import io.github.mooy1.infinityexpansion.utils.Util;
import io.github.mooy1.infinitylib.items.StackUtils;
import io.github.mooy1.infinitylib.presets.MenuPreset;
import io.github.mooy1.infinitylib.recipes.RecipeMap;
import io.github.mooy1.infinitylib.recipes.RecipeOutput;
import io.github.mooy1.infinitylib.recipes.ShapedRecipe;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.cscorelib2.collections.Pair;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

/**
 * A 6x6 crafting table O.o
 *
 * @author Mooy1
 */
public final class SCArmorCrafter extends AbstractEnergyCrafter {

    public static final int[] INPUT_SLOTS = {

            10, 11, 12, 19, 20, 21, 28, 29, 30
    };

    private static final int[] OUTPUT_SLOTS = {MenuPreset.OUTPUT + 27};
    private static final int STATUS_SLOT = MenuPreset.OUTPUT;
    private static final int[] STATUS_BORDER = { 0, 1, 2, 3, 4, 5, 9, 13, 14, 18, 22, 23, 27, 31, 32, 36, 37, 38, 39,
            40, 41, 45, 46, 47, 48, 49, 50, 6, 8, 15, 17, 24, 25, 26};
    private static final int RECIPE_SLOT = 7;

    public static final RecipeMap<SlimefunItemStack> RECIPES = new RecipeMap<>(ShapedRecipe::new);
    public static final LinkedHashMap<String, Pair<SlimefunItemStack, ItemStack[]>> ITEMS = new LinkedHashMap<>();
    public static final List<String> IDS = new ArrayList<>();

    public static final RecipeType TYPE = new RecipeType(new
            NamespacedKey(SlimefunZT.getInstance(), "ZIM_ARMOR_WORKBENCH"),
            Items.ArmorCrafter,
            (stacks, stack) -> {
                SlimefunItemStack item = (SlimefunItemStack) stack;
                RECIPES.put(stacks, item);
                ITEMS.put(item.getItemId(), new Pair<>(item, stacks));
                IDS.add(item.getItemId());
            }, "", "&c请在SC配方内查看正确的配方!");

    public SCArmorCrafter(Category category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe, int energy) {
        super(category, item, type, recipe, energy, STATUS_SLOT);
    }

    @Override
    protected void onBreak(@Nonnull BlockBreakEvent e, @Nonnull BlockMenu inv, @Nonnull Location l) {
        inv.dropItems(l, OUTPUT_SLOTS);
        inv.dropItems(l, INPUT_SLOTS);
    }

    @Override
    public void setupMenu(@Nonnull BlockMenuPreset blockMenuPreset) {
        for (int i : MenuPreset.OUTPUT_BORDER) {
            blockMenuPreset.addItem(i + 27, MenuPreset.OUTPUT_ITEM, ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : STATUS_BORDER) {
            blockMenuPreset.addItem(i, MenuPreset.STATUS_ITEM, ChestMenuUtils.getEmptyClickHandler());
        }
        blockMenuPreset.addItem(RECIPE_SLOT, new CustomItem(Material.BOOK, "&6配方"), ChestMenuUtils.getEmptyClickHandler());
        blockMenuPreset.addItem(STATUS_SLOT, MenuPreset.INVALID_INPUT, ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    public void onNewInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {
        menu.addMenuClickHandler(STATUS_SLOT, (p, slot, item, action) -> {
            craft(b, menu, p);
            return false;
        });
    }

    public void craft(@Nonnull Block b, @Nonnull BlockMenu inv, @Nonnull  Player p) {
        int charge = getCharge(b.getLocation());

        if (charge < this.energy) { //not enough energy
            p.sendMessage( new String[] {
                    ChatColor.RED + "没有足够的能量!",
                    ChatColor.GREEN + "所需能量: " + ChatColor.RED + charge + ChatColor.GREEN + "/" + this.energy + " J"
            });
            return;
        }

        RecipeOutput<SlimefunItemStack> output = RECIPES.get(StackUtils.arrayFrom(inv, INPUT_SLOTS));

        if (output == null) { //invalid
            p.sendMessage( ChatColor.RED + "无效配方!");
            return;
        }

        if (!inv.fits(output.getOutput(), OUTPUT_SLOTS)) { //not enough room
            p.sendMessage( ChatColor.GOLD + "空间不足!");
            return;
        }

        output.consumeInput();
        p.sendMessage( ChatColor.GREEN + "制作成功: " + ChatColor.WHITE + output.getOutput().getDisplayName());

        inv.pushItem(output.getOutput().clone(), OUTPUT_SLOTS);
        setCharge(b.getLocation(), 0);
    }

    @Override
    public void update(@Nonnull BlockMenu inv) {

        SlimefunItemStack output = RECIPES.getNoConsume(StackUtils.arrayFrom(inv, INPUT_SLOTS));

        if (output == null) { //invalid

            inv.replaceExistingItem(STATUS_SLOT, MenuPreset.INVALID_RECIPE);

        } else { //correct recipe

            inv.replaceExistingItem(STATUS_SLOT, Util.getDisplayItem(output.clone()));

        }

    }

}