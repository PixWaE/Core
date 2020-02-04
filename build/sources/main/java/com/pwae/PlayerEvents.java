package com.pwae;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PlayerEvents {
  private final String PREFIX = TextFormatting.GOLD + "-> ";
  
  @SubscribeEvent
  public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent e) {
	  EntityPlayer player = e.player;
	  player.sendStatusMessage(new TextComponentString(TextFormatting.GREEN + "Welcome to PWaE 0.1.0d"), false);
	  player.sendStatusMessage(new TextComponentString(TextFormatting.GREEN + "This version is a test. Expect bugs, crashes, etc. to be present"), false);
  }
}