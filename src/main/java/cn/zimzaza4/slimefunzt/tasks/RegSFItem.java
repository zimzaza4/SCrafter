package cn.zimzaza4.slimefunzt.tasks;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.items.ElectricAxe;
import cn.zimzaza4.slimefunzt.items.IEItem;
import cn.zimzaza4.slimefunzt.items.gear.EnderGear;
import cn.zimzaza4.slimefunzt.items.material.EnderOre;
import cn.zimzaza4.slimefunzt.items.material.NetherOre;
import cn.zimzaza4.slimefunzt.lists.Items;
import cn.zimzaza4.slimefunzt.machines.SCArmorCrafter;
import cn.zimzaza4.slimefunzt.machines.SoulInfinityMageTable;
import cn.zimzaza4.slimefunzt.util.RecipeTypes;
import cn.zimzaza4.slimefunzt.util.SkUtils;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RegSFItem {
    public static void run() {

        IEItem.setup(SlimefunZT.getInstance());
        SlimefunAddon plugin = SlimefunZT.getInstance();
        ItemStack[] HEALTH_Kong = {SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FIRE_RUNE,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.EARTH_RUNE, SlimefunItems.ANCIENT_PEDESTAL,
                SlimefunItems.AIR_RUNE, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ENDER_RUNE,
                SlimefunItems.REINFORCED_ALLOY_INGOT};
        SkUtils.regitem("ZIM_CRY_KONG", Items.Crystal_kong, Items.crystal, RecipeType.ANCIENT_ALTAR, HEALTH_Kong);

        new SlimefunItem(Items.MatCate, Items.EnderOre, RecipeType.GEO_MINER, new ItemStack[9])
                .register(SlimefunZT.getInstance());
        new SlimefunItem(Items.MatCate, Items.NetherOre, RecipeType.GEO_MINER, new ItemStack[9])
                .register(SlimefunZT.getInstance());

        EnderOre enderore = new EnderOre(SlimefunZT.getInstance(), Items.EnderOre);
        NetherOre netherore = new NetherOre(SlimefunZT.getInstance(), Items.NetherOre);
        enderore.register();
        netherore.register();
        new SlimefunItem(Items.MatCate, Items.EM_dust, RecipeTypes.KillEliteMobs, new ItemStack[9])
                .register(SlimefunZT.getInstance());

        new SlimefunItem(Items.MatCate, Items.Ender_ingot, RecipeType.SMELTERY,
                new ItemStack[]{Items.EnderOre, null, null, null, null, null, null, null, null})
                .register(SlimefunZT.getInstance());
        new SlimefunItem(Items.MatCate, Items.Nether_ingot, RecipeType.SMELTERY,
                new ItemStack[]{Items.NetherOre, null, null, null, null, null, null, null, null})
                .register(plugin);
        new SlimefunItem(Items.MatCate, Items.EM_boss_soul, RecipeTypes.KillBossMobs, new ItemStack[9])
                .register(SlimefunZT.getInstance());

        new EnderGear(Items.ToolCate, Items.Ender_Head, SCArmorCrafter.TYPE, Helmet(Items.Ender_ingot),
                new PotionEffect[]{new PotionEffect(PotionEffectType.NIGHT_VISION, 20, 1)})
                .register(SlimefunZT.getInstance());
        new SlimefunItem(Items.ToolCate, Items.Ender_Chest, SCArmorCrafter.TYPE, Chest(Items.Ender_ingot))
                .register(SlimefunZT.getInstance());
        new SlimefunItem(Items.ToolCate, Items.Ender_Leg, SCArmorCrafter.TYPE, Leg(Items.Ender_ingot))
                .register(SlimefunZT.getInstance());
        new SlimefunItem(Items.ToolCate, Items.Ender_feet, SCArmorCrafter.TYPE, Boot(Items.Ender_ingot))
                .register(SlimefunZT.getInstance());


        new SlimefunArmorPiece(Items.ToolCate, Items.gold_Head, RecipeType.ENHANCED_CRAFTING_TABLE, Helmet(new ItemStack(Material.GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 400, 0)})

                .register(SlimefunZT.getInstance());


        new SlimefunArmorPiece(Items.ToolCate, Items.gold_Chest, RecipeType.ENHANCED_CRAFTING_TABLE, Chest(new ItemStack(Material.GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.REGENERATION, 120, 0)})

                .register(SlimefunZT.getInstance());


        new SlimefunArmorPiece(Items.ToolCate, Items.gold_Leg, RecipeType.ENHANCED_CRAFTING_TABLE, Leg(new ItemStack(Material.GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 120, 0)})

                .register(SlimefunZT.getInstance());

        new SlimefunArmorPiece(Items.ToolCate, Items.gold_feet, RecipeType.ENHANCED_CRAFTING_TABLE, Boot(new ItemStack(Material.GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 120, 0)})

                .register(SlimefunZT.getInstance());


        new SlimefunArmorPiece(Items.ToolCate, Items.e_gold_Head, RecipeType.ENHANCED_CRAFTING_TABLE, Helmet(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 400, 1)})

                .register(SlimefunZT.getInstance());


        new SlimefunArmorPiece(Items.ToolCate, Items.e_gold_Chest, RecipeType.ENHANCED_CRAFTING_TABLE, Chest(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.REGENERATION, 120, 1)})

                .register(SlimefunZT.getInstance());


        new SlimefunArmorPiece(Items.ToolCate, Items.e_gold_Leg, RecipeType.ENHANCED_CRAFTING_TABLE, Leg(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 120, 1)})

                .register(SlimefunZT.getInstance());

        new SlimefunArmorPiece(Items.ToolCate, Items.e_gold_feet, RecipeType.ENHANCED_CRAFTING_TABLE, Boot(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE)),

                new PotionEffect[]{new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 120, 1)})

                .register(SlimefunZT.getInstance());


        SoulMatReg(Items.EM_dust, Items.EM_bit);
        SoulMatReg(Items.EM_bit, Items.EM_sp);
        SoulMatReg(Items.EM_sp, Items.EM_soul);
        new SlimefunItem(Items.MatCate, Items.GhostIngot, RecipeType.SMELTERY, new ItemStack[]{
                Items.Ender_ingot, Items.EM_soul, Items.EM_soul
                , Items.EM_soul, null, null,
                null, null, null


        }).register(SlimefunZT.getInstance());

        new SlimefunItem(Items.ToolCate, Items.Soul_Sword, RecipeType.ARMOR_FORGE, new ItemStack[]{
                null, Items.GhostIngot, null
                , null, Items.GhostIngot, null,
                null, new ItemStack(Material.STICK), null
        }).register(SlimefunZT.getInstance());
        new ElectricAxe(Items.ToolCate, Items.ElectricAxe, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.SMALL_CAPACITOR,
                        SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD, null, null, null

                }).register(SlimefunZT.getInstance());
        ItemStack[] ImproveCry = CryImprover(SlimefunItems.POWER_CRYSTAL);
        SkUtils.regitem("ZIM_IMPROVE_CRY", Items.ImproveCry, Items.crystal, RecipeType.ANCIENT_ALTAR, ImproveCry);
        RegCryBuff("&a&l强化水晶&e - &b速度",
                      "ZIM_SPEED_MAC",
                       "&7点击以获得&b速度",
                    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDJlNGZmYzcxYzlmZDQ0NWRhNmYyNWY3ODAzNDEwNjg5N2E5YWFhY2VkNTM5Y2YxY2ZiZWU0ZGNiOThhYzNmOSJ9fX0=",
                new ItemStack(Material.FEATHER));

        RegCryBuff("&a&l强化水晶&e - &7抗性",
                    "ZIM_DAMAGE_RESISTANCE_MAC",
                     "&7点击以获得&l抗性",
                  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDJlNGZmYzcxYzlmZDQ0NWRhNmYyNWY3ODAzNDEwNjg5N2E5YWFhY2VkNTM5Y2YxY2ZiZWU0ZGNiOThhYzNmOSJ9fX0=",
                new ItemStack(Material.TURTLE_HELMET));

        RegCryBuff("&a&l强化水晶&e - &e力量",
                      "ZIM_STRONG_MAC",
                      "&7点击以获得&e力量",
                   "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2JmMDdhODcyYmJjOTg1YTZmMWE1YTI4M2IzYTZmNjVmMjgzZjM0YjEyZjE0NTY5MWZkOTQwYTVkZTNkNGExMiJ9fX0=",
                new ItemStack(Material.BLAZE_ROD));

        RegCryBuff("&a&l强化水晶&e - &c生命回复",
                     "ZIM_HEALTH_MAC",
                       "&7点击以获得&c生命回复",
                    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY3NDY3YzVmNzM4YzY0MTI0NmMwOWY4Y2U3OTFlMzM5YTg2ZTgxZGU2MjA0OWI0MWY0OTI4ODgxNzJmYTcyNiJ9fX0=",
                new ItemStack(Material.GHAST_TEAR));

        new SoulInfinityMageTable(Items.NB, Items.Soul_IE_mage_table, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{Items.Soul_IE_ingot, Items.Soul_IE_ingot, Items.Soul_IE_ingot,
                Items.Soul_IE_ingot, Materials.INFINITE_CORE, Items.Soul_IE_ingot,
                Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE}).register(SlimefunZT.getInstance());
        new SlimefunItem(Items.NB, Items.Soul_Amey, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{Items.Soul_Singularity, new ItemStack(Material.AMETHYST_BLOCK), null, null, null, null, null, null, null}).register(SlimefunZT.getInstance());

        new SlimefunItem(Items.NB, Items.IE_Soul_f, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null, Materials.NETHERITE_SINGULARITY, null, null, Items.EM_soul, null, null, null, null}).register(SlimefunZT.getInstance());

        new SlimefunItem(Items.NB, Items.IE_Soul_torch, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null, new ItemStack(Material.SOUL_TORCH)}).register(SlimefunZT.getInstance());

        new SlimefunItem(Items.NB, Items.IE_Soul_Glass, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null, new ItemStack(Material.GLASS), null, null, Items.Soul_IE_ingot, null, null, new ItemStack(Material.BLACK_STAINED_GLASS), null}).register(SlimefunZT.getInstance());

        new SlimefunItem(Items.MatCate, Items.Void_Ore_Ame, RecipeTypes.Natural, new ItemStack[9]).register(SlimefunZT.getInstance());
    }


    private static void SoulMatReg(SlimefunItemStack input, SlimefunItemStack output) {
        ItemStack[] soul = new ItemStack[] { input, input, input, input, input, input, input, input, input };
        new SlimefunItem(Items.MatCate, output, RecipeTypes.SoulCraft, soul).register(SlimefunZT.getInstance());

    }

    private static ItemStack[] CryImprover(SlimefunItemStack item) {
        ItemStack[] RETURN = { null, item, null, item, new ItemStack(Material.NETHERITE_BLOCK), item, null, null, null

        };
        return RETURN;
    }

    private static ItemStack[] CryImprove(ItemStack item, SlimefunItemStack sti) {
        ItemStack[] RETURN = { item, item, item, item, sti, item, item, item, item

        };
        return RETURN;
    }

    private static ItemStack[] CryEffect(ItemStack item, SlimefunItemStack sti) {
        ItemStack[] RETURN = { item, item, item, item, sti, item, item, item, item

        };
        return RETURN;
    }

    private static void RegCryBuff(String itemname, String itemid, String lore, String textures, ItemStack Base) {
        SlimefunItemStack Level1 = new SlimefunItemStack(itemid, textures, itemname, "", lore + "I");
        ItemStack[] basecraft = CryEffect(Base, Items.Crystal_kong);
        SkUtils.regitem(itemid, Level1, Items.crystal, RecipeType.ANCIENT_ALTAR, basecraft);
        ItemStack[] improvecry1 = CryImprove(Items.ImproveCry, Level1);
        SlimefunItemStack Level2 = new SlimefunItemStack(itemid + "_II", textures, itemname + " II", "", lore + "II");
        SkUtils.regitem(itemid + "_II", Level2, Items.crystal, RecipeType.ANCIENT_ALTAR, improvecry1);
        ItemStack[] improvecry2 = CryImprove(Items.ImproveCry, Level2);
        SlimefunItemStack Level3 = new SlimefunItemStack(itemid + "_III", textures, itemname + " III", "",
                lore + "III");
        SkUtils.regitem(itemid + "_III", Level3, Items.crystal, RecipeType.ANCIENT_ALTAR, improvecry2);

    }

    private static ItemStack[] Helmet(ItemStack si) {
        return new ItemStack[] { si, si, si, si, null, si, null, null, null };
    }

    private static ItemStack[] Chest(ItemStack si) {
        return new ItemStack[] { si, null, si, si, si, si, si, si, si };
    }

    private static ItemStack[] Leg(ItemStack si) {
        return new ItemStack[] { si, si, si, si, null, si, si, null, si };
    }

    private static ItemStack[] Boot(ItemStack si) {
        return new ItemStack[] { null, null, null, si, null, si, si, null, si };
    }
}
