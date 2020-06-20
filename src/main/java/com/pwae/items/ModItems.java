package com.pwae.items;

//Imports
import com.pwae.Core;
import com.pwae.items.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

//Ew Gross Modded Items
public class ModItems {
	//public static ItemArmour trainerHatWhite = new ItemArmour(Core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_white").setCreativeTab(Core.CosmeticsTab);
	//public static ItemArmour trainerHatBlack = new ItemArmour(Core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_black").setCreativeTab(Core.CosmeticsTab);
	//public static ItemArmour trainerHatGreen = new ItemArmour(Core.trainerHatMaterial, EntityEquipmentSlot.HEAD, "trainer_hat_green").setCreativeTab(Core.CosmeticsTab);
	public static ItemBase tabItems = new ItemBase("items_tab");
	public static ItemBase badgeOne = new ItemBase("badge_one").setCreativeTab(Core.BadgesTab);
	public static ItemBase badgeOneV = new ItemBase("badge_one").setCreativeTab(Core.BadgesTab);

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				//Cosmetics
				//trainerHatWhite,
				//trainerHatBlack,
				//trainerHatGreen,
				//Badges
				badgeOne,
				badgeOneV,
				//Tabs
				tabItems
		);
	}

	public static void registerModels() {
		//trainerHatWhite.registerItemModel();
		//trainerHatBlack.registerItemModel();
		//trainerHatGreen.registerItemModel();
		badgeOne.registerItemModel();
		badgeOneV.registerItemModel();
		tabItems.registerItemModel();
	}

}