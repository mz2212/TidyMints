package com.tidest.tidymints.tidyitems;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import com.tidest.tidymints.TidyMints;

public class TidyItemBase extends Item implements ItemModelProvider{
	protected String unlocalName;
	
	public TidyItemBase(String unlocalName){
		super();
		
		this.unlocalName = unlocalName;
		setUnlocalizedName(unlocalName);
		setRegistryName(unlocalName);
		
	}
	
	public void registerItemModel(Item item) {
		TidyMints.proxy.registerItemRenderer(this, 0, unlocalName);
	}
	
	public TidyItemBase setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}

}
