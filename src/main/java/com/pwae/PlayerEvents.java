package com.pwae;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PlayerEvents {
  private final String PREFIX = TextFormatting.GOLD + "-> ";
  
  @SubscribeEvent
  //Send Modpack information when joining a world
  public void layerJoin(EntityJoinWorldEvent event) {
      if (!(event.getEntity() instanceof EntityPlayer))
          return;
      EntityPlayer player = (EntityPlayer)event.getEntity();
	  player.sendStatusMessage(new TextComponentString(TextFormatting.WHITE + "" + TextFormatting.BOLD + "Welcome to PWaE 0.2.0d"), false);
	  player.sendStatusMessage(new TextComponentString(TextFormatting.WHITE + "" + TextFormatting.BOLD + "This version is a test. Expect bugs, crashes, etc. to be present"), false);
  }
}