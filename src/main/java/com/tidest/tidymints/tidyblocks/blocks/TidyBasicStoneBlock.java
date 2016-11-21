package com.tidest.tidymints.tidyblocks.blocks;

import com.tidest.tidymints.tidyblocks.TidyBlockBase;
import net.minecraft.block.material.Material;

public class TidyBasicStoneBlock extends TidyBlockBase {
    //The base class here.
    public TidyBasicStoneBlock(String unlocalName, Material mat, float hardness, float resistance, int harvestLevel){
        super(mat, unlocalName);
        this.setResistance(resistance);//2000.0f = Obsidian, 10.0f = Stone
        this.setHardness(hardness);//50.0f = Obisidan, 1.5 = Stone
        this.setHarvestLevel("pickaxe", harvestLevel); //3 = diamond
    }
    //An overload to make defining these things a bit faster.
    public TidyBasicStoneBlock(String unlocalName, float hardness, float resistance, int harvestLevel){
        this(unlocalName, Material.ROCK, hardness, resistance, harvestLevel);
    }
}
