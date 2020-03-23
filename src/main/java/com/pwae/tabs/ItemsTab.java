package com.pwae.tabs;

//Imports
import com.pwae.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

//Become a thing because a thing
public class ItemsTab extends CreativeTabs {

    public ItemsTab() {
        super("itemstab");
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.tabItems);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}