package com.pwae.Tabs;

import com.pwae.Items.ModItems;
import com.pwae.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

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