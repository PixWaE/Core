package com.pwae.items;

import com.pwae.Core;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemArmour trainerHatWhite = new ItemArmour(Core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_white");
	public static ItemArmour trainerHatBlack = new ItemArmour(Core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_black");
	public static ItemArmour trainerHatGreen = new ItemArmour(Core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_green");
	public static ItemBase tabItems = new ItemBase("items_tab");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				trainerHatWhite,
				trainerHatBlack,
				trainerHatGreen,
				tabItems
		);
	}
	
	public static void registerModels() {
		trainerHatWhite.registerItemModel();
		trainerHatBlack.registerItemModel();
		trainerHatGreen.registerItemModel();
		tabItems.registerItemModel();
	}

}