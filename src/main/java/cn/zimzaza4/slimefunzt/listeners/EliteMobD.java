package cn.zimzaza4.slimefunzt.listeners;

import com.magmaguy.elitemobs.api.EliteMobDeathEvent;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import cn.zimzaza4.slimefunzt.lists.Items;

public class EliteMobD implements Listener {

    @EventHandler
    public void EliteMobDeath(EliteMobDeathEvent e) {
       if (e.getEntity() instanceof LivingEntity) {
           if (e.getEliteMobEntity()!=null){


        int level = e.getEliteMobEntity().getLevel();

        LivingEntity le = (LivingEntity) e.getEntity();
        if (le.getKiller().getPlayer() != null) {
            int number = (int) Math.floor(level / 3);

            if (number > 40) {
                number = 40;
            }

            for (int i = 0; i < number; i++) {
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), Items.EM_dust);
                }
            }}
        }
    }

}
