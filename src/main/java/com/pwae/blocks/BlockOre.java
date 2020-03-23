package com.pwae.blocks;

//Imports
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

//Extended Class because teachers need moneys or something
public class BlockOre extends BlockBase {

    public BlockOre(String name) {
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}