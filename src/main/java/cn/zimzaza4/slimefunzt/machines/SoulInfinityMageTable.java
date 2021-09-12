package cn.zimzaza4.slimefunzt.machines;

import cn.zimzaza4.slimefunzt.lists.Items;
import io.github.mooy1.infinitylib.machines.CraftingBlock;
import io.github.mooy1.infinitylib.machines.MachineLayout;
import io.github.mooy1.infinitylib.machines.MachineRecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class SoulInfinityMageTable extends CraftingBlock {
    /*
    public final static int[] BOARD = new int []{
        0, 1, 2, 3, 4, 5, 6, 7, 8,
        9,         13     ,16,17,
        18,        22,23,24,25,26,
        27,        31    ,34,35,
        36,37,38,39,40,41,42,43,44
    };
    public final static int[] INPUT = new int []{
            10,11,12,19,20,21,28,29,30
    };
    public static final List<CraftingBlockRecipe> RECIPE = new ArrayList<>();
     public static final RecipeType Type = new RecipeType(SlimefunZT.getInstance().getKey("soul_infinity_magic_table"), Items.Soul_IE_mage_table,(stacks, stack) -> {
         SlimefunItemStack item = (SlimefunItemStack) stack;
         CraftingBlockRecipe recipe = new CraftingBlockRecipe()
     }, "");
    public SoulInfinityMageTable(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        new BlockMenuPreset(getId(), "&c&l无尽魔法桌") {
            @Override
            public void init() {
                setupMenu(this);
            }
            @Override
            public void newInstance(BlockMenu menu ,Block block){
                menu.addMenuClickHandler(32, (p, slot, item, action)->{
                    craft(block, menu, p);
                    return false;
                });
            }
            @Override
            public boolean canOpen(Block block, Player player) {
                if (player.hasPermission("slimefun.inventory.bypass")|| SlimefunPlugin.getProtectionManager().hasPermission(player, block, ProtectableAction.INTERACT_BLOCK)){
                    if (BlockStorage.checkID(block.getLocation().add(0,-1,0)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(1,-1,0)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(2,-1,0)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(-1,-1,0)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(-2,-1,0)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(0,-1,1)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(0,-1,2)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(0,-1,-1)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(0,-1,-2)).equals("ZIM_SOUL_FLOOR")&&
                            BlockStorage.checkID(block.getLocation().add(1,0,0)).equals("ZIM_SOUL_GLASS")&&
                            BlockStorage.checkID(block.getLocation().add(-1,0,0)).equals("ZIM_SOUL_GLASS")&&
                            BlockStorage.checkID(block.getLocation().add(0,0,1)).equals("ZIM_SOUL_GLASS")&&
                            BlockStorage.checkID(block.getLocation().add(0,0,-1)).equals("ZIM_SOUL_GLASS")&&
                            BlockStorage.checkID(block.getLocation().add(2,0,0)).equals("ZIM_SOUL_TORCH")&&
                            BlockStorage.checkID(block.getLocation().add(-2,0,0)).equals("ZIM_SOUL_TORCH")&&
                            BlockStorage.checkID(block.getLocation().add(0,0,2)).equals("ZIM_SOUL_TORCH")&&
                            BlockStorage.checkID(block.getLocation().add(0,0,-2)).equals("ZIM_SOUL_TORCH")
                    ){
                        return true;
                    }else {player.sendMessage("§c结构不完整"); return false;}
                }else{return false;}
            }


        */



    public static final int[] INPUT_SLOTS = {

            10, 11 ,12,
            19, 20, 21,
            28, 29, 30

    };
    public static final MachineRecipeType TYPE = new MachineRecipeType("sc_infinity_soul",
            Items.ArmorCrafter);


    public SoulInfinityMageTable(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(category, item, type, recipe);
        addRecipesFrom(TYPE);
        layout(new MachineLayout()
                .inputSlots(INPUT_SLOTS)
                .outputSlots(new int[] { 43 })
                .statusSlot(16)
                .inputBorder(new int[] {0,1,2,3,4,9,13, 18, 22, 27, 31, 36, 37,38,39, 40,41, 45, 46, 47,48,49})
                .outputBorder(new int[] {
                        33, 34, 35,
                        42, 44,
                        51, 52, 53
                }).background(new int[] {
                        5, 6,7, 8, 14, 15,16, 17,23,32,41, 24, 25, 26,50
                })
        );

    }




    @Override
    protected void setup(BlockMenuPreset preset) {
        super.setup(preset);
    }

    @Override
    protected void onNewInstance(BlockMenu menu, Block b) {
        super.onNewInstance(menu, b);
    }

    @Override
    protected void craft(Block block, BlockMenu menu, Player p) {

        if (

                Objects.equals(BlockStorage.checkID(block.getLocation().add(0, -1, 0)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(1, -1, 0)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(2, -1, 0)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(-1, -1, 0)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(-2, -1, 0)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, -1, 1)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, -1, 2)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, -1, -1)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, -1, -2)), "ZIM_SOUL_FLOOR") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(1, 0, 0)), "ZIM_SOUL_GLASS") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(-1, 0, 0)), "ZIM_SOUL_GLASS") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, 0, 1)), "ZIM_SOUL_GLASS") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, 0, -1)), "ZIM_SOUL_GLASS") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(2, 0, 0)), "ZIM_SOUL_TORCH") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(-2, 0, 0)), "ZIM_SOUL_TORCH") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, 0, 2)), "ZIM_SOUL_TORCH") &&
                        Objects.equals(BlockStorage.checkID(block.getLocation().add(0, 0, -2)), "ZIM_SOUL_TORCH")
        ) {
            super.craft(block, menu, p);
        }else {p.sendMessage("§c结构不完整");}
    }

    @Override
    protected void onSuccessfulCraft(BlockMenu menu, ItemStack toOutput) {

    }


}
