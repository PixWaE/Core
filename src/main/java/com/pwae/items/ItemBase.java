package com.pwae.items;

//Imports
import com.pwae.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


//Extend that Item Class
public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		Core.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}