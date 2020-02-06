package com.pwae.tabs;

import com.pwae.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TempTab extends CreativeTabs {

	public TempTab() {
		super("temptab");
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.trainerHatWhite);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

}