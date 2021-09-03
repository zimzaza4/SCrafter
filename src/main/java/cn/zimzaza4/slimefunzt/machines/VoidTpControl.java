package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class VoidTpControl extends SlimefunItem implements EnergyNetComponent {
    public VoidTpControl(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        new BlockMenuPreset(getId(), "&c&l虚空传送控制器") {
            @Override
            public void init() {

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
        };
       addItemHandler(new BlockTicker(){

           @Override
           public boolean isSynchronized() {
               return true;
           }

           @Override
           public void tick(Block block, SlimefunItem slimefunItem, Config config) {

           }
       });
    }


    @NotNull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return 3000;
    }
}
