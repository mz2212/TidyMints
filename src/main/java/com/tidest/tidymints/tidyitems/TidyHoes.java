package com.tidest.tidymints.tidyitems;

import com.tidest.tidymints.TidyMints;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class TidyHoes extends ItemHoe implements ItemModelProvider{
	//public static boolean unbreakable;
	protected String unlocalName;
	public TidyHoes(ToolMaterial mat, String unlocalName, boolean breakable){
		super(mat);
		this.setUnlocalizedName(unlocalName);
		/*
		if (breakable) TidyHoes.unbreakable = true;
		else TidyHoes.unbreakable = false;
		*/
		if (breakable) this.setMaxDamage(0);
		this.setRegistryName(unlocalName);
		this.unlocalName = unlocalName;
	}

	public void registerItemModel(Item item) {
		TidyMints.proxy.registerItemRenderer(this, 0, unlocalName);
	}

	//DONE?: unbreakable hoes.
	
	/* I can't figure out how to make hoes unbreakable in 1.10.2
	//Hoe overrides suck.
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(stack, playerIn, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(stack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                    }
                }
            }

            return EnumActionResult.PASS;
        }
    }
    */

}
