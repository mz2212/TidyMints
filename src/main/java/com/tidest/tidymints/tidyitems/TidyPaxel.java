package com.tidest.tidymints.tidyitems;

import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.tidest.tidymints.TidyMints;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TidyPaxel extends ItemPickaxe implements ItemModelProvider{
	//private static boolean unbreakable;
	protected String unlocalName;
	public TidyPaxel(ToolMaterial mat, String unlocalName, boolean breakable){
		super(mat);
		this.setUnlocalizedName(unlocalName);
		/*
		if (breakable) TidyPaxel.unbreakable = true;
		else TidyPaxel.unbreakable = false;
		*/
		if (breakable) this.setMaxDamage(0);
		this.setRegistryName(unlocalName);
		this.unlocalName = unlocalName;
	}

	public void registerItemModel(Item item) {
		TidyMints.proxy.registerItemRenderer(this, 0, unlocalName);
	}

	//My unbreakability implementation. Nice, huh?
	//Unneeded, still here for history reasons.
	/*
	public boolean hitEntity(ItemStack tool, EntityLivingBase elb1, EntityLivingBase elb2){
		if (!TidyPaxel.unbreakable) tool.damageItem(2, elb2);
		return true;
	}
	
    public boolean onBlockDestroyed(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player)
    {
		if ((double)state.getBlockHardness(world, pos) != 0.0D && !TidyPaxel.unbreakable)
		{
			tool.damageItem(1, player);
		}
        return true;
    }
    */
	
	@Override
	//Set this "pickaxe" to be of these types
	//DONE: Make a paxel work as a pick again.
	//Gawddammit, vanilla broke it.
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "spade", "axe");
	}
	
	//Vanilla doesn't follow forge rules :(
	private static Set<Block> effectiveAgainst = Sets.newHashSet(new Block[]{
			Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, 
			Blocks.FARMLAND, Blocks.SOUL_SAND, Blocks.MYCELIUM, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, 
			Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN
	});
	
	public boolean canHarvestBlock(IBlockState state){
		Block block = state.getBlock();
		return effectiveAgainst.contains(block) || block == Blocks.SNOW;
	}
	//It seems your friendly neighborhood paxel, is back!
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material mat = state.getMaterial();
		if (mat == Material.WOOD || mat == Material.VINE || mat == Material.PLANTS || mat == Material.ROCK || mat == Material.ANVIL || mat == Material.IRON)
			return this.efficiencyOnProperMaterial;
		if (effectiveAgainst.contains(state.getBlock())) return this.efficiencyOnProperMaterial;

		return 1.0F;
	}
}
