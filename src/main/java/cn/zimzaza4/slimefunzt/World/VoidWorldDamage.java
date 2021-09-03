package cn.zimzaza4.slimefunzt.World;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collection;

public class VoidWorldDamage {

    public void start(){
        new BukkitRunnable() {
            @Override
            public void run() {
                Collection<? extends Player> allplayers = Bukkit.getServer().getOnlinePlayers();
                for (Player p : allplayers){
                    if (p.getWorld().getName()== SlimefunZT.inst.void_world){

                    }
                }
            }
        }.runTaskTimer(SlimefunZT.inst, 10, 20);
    }
}


