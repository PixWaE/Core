package com.pwae.blocks;

import com.pwae.Core;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper").setCreativeTab(Core.TempTab);
    public static BlockOre tabBlock = new BlockOre("tabBlock");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                tabBlock
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                tabBlock.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        tabBlock.registerItemModel(Item.getItemFromBlock(tabBlock));
    }

}