package com.pwae;

//Imports
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class PlayerEvents {
  private final String PREFIX = TextFormatting.GOLD + "-> ";
  
  @SubscribeEvent
  //Send Modpack information when joining a world
  public void playerJoin(PlayerEvent.PlayerLoggedInEvent event) {
	  event.player.sendStatusMessage(new TextComponentString(TextFormatting.WHITE + "" + TextFormatting.BOLD + "Welcome to PWaE 0.3.0d"), false);
	  event.player.sendStatusMessage(new TextComponentString(TextFormatting.WHITE + "" + TextFormatting.BOLD + "This version is a test. Expect bugs, crashes, etc. to be present"), false);
  }
}