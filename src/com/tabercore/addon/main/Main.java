package com.tabercore.addon.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.tabercore.addon.events.ChatEvent;
import com.tabercore.addon.events.JoinEvent;
import com.tabercore.addon.events.LeaveEvent;

public class Main extends JavaPlugin{

	public static Main instance;
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new ChatEvent(), this);
		Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
		Bukkit.getPluginManager().registerEvents(new LeaveEvent(), this);
		instance = this;
		
	}
	
	public void onDisable() {
		
		instance = null;
		
	}
	
	
}
