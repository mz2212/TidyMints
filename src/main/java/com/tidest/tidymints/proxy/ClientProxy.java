package com.tidest.tidymints.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import com.tidest.tidymints.TidyMints;
import com.tidest.tidymints.proxy.CommonProxy;

public class ClientProxy extends CommonProxy{
	public void registerItemRenderer(Item item, int meta, String unlocalName){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(TidyMints.MODID + ":" + unlocalName, "inventory"));
	}

}
