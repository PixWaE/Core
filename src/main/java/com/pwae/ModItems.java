package com.pwae;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase ingotCopper = new ItemBase("ingot_copper");
	public static ItemArmour trainerHatWhite = new ItemArmour(core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_white");
	public static ItemArmour trainerHatBlack = new ItemArmour(core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_black");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				ingotCopper,
				trainerHatWhite,
				trainerHatBlack
		);
	}
	
	public static void registerModels() {
		ingotCopper.registerItemModel();
		trainerHatWhite.registerItemModel();
		trainerHatBlack.registerItemModel();
	}

}