package com.tidest.tidymints;

import com.tidest.tidymints.tidyblocks.TidyBlocks;
import com.tidest.tidymints.tidyitems.TidyItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TidyRecipes {
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(TidyItems.gold_diamond_lump), Items.DIAMOND, Items.GOLD_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(TidyBlocks.ender_obsidian), Blocks.OBSIDIAN, Blocks.END_STONE);
		GameRegistry.addSmelting(TidyItems.gold_diamond_lump, new ItemStack(TidyItems.gold_diamond), 0.45F);
		pickaxe(new ItemStack(TidyItems.gold_diamond_pick), TidyItems.gold_diamond, Items.STICK);
		axe(new ItemStack(TidyItems.gold_diamond_axe), TidyItems.gold_diamond, Items.STICK);
		hoe(new ItemStack(TidyItems.gold_diamond_hoe), TidyItems.gold_diamond, Items.STICK);
		shovel(new ItemStack(TidyItems.gold_diamond_shovel), TidyItems.gold_diamond, Items.STICK);
		sword(new ItemStack(TidyItems.gold_diamond_sword), TidyItems.gold_diamond, Items.STICK);
		paxel(new ItemStack(TidyItems.gold_diamond_paxel), TidyItems.gold_diamond_axe, TidyItems.gold_diamond_shovel, TidyItems.gold_diamond_pick, Items.STICK);
		axe(new ItemStack(TidyItems.obsidian_axe), TidyBlocks.ender_obsidian, Items.STICK);
		hoe(new ItemStack(TidyItems.obsidian_hoe), TidyBlocks.ender_obsidian, Items.STICK);
		pickaxe(new ItemStack(TidyItems.obsidian_pick), TidyBlocks.ender_obsidian, Items.STICK);
		shovel(new ItemStack(TidyItems.obsidian_shovel), TidyBlocks.ender_obsidian, Items.STICK);
		sword(new ItemStack(TidyItems.obsidian_sword), TidyBlocks.ender_obsidian, Items.STICK);
		paxel(new ItemStack(TidyItems.obsidian_paxel), TidyItems.obsidian_axe, TidyItems.obsidian_shovel, TidyItems.obsidian_pick, Items.STICK);
		paxel(new ItemStack(TidyItems.iron_paxel), Items.IRON_AXE, Items.IRON_SHOVEL, Items.IRON_PICKAXE, Items.STICK);
		paxel(new ItemStack(TidyItems.stone_paxel), Items.STONE_AXE, Items.STONE_SHOVEL, Items.STONE_PICKAXE, Items.STICK);
		paxel(new ItemStack(TidyItems.wood_paxel), Items.WOODEN_AXE, Items.WOODEN_SHOVEL, Items.WOODEN_PICKAXE, Items.STICK);
		paxel(new ItemStack(TidyItems.gold_paxel), Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_PICKAXE, Items.STICK);
		paxel(new ItemStack(TidyItems.diamond_paxel), Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_PICKAXE, Items.STICK);

		System.out.println("TidyRecipes from "+TidyMints.MODID+" checking in!");
	}
	//Output, Axe, Spade, Pickaxe, Stick
	private static void paxel(ItemStack out, Item in1, Item in2, Item in3, Item in4){
		GameRegistry.addRecipe(out, new Object[]{ "ADP", " S ", " S ", 'A', in1, 'D', in2, 'P', in3, 'S', in4 });
	}
	//Output, Material, Stick
	private static void hoe(ItemStack out, Item in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ "DD ", " S ", " S ", 'D', in1, 'S', in2 });
		GameRegistry.addRecipe(out, new Object[]{ " DD", " S ", " S ", 'D', in1, 'S', in2 });
	}
	private static void hoe(ItemStack out, Block in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ "DD ", " S ", " S ", 'D', in1, 'S', in2 });
		GameRegistry.addRecipe(out, new Object[]{ " DD", " S ", " S ", 'D', in1, 'S', in2 });
	}
	//Output, Material, Stick
	private static void axe(ItemStack out, Item in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ "DD ", "DS ", " S ", 'D', in1, 'S', in2 });
		GameRegistry.addRecipe(out, new Object[]{ " DD", " SD", " S ", 'D', in1, 'S', in2 });
	}
	private static void axe(ItemStack out, Block in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ "DD ", "DS ", " S ", 'D', in1, 'S', in2 });
		GameRegistry.addRecipe(out, new Object[]{ " DD", " SD", " S ", 'D', in1, 'S', in2 });
	}
	private static void shovel(ItemStack out, Item in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ " D ", " S ", " S ", 'D', in1, 'S', in2 });
	}
	private static void shovel(ItemStack out, Block in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ " D ", " S ", " S ", 'D', in1, 'S', in2 });
	}
	private static void pickaxe(ItemStack out, Item in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ "DDD", " S ", " S ", 'D', in1, 'S', in2 });
	}
	private static void pickaxe(ItemStack out, Block in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ "DDD", " S ", " S ", 'D', in1, 'S', in2 });
	}
	private static void sword(ItemStack out, Item in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ " D ", " D ", " S ", 'D', in1, 'S', in2 });
	}
	private static void sword(ItemStack out, Block in1, Item in2){
		GameRegistry.addRecipe(out, new Object[]{ " D ", " D ", " S ", 'D', in1, 'S', in2 });
	}
}
