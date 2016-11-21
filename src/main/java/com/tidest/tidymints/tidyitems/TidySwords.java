package com.tidest.tidymints.tidyitems;

import com.tidest.tidymints.TidyMints;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TidySwords extends ItemSword implements ItemModelProvider{
	//private static boolean unbreakable;
	protected String unlocalName;
	public TidySwords(ToolMaterial mat, String unlocalName, boolean breakable) {
		super(mat);
		this.setUnlocalizedName(unlocalName);
		/*
		if (breakable) TidySwords.unbreakable = true;
		else TidySwords.unbreakable = false;
		*/
		if (breakable) this.setMaxDamage(0);
		this.setRegistryName(unlocalName);
		this.unlocalName = unlocalName;
	}
	
	public void registerItemModel(Item item) {
		TidyMints.proxy.registerItemRenderer(this, 0, unlocalName);
	}
	/*
	public boolean hitEntity(ItemStack tool, EntityLivingBase elb1, EntityLivingBase elb2){
		if (TidySwords.unbreakable);
		else tool.damageItem(1, elb2);
		return true;
	}
	
    public boolean onBlockDestroyed(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player)
    {
    	if (TidySwords.unbreakable);
    	else {
    		if ((double)state.getBlockHardness(world, pos) != 0.0D)
    		{
    			tool.damageItem(2, player);
    		}
    	}
        return true;
    }
    */
}
