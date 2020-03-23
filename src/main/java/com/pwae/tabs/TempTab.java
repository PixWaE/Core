package com.pwae.tabs;

//Imports
import com.pwae.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

//Become a thing because a thing
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