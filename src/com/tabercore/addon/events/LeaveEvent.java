package com.tabercore.addon.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.samtaber.base.Base;

public class LeaveEvent implements Listener{
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		
		e.getPlayer().sendMessage(ChatColor.RED + e.getPlayer().getName() + " has left " + ChatColor.GOLD + Base.serverName);
	}

}
