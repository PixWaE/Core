package com.pwae.Tabs;

import com.pwae.Items.ModItems;
import com.pwae.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CosmeticsTab extends CreativeTabs {

    public CosmeticsTab() {
        super("cosmeticstab");
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