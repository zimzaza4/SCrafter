package cn.zimzaza4.slimefunzt;

import cn.zimzaza4.slimefunzt.listeners.EliteMobD;
import cn.zimzaza4.slimefunzt.listeners.ClickMac;
import cn.zimzaza4.slimefunzt.tasks.RegSFItem;
import cn.zimzaza4.slimefunzt.tasks.RegSFMachine;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SlimefunZT extends JavaPlugin implements SlimefunAddon {

    private static SlimefunZT Instance;

    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public String getBugTrackerURL() {
        return "wnm";
    }

    @Override
    public void onEnable() {
        Instance = this;
        RegSFMachine.run();
        RegSFItem.run();
        Bukkit.getPluginManager().registerEvents(new EliteMobD(), this);
        Bukkit.getPluginManager().registerEvents(new ClickMac(), this);
    }

    public static SlimefunZT getInstance() {

        return Instance;
    }

}
