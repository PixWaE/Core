package com.pwae.Tabs;

import com.pwae.Blocks.ModBlocks;
import com.pwae.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs {

    public BlocksTab() {
        super("blockstab");
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.tabBlock);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}