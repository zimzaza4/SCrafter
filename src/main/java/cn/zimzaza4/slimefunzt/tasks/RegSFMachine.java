package cn.zimzaza4.slimefunzt.tasks;

import cn.zimzaza4.slimefunzt.SlimefunZT;
import cn.zimzaza4.slimefunzt.lists.Items;
import cn.zimzaza4.slimefunzt.machines.*;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegSFMachine {

        public static void run() {
                ItemStack[] ZIM_YS_Q = new ItemStack[] { SlimefunItems.MEDIUM_CAPACITOR,
                                SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.DAMASCUS_STEEL_INGOT,
                                new ItemStack(Material.LAVA_BUCKET), SlimefunItems.REINFORCED_ALLOY_INGOT,
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ALUMINUM_BRONZE_INGOT,
                                SlimefunItems.ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT };
                new ZIMysger(Items.Cate, "ZIM_GEA_YS", Items.ZIMysger, RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_YS_Q)
                                .register(SlimefunZT.getInstance());

                ItemStack[] ZIM_MACH = new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.IRON_BLOCK),
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ALUMINUM_BRONZE_INGOT,
                                SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ALUMINUM_BRONZE_INGOT };
                new ZmDiamondMach(Items.Cate, "ZIM_MA_FRUIT", Items.FruitMachine, RecipeType.ENHANCED_CRAFTING_TABLE,
                                ZIM_MACH).register(SlimefunZT.getInstance());
                ItemStack[] ZIM_SKTQ = new ItemStack[] { SlimefunItems.COPPER_WIRE,
                                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.COPPER_WIRE,
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.SMALL_CAPACITOR,
                                SlimefunItems.ELECTRO_MAGNET, SlimefunItems.DAMASCUS_STEEL_INGOT,
                                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT };
                new ZMSaiktMach(Items.Cate, "ZIM_MA_SAI_I", Items.ShaiKTQMachine, RecipeType.ENHANCED_CRAFTING_TABLE,
                                ZIM_SKTQ).register(SlimefunZT.getInstance());
                ItemStack[] ZIM_SKTQ_II = new ItemStack[] { SlimefunItems.MEDIUM_CAPACITOR,
                                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.MEDIUM_CAPACITOR,
                                SlimefunItems.ELECTRIC_MOTOR, Items.ShaiKTQMachine, SlimefunItems.ELECTRIC_MOTOR,
                                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT,
                                SlimefunItems.DAMASCUS_STEEL_INGOT };
                new ZMSaiktMachII(Items.Cate, "ZIM_MA_SAI_II", Items.ShaiKTQMachineII,
                                RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_SKTQ_II).register(SlimefunZT.getInstance());
                ItemStack[] ZIM_GOLD_CRAFTER = new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.POWER_CRYSTAL, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.POWER_CRYSTAL,
                                SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK,
                                SlimefunItems.GOLD_24K_BLOCK };
                new AutoGoldCrafter(Items.Cate, "ZIM_GOLD_CRAFTER", Items.GoldCrafter,
                                RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_GOLD_CRAFTER)
                                                .register(SlimefunZT.getInstance());
                ItemStack[] ZIM_CARBON_CRAFTER = new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.POWER_CRYSTAL, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.POWER_CRYSTAL,
                                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.GOLD_24K_BLOCK,
                                SlimefunItems.REINFORCED_ALLOY_INGOT };
                new CarbonCrafter(Items.Cate, "ZIM_CARBON_CRAFTER", Items.CarbonCrafter,
                                RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_CARBON_CRAFTER)
                                                .register(SlimefunZT.getInstance());

                ItemStack[] ZIM_CARBON_CRAFTER_II = new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.POWER_CRYSTAL, Items.CarbonCrafter, SlimefunItems.POWER_CRYSTAL,
                                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.SMALL_CAPACITOR,
                                SlimefunItems.REINFORCED_ALLOY_INGOT };
                ItemStack[] ZIM_SOUL_CRAFTER = new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                new SlimefunItemStack(Items.EM_dust, 32), SlimefunItems.SMALL_CAPACITOR,
                                new SlimefunItemStack(Items.EM_dust, 32), new ItemStack(Material.IRON_BLOCK),
                                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), };
                ItemStack[] ZIM_ANTIER = new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                SlimefunItems.POWER_CRYSTAL, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                new SlimefunItemStack(Items.EM_bit, 2), SlimefunItems.SMALL_CAPACITOR,
                                SlimefunItems.POWER_CRYSTAL, SlimefunItems.REINFORCED_ALLOY_INGOT,
                                SlimefunItems.POWER_CRYSTAL, SlimefunItems.REINFORCED_ALLOY_INGOT };

                ItemStack[] ZIM_ARMOR_CRAFTER = new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                new ItemStack(Material.IRON_BLOCK, 3), SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                                new SlimefunItemStack(Items.EM_dust, 32), SlimefunItems.SMALL_CAPACITOR,
                                new SlimefunItemStack(Items.EM_dust, 32), new ItemStack(Material.IRON_BLOCK),
                                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), };

                new CarbonCrafterII(Items.Cate, "ZIM_CARBON_CRAFTER_II", Items.CarbonCrafter_II,
                                RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_CARBON_CRAFTER_II)
                                                .register(SlimefunZT.getInstance());

                /*
                 * new SoulCrafter( Items.Cate, Items.SoulCrafter,
                 * RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_SOUL_CRAFTER)
                 * .register(SlimefunZT.getInstance());
                 */
                new Antier(Items.ToolCate, Items.Antier, RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_ANTIER, 60, 8, 13,
                                Color.RED, Material.IRON_BLOCK, Material.REDSTONE_BLOCK, 1)
                                                .register(SlimefunZT.getInstance());
                new SCArmorCrafter(Items.Cate, Items.ArmorCrafter, RecipeType.ENHANCED_CRAFTING_TABLE,
                                ZIM_ARMOR_CRAFTER, 100);
                new ZMCrafter(Items.Cate, Items.SoulCrafter, RecipeType.ENHANCED_CRAFTING_TABLE, ZIM_SOUL_CRAFTER, 50)
                                .register(SlimefunZT.getInstance());
        };

}