package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class VoidTpControl extends SlimefunItem implements EnergyNetComponent {
    private int[] BOARD = new int[]
            {0,1,2,3,4,5,6,7,8,
             9,  11,12,  14,15,  17,
             18,19,20,21,22,23,24,25,26};

    public VoidTpControl(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        new BlockMenuPreset(getId(), "&c&l虚空传送控制器") {
            @Override
            public void init() {
                setupMenu(this);
            }

            @Override
            public boolean canOpen(@NotNull Block block, @NotNull Player player) {
                if (player.hasPermission("slimefun.inventory.bypass")|| Slimefun.getProtectionManager().hasPermission(player, block, Interaction.INTERACT_BLOCK)){
                    return true;
                }   else{
                    return false;
                }
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow itemTransportFlow) {
                return new int[0];
            }

            @Override
            public void newInstance(@NotNull BlockMenu menu, @NotNull Block b) {
                super.newInstance(menu, b);
                menu.addMenuClickHandler(13, (player, i, itemStack, clickAction) -> {


                    return false;

                });
            }
        };


    }

    private void setupMenu(BlockMenuPreset present){

        for (int i : BOARD) {

            present.addItem( i, new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE), ChestMenuUtils.getEmptyClickHandler());

        }

    }



    public final void postRegister() {

    }

    private void openVoidDoor(){

    }






    @NotNull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }



    @Override
    public int getCapacity() {
        return 0;
    }

}
