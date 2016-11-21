package com.tidest.tidymints;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class TidyConfig {
    public static int diamond_biome_rarity;
    public static boolean enable_tools;
    public static boolean enable_blocks;

    public static void init(File file){
        Configuration config = new Configuration(file);
        config.load();

        diamond_biome_rarity = config.getInt("Diamond Biome Rarity", "Biome Rarities", 4, 0, 30, "Controls the 'Diamond Biome' Spawn Rate, 0 disables.");
        enable_tools = config.getBoolean("Enable Tools", "On/Off Switches", true, "Enables/Disables ALL tools added by this mod");
        enable_blocks = config.getBoolean("Enable Blocks", "On/Off Switches", true, "Enables/Disables ALL blocks added by this mod (You MUST disable tools if you disable blocks.)");

        config.save();
    }
}
