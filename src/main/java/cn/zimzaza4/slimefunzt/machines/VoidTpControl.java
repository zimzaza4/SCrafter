package cn.zimzaza4.slimefunzt.machines;

import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import me.mrCookieSlime.Slimefun.cscorelib2.protection.ProtectableAction;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class VoidTpControl extends SlimefunItem implements EnergyNetComponent {
    public VoidTpControl(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        new BlockMenuPreset(getId(), "&c&l虚空传送控制器") {
            @Override
            public void init() {

            }

            @Override
            public boolean canOpen(@NotNull Block block, @NotNull Player player) {
                if (player.hasPermission("slimefun.inventory.bypass")|| SlimefunPlugin.getProtectionManager().hasPermission(player, block, ProtectableAction.INTERACT_BLOCK)){
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
