package com.pwae.tabs;

//Imports
import com.pwae.blocks.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

//Become a thing because a thing
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