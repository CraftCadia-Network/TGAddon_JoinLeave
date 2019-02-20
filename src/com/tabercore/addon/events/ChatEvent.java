package com.tabercore.addon.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener{

public void onPlayerChat(AsyncPlayerChatEvent e) {
		
		e.setCancelled(true);
		Player p = e.getPlayer();
		String name = p.getName();
		String message = e.getMessage();
		String prefix = ChatColor.GRAY + " >" + ChatColor.WHITE + "> " + ChatColor.GRAY; 
		Bukkit.broadcastMessage(name + prefix + message);
}
	
	
}
