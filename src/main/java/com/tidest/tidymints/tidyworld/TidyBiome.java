package com.tidest.tidymints.tidyworld;


import com.tidest.tidymints.TidyConfig;
import com.tidest.tidymints.TidyMints;
import com.tidest.tidymints.tidyworld.biome.TidyBiomeDiamond;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TidyBiome {
    public static Biome diamond_biome;
    public static void init(){
        //Setup the biomes.
        diamond_biome = new TidyBiomeDiamond();
        //Register them.
        register(diamond_biome, BiomeManager.BiomeType.WARM, TidyConfig.diamond_biome_rarity, BiomeDictionary.Type.MAGICAL);


        System.out.println("TidyBiome from " + TidyMints.MODID + " checking in!");
    }

    private static <T extends Biome> T register(T biome, BiomeManager.BiomeType temperature, int rarity, BiomeDictionary.Type ... types ){
        BiomeDictionary.registerBiomeType(biome, types);
        BiomeManager.addBiome(temperature, new BiomeManager.BiomeEntry(biome, rarity));
        BiomeManager.addSpawnBiome(biome);
        GameRegistry.register(biome);
        return biome;
    }
}
