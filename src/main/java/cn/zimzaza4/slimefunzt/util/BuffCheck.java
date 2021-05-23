package cn.zimzaza4.slimefunzt.util;

import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BuffCheck {
    public static void Check(Player p, String itemid, Block b, PotionEffectType type) {
        if (BlockStorage.checkID(b) != null && BlockStorage.checkID(b).contains(itemid)) {
            String BS = BlockStorage.checkID(b).replaceAll(itemid, "");
            p.sendMessage("§a§o已获得强化");

            if (BS.equals("_II")) {
                PotionEffect po = new PotionEffect(type, 1200, 1);
                p.addPotionEffect(po);
            } else if (BS.equals("_III")) {
                PotionEffect po = new PotionEffect(type, 1600, 2);
                p.addPotionEffect(po);
            } else if (BS.equals("_IIII")) {
                PotionEffect po = new PotionEffect(type, 1900, 3);
                p.addPotionEffect(po);
            } else {
                PotionEffect po = new PotionEffect(type, 1200, 0);
                p.addPotionEffect(po);
            }

        }
    }
}
