package cn.zimzaza4.slimefunzt;

import cn.zimzaza4.slimefunzt.World.VoidWorld;
import cn.zimzaza4.slimefunzt.listeners.ClickMac;
import cn.zimzaza4.slimefunzt.listeners.EliteMobD;
import cn.zimzaza4.slimefunzt.listeners.NormalMobD;
import cn.zimzaza4.slimefunzt.tasks.RegSFItem;
import cn.zimzaza4.slimefunzt.tasks.RegSFMachine;
import cn.zimzaza4.slimefunzt.util.SchematicUtil;
import com.sk89q.worldedit.extent.clipboard.Clipboard;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.*;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

public class SlimefunZT extends JavaPlugin implements SlimefunAddon {
    public Boolean isFAME;
    public Boolean isDebug;
    public static SlimefunZT inst;
    private static SlimefunZT Instance;
    public Clipboard void_tree;
    public Clipboard void_tree_large;
    public Clipboard stone_1;
    public Clipboard stone_2;


    public String void_world;


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
        inst = this;
        if (Bukkit.getPluginManager().getPlugin("FastAsyncWorldEdit")!=null){
            this.isFAME = true;
        } else {
            this.isFAME = false;
        }
        try {
            setupSchematic();
        }
        catch (IOException ioe){
            System.out.println("§c 加载结构失败");
        }
        if (Bukkit.getWorld("world_void") == null) {
            WorldCreator newWorld = new WorldCreator("world_void");
            newWorld.environment(World.Environment.NORMAL);
            long seed = new Random().nextLong();
            newWorld = newWorld.seed(seed);
            newWorld = newWorld.type(WorldType.NORMAL);
            newWorld = newWorld.generateStructures(false);
            newWorld = newWorld.generator(new VoidWorld());
            World w = newWorld.createWorld();
        }
        setupConfig();
        RegSFMachine.run();
        RegSFItem.run();
        if (Bukkit.getPluginManager().getPlugin("EliteMobs") != null) {
            Bukkit.getPluginManager().registerEvents(new EliteMobD(), this);
        }else {
            Bukkit.getPluginManager().registerEvents(new NormalMobD(), this);
        }
        Bukkit.getPluginManager().registerEvents(new ClickMac(), this);

        if (getConfig().getBoolean("debug-mode")==true){
            isDebug = true;
        }else {
            isDebug = false;
        }
        void_world = getConfig().getString("void-world");
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
            saveResource("void_tree.schem", true);
            saveResource("void_tree_2.schem", true);
            saveResource("stone_natural_1.schem", true);
            saveResource("stone_natural_2.schem", true);
        }
    }
    private void setupSchematic() throws IOException {
        File f = new File (getDataFolder(),"void_tree.schem");
        System.out.println("Loading "+f.getPath());
        this.void_tree = SchematicUtil.LoadSchmatic(f);

        f = new File (getDataFolder(),"void_tree_large.schem");
        System.out.println("Loading "+f.getPath());
        this.void_tree_large = SchematicUtil.LoadSchmatic(f);

        f = new File (getDataFolder(),"stone_natural_1,schem");
        System.out.println("Loading "+f.getPath());
        this.stone_1 = SchematicUtil.LoadSchmatic(f);

        f = new File (getDataFolder(),"stone_natural_2.schem");
        System.out.println("Loading "+f.getPath());
        this.stone_2 = SchematicUtil.LoadSchmatic(f);



    }
}
