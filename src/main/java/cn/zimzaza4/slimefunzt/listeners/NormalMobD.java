package cn.zimzaza4.slimefunzt.listeners;

import cn.zimzaza4.slimefunzt.lists.Items;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class NormalMobD implements Listener {
    @EventHandler
    public void MobDeathEvent(EntityDeathEvent event) {
        if (event.getEntity().getKiller() != null){
          Player p =event.getEntity().getKiller().getPlayer();
            if (p!=null) {
                int number = 1;



                if(event.getEntity().getKiller().getPlayer().getEquipment().getItemInMainHand()!=null&& SlimefunItem.getByItem(event.getEntity().getKiller().getPlayer().getEquipment().getItemInMainHand())!=null&&SlimefunItem.getByItem(event.getEntity().getKiller().getPlayer().getEquipment().getItemInMainHand()).getId()=="ZIM_SOUL_SWORD"){
                    number =3;
                }


                if (number > 0){

                    event.getEntity().getWorld().dropItem(event.getEntity().getLocation(), new SlimefunItemStack(Items.EM_dust, number ));


                }
            }
        }
    }
}
