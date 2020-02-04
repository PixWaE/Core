package com.pwae;

import com.pwae.ModItems;
import com.pwae.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PWaETab extends CreativeTabs {

	public PWaETab() {
		super(core.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ingotCopper);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

}