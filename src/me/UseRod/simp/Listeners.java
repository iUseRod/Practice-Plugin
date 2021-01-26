package me.UseRod.simp;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class Listeners implements Listener {
	public Plugin plugin = Main.getPlugin(Main.class);
	Location ARENA1 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA1-WORLD")), this.plugin.getConfig().getDoubleList("ARENA1").get(0), this.plugin.getConfig().getDoubleList("ARENA1").get(1), this.plugin.getConfig().getDoubleList("ARENA1").get(2));
	Location ARENA2 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA2-WORLD")), this.plugin.getConfig().getDoubleList("ARENA2").get(0), this.plugin.getConfig().getDoubleList("ARENA2").get(1), this.plugin.getConfig().getDoubleList("ARENA2").get(2));
	Location ARENA3 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA3-WORLD")), this.plugin.getConfig().getDoubleList("ARENA3").get(0), this.plugin.getConfig().getDoubleList("ARENA3").get(1), this.plugin.getConfig().getDoubleList("ARENA3").get(2));
	Location ARENA4 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA4-WORLD")), this.plugin.getConfig().getDoubleList("ARENA4").get(0), this.plugin.getConfig().getDoubleList("ARENA4").get(1), this.plugin.getConfig().getDoubleList("ARENA4").get(2));
	Location ARENA5 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA5-WORLD")), this.plugin.getConfig().getDoubleList("ARENA5").get(0), this.plugin.getConfig().getDoubleList("ARENA5").get(1), this.plugin.getConfig().getDoubleList("ARENA5").get(2));
	Location ARENA6 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA6-WORLD")), this.plugin.getConfig().getDoubleList("ARENA6").get(0), this.plugin.getConfig().getDoubleList("ARENA6").get(1), this.plugin.getConfig().getDoubleList("ARENA6").get(2));
	Location ARENA7 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA7-WORLD")), this.plugin.getConfig().getDoubleList("ARENA7").get(0), this.plugin.getConfig().getDoubleList("ARENA7").get(1), this.plugin.getConfig().getDoubleList("ARENA7").get(2));
	Location ARENA8 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA8-WORLD")), this.plugin.getConfig().getDoubleList("ARENA8").get(0), this.plugin.getConfig().getDoubleList("ARENA8").get(1), this.plugin.getConfig().getDoubleList("ARENA8").get(2));
	Location ARENA9 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA9-WORLD")), this.plugin.getConfig().getDoubleList("ARENA9").get(0), this.plugin.getConfig().getDoubleList("ARENA9").get(1), this.plugin.getConfig().getDoubleList("ARENA9").get(2));
	Location ARENA10 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA10-WORLD")), this.plugin.getConfig().getDoubleList("ARENA10").get(0), this.plugin.getConfig().getDoubleList("ARENA10").get(1), this.plugin.getConfig().getDoubleList("ARENA10").get(2));
	Location ARENA11 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA11-WORLD")), this.plugin.getConfig().getDoubleList("ARENA11").get(0), this.plugin.getConfig().getDoubleList("ARENA11").get(1), this.plugin.getConfig().getDoubleList("ARENA11").get(2));
	Location ARENA12 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA12-WORLD")), this.plugin.getConfig().getDoubleList("ARENA12").get(0), this.plugin.getConfig().getDoubleList("ARENA12").get(1), this.plugin.getConfig().getDoubleList("ARENA12").get(2));
	Location ARENA13 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA13-WORLD")), this.plugin.getConfig().getDoubleList("ARENA13").get(0), this.plugin.getConfig().getDoubleList("ARENA13").get(1), this.plugin.getConfig().getDoubleList("ARENA13").get(2));
	Location ARENA14 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA14-WORLD")), this.plugin.getConfig().getDoubleList("ARENA14").get(0), this.plugin.getConfig().getDoubleList("ARENA14").get(1), this.plugin.getConfig().getDoubleList("ARENA14").get(2));
	Location ARENA15 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA15-WORLD")), this.plugin.getConfig().getDoubleList("ARENA15").get(0), this.plugin.getConfig().getDoubleList("ARENA15").get(1), this.plugin.getConfig().getDoubleList("ARENA15").get(2));
	Location ARENA16 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA16-WORLD")), this.plugin.getConfig().getDoubleList("ARENA16").get(0), this.plugin.getConfig().getDoubleList("ARENA16").get(1), this.plugin.getConfig().getDoubleList("ARENA16").get(2));
	Location ARENA17 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA17-WORLD")), this.plugin.getConfig().getDoubleList("ARENA17").get(0), this.plugin.getConfig().getDoubleList("ARENA17").get(1), this.plugin.getConfig().getDoubleList("ARENA17").get(2));
	Location ARENA18 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA18-WORLD")), this.plugin.getConfig().getDoubleList("ARENA18").get(0), this.plugin.getConfig().getDoubleList("ARENA18").get(1), this.plugin.getConfig().getDoubleList("ARENA18").get(2));
	Location ARENA19 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA19-WORLD")), this.plugin.getConfig().getDoubleList("ARENA19").get(0), this.plugin.getConfig().getDoubleList("ARENA19").get(1), this.plugin.getConfig().getDoubleList("ARENA19").get(2));
	Location ARENA20 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA20-WORLD")), this.plugin.getConfig().getDoubleList("ARENA20").get(0), this.plugin.getConfig().getDoubleList("ARENA20").get(1), this.plugin.getConfig().getDoubleList("ARENA20").get(2));
	Location ARENA21 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA21-WORLD")), this.plugin.getConfig().getDoubleList("ARENA21").get(0), this.plugin.getConfig().getDoubleList("ARENA21").get(1), this.plugin.getConfig().getDoubleList("ARENA21").get(2));
	Location ARENA22 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA22-WORLD")), this.plugin.getConfig().getDoubleList("ARENA22").get(0), this.plugin.getConfig().getDoubleList("ARENA22").get(1), this.plugin.getConfig().getDoubleList("ARENA22").get(2));
	Location ARENA23 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA23-WORLD")), this.plugin.getConfig().getDoubleList("ARENA23").get(0), this.plugin.getConfig().getDoubleList("ARENA23").get(1), this.plugin.getConfig().getDoubleList("ARENA23").get(2));
	Location ARENA24 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA24-WORLD")), this.plugin.getConfig().getDoubleList("ARENA24").get(0), this.plugin.getConfig().getDoubleList("ARENA24").get(1), this.plugin.getConfig().getDoubleList("ARENA24").get(2));
	Location ARENA25 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA25-WORLD")), this.plugin.getConfig().getDoubleList("ARENA25").get(0), this.plugin.getConfig().getDoubleList("ARENA25").get(1), this.plugin.getConfig().getDoubleList("ARENA25").get(2));
	Location ARENA26 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA26-WORLD")), this.plugin.getConfig().getDoubleList("ARENA26").get(0), this.plugin.getConfig().getDoubleList("ARENA26").get(1), this.plugin.getConfig().getDoubleList("ARENA26").get(2));
	Location ARENA27 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA27-WORLD")), this.plugin.getConfig().getDoubleList("ARENA27").get(0), this.plugin.getConfig().getDoubleList("ARENA27").get(1), this.plugin.getConfig().getDoubleList("ARENA27").get(2));
	Location ARENA28 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA28-WORLD")), this.plugin.getConfig().getDoubleList("ARENA28").get(0), this.plugin.getConfig().getDoubleList("ARENA28").get(1), this.plugin.getConfig().getDoubleList("ARENA28").get(2));
	Location ARENA29 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA29-WORLD")), this.plugin.getConfig().getDoubleList("ARENA29").get(0), this.plugin.getConfig().getDoubleList("ARENA29").get(1), this.plugin.getConfig().getDoubleList("ARENA29").get(2));
	Location ARENA30 = new Location(Bukkit.getWorld(this.plugin.getConfig().getString("ARENA30-WORLD")), this.plugin.getConfig().getDoubleList("ARENA30").get(0), this.plugin.getConfig().getDoubleList("ARENA30").get(1), this.plugin.getConfig().getDoubleList("ARENA30").get(2));

	List<Player> unrankedBuildUhc = new ArrayList<>();
	List<Player> unrankedRodPvP = new ArrayList<>();
	List<Player> unrankedSmooth = new ArrayList<>();
	List<Player> unrankedBlury = new ArrayList<>();
	
	//--------------------------------------------------
	
	List<Player> rankedBuildUhc = new ArrayList<>();
	List<Player> rankedRodPvP = new ArrayList<>();
	List<Player> rankedSmooth = new ArrayList<>();
	List<Player> rankedBlury = new ArrayList<>();
	@EventHandler
	public void Guiclick(InventoryClickEvent e) {
		if(e.getInventory().getName().equals("Unranked")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() != Material.AIR && e.getCurrentItem().getType() != Material.STAINED_GLASS_PANE) {
				try {
					if(e.getCurrentItem().getItemMeta().getDisplayName() != null) {
						e.getWhoClicked().getWorld().playSound(e.getWhoClicked().getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
						e.getWhoClicked().sendMessage(ChatColor.BLUE + "You Joined The Queue Of Unranked " + e.getCurrentItem().getItemMeta().getDisplayName() + ChatColor.BLUE + "!");
						if(e.getCurrentItem().getType() == Material.LAVA_BUCKET) {
							if(!unrankedBuildUhc.contains(e.getWhoClicked())) {
								unrankedBuildUhc.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(unrankedBuildUhc.size() == 2) {
								unrankedBuildUhc.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								unrankedBuildUhc.get(1).teleport(ARENA1);
								unrankedBuildUhc.get(2).teleport(ARENA1);
							}
						}else if(e.getCurrentItem().getType() == Material.FISHING_ROD) {
							if(!unrankedRodPvP.contains(e.getWhoClicked())) {
								unrankedRodPvP.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(unrankedRodPvP.size() == 2) {
								unrankedRodPvP.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								unrankedRodPvP.get(1).teleport(ARENA2);
								unrankedRodPvP.get(2).teleport(ARENA2);
							}
						}else if(e.getCurrentItem().getType() == Material.REDSTONE_BLOCK) {
							if(!unrankedSmooth.contains(e.getWhoClicked())) {
								unrankedSmooth.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(unrankedSmooth.size() == 2) {
								unrankedSmooth.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								unrankedSmooth.get(1).teleport(ARENA3);
								unrankedSmooth.get(2).teleport(ARENA3);
							}
						}else if(e.getCurrentItem().getType() == Material.MAP) {
							if(!unrankedBlury.contains(e.getWhoClicked())) {
								unrankedBlury.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(unrankedBlury.size() == 2) {
								unrankedBlury.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								unrankedBlury.get(1).teleport(ARENA4);
								unrankedBlury.get(2).teleport(ARENA4);
							}
						}

					}
				}catch (NullPointerException error) {
				}

			}
			e.setCancelled(true);
		}else if(e.getInventory().getName().equals("Ranked")) {
			if(e.getCurrentItem().getType() != Material.AIR && e.getCurrentItem().getType() != Material.STAINED_GLASS_PANE) {
				try {
					if(e.getCurrentItem().getItemMeta().getDisplayName() != null) {
						e.getWhoClicked().getWorld().playSound(e.getWhoClicked().getLocation(), Sound.WOOD_CLICK, 1, 1);
						e.getWhoClicked().sendMessage(ChatColor.BLUE + "You Joined The Queue Of Ranked " + e.getCurrentItem().getItemMeta().getDisplayName() + ChatColor.BLUE + "!");
						if(e.getCurrentItem().getType() == Material.LAVA_BUCKET) {
							if(!rankedBuildUhc.contains(e.getWhoClicked())) {
								rankedBuildUhc.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(rankedBuildUhc.size() == 2) {
								rankedBuildUhc.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								rankedBuildUhc.get(1).teleport(ARENA5);
								rankedBuildUhc.get(2).teleport(ARENA6);
							}
						}else if(e.getCurrentItem().getType() == Material.FISHING_ROD) {
							if(!rankedRodPvP.contains(e.getWhoClicked())) {
								rankedRodPvP.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(rankedRodPvP.size() == 2) {
								rankedRodPvP.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								rankedRodPvP.get(1).teleport(ARENA7);
								rankedRodPvP.get(2).teleport(ARENA8);
							}
						}else if(e.getCurrentItem().getType() == Material.REDSTONE_BLOCK) {
							if(!rankedSmooth.contains(e.getWhoClicked())) {
								rankedSmooth.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(rankedSmooth.size() == 2) {
								rankedSmooth.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								rankedSmooth.get(1).teleport(ARENA8);
								rankedSmooth.get(2).teleport(ARENA9);
							}
						}else if(e.getCurrentItem().getType() == Material.MAP) {
							if(!rankedBlury.contains(e.getWhoClicked())) {
								rankedBlury.add((Player) e.getWhoClicked());
							}
							((Player)e.getWhoClicked()).getInventory().clear();
							((Player)e.getWhoClicked()).getInventory().setItem(8, new ItemStack(Material.BARRIER));
							if(rankedBlury.size() == 2) {
								rankedBlury.clear();
								((Player)e.getWhoClicked()).sendMessage(ChatColor.DARK_GREEN + "Your Game's Starting!");
								rankedBlury.get(1).teleport(ARENA10);
								rankedBlury.get(2).teleport(ARENA11);

							}
						}
					}
				}catch (NullPointerException error) {
					
				}

			}
			e.setCancelled(true);
		}

	}
	@EventHandler
	public void onRightclick(PlayerInteractEvent e) {
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getPlayer().getItemInHand().getType() == Material.BARRIER) {
				if(!unrankedBuildUhc.isEmpty()) {
					if(unrankedBuildUhc.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						unrankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}else if(!unrankedRodPvP.isEmpty()) {
					if(unrankedRodPvP.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						unrankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}else if(!unrankedSmooth.isEmpty()) {
					if(unrankedSmooth.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						unrankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}else if(!unrankedBlury.isEmpty()) {
					if(unrankedBlury.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						unrankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}
				//------------------------------------------------------------------------------------
				else if(!rankedBuildUhc.isEmpty()) {
					if(rankedBuildUhc.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						rankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}else if(!rankedRodPvP.isEmpty()) {
					if(rankedRodPvP.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						rankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}else if(!rankedSmooth.isEmpty()) {
					if(rankedSmooth.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						rankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}else if(!rankedBlury.isEmpty()) {
					if(rankedBlury.contains(e.getPlayer())) {
						e.getPlayer().getInventory().clear();
						rankedBuildUhc.remove(e.getPlayer());
						ItemStack unranked = new ItemStack(Material.IRON_HELMET);
						ItemMeta unm = unranked.getItemMeta();
						unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
						unranked.setItemMeta(unm);
						e.getPlayer().getInventory().setItem(0, unranked);
						ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
						ItemMeta nm = unranked.getItemMeta();
						nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
						ranked.setItemMeta(nm);
						e.getPlayer().getInventory().setItem(1, ranked);
					}else e.getPlayer().sendMessage(ChatColor.RED + "You Are Not In a Queue!");
				}
			}
			if(e.getPlayer().getItemInHand().getType() == Material.IRON_HELMET) {
				e.setCancelled(true);
				e.getPlayer().performCommand("Unranked");
			}else if(e.getPlayer().getItemInHand().getType() == Material.GOLD_HELMET) {
				e.setCancelled(true);
				e.getPlayer().performCommand("Ranked");
			}
		}
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.getPlayer().getInventory().clear();
		ItemStack unranked = new ItemStack(Material.IRON_HELMET);
		ItemMeta unm = unranked.getItemMeta();
		unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
		unranked.setItemMeta(unm);
		e.getPlayer().getInventory().setItem(0, unranked);
		ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
		ItemMeta nm = unranked.getItemMeta();
		nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
		ranked.setItemMeta(nm);
		e.getPlayer().getInventory().setItem(1, ranked);
	}
	@EventHandler
	public void onRespawn(PlayerRespawnEvent e) {
		e.getPlayer().getInventory().clear();
		ItemStack unranked = new ItemStack(Material.IRON_HELMET);
		ItemMeta unm = unranked.getItemMeta();
		unm.setDisplayName(ChatColor.DARK_AQUA + "Unranked");
		unranked.setItemMeta(unm);
		e.getPlayer().getInventory().setItem(0, unranked);
		ItemStack ranked = new ItemStack(Material.GOLD_HELMET);
		ItemMeta nm = unranked.getItemMeta();
		nm.setDisplayName(ChatColor.DARK_AQUA + "Ranked");
		ranked.setItemMeta(nm);
		e.getPlayer().getInventory().setItem(1, ranked);
	}
	@EventHandler
	public void onLaunch(ProjectileHitEvent e) {
		e.getEntity().remove();
	}
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		if(e.getBlock().getType() == Material.BARRIER) {
			e.setCancelled(true); 
		}
	}
}
