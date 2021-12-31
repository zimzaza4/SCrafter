package cn.zimzaza4.slimefunzt.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Weapon {
    public static void setWeaponType(ItemStack item, Type type) {

        ItemMeta meta = item.getItemMeta();

    }




    public enum Type{
        SWORD,
        BOW,
        AXE,
        CROSSBOW,
        GUN,
        MAGE
    }
}
