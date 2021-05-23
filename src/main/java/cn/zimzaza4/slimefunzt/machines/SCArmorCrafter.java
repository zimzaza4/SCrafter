package cn.zimzaza4.slimefunzt.machines;


import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.util.Items;
import io.github.mooy1.infinityexpansion.implementation.abstracts.AbstractEnergyCrafter;
import io.github.mooy1.infinityexpansion.infinitylib.slimefun.presets.MenuPreset;
import io.github.mooy1.infinityexpansion.infinitylib.slimefun.recipes.inputs.MultiInput;
import io.github.mooy1.infinityexpansion.utils.Util;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.cscorelib2.collections.Pair;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.*;

public class SCArmorCrafter extends AbstractEnergyCrafter {


    public static final int[] INPUT_SLOTS = {

            10, 11, 12,
            19, 20, 21,
            28, 29, 30


    };

    private static final int[] OUTPUT_SLOTS = {MenuPreset.slot3 + 27};
    private static final int STATUS_SLOT = MenuPreset.slot3;
    private static final int[] STATUS_BORDER = {0, 1, 2, 3, 4, 5,
            9, 13, 14,
            18, 22, 23,
            27, 31, 32,
            36, 37, 38, 39, 40, 41,
            45, 46, 47, 48, 49, 50, 6, 8, 15, 17, 24, 25, 26};
    private static final int RECIPE_SLOT = 7;

    public static final Map<MultiInput, ItemStack> RECIPES = new HashMap<>();
    public static final LinkedHashMap<String, Pair<SlimefunItemStack, ItemStack[]>> ITEMS = new LinkedHashMap<>();
    public static final List<String> IDS = new ArrayList<>();

    public static final RecipeType TYPE = new RecipeType(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_ARMOR_WORKBENCH"), Items.ArmorCrafter, (stacks, stack) -> {
        SlimefunItemStack item = (SlimefunItemStack) stack;
        RECIPES.put(new MultiInput(stacks), item);
        ITEMS.put(item.getItemId(), new Pair<>(item, stacks));
        IDS.add(item.getItemId());
    }, "");

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
        for (int i : MenuPreset.slotChunk3) {
            blockMenuPreset.addItem(i + 27, MenuPreset.borderItemOutput, ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : STATUS_BORDER) {
            blockMenuPreset.addItem(i, MenuPreset.borderItemStatus, ChestMenuUtils.getEmptyClickHandler());
        }
        blockMenuPreset.addItem(RECIPE_SLOT, new CustomItem(Material.BOOK, "&a工作台"), ChestMenuUtils.getEmptyClickHandler());
        blockMenuPreset.addItem(STATUS_SLOT, MenuPreset.invalidInput, ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    public void onNewInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {
        menu.addMenuClickHandler(STATUS_SLOT, (p, slot, item, action) -> {
            craft(b, menu, p);
            return false;
        });
    }


    public void craft(@Nonnull Block b, @Nonnull BlockMenu inv, @Nonnull Player p) {
        int charge = getCharge(b.getLocation());

        if (charge < this.energy) { //not enough energy
            p.sendMessage(new String[]{
                    ChatColor.RED + "电量不足了",
                    ChatColor.GREEN + "电量: " + ChatColor.RED + charge + ChatColor.GREEN + "/" + this.energy + " J"
            });
            return;
        }

        ItemStack output = RECIPES.get(new MultiInput(inv, INPUT_SLOTS));

        if (output == null) { //invalid
            p.sendMessage(ChatColor.RED + "无效的配方");
            return;
        }

        if (!inv.fits(output, OUTPUT_SLOTS)) { //not enough room
            p.sendMessage(ChatColor.GOLD + "空间不足");
            return;
        }

        for (int slot : INPUT_SLOTS) {
            if (inv.getItemInSlot(slot) != null) {
                inv.consumeItem(slot, 1);
            }
        }

        p.sendMessage(ChatColor.GREEN + "成功合成: " + ChatColor.WHITE + output.getItemMeta().getDisplayName());

        inv.pushItem(output.clone(), OUTPUT_SLOTS);
        setCharge(b.getLocation(), 0);

    }

    @Override
    public void update(@Nonnull BlockMenu inv) {

        ItemStack output = RECIPES.get(new MultiInput(inv, INPUT_SLOTS));

        if (output == null) { //invalid

            inv.replaceExistingItem(STATUS_SLOT, MenuPreset.invalidRecipe);

        } else { //correct recipe

            inv.replaceExistingItem(STATUS_SLOT, Util.getDisplayItem(output.clone()));

        }

    }

}
