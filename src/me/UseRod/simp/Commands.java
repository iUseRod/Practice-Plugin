package me.UseRod.simp;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Commands implements Listener, CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getLabel().equals("unranked")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
			    Inventory inv;
			    inv = Bukkit.createInventory(null, 9, "Unranked");
			    ItemStack BuildUHC = new ItemStack(Material.LAVA_BUCKET);
			    ItemMeta name = BuildUHC.getItemMeta();
			    name.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "BuildUHC");
			    BuildUHC.setItemMeta(name);
			    inv.setItem(1, BuildUHC);
			    ItemStack RodPvP = new ItemStack(Material.FISHING_ROD);
			    ItemMeta name1 = RodPvP.getItemMeta();
			    name1.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "RodPvP");
			    RodPvP.setItemMeta(name1);
			    inv.setItem(3, RodPvP);
			    ItemStack Smooth = new ItemStack(Material.REDSTONE_BLOCK);
			    ItemMeta name11 = Smooth.getItemMeta();
			    name11.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Smooth");
			    Smooth.setItemMeta(name11);
			    inv.setItem(5, Smooth);
			    ItemStack Blury = new ItemStack(Material.MAP);
			    ItemMeta name111 = Blury.getItemMeta();
			    name111.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Blury");
			    Blury.setItemMeta(name111);
			    inv.setItem(7, Blury);
	            ItemStack g1 = new ItemStack(Material.STAINED_GLASS_PANE);
	            ItemMeta gl1 = g1.getItemMeta();
	            gl1.setDisplayName(ChatColor.DARK_GREEN + "💵");
	            ArrayList<String> l1= new ArrayList<String>();
	            gl1.setLore(l1);
	            g1.setItemMeta(gl1);
	            inv.setItem(2, g1);
	            inv.setItem(4, g1);
	            inv.setItem(6, g1);
				p.sendMessage(ChatColor.GREEN + "You Opened The " + ChatColor.DARK_GREEN + "Unranked " + ChatColor.GREEN + "Menu!");
				p.openInventory(inv);
			}else System.out.println("This Command Is Only Executable By Players!");
		} else if(command.getLabel().equals("ranked")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
			    Inventory inv;
			    inv = Bukkit.createInventory(null, 9, "Ranked");
			    ItemStack BuildUHC = new ItemStack(Material.LAVA_BUCKET);
			    ItemMeta name = BuildUHC.getItemMeta();
			    name.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "BuildUHC");
			    BuildUHC.setItemMeta(name);
			    BuildUHC.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
			    inv.setItem(1, BuildUHC);
			    ItemStack RodPvP = new ItemStack(Material.FISHING_ROD);
			    ItemMeta name1 = RodPvP.getItemMeta();
			    name1.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "RodPvP");
			    RodPvP.setItemMeta(name1);
			    RodPvP.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
			    inv.setItem(3, RodPvP);
			    ItemStack Smooth = new ItemStack(Material.REDSTONE_BLOCK);
			    ItemMeta name11 = Smooth.getItemMeta();
			    name11.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Smooth");
			    Smooth.setItemMeta(name11);
			    Smooth.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
			    inv.setItem(5, Smooth);
			    ItemStack Blury = new ItemStack(Material.MAP);
			    ItemMeta name111 = Blury.getItemMeta();
			    name111.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Blury");
			    Blury.setItemMeta(name111);
			    Blury.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
			    inv.setItem(7, Blury);
	            ItemStack g1 = new ItemStack(Material.STAINED_GLASS_PANE);
	            ItemMeta gl1 = g1.getItemMeta();
	            ArrayList<String> l1= new ArrayList<String>();
	            gl1.setLore(l1);
	            gl1.setDisplayName(ChatColor.DARK_GREEN + "💵");
	            g1.setItemMeta(gl1);
	            inv.setItem(2, g1);
	            inv.setItem(4, g1);
	            inv.setItem(6, g1);
				p.sendMessage(ChatColor.GREEN + "You Opened The " + ChatColor.DARK_GREEN + "Ranked " + ChatColor.GREEN + "Menu!");
				p.openInventory(inv);
			}else System.out.println("This Command Is Only Executable By Players!");
		}
        return false;
    }
}
