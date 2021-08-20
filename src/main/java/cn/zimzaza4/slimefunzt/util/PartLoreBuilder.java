package cn.zimzaza4.slimefunzt.util;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class PartLoreBuilder {
    public String PartLoreLine = "§7• §e-- §l配件:";
    public String PartStartwith = "§7-> §l[+]§r";
    public List<String> getPartLores(ItemStack item){
        if (item.getItemMeta().hasLore()){
            List<String> lores = item.getItemMeta().getLore();
            List <String> lreturn = new ArrayList<>();
            for (String lore: lores){
                if (lore.startsWith(PartStartwith)){
                    lreturn.add(lore);
                }
            }
            return lreturn;
        }
        return null;
    }
    public void ChangeItemPartLore(ItemStack item, String Line, String Startwith, String AddLine) {
        List<String> r = item.getItemMeta().getLore();
        List<String> nowr = new ArrayList<>();
        int i = 0;
        for (String lore : item.getItemMeta().getLore()) {

            if (lore.equals(Line)) {
                r.remove(Line);
                r.add(Line);
            } else if (lore.startsWith(Startwith)) {
                r.remove(i);
                r.add(lore);
            }
            i++;

        }
        item.getItemMeta().setLore(r);
    }

}
