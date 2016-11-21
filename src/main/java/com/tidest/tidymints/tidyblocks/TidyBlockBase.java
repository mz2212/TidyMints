package com.tidest.tidymints.tidyblocks;

import com.tidest.tidymints.TidyMints;
import com.tidest.tidymints.tidyitems.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class TidyBlockBase extends Block implements ItemModelProvider{
    protected String unlocalName;

    public TidyBlockBase(Material mat, String unlocalName){
        super(mat);

        this.unlocalName = unlocalName;
        setUnlocalizedName(unlocalName);
        setRegistryName(unlocalName);
    }

    public void registerItemModel(Item item){
        TidyMints.proxy.registerItemRenderer(item, 0, unlocalName);
    }

    public TidyBlockBase setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
