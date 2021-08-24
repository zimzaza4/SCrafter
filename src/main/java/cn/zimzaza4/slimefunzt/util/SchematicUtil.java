package cn.zimzaza4.slimefunzt.util;

import com.sk89q.worldedit.bukkit.BukkitWorld;
import com.sk89q.worldedit.extent.clipboard.Clipboard;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormats;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.world.World;
import org.bukkit.Location;

import java.io.File;
import java.io.IOException;

public class SchematicUtil {

    public static Clipboard LoadSchmatic(File schematic) throws IOException {

        Clipboard cb = ClipboardFormats.findByFile(schematic).load(schematic);
        return cb;

    }

    public static void SpawnSchmatic(Clipboard cb, Location l){
        World world = new BukkitWorld(l.getWorld());
        BlockVector3 loc = BlockVector3.at(l.getX(), l.getY(), l.getZ());
        cb.paste(world, loc, false);
    }
}
