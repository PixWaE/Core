package com.pwae;

import org.apache.logging.log4j.Logger;

import com.pwae.ModItems;

import org.apache.logging.log4j.LogManager;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.creativetab.CreativeTabs;
import com.pwae.PlayerEvents;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

@Mod(modid = core.MODID, name = core.NAME, version = core.VERSION, acceptedMinecraftVersions = core.MC_VERSION)
public class core {

	public static final String MODID = "pwae";
	public static final String NAME = "PWaE Core";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";
	public static final String FULL_NAME = "Pixelmon: Wind and Earth";

	public static final Logger LOGGER = LogManager.getLogger(core.MODID);
	private String windowDisplayTitle;

	 @EventHandler
	 @SideOnly(Side.CLIENT)
	 public void preinit(FMLPreInitializationEvent event) {
		 if (proxy instanceof ClientProxy) {
			 
		 }
		 Display.setTitle(FULL_NAME);
	 }
	  
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//LOGGER.info(core.NAME + "says hi!");
		MinecraftForge.EVENT_BUS.register(new PlayerEvents());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}
	
	@SidedProxy(serverSide = "com.pwae.CommonProxy", clientSide = "com.pwae.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}
	public static final PWaETab creativeTab = new PWaETab();
	public static final ItemArmor.ArmorMaterial trainerHatMaterial = EnumHelper.addArmorMaterial("COPPER", MODID + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

}