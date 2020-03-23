package com.pwae.proxy;

//Imports
import com.pwae.Core;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

//EXTEND THAT PROXY BITCH
public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Core.MODID + ":" + id, "inventory"));
	}

}
