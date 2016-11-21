package com.tidest.tidymints.tidyblocks;

import com.tidest.tidymints.TidyMints;
import com.tidest.tidymints.tidyblocks.blocks.TidyBasicStoneBlock;
import com.tidest.tidymints.tidyitems.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TidyBlocks {
    public static TidyBasicStoneBlock ender_obsidian;

    public static void init() {
        //Setup the blocks
        ender_obsidian = new TidyBasicStoneBlock("ender_obsidian", 15.0f, 2000.0f, 3);

        //Register them!
        register(ender_obsidian);
        System.out.println("TidyBlocks from " + TidyMints.MODID + " Checking in!");
    }
    private static <T extends Block> T register(T block, ItemBlock itemBlock){
        GameRegistry.register(block);
        if(itemBlock != null){
            GameRegistry.register(itemBlock);
        }

        if(block instanceof ItemModelProvider){
            ((ItemModelProvider)block).registerItemModel(itemBlock);
        }
        return block;
    }
    //Overload to make things just a bit easier
    private static <T extends Block> T register(T block){
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
