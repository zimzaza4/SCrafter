package cn.zimzaza4.slimefunzt.listeners;

import cn.zimzaza4.slimefunzt.util.BuffCheck;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffectType;

public class ClickMac implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {

            BuffCheck.Check(p, "ZIM_HEALTH_MAC", e.getClickedBlock(), PotionEffectType.REGENERATION);
            BuffCheck.Check(p, "ZIM_STRONG_MAC", e.getClickedBlock(), PotionEffectType.INCREASE_DAMAGE);
            BuffCheck.Check(p, "ZIM_SPEED_MAC", e.getClickedBlock(), PotionEffectType.SPEED);
            BuffCheck.Check(p, "ZIM_DAMAGE_RESISTANCE", e.getClickedBlock(), PotionEffectType.DAMAGE_RESISTANCE);
        }
    }

}
