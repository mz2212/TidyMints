package com.tidest.tidymints.tidyitems;

import com.tidest.tidymints.TidyMints;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TidyPicks extends ItemPickaxe implements ItemModelProvider{
	protected String unlocalName;
	public TidyPicks(ToolMaterial mat, String unlocalName, boolean breakable){
		super(mat);
		this.setUnlocalizedName(unlocalName);
		/*
		if (breakable) TidyPicks.unbreakable = true;
		else TidyPicks.unbreakable = false;
		*/
		//This makes a couple things unnecessary.
		if (breakable) this.setMaxDamage(0);
		this.setRegistryName(unlocalName);
		this.unlocalName = unlocalName;
	}

	public void registerItemModel(Item item) {
		TidyMints.proxy.registerItemRenderer(this, 0, unlocalName);
	}


	//DONE: make some tools breakable. Note: This is broken for ALL my custom tools & swords.
	//FAK! This broke in the update to 1.10.2, while having all tools unbreakable is nice, it's unbalanced.
	//I don't need to override these anymore.
	/*
	public boolean hitEntity(ItemStack tool, EntityLivingBase elb1, EntityLivingBase elb2){
		if (!TidyPicks.unbreakable) tool.damageItem(2, elb2);
		return true;
	}
	
    public boolean onBlockDestroyed(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player)
    {

		if ((double)state.getBlockHardness(world, pos) != 0.0D && !TidyPicks.unbreakable)
		{
			tool.damageItem(1, player);
		}
        return true;
    }
    */

}
