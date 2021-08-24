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




    public static void SpawnSchmatic(File schematic, Location l) throws IOException {
        Clipboard cb = ClipboardFormats.findByFile(schematic).load(schematic);
        World world = new BukkitWorld(l.getWorld());
        BlockVector3 loc =   BlockVector3.at(l.getX(), l.getY(), l.getZ());
        cb.paste(world, loc, false, false, false);
    }
}
