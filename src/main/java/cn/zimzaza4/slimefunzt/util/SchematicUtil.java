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
    public void SpawnSchmatic(File schematic, Location l) throws IOException
    {
        World world = new BukkitWorld(l.getWorld());
        BlockVector3 to = BlockVector3.at(l.getBlockX(), l.getBlockY(),l.getBlockZ());
        Clipboard cb = ClipboardFormats.findByFile(schematic).load(schematic);
        cb.paste(world, to, false);

}}
