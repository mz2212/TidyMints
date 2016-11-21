package com.tidest.tidymints.tidyworld.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class TidyBiomeDiamond extends Biome{
    public TidyBiomeDiamond(){
        super(new BiomeProperties("Diamond Biome").setTemperature(0.9F).setBaseHeight(0.1F).setHeightVariation(0.3F));
        this.theBiomeDecorator.treesPerChunk = -100;
        this.theBiomeDecorator.flowersPerChunk = -100;
        this.theBiomeDecorator.grassPerChunk = -100;
        this.topBlock = Blocks.DIAMOND_BLOCK.getDefaultState();
        this.fillerBlock = Blocks.DIAMOND_ORE.getDefaultState();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();
        this.setRegistryName("diamond_biome");
    }
}
