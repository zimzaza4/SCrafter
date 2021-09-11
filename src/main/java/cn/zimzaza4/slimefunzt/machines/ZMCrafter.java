package cn.zimzaza4.slimefunzt.machines;

import cn.zimzaza4.slimefunzt.lists.Items;
import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.mooy1.infinitylib.machines.CraftingBlock;
import io.github.mooy1.infinitylib.machines.MachineLayout;
import io.github.mooy1.infinitylib.machines.MachineRecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * A 6x6 crafting table O.o
 *
 * @author Mooy1
 */
public final class ZMCrafter extends CraftingBlock implements EnergyNetComponent {


    public static final int[] INPUT_SLOTS = {

            10, 11 ,12,
            19, 20, 21,
            28, 29, 30

    };
    private static final int RECIPE_SLOT = 7;
    public static final MachineRecipeType TYPE = new MachineRecipeType("sc_s_crafter",
            Items.ArmorCrafter);

    private final int energy;

    public ZMCrafter(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe, int energy) {
        super(category, item, type, recipe);
        addRecipesFrom(TYPE);
        layout(new MachineLayout()
                .inputSlots(INPUT_SLOTS)
                .outputSlots(new int[] { 43 })
                .statusSlot(16)
                .inputBorder(new int[] {0,2,3,4,5,9,13, 18, 22, 27, 31, 36, 37,38,39, 40,41, 45, 46, 47,48,49,50})
                .outputBorder(new int[] {
                        33, 34, 35,
                        42, 44,
                        51, 52, 53
                }).background(new int[] {
                        6, 8, 15, 17, 24, 25, 26
                })
        );
        this.energy = energy;
    }

    @Override
    protected void setup(BlockMenuPreset preset) {
        super.setup(preset);
        preset.addItem(RECIPE_SLOT, new CustomItemStack(Material.BOOK, "&6Recipes"), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    protected void onNewInstance(BlockMenu menu, Block b) {
        super.onNewInstance(menu, b);
        menu.addMenuClickHandler(RECIPE_SLOT, (p, slot, item, action) -> {

            return false;
        });
    }

    @Override
    protected void craft(Block b, BlockMenu menu, Player p) {
        int charge = getCharge(menu.getLocation());
        if (charge < this.energy) {
            p.sendMessage(
                    ChatColor.RED + "能量不足"  );
        }
        else {
            super.craft(b, menu, p);
        }
    }

    @Override
    protected void onSuccessfulCraft(BlockMenu menu, ItemStack toOutput) {
        setCharge(menu.getLocation(), 0);
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return this.energy;
    }

}
