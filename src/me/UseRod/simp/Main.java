package me.UseRod.simp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable() {
		this.saveDefaultConfig();
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "Enabled " + ChatColor.GRAY + "" + ChatColor.ITALIC + "(Made By: UseRod)");
		Bukkit.getPluginManager().registerEvents(new Listeners(), this);
        getCommand("Unranked").setExecutor(new Commands());
        getCommand("Ranked").setExecutor(new Commands());
	}
	public void onDisable() {
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "Disabled " + ChatColor.GRAY + "" + ChatColor.ITALIC + "(Made By: UseRod)");
	}

}
