package com.pwae.Items;

import com.pwae.core;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemArmour trainerHatWhite = new ItemArmour(core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_white");
	public static ItemArmour trainerHatBlack = new ItemArmour(core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_black");
	public static ItemBase tabItems = new ItemBase("items_tab");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				trainerHatWhite,
				trainerHatBlack,
				tabItems
		);
	}
	
	public static void registerModels() {
		trainerHatWhite.registerItemModel();
		trainerHatBlack.registerItemModel();
		tabItems.registerItemModel();
	}

}