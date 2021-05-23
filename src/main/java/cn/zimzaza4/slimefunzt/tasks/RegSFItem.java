package cn.zimzaza4.slimefunzt.tasks;

import cn.zimzaza4.slimefunzt.Items.ElectricAxe;
import cn.zimzaza4.slimefunzt.Items.IEItem;
import cn.zimzaza4.slimefunzt.Items.gear.EnderGear;
import cn.zimzaza4.slimefunzt.Items.material.EnderOre;
import cn.zimzaza4.slimefunzt.Items.material.NetherOre;
import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.machines.SCArmorCrafter;
import cn.zimzaza4.slimefunzt.machines.ZMCrafter;
import cn.zimzaza4.slimefunzt.util.Items;
import cn.zimzaza4.slimefunzt.util.RecipeTypes;
import cn.zimzaza4.slimefunzt.util.SkUtils;
import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class RegSFItem {
    public static void run(){

        IEItem.setup(SlimefunZT.getInstance() );
        SlimefunAddon plugin = SlimefunZT.getInstance();
       ItemStack[] HEALTH_Kong = {
               SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FIRE_RUNE, SlimefunItems.REINFORCED_ALLOY_INGOT,
               SlimefunItems. EARTH_RUNE, SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems. AIR_RUNE,
               SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ENDER_RUNE, SlimefunItems. REINFORCED_ALLOY_INGOT
       };
       SkUtils.regitem("ZIM_CRY_KONG", Items.Crystal_kong, Items.crystal, RecipeType.ANCIENT_ALTAR, HEALTH_Kong);



       new SlimefunItem(Items.MatCate, Items.EnderOre, RecipeType.GEO_MINER, new ItemStack[9]).register(SlimefunZT.getInstance());
       new SlimefunItem(Items.MatCate, Items.NetherOre, RecipeType.GEO_MINER, new ItemStack[9]).register(SlimefunZT.getInstance());

       EnderOre enderore = new EnderOre(SlimefunZT.getInstance(), Items.EnderOre);
        NetherOre netherore = new NetherOre(SlimefunZT.getInstance(), Items.NetherOre);
        enderore.register();
        netherore.register();
        new SlimefunItem(Items.MatCate, Items.EM_dust, RecipeTypes.KillEliteMobs, new ItemStack[9]).register(SlimefunZT.getInstance());

        new SlimefunItem(Items.MatCate,Items.Ender_ingot,RecipeType.SMELTERY, new ItemStack[]{Items. EnderOre, null, null, null, null, null, null, null,null,null} ).register(SlimefunZT.getInstance());
        new SlimefunItem(Items.MatCate,Items.Nether_ingot,RecipeType.SMELTERY, new ItemStack[]{Items. NetherOre, null, null, null, null, null, null, null,null,null} ). register(plugin);


        new EnderGear(Items.ToolCate, Items.Ender_Head, SCArmorCrafter.TYPE,  Helmet(Items.Ender_ingot),new PotionEffect[]{ new PotionEffect(PotionEffectType.NIGHT_VISION, 20,1)})          .register(SlimefunZT.getInstance());
        new SlimefunItem(Items.ToolCate,Items.Ender_Chest, SCArmorCrafter.TYPE,  Chest(Items.Ender_ingot)) . register(SlimefunZT. getInstance());
        new SlimefunItem(Items. ToolCate, Items.Ender_Leg, SCArmorCrafter.TYPE, Leg(Items.Ender_ingot))        .register(SlimefunZT. getInstance());
        new SlimefunItem(Items.ToolCate, Items.Ender_feet, SCArmorCrafter.TYPE, Boot(Items.Ender_ingot))  . register(SlimefunZT.getInstance());

        SoulMatReg(Items. EM_dust, Items.EM_bit);
        SoulMatReg(Items.EM_bit, Items.EM_sp);
        SoulMatReg(Items.EM_sp, Items.EM_soul);
       new ElectricAxe(Items.ToolCate, Items.ElectricAxe, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
               SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT
               ,SlimefunItems.SMALL_CAPACITOR, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
               null, null, null

       }).register(SlimefunZT.getInstance());
       ItemStack[] ImproveCry = CryImprover( SlimefunItems.POWER_CRYSTAL);
       SkUtils.regitem("ZIM_IMPROVE_CRY", Items.ImproveCry, Items.crystal, RecipeType.ANCIENT_ALTAR, ImproveCry);
       RegCryBuff("&a&l强化水晶&e - &b速度", "ZIM_SPEED_MAC", "&7点击获得&b速度", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDJlNGZmYzcxYzlmZDQ0NWRhNmYyNWY3ODAzNDEwNjg5N2E5YWFhY2VkNTM5Y2YxY2ZiZWU0ZGNiOThhYzNmOSJ9fX0=",new ItemStack(Material.FEATHER));
       RegCryBuff("&a&l强化水晶&e - &7抗性", "ZIM_DAMAGE_RESISTANCE_MAC", "&7点击获得&l抗性", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDJlNGZmYzcxYzlmZDQ0NWRhNmYyNWY3ODAzNDEwNjg5N2E5YWFhY2VkNTM5Y2YxY2ZiZWU0ZGNiOThhYzNmOSJ9fX0=",  new ItemStack(Material.TURTLE_HELMET));
       RegCryBuff("&a&l强化水晶&e - &e力量", "ZIM_STRONG_MAC", "&7点击获得&e力量", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2JmMDdhODcyYmJjOTg1YTZmMWE1YTI4M2IzYTZmNjVmMjgzZjM0YjEyZjE0NTY5MWZkOTQwYTVkZTNkNGExMiJ9fX0=", new ItemStack(Material.BLAZE_ROD));
       RegCryBuff("&a&l强化水晶&e - &c生命回复","ZIM_HEALTH_MAC", "&7点击获得&c生命回复","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY3NDY3YzVmNzM4YzY0MTI0NmMwOWY4Y2U3OTFlMzM5YTg2ZTgxZGU2MjA0OWI0MWY0OTI4ODgxNzJmYTcyNiJ9fX0=",   new ItemStack(Material.GHAST_TEAR));
    }
    private static void SoulMatReg(SlimefunItemStack input , SlimefunItemStack output){
       ItemStack[] soul = new ItemStack[]{input,input,input,input,input,input,input,input,input};
       new SlimefunItem(Items.MatCate, output, ZMCrafter.TYPE, soul).register(SlimefunZT.getInstance());

    }

    private static ItemStack[] CryImprover(SlimefunItemStack item){
        ItemStack[] RETURN = {
                null, item, null,
                item, new ItemStack(Material. NETHERITE_BLOCK), item,
                null, null, null

        };
        return RETURN;
    }

    private static ItemStack[] CryImprove(ItemStack item, SlimefunItemStack sti){
        ItemStack[] RETURN = {
                item, item, item,
                item, sti, item,
                item, item, item

        };
        return RETURN;
    }

    private static ItemStack[] CryEffect(ItemStack item, SlimefunItemStack sti){
        ItemStack[] RETURN = {
                item, item, item,
                item, sti, item,
                item, item, item

    };
        return RETURN;
    }
    private static void RegCryBuff(String itemname, String itemid, String  lore, String textures, ItemStack Base){
        SlimefunItemStack Level1 = new SlimefunItemStack(itemid, textures, itemname, "", lore + "I");
        ItemStack[] basecraft =  CryEffect(Base,  Items.Crystal_kong);
         SkUtils.regitem(itemid, Level1, Items.crystal, RecipeType.ANCIENT_ALTAR, basecraft);
        ItemStack[] improvecry1 = CryImprove(Items.ImproveCry, Level1);
        SlimefunItemStack Level2= new SlimefunItemStack(itemid+"_II", textures, itemname+ " II", "", lore + "II");
        SkUtils.regitem(itemid+"_II", Level2, Items.crystal, RecipeType.ANCIENT_ALTAR, improvecry1);
        ItemStack[] improvecry2 = CryImprove(Items.ImproveCry, Level2);
        SlimefunItemStack Level3= new SlimefunItemStack(itemid+"_III", textures, itemname+ " III", "", lore + "III");
        SkUtils.regitem(itemid+"_III", Level3, Items.crystal, RecipeType.ANCIENT_ALTAR, improvecry2);


    }
    private static ItemStack[] Helmet(SlimefunItemStack si ){
        return  new ItemStack [] { si,si,si,si,null,si,null,null,null};
    }
private static ItemStack[] Chest(SlimefunItemStack si ){
    return  new ItemStack [] { si,null,si,si,si,si,si,si,si}    ;
}
 private static ItemStack[] Leg(SlimefunItemStack si ){
       return  new ItemStack [] { si,si,si,si,null,si, si,null,si}        ;
     }
                      private static ItemStack[] Boot(SlimefunItemStack si ){
                              return  new ItemStack [] { null,null,null,si,null,si,si,null,si}  ;  }}