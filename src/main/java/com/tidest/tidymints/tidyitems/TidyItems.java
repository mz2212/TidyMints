package com.tidest.tidymints.tidyitems;

import net.minecraftforge.fml.common.registry.GameRegistry;
import com.tidest.tidymints.TidyMints;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

//DONE: Armours, Paxel crafting Recipes, Obsidian tool recipes.

public class TidyItems {
	//Materials
	public static ToolMaterial GOLDDIAMOND;
	public static ToolMaterial OBSIDIAN;
	//Items
	//Gold Diamond
	public static Item gold_diamond_lump;
	public static Item gold_diamond;
	public static Item gold_diamond_sword;
	public static Item gold_diamond_pick;
	public static Item gold_diamond_hoe;
	public static Item gold_diamond_shovel;
	public static Item gold_diamond_axe;
	public static Item gold_diamond_paxel;
	//Obsidian
	public static Item obsidian_sword;
	public static Item obsidian_pick;
	public static Item obsidian_axe;
	public static Item obsidian_shovel;
	public static Item obsidian_hoe;
	public static Item obsidian_paxel;
	//Vanilla Paxels
	public static Item wood_paxel;
	public static Item stone_paxel;
	public static Item iron_paxel;
	public static Item gold_paxel;
	public static Item diamond_paxel;
	
	public static void init() {
		
		//Materials
		GOLDDIAMOND = EnumHelper.addToolMaterial("GOLDDIAMOND", 3, 1024, 10.0F, 2.5F, 16);
		OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 10, 4096, 20.0F, 31.0F, 35);
		//Items
		//Gold Diamond Stuff
		gold_diamond_lump = new TidyItemBase("gold_diamond_lump").setUnlocalizedName("gold_diamond_lump").setCreativeTab(CreativeTabs.MATERIALS);
		gold_diamond = new TidyItemBase("gold_diamond").setUnlocalizedName("gold_diamond").setCreativeTab(CreativeTabs.MATERIALS);
		gold_diamond_sword = new TidySwords(TidyItems.GOLDDIAMOND, "gold_diamond_sword", false);
		gold_diamond_pick = new TidyPicks(TidyItems.GOLDDIAMOND, "gold_diamond_pick", false);
		gold_diamond_hoe = new TidyHoes(TidyItems.GOLDDIAMOND, "gold_diamond_hoe", false);
		gold_diamond_shovel = new TidyShovels(TidyItems.GOLDDIAMOND, "gold_diamond_shovel", false);
		gold_diamond_axe = new TidyAxes(TidyItems.GOLDDIAMOND, "gold_diamond_axe", false);
		gold_diamond_paxel = new TidyPaxel(TidyItems.GOLDDIAMOND, "gold_diamond_paxel", false);
		//End Gold Diamond Stuff
		//Obsidian Stuff
		obsidian_sword = new TidySwords(TidyItems.OBSIDIAN, "obsidian_sword", true);
		obsidian_pick = new TidyPicks(TidyItems.OBSIDIAN, "obsidian_pick", true);
		obsidian_axe = new TidyAxes(TidyItems.OBSIDIAN, "obsidian_axe", true);
		obsidian_shovel = new TidyShovels(TidyItems.OBSIDIAN, "obsidian_shovel", true);
		obsidian_hoe = new TidyHoes(TidyItems.OBSIDIAN, "obsidian_hoe", true);
		obsidian_paxel = new TidyPaxel(TidyItems.OBSIDIAN, "obsidian_paxel", true);
		//Vanilla Paxels
		wood_paxel = new TidyPaxel(ToolMaterial.WOOD, "wood_paxel", false);
		stone_paxel = new TidyPaxel(ToolMaterial.STONE, "stone_paxel", false);
		iron_paxel = new TidyPaxel(ToolMaterial.IRON, "iron_paxel", false);
		gold_paxel = new TidyPaxel(ToolMaterial.GOLD, "gold_paxel", false);
		diamond_paxel = new TidyPaxel(ToolMaterial.DIAMOND, "diamond_paxel", false);
		//End Vanilla Paxels
		//Don't forget to register the item!
		//Gold Diamond
		register(gold_diamond_lump);
		register(gold_diamond);
		register(gold_diamond_sword);
		register(gold_diamond_pick);
		register(gold_diamond_hoe);
		register(gold_diamond_shovel);
		register(gold_diamond_axe);
		register(gold_diamond_paxel);
		//Obsidian
		register(obsidian_axe);
		register(obsidian_hoe);
		register(obsidian_paxel);
		register(obsidian_pick);
		register(obsidian_shovel);
		register(obsidian_sword);
		//Vanilla Paxels
		register(wood_paxel);
		register(stone_paxel);
		register(iron_paxel);
		register(gold_paxel);
		register(diamond_paxel);
		
		
		System.out.println("TidyItems from "+TidyMints.MODID+" checking in!");

	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		return item;
	}

}
