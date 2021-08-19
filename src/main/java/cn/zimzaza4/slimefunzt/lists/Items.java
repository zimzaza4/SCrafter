package cn.zimzaza4.slimefunzt.lists;

import cn.zimzaza4.slimefunzt.SlimefunZT;

import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;


public class Items {

        public static MultiCategory Main_Cate = new MultiCategory(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MAIN_CATE"), new CustomItem(Material.NETHERITE_BLOCK, "&cSiciliaCraft"));
        public static SubCategory Cate = new SubCategory(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_D"),Main_Cate,
                        new CustomItem(Material.DIAMOND, "&e&l SC拓展 - 物品"));
        public static SubCategory MatCate = new SubCategory(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MAT"),Main_Cate,
                        new CustomItem(Material.GOLD_ORE, "&e&l SC拓展 - 材料"));
        public static SubCategory crystal = new SubCategory(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_D_C"),Main_Cate,
                        new CustomItem(Material.DIAMOND, "&e&l SC拓展 - 强化"));
        public static SubCategory ToolCate = new SubCategory(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_TOOL"),Main_Cate,
                        new CustomItem(Material.DIAMOND_PICKAXE, "&b&l SC拓展 - 工具"));
        public static SubCategory IE = new SubCategory(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_MA_IE"),Main_Cate,
                        new CustomItem(Material.NETHERITE_BLOCK, "&e&l SC拓展 - &c疯狂无限"));
    public static SubCategory NB = new SubCategory(new NamespacedKey(SlimefunZT.getInstance(), "ZIM_NEW_B"),Main_Cate,
            new CustomItem(Material.NETHERITE_BLOCK, "&e&l SC拓展 - &a结束了?"));

    // ------ 分割线
        public static SlimefunItemStack Soul_Amey = new SlimefunItemStack("SOUL_AMEY", new CustomItem(Material.AMETHYST_SHARD), "&7&l灵魂合成剂");
        public static SlimefunItemStack Soul_IE_mage_table = new SlimefunItemStack("SOUL_IE_MAGIC_TABLE", new CustomItem(Material.RESPAWN_ANCHOR, "&c&l灵魂无尽魔法台", "&7不是单独的机器"));


        public static SlimefunItemStack IE_SING_Craft = new SlimefunItemStack("ZIM_SING_IE_CRAFT", new CustomItem(Material.NETHERITE_BLOCK, "&c&l灵魂奇点构造机 &c- 普通", "&c加强!"));

        public static SlimefunItemStack IE_Soul_Mac_Core = new SlimefunItemStack("ZIM_SOUL_MACE_CORE", new CustomItem(Material.AMETHYST_BLOCK), "&7&l灵魂机器核心");


        public static SlimefunItemStack IE_Soul_f = new SlimefunItemStack("ZIM_SOUL_FLOOR",new CustomItem(Material.NETHERITE_BLOCK, "&c灵魂地基"));
        public static SlimefunItemStack IE_Soul_torch = new SlimefunItemStack("ZIM_SOUL_TORCH", new CustomItem(Material.SOUL_TORCH, "&c灵魂无尽火把"));
        public static SlimefunItemStack IE_Soul_Glass = new SlimefunItemStack("ZIM_SOUL_GLASS", new CustomItem(Material.BLACK_STAINED_GLASS, "&e亡魂玻璃"));
    // --------

        public static ItemStack FruitMachine = new CustomItem(Material.GRAY_STAINED_GLASS, "&e糖提取机", "&a 从水果里提取糖",
                        "30J/s    300J可储存");
        public static ItemStack ShaiKTQMachine = new CustomItem(Material.IRON_BLOCK, "&a筛矿提取机 &eI", "&e 从原石提取筛矿 每两秒5个",
                        "3J/s     300J可储存");
        public static ItemStack ShaiKTQMachineII = new CustomItem(Material.GOLD_BLOCK, "&a筛矿提取机 &eII",
                        "&e 从原石提取筛矿 每秒10个", "6J/s    500J可储存");

        public static SlimefunItemStack Crystal_kong = new SlimefunItemStack("ZIM_CRY_KONG",
                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTc2NThiZGU1NTRkNGNmM2E3ZTU4OGQ3ZGJlYmE1NTQzNGM2OWY3Nzk5MjUwMzhkYTZkN2YxZGIyMTlkNTE2NSJ9fX0=",
                        "&o&l&7强化水晶 - 无效果", "合成材料");
        public static final SlimefunItemStack EnderOre = new SlimefunItemStack("ZIM_ENDER_ORE", Material.LAPIS_ORE,
                        "&b&l紫影矿", "", "&7来自末地的矿物");
        public static final SlimefunItemStack NetherOre = new SlimefunItemStack("ZIM_NETHER_ORE",
                        Material.ANCIENT_DEBRIS, "&b&l熔岩矿", "", "&7来自地狱的矿物");

        public static final SlimefunItemStack Ender_ingot = new SlimefunItemStack("ZIM_ENDER_INGOT",
                        Material.IRON_INGOT, "&b&l紫影锭", "&7末地的气息");
        public static final SlimefunItemStack Nether_ingot = new SlimefunItemStack("ZIM_NETHER_INGOT",
                        Material.NETHERITE_INGOT, "&c&l熔岩锭", "&c火热!");


        public static final SlimefunItemStack FastIngotFactory = new SlimefunItemStack("ZIM_FAST_INGOT_FACTORY",  new CustomItem(Material.SMITHING_TABLE, "&a加强电动铸锭机 &c- I", "&7效率更高", "","&c512J可储存", "&c30J/s"));

        public static final SlimefunItemStack FastIngotFactory_II = new SlimefunItemStack("ZIM_FAST_INGOT_FACTORY_2",  new CustomItem(Material.SMITHING_TABLE, "&a加强电动铸锭机 &c- II", "&7效率++", "","&c1024J可储存", "&c40J/s"));

        public static final SlimefunItemStack Ender_Singularity = new SlimefunItemStack("ZIM_ENDER_SINGULARITY",
                        Material.IRON_BLOCK, "&b&l紫影奇点");
        public static final SlimefunItemStack Nether_Singularity = new  SlimefunItemStack("ZIM_NETHER_SINGULARITY",
                                 Material.NETHERITE_BLOCK, "&b&l熔岩奇点");
    public static final SlimefunItemStack Soul_Singularity = new SlimefunItemStack("ZIM_SOUL_SINGULARITY",
            Material.BLUE_WOOL, "&b&l魂奇点");
        public static ItemStack ZIMysger = new CustomItem(Material.BLACK_STAINED_GLASS, "&a&l&o元素发电机", "",
                        "&a&l将石头, 泥土, 沙子等 作为燃料", "&e9J / 2s", "&a500 J 可储存"
        );
        public static SlimefunItemStack AutoSoulCrafter = new SlimefunItemStack("Z_AUTOSOULCRAFTER", Material.IRON_BLOCK, "&c自动灵魂处理", "&7 512J可储存" );

        public static SlimefunItemStack GhostIngot = new SlimefunItemStack("Z_GHOST_INGOT", new CustomItem(Material.IRON_INGOT, "&7魂锭"));

        public static SlimefunItemStack ArmorCrafter = new SlimefunItemStack("ARMOR_CRAFTER",
                        new CustomItem(Material.BLACK_STAINED_GLASS, "&cSC装备制作机 - I", "",

                                        "&e100 J /s", "&a200 J 可储存"

                        ));
        public static SlimefunItemStack SoulCrafter = new SlimefunItemStack("SOUL_CRAFTER",
                        new CustomItem(Material.SMITHING_TABLE, "&c灵魂处理器 - I", "",

                                        "&e50J /s", "&a200 J 可储存"

                        ));

        public static SlimefunItemStack gold_sing = new SlimefunItemStack("24K_GOLD_SING", Material.GOLD_BLOCK, "&e24K金奇点");


        public static SlimefunItemStack Soul_IE_ingot = new SlimefunItemStack("ZIM_SOUL_INF_INGOT", Material.NETHERITE_INGOT, "&r&c&l灵魂无尽锭");



         public static SlimefunItemStack Soul_EM_IE_ingot = new SlimefunItemStack("ZIM_SOUL_EM_INF_INGOT", Material.NETHERITE_INGOT, "&r&c&l无尽精英锭");




        public static SlimefunItemStack Antier = new SlimefunItemStack("ZIM_ANTIER_I", Material.IRON_BLOCK,
                        "&e激光射线&c - I", "&c防御性机器", "50 J / s");
        public static ItemStack GoldCrafter = new CustomItem(Material.GOLD_BLOCK, "&e&l24K金制造机", "&a自动将金粉转为24K金",
                        "&7一体机", "&e50 J / s", "200 J 可储存");
        public static ItemStack CarbonCrafter = new CustomItem(Material.WHITE_STAINED_GLASS, "&7&l解压机", "&a把钻石转换为128个煤",
                        "&e90 J / s", "200 J 可储存");
        public static ItemStack CarbonCrafter_II = new CustomItem(Material.WHITE_STAINED_GLASS, "&7&l解压机&c - II",
                        "&a把钻石或128个煤转换为12个碳", "&e100 J / s", "400 J 可储存");
        public static ItemStack ImproveCry = new CustomItem(Material.DIAMOND, "&b&l水晶强化", "&7升级你的强化水晶");

        public static SlimefunItemStack EM_dust = new SlimefunItemStack("EM_DUST", Material.SUGAR, "&7灵魂粉末", "&7一种材料");
        public static SlimefunItemStack EM_bit = new SlimefunItemStack("EM_BIT", Material.IRON_NUGGET, "&7灵魂粒子",
                        "&7一种材料");
        public static SlimefunItemStack EM_sp = new SlimefunItemStack("EM_SP", Material.PRISMARINE_SHARD, "&c灵魂碎片",
                        "&7一种材料");
        public static SlimefunItemStack EM_soul = new SlimefunItemStack("EM_SOUL", Material.HEART_OF_THE_SEA, "&b灵魂",
                        "&7闪耀着微弱的光");
        public static SlimefunItemStack EM_boss_soul = new SlimefunItemStack("EM_BOSS_SOUL", Material.HEART_OF_THE_SEA, "&4亡魂");





        public static SlimefunItemStack Tester = new SlimefunItemStack("TESTER_SAVE",
                        new CustomItem(Material.GOLD_BLOCK, "ok", ":P"));
        public static final SlimefunItemStack ElectricAxe = new SlimefunItemStack("ELECTRIC_AXE",
                        Material.NETHERITE_AXE, "&b电锯", LoreBuilder.powerCharged(0, 300));
        static {
                ElectricAxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 20);
        }

        public static final SlimefunItemStack Ender_feet = new SlimefunItemStack("Z_ENDER_BOOT", Material.IRON_BOOTS,
                        "&6紫影靴");
        static {

                Ender_feet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }

        public static final SlimefunItemStack Ender_Leg = new SlimefunItemStack("Z_ENDER_LEG", Material.IRON_LEGGINGS,
                        "&6紫影护腿");
        static {
                Ender_Leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }
        public static final SlimefunItemStack Ender_Chest = new SlimefunItemStack("Z_ENDER_CHEST",
                        Material.IRON_CHESTPLATE, "&6紫影胸甲");
        static {

                Ender_Chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }

        public static final SlimefunItemStack Ender_Head = new SlimefunItemStack("Z_ENDER_HELMET", Material.IRON_HELMET,
                        "&6紫影头盔");
        static {
                Ender_Head.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        }
        public static final SlimefunItemStack Soul_Sword = new SlimefunItemStack("ZIM_SOUL_SWOED", Material.IRON_SWORD, "&7魂剑", "&c提高灵魂粉末的掉落数量");
        static {
                Soul_Sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
        }

        public static final SlimefunItemStack Soul_ece = new SlimefunItemStack("ZIM_SOUL_ECT", Material.NETHERITE_BLOCK,"&c灵魂鼓舞室", "速度x10!");

        public static final SlimefunItemStack gold_feet = new SlimefunItemStack("Z_GOLDP_BOOT", Material.GOLDEN_BOOTS,
                        "&e金苹果靴");
        static {

                gold_feet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }

        public static final SlimefunItemStack gold_Leg = new SlimefunItemStack("Z_GOLDP_LEG", Material.GOLDEN_LEGGINGS,
                        "&e金苹果护腿");
        static {
                gold_Leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
        public static final SlimefunItemStack gold_Chest = new SlimefunItemStack("Z_GOLDP_CHESTPLANT",
                        Material.GOLDEN_CHESTPLATE, "&e金苹果胸甲");
        static {

                gold_Chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }

        public static final SlimefunItemStack gold_Head = new SlimefunItemStack("Z_GOLDP_HELMET", Material.GOLDEN_HELMET,
                        "&e金苹果头盔");
        static {
                gold_Head.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }


        public static final SlimefunItemStack e_gold_feet = new SlimefunItemStack("Z_E_GOLDP_BOOT", Material.GOLDEN_BOOTS,
                        "&e附魔金苹果靴");
        static {

                e_gold_feet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }

        public static final SlimefunItemStack e_gold_Leg = new SlimefunItemStack("Z_E_GOLDP_LEG", Material.GOLDEN_LEGGINGS,
                        "&e附魔金苹果护腿");
        static {
                e_gold_Leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }
        public static final SlimefunItemStack e_gold_Chest = new SlimefunItemStack("Z_E_GOLDP_CHESTPLANT",
                        Material.GOLDEN_CHESTPLATE, "&e附魔金苹果胸甲");
        static {

                e_gold_Chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }

        public static final SlimefunItemStack e_gold_Head = new SlimefunItemStack("Z_E_GOLDP_HELMET", Material.GOLDEN_HELMET,
                        "&e附魔金苹果头盔");
        static {
                e_gold_Head.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        }







}
