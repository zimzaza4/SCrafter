package cn.zimzaza4.slimefunzt.util;

import cn.zimzaza4.slimefunzt.SlimefunZT;
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
import org.bukkit.Location;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SchematicUtil {



    public static Clipboard LoadSchmatic(File file) throws FileNotFoundException {
            Clipboard clipboard = null;

            ClipboardFormat format = ClipboardFormats.findByFile(file);
            try {
                assert format != null;
                try (ClipboardReader reader = format.getReader(new FileInputStream(file))) {
                        clipboard = reader.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return clipboard;
    }
    public static void SpawnSchmatic(Clipboard cb, Location l) throws WorldEditException {
            if (SlimefunZT.getInstance().isFAME==true){
                try (EditSession editSession = WorldEdit.getInstance().getEditSessionFactory().getEditSession(new BukkitWorld(l.getWorld()), -1)) {
                    Operation operation = new ClipboardHolder(cb)
                            .createPaste(editSession)
                            .to(BlockVector3.at(l.getX(), l.getY(), l.getZ()))
                            // configure here
                            .ignoreAirBlocks(true)
                            .build();
                    Operations.complete(operation);
                    editSession.flushSession();
                    editSession.close();
                }
            }else{
            try (EditSession editSession = WorldEdit.getInstance().newEditSession(new BukkitWorld(l.getWorld()))) {
                    Operation operation = new ClipboardHolder(cb)
                            .createPaste(editSession)
                            .to(BlockVector3.at(l.getX(), l.getY(), l.getZ()))
                            // configure here
                            .ignoreAirBlocks(true)

                            .build();
                    Operations.complete(operation);
                    editSession.close();
            }}
    }


}
