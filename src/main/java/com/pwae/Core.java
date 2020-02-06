package com.pwae;

import com.pwae.blocks.ModBlocks;
import com.pwae.items.ModItems;
import com.pwae.proxy.ClientProxy;
import com.pwae.proxy.CommonProxy;
import com.pwae.tabs.BlocksTab;
import com.pwae.tabs.CosmeticsTab;
import com.pwae.tabs.ItemsTab;
import com.pwae.tabs.TempTab;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.Display;

@Mod(modid = Core.MODID, name = Core.NAME, version = Core.VERSION, acceptedMinecraftVersions = Core.MC_VERSION)
public class Core {

	public static final String MODID = "pwae";
	public static final String NAME = "PWaE Core";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";
	public static final String FULL_NAME = "Pixelmon: Wind and Earth";

	public static final Logger LOGGER = LogManager.getLogger(Core.MODID);
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
	
	@SidedProxy(serverSide = "com.pwae.Proxy.CommonProxy", clientSide = "com.pwae.Proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
	}

	public static final com.pwae.tabs.TempTab TempTab = new TempTab();
	public static final BlocksTab BlocksTab = new BlocksTab();
	public static final ItemsTab ItemsTab = new ItemsTab();
	public static final com.pwae.tabs.CosmeticsTab CosmeticsTab = new CosmeticsTab();
	public static final ItemArmor.ArmorMaterial trainerHatMaterial = EnumHelper.addArmorMaterial("COPPER", MODID + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

}