package cn.zimzaza4.slimefunzt.util;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.WorldEdit;
import com.sk89q.worldedit.WorldEditException;
import com.sk89q.worldedit.bukkit.BukkitWorld;
import com.sk89q.worldedit.extent.clipboard.Clipboard;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormat;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormats;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardReader;
import com.sk89q.worldedit.function.operation.Operation;
import com.sk89q.worldedit.function.operation.Operations;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.session.ClipboardHolder;
import com.sk89q.worldedit.world.World;
import de.schlichtherle.io.FileInputStream;
import org.bukkit.Location;

import java.io.File;
import java.io.IOException;

public class SchematicUtil {




    public static void SpawnSchmatic(File schematic, Location l) throws IOException, WorldEditException {

            ClipboardFormat cb = ClipboardFormats.findByFile(schematic);
            World world = new BukkitWorld(l.getWorld());
            FileInputStream stream = new FileInputStream(schematic);
            ClipboardReader reader = cb.getReader(stream);
            Clipboard clipboard = reader.read();
            BlockVector3 loc = BlockVector3.at(l.getX(), l.getY(), l.getZ());

            EditSession editSession = WorldEdit.getInstance().newEditSession(world);
            Operation operation = new ClipboardHolder(clipboard).createPaste(editSession).to(loc).ignoreAirBlocks(true).build();
            Operations.complete(operation);

    }
}
