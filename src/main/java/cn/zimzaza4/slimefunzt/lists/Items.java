package cn.zimzaza4.slimefunzt.lists;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;


public class Items {

        public static NestedItemGroup Main_Cate = new NestedItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MAIN_CATE"), new CustomItemStack(Material.NETHERITE_BLOCK, "&cSiciliaCraft"));
        public static SubItemGroup Cate = new SubItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_D"),Main_Cate,
                        new CustomItemStack(Material.BLACK_STAINED_GLASS, "&e&l SC拓展 &7- &6机器"));

        public static SubItemGroup MatCate = new SubItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MAT"),Main_Cate,
                        new CustomItemStack(Material.GOLD_ORE, "&e&l SC拓展 &7- &d材料"));

        public static SubItemGroup crystal = new SubItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_D_C"),Main_Cate,
                        new CustomItemStack(Material.DIAMOND, "&e&l SC拓展 &7- &9强化"));

        public static SubItemGroup ToolCate = new SubItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_TOOL"),Main_Cate,
                        new CustomItemStack(Material.DIAMOND_PICKAXE, "&b&l SC拓展 &7- &6工具"));

        public static SubItemGroup WeaponCate = new SubItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_WEAPONS"),Main_Cate,
            new CustomItemStack(Material.IRON_SWORD, "&b&l SC拓展 &7- &e武器和锻造"));

        public static SubItemGroup IE = new SubItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_IE"),Main_Cate,
                        new CustomItemStack(Material.NETHERITE_BLOCK, "&e&l SC拓展 &7- &c疯狂无限"));

        public static SubItemGroup NB = new SubItemGroup(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_NEW_B"),Main_Cate,
            new CustomItemStack(Material.BEDROCK, "&e&l SC拓展 &7- &a结束了?"));
    // -------------------------------------------------------------------------------------------------------------------------------------------

    // 多方块结构
        public static SlimefunItemStack Soul_Amey = new SlimefunItemStack("SOUL_AMEY", new CustomItemStack(Material.AMETHYST_SHARD),
                "&7&l灵魂合成剂");

        public static SlimefunItemStack Soul_IE_mage_table = new SlimefunItemStack("SOUL_IE_MAGIC_TABLE", new CustomItemStack(Material.RESPAWN_ANCHOR,
                "&c&l灵魂无尽魔法台",
                "&7多方块结构"));

        public static SlimefunItemStack IE_SING_Craft = new SlimefunItemStack("ZIM_SING_IE_CRAFT", new CustomItemStack(Material.NETHERITE_BLOCK,
                "&c&l灵魂奇点构造机 &7[&c普通&7]",
                "&c加强版!"));

        public static SlimefunItemStack IE_Soul_Mac_Core = new SlimefunItemStack("ZIM_SOUL_MACE_CORE", new CustomItemStack(Material.AMETHYST_BLOCK),
                "&7&l灵魂机器核心");

        public static SlimefunItemStack IE_Soul_f = new SlimefunItemStack("ZIM_SOUL_FLOOR",new CustomItemStack(Material.NETHERITE_BLOCK,
                "&c灵魂地基"));

        public static SlimefunItemStack IE_Soul_torch = new SlimefunItemStack("ZIM_SOUL_TORCH", new CustomItemStack(Material.SOUL_TORCH,
                "&9灵魂无尽火把"));

        public static SlimefunItemStack IE_Soul_Glass = new SlimefunItemStack("ZIM_SOUL_GLASS", new CustomItemStack(Material.BLACK_STAINED_GLASS,
                "&e亡魂玻璃"));

        // ------------------------------------------------------------------------------------------------------------------------------------------
        // 普通物品/机器
        public static ItemStack FruitMachine = new CustomItemStack(Material.GRAY_STAINED_GLASS,
                "&e糖提取机",
                "&7从水果里提取糖",
                "",
                "&7⇨ &e⚡ &730J/s",
                "&7⇨ &e⚡ &7300J 可储存");

        public static ItemStack ShaiKTQMachine = new CustomItemStack(Material.IRON_BLOCK,
                "&a筛矿提取机 &7[&cI&7]",
                "&7从圆石提取筛矿,每秒二个",
                "",
                "&7⇨ &e⚡ &73J/s",
                "&7⇨ &e⚡ &7300J 可储存");

        public static ItemStack ShaiKTQMachineII = new CustomItemStack(Material.GOLD_BLOCK,
                "&a筛矿提取机 &7[&cII&7]",
                "&7从原石提取筛矿,每秒十个",
                "",
                "&7⇨ &e⚡ &7500J 可储存",
                "&7⇨ &e⚡ &76J/s");

        public static SlimefunItemStack Crystal_kong = new SlimefunItemStack("ZIM_CRY_KONG",
               "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTc2NThiZGU1NTRkNGNmM2E3ZTU4OGQ3ZGJlYmE1NTQzNGM2OWY3Nzk5MjUwMzhkYTZkN2YxZGIyMTlkNTE2NSJ9fX0=",
                "&9&l强化水晶",
                "",
                "&7有效水晶的基础合成材料");

        public static final SlimefunItemStack EnderOre = new SlimefunItemStack("ZIM_ENDER_ORE", Material.LAPIS_ORE,
                "&b&l紫影矿",
                "",
                "&7来自末地的矿物");

        public static final SlimefunItemStack NetherOre = new SlimefunItemStack("ZIM_NETHER_ORE",
                        Material.ANCIENT_DEBRIS,
                "&b&l熔岩矿",
                "",
                "&7来自地狱的矿物");

        public static final SlimefunItemStack Ender_ingot = new SlimefunItemStack("ZIM_ENDER_INGOT",
                        Material.IRON_INGOT,
                "&b&l紫影锭",
                "",
                "&7末地的气息");

        public static final SlimefunItemStack Nether_ingot = new SlimefunItemStack("ZIM_NETHER_INGOT",
                        Material.NETHERITE_INGOT,
                "&c&l熔岩锭",
                "",
                "&7烫手的&c熔岩锭!");

        public static final SlimefunItemStack FastIngotFactory = new SlimefunItemStack("ZIM_FAST_INGOT_FACTORY",  new CustomItemStack(Material.SMITHING_TABLE,
                "&a加强电动铸锭机 &7[&cI&7]",
                "",
                "&c一级机器",
                "&7⇨ &e⚡ &7512J 可储存",
                "&7⇨ &e⚡ &730J/s"));

        public static final SlimefunItemStack FastIngotFactory_II = new SlimefunItemStack("ZIM_FAST_INGOT_FACTORY_2",  new CustomItemStack(Material.SMITHING_TABLE,
                "&a加强电动铸锭机 &7[&cII&7]",
                "",
                "&c二级机器",
                "&7⇨ &e⚡ &71024J 可储存",
                "&7⇨ &e⚡ &740J/s"));

        public static final SlimefunItemStack Ender_Singularity = new SlimefunItemStack("ZIM_ENDER_SINGULARITY",
                        Material.IRON_BLOCK,
                "&b&l紫影奇点");

        public static final SlimefunItemStack Nether_Singularity = new  SlimefunItemStack("ZIM_NETHER_SINGULARITY",
                                 Material.NETHERITE_BLOCK,
                "&b&l熔岩奇点");

    public static final SlimefunItemStack Soul_Singularity = new SlimefunItemStack("ZIM_SOUL_SINGULARITY",
            Material.BLUE_WOOL,
                "&b&l魂奇点");

        public static ItemStack ZIMysger = new CustomItemStack(Material.BLACK_STAINED_GLASS,
                "&a&l元素发电机",
                "&7将石头,泥土,沙子等作为燃料",
                "",
                "&7⇨ &e⚡ &7500J 可储存",
                "&7⇨ &e⚡ &79J/2s");

        public static SlimefunItemStack AutoSoulCrafter = new SlimefunItemStack("Z_AUTOSOULCRAFTER", Material.IRON_BLOCK,
                "&c全自动灵魂处理器",
                "",
                "&7⇨ &e⚡ &7512J 可储存");

        public static SlimefunItemStack GhostIngot = new SlimefunItemStack("Z_GHOST_INGOT", new CustomItemStack(Material.IRON_INGOT,
                "&7魂锭"));

        public static SlimefunItemStack ArmorCrafter = new SlimefunItemStack("ARMOR_CRAFTER",
                        new CustomItemStack(Material.BLACK_STAINED_GLASS,
                "&cSC装备制作机 &7[&cI&7]",
                "",
                "&c一级机器",
                "&7⇨ &e⚡ &7100J/s",
                "&7⇨ &e⚡ &7200J 可储存"));

        public static SlimefunItemStack SoulCrafter = new SlimefunItemStack("SOUL_CRAFTER",
                        new CustomItemStack(Material.SMITHING_TABLE,
                "&c灵魂处理器 &7[&cI&7]",
                "",
                "&c一级机器",
                "&7⇨ &e⚡ &750J/s",
                "&7⇨ &e⚡ &7200J 可储存"));

        public static SlimefunItemStack gold_sing = new SlimefunItemStack("24K_GOLD_SING", Material.GOLD_BLOCK,
                "&e24K金奇点");

        public static SlimefunItemStack Soul_IE_ingot = new SlimefunItemStack("ZIM_SOUL_INF_INGOT", Material.NETHERITE_INGOT,
                "&r&c&l无尽灵魂锭");

         public static SlimefunItemStack Soul_EM_IE_ingot = new SlimefunItemStack("ZIM_SOUL_EM_INF_INGOT", Material.NETHERITE_INGOT,
                 "&r&c&l无尽精英锭");

        public static SlimefunItemStack Antier = new SlimefunItemStack("ZIM_ANTIER_I", Material.IRON_BLOCK,
                 "&e激光射线器 &7[&cI&7]",
                 "&7防御性机器",
                 "",
                 "&c一级机器",
                 "&7⇨ &e⚡ &750J/s");

        public static ItemStack GoldCrafter = new CustomItemStack(Material.GOLD_BLOCK,
                 "&e&l24K金制造机",
                 "&7全自动金粉转为24K金",
                 "",
                 "&c一体式机器",
                 "&7⇨ &e⚡ &750J/s",
                 "&7⇨ &e⚡ &7200J 可储存");

        public static ItemStack CarbonCrafter = new CustomItemStack(Material.WHITE_STAINED_GLASS,
                 "&7&l解压机 &7[&cI&7]",
                 "&7钻石转换为128个煤",
                 "",
                 "&c一级机器",
                 "&7⇨ &e⚡ &790J/s",
                 "&7⇨ &e⚡ &7200J 可储存");

        public static ItemStack CarbonCrafter_II = new CustomItemStack(Material.WHITE_STAINED_GLASS,
                 "&7&l解压机 &7[&cII&7]",
                 "&7钻石或128个煤转换为12个碳",
                 "",
                 "&c二级机器",
                 "&7⇨ &e⚡ &7100J/s",
                 "&7⇨ &e⚡ &7400J 可储存");

        public static ItemStack ImproveCry = new CustomItemStack(Material.DIAMOND,
                 "&b&l水晶强化物",
                 "",
                 "&7升级你的强化水晶");

        public static SlimefunItemStack EM_dust = new SlimefunItemStack("EM_DUST", Material.SUGAR,
                 "&7灵魂粉末",
                 "",
                 "&7一种材料");

        public static SlimefunItemStack EM_bit = new SlimefunItemStack("EM_BIT", Material.IRON_NUGGET,
                 "&7灵魂粒子",
                 "",
                 "&7一种材料");

        public static SlimefunItemStack EM_sp = new SlimefunItemStack("EM_SP", Material.PRISMARINE_SHARD,
                 "&c灵魂碎片",
                 "",
                 "&7一种材料");

        public static SlimefunItemStack EM_soul = new SlimefunItemStack("EM_SOUL", Material.HEART_OF_THE_SEA,
                 "&b灵魂",
                 "",
                 "&7&o闪耀着微弱的光");

        public static SlimefunItemStack EM_boss_soul = new SlimefunItemStack("EM_BOSS_SOUL", Material.HEART_OF_THE_SEA,
                 "&4亡魂",
                 "",
                 "&7&o貌似很恐怖的样子");

        public static SlimefunItemStack Tester = new SlimefunItemStack("TESTER_SAVE",
                        new CustomItemStack(Material.GOLD_BLOCK,
                 "OK",
                 ":P"));

        public static final SlimefunItemStack ElectricAxe = new SlimefunItemStack("ELECTRIC_AXE",
                        Material.NETHERITE_AXE,
                 "&b电锯",
                        LoreBuilder.powerCharged(0, 300));
        static {
                ElectricAxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 20);
        }

        public static final SlimefunItemStack Ender_feet = new SlimefunItemStack("Z_ENDER_BOOT",
                Material.IRON_BOOTS,
                 "&9紫影靴");
        static {

                Ender_feet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }

        public static final SlimefunItemStack Ender_Leg = new SlimefunItemStack("Z_ENDER_LEG",
                Material.IRON_LEGGINGS,
                "&9紫影护腿");
        static {
                Ender_Leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }

        public static final SlimefunItemStack Ender_Chest = new SlimefunItemStack("Z_ENDER_CHEST",
                Material.IRON_CHESTPLATE,
                "&9紫影胸甲");
        static {

                Ender_Chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }

        public static final SlimefunItemStack Ender_Head = new SlimefunItemStack("Z_ENDER_HELMET",
                Material.IRON_HELMET,
                "&9紫影头盔");
        static {
                Ender_Head.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }

        public static final SlimefunItemStack Soul_Sword = new SlimefunItemStack("ZIM_SOUL_SWOED",
                Material.IRON_SWORD,
                "&7&l魂剑",
                "",
                "&c提高灵魂粉末的掉落数量");
        static {
                Soul_Sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
        }

        public static final SlimefunItemStack Soul_ece = new SlimefunItemStack("ZIM_SOUL_ECT",
                Material.NETHERITE_BLOCK,
                "&c灵魂鼓舞室",
                "",
                "&7⇨ &b⚡ &7速度:10x");


        public static final SlimefunItemStack gold_feet = new SlimefunItemStack("Z_GOLDP_BOOT",
                Material.GOLDEN_BOOTS,
                "&e金苹果靴");
        static {

                gold_feet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }

        public static final SlimefunItemStack gold_Leg = new SlimefunItemStack("Z_GOLDP_LEG",
                Material.GOLDEN_LEGGINGS,
                "&e金苹果护腿");
        static {
                gold_Leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }

        public static final SlimefunItemStack gold_Chest = new SlimefunItemStack("Z_GOLDP_CHESTPLANT",
                        Material.GOLDEN_CHESTPLATE,
                "&e金苹果胸甲");
        static {

                gold_Chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }

        public static final SlimefunItemStack gold_Head = new SlimefunItemStack("Z_GOLDP_HELMET",
                Material.GOLDEN_HELMET,
                "&e金苹果头盔");
        static {
                gold_Head.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }

        public static final SlimefunItemStack e_gold_feet = new SlimefunItemStack("Z_E_GOLDP_BOOT",
                Material.GOLDEN_BOOTS,
                "&e&l附魔金苹果靴");
        static {

                e_gold_feet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }

        public static final SlimefunItemStack e_gold_Leg = new SlimefunItemStack("Z_E_GOLDP_LEG",
                Material.GOLDEN_LEGGINGS,
                "&e&l附魔金苹果护腿");
        static {
                e_gold_Leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }

        public static final SlimefunItemStack e_gold_Chest = new SlimefunItemStack("Z_E_GOLDP_CHESTPLANT",
                Material.GOLDEN_CHESTPLATE,
                "&e&l附魔金苹果胸甲");
        static {
                e_gold_Chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }

        public static final SlimefunItemStack e_gold_Head = new SlimefunItemStack("Z_E_GOLDP_HELMET",
                Material.GOLDEN_HELMET,
               "&e&l附魔金苹果头盔");
        static {
                e_gold_Head.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }

        public static  SlimefunItemStack Void_Stone = new SlimefunItemStack("ZIM_VOID_STONE",
                Material.BLACKSTONE,
                "&7虚空石");

        public static  SlimefunItemStack Void_Ore_Ame = new SlimefunItemStack("ZIM_VOID_ORE_AME",
                Material.PURPLE_STAINED_GLASS,
                "&7&l虚空晶体");

        public static SlimefunItemStack Void_Ore_2 = new SlimefunItemStack("ZIM_VOID_ORE_II",
                Material.BLACK_STAINED_GLASS,
                "&7&l虚空魔石");



}
