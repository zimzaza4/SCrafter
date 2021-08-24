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
            Clipboard cb;
            ClipboardFormat format = ClipboardFormats.findByFile(schematic);
            World world = new BukkitWorld(l.getWorld());
            try (ClipboardReader reader = format.getReader(new FileInputStream(schematic))) {
                    cb = reader.read();
            }
            try (EditSession editSession = WorldEdit.getInstance().newEditSession(world)) {
                    Operation operation = new ClipboardHolder(cb)
                            .createPaste(editSession)
                            .to(BlockVector3.at(l.getX(), l.getY(), l.getZ()))
                            // configure here
                            .build();
                    Operations.complete(operation);
            }




    }
}
