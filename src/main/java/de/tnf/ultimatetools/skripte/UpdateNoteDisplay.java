package de.tnf.ultimatetools.skripte;

import net.minecraft.network.NetworkManager;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import de.tnf.ultimatetools.UltimateTools;

public class UpdateNoteDisplay {

    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) 
    {
    	if (UltimateTools.notefication == 4)
    	event.player.addChatComponentMessage(new ChatComponentText("A new Major Version of Ultimate Tools is available. It is absolutely necessary to download it now. You can deactivate this notice in the config file."));
    	if (UltimateTools.notefication == 3)
    	event.player.addChatComponentMessage(new ChatComponentText("A new Minor Version of Ultimate Tools is available. Please download it now to take all features and Minecraft version support. You can deactivate this notice in the config file."));
    	if (UltimateTools.notefication == 2)
    	event.player.addChatComponentMessage(new ChatComponentText("A new Build of Ultimate Tools is available. Please download it now to take best Performance. You can deactivate this notice in the config file."));
    	if (UltimateTools.notefication == 1)
    	event.player.addChatComponentMessage(new ChatComponentText("A new revision of Ultimate Tools is available. Please download it now to fix Bugs. You can deactivate this notice in the config file."));

    }
	
}
