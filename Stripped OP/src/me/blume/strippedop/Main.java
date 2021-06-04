package me.blume.strippedop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.blume.strippedop.listeners.BreakingStripped;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new BreakingStripped(this), this);
	}
	@Override
	public void onDisable() {
		
	}
}
