package cn.zimzaza4.slimefunzt;

import cn.zimzaza4.slimefunzt.World.VoidWorld;
import cn.zimzaza4.slimefunzt.listeners.ClickMac;
import cn.zimzaza4.slimefunzt.listeners.EliteMobD;
import cn.zimzaza4.slimefunzt.tasks.RegSFItem;
import cn.zimzaza4.slimefunzt.tasks.RegSFMachine;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.*;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.Locale;
import java.util.Random;

public class SlimefunZT extends JavaPlugin implements SlimefunAddon {

    private static SlimefunZT Instance;


    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return null;
    }


    @Override
    public void onEnable() {
        Instance = this;


        if (Bukkit.getWorld("world_void")==null) {
            WorldCreator newWorld = new WorldCreator("world_void");
            newWorld.environment(World.Environment.NORMAL);
            long seed = new Random().nextLong();
            newWorld = newWorld.seed(seed);
            newWorld = newWorld.type(WorldType.NORMAL);
            newWorld = newWorld.generateStructures(false);
            newWorld = newWorld.generator(new VoidWorld());
            World w = newWorld.createWorld();
        }
        RegSFMachine.run();
        RegSFItem.run();

        Bukkit.getPluginManager().registerEvents(new EliteMobD(), this);
        Bukkit.getPluginManager().registerEvents(new ClickMac(), this);
    }

    public static SlimefunZT getInstance() {

        return Instance;
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String world, String id){
        switch (id){
            case "the_void":
                return new VoidWorld();
            default:
                return null;
        }
    }


    public   static NamespacedKey getKey(String key){
        return new NamespacedKey(Instance, key.toUpperCase(Locale.ROOT));
    }

    private void setupConfig(){
        if (!new File(getDataFolder(), "config.yml").exists()){
            saveDefaultConfig();
            saveResource("schematics", true);
        }
    }
}
