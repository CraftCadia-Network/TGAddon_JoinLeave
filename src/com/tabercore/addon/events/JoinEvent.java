package com.tabercore.addon.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.samtaber.base.Base;

public class JoinEvent implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		e.getPlayer().sendMessage(ChatColor.GREEN + e.getPlayer().getName() + " has joined " + ChatColor.GOLD + Base.serverName);
	}

}
