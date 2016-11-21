package com.tidest.tidymints.tidyitems;

import java.util.Set;
import com.google.common.collect.Sets;
import com.tidest.tidymints.TidyMints;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//I guess I can't extend ItemAxe directly anymore...
public class TidyAxes extends ItemTool implements ItemModelProvider{
	private static Set<Block> effectiveAgainst = Sets.newHashSet(new Block[]{ Blocks.PLANKS, 
			Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, 
			Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN
	});
	//private static boolean unbreakable;
	protected String unlocalName;
	public TidyAxes(ToolMaterial mat, String unlocalName, boolean breakable){
		super(mat, effectiveAgainst);
		this.setUnlocalizedName(unlocalName);
		/*
		if (breakable) TidyAxes.unbreakable = true;
		else TidyAxes.unbreakable = false;
		*/
		if (breakable) this.setMaxDamage(0);
		this.attackSpeed = -3.0F;
		this.damageVsEntity = mat.getDamageVsEntity();
		this.setRegistryName(unlocalName);
		this.unlocalName = unlocalName;
	}
	
	public void registerItemModel(Item item) {
		TidyMints.proxy.registerItemRenderer(this, 0, unlocalName);
	}
	/*
	public boolean hitEntity(ItemStack tool, EntityLivingBase elb1, EntityLivingBase elb2){
		if (TidyAxes.unbreakable);
		else tool.damageItem(2, elb2);
		return true;
	}
	
    public boolean onBlockDestroyed(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player)
    {
    		if ((double)state.getBlockHardness(world, pos) != 0.0D && !TidyAxes.unbreakable)
    		{
    			tool.damageItem(1, player);
    		}

        return true;
    }
    */
    
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && 
        		material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

}
