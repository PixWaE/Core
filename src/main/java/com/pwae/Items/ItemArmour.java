package com.pwae.items;

import com.pwae.Core;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ItemArmour extends net.minecraft.item.ItemArmor {
	
	private String name;

	public ItemArmour(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setCreativeTab(Core.CosmeticsTab);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	public void registerItemModel() {
		Core.proxy.registerItemRenderer(this, 0, name);
	}

	public void registerItemModel(Item item) {
		Core.proxy.registerItemRenderer(this, 0, name);
	}

}