package cn.zimzaza4.slimefunzt.Items;

import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class ElectricAxe extends SlimefunItem implements Rechargeable {
    public ElectricAxe(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

    }

    @Override
    public float getMaxItemCharge(ItemStack itemStack) {
        return 300;

    }
    @Nonnull
    protected ToolUseHandler getItemUseHandler(){
        return ((e, tool, f,d)-> {

           if (getItemCharge(tool)>=5F){
                removeItemCharge( tool, 5F);

           }
           else{
               e.getPlayer().sendMessage("§c没电了");
               e.setCancelled(true);
           }

        });
    };
    @Override
     public void preRegister(){
        addItemHandler(getItemUseHandler());
    }
}
