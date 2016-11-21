package com.tidest.tidymints;

import com.tidest.tidymints.proxy.CommonProxy;
import com.tidest.tidymints.tidyblocks.TidyBlocks;
import com.tidest.tidymints.tidyitems.TidyItems;
import com.tidest.tidymints.tidyworld.TidyBiome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TidyMints.MODID, version = TidyMints.VERSION)

public class TidyMints {
	@SidedProxy(serverSide = "com.tidest.tidymints.proxy.CommonProxy", clientSide = "com.tidest.tidymints.proxy.ClientProxy")
	//TODO: Trees, that drop planks?! (Goddammit Cody.)
	//TODO: Begin the mob framework. Primaraly player-based NPCs.
	//DONE: Apparently, create biomes.
	//TODO: Diamond Trees, for the diamond biome.
	//Please note down any ideas I have here...
	
	public static CommonProxy proxy;
	public static TidyMints instance;
	public static final String MODID = "tidymints";
	public static final String VERSION = "0.0.5";
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		TidyConfig.init(event.getSuggestedConfigurationFile());
		//Get the stuff added in.
		if (TidyConfig.enable_tools) TidyItems.init();
		if (TidyConfig.enable_blocks) TidyBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Say "Hi" Why don't you?
		//HEHEHEHEHE
		TidyRecipes.init();
		TidyBiome.init();
		System.out.println("Hi there! My name is "+TidyMints.MODID+"! Nice to meet you!");
	}
}
