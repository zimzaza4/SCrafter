package cn.zimzaza4.slimefunzt.listeners;

import com.magmaguy.elitemobs.api.EliteMobDeathEvent;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Particle;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import cn.zimzaza4.slimefunzt.lists.Items;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

public class EliteMobD implements Listener {

    @EventHandler
    public void MobD(EntityDamageEvent e){
        if (e.getEntity()instanceof LivingEntity){
            LivingEntity l = (LivingEntity) e.getEntity();
            if (l.getKiller().getPlayer()!=null){
                if(l.getKiller().getPlayer().getEquipment().getItemInMainHand()!=null&&SlimefunItem.getByItem(l.getKiller().getPlayer().getEquipment().getItemInMainHand()).getId()=="ZIM_SOUL_SWORD")
                    l.getLocation().getWorld().spawnParticle(Particle.SOUL, l.getLocation(), 1);
                }
            }}
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

            if(le.getKiller().getPlayer().getEquipment().getItemInMainHand()!=null&&SlimefunItem.getByItem(le.getKiller().getPlayer().getEquipment().getItemInMainHand()).getId()=="ZIM_SOUL_SWORD"){
                number = (int) (number*1.5);
            }


            for (int i = 0; i < number; i++) {
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), Items.EM_dust);
                }
            }}
        }
    }

}
