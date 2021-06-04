package me.blume.strippedop.listeners;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.blume.strippedop.Main;
import me.blume.strippedop.items.ItemClasss;
import net.md_5.bungee.api.ChatColor;

public class BreakingStripped implements Listener{
	
	@SuppressWarnings("unused")
	private Main plugin;
	public BreakingStripped(Main plugin) {
		this.plugin=plugin;
	}
	Random rand = new Random();
	ItemClasss item = new ItemClasss();
	@EventHandler
	public void onBreakWood(BlockBreakEvent event) {
		Block block = event.getBlock();
		if(block.getType().toString().contains("STRIPPED")) {
			Player player = event.getPlayer();
			Location location = event.getBlock().getLocation();
			event.getBlock().setType(Material.AIR);
			event.getBlock().getDrops().clear();
			int RandomPercentage = rand.nextInt(100)+1;
			if(RandomPercentage > 1 && RandomPercentage <= 8) {
				player.getWorld().dropItem(location, new ItemStack(Material.GOLDEN_APPLE,2));	
			}
			else if(RandomPercentage > 8    && RandomPercentage <= 16) {
				player.getWorld().dropItem(location, new ItemStack(Material.IRON_INGOT,rand.nextInt(10)+1));	

			}
			else if(RandomPercentage > 16    && RandomPercentage <= 25) {
				player.getWorld().dropItem(location, new ItemStack(Material.DIAMOND,rand.nextInt(5)+1));	

			}
			else if(RandomPercentage > 25    && RandomPercentage <= 33) {
				player.getWorld().dropItem(location, new ItemStack(Material.EXPERIENCE_BOTTLE,rand.nextInt(64)+1));	

			}
			else if(RandomPercentage > 33    && RandomPercentage <= 41) {
				player.getWorld().dropItem(location, new ItemStack(Material.TNT,rand.nextInt(5)+1));	

			}
			else if(RandomPercentage > 41    && RandomPercentage <= 46) {
				ItemStack helmet = new ItemStack(Material.IRON_HELMET);
				item.helmetindex =rand.nextInt(2);
				item.level=rand.nextInt(6)+5;
				item.helmetmeta(helmet);
			}
			else if(RandomPercentage > 46    && RandomPercentage <= 51) {
				ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
				item.chestplateindex =rand.nextInt(2);
				item.level=rand.nextInt(6)+5;
				item.chestplatemeta(chestplate);
				player.getWorld().dropItem(location, chestplate);
			}
			else if(RandomPercentage > 51    && RandomPercentage <= 56) {
				ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
					item.leggingsindex =rand.nextInt(2);
					item.level=rand.nextInt(6)+5;
					item.leggingsmeta(leggings);
					player.getWorld().dropItem(location, leggings);
			}
			else if(RandomPercentage > 56    && RandomPercentage <= 61) {
				ItemStack boots = new ItemStack(Material.IRON_BOOTS);
					item.bootsindex=rand.nextInt(4);
					item.level=rand.nextInt(6)+5;
					item.bootsmeta(boots);
					player.getWorld().dropItem(location, boots);
			}
			else if(RandomPercentage > 61    && RandomPercentage <= 66) {
				ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);		
					item.pickaxeindex=rand.nextInt(2);
					item.level=rand.nextInt(6)+5;
					item.pickaxemeta(pickaxe);
					player.getWorld().dropItem(location, pickaxe);
			}
			else if(RandomPercentage > 66    && RandomPercentage <= 71) {
				ItemStack sword = new ItemStack(Material.IRON_SWORD);
					item.swordindex=rand.nextInt(3);
					item.level=rand.nextInt(6)+5;
					item.swordmeta(sword);
					player.getWorld().dropItem(location, sword);
			}
			else if(RandomPercentage > 71    && RandomPercentage <= 76) {
				ItemStack axe = new ItemStack(Material.IRON_AXE);
					item.axeindex=rand.nextInt(2);
					item.level=rand.nextInt(6)+5;
					item.axemeta(axe);
					player.getWorld().dropItem(location, axe);
				}
			else if(RandomPercentage > 76    && RandomPercentage <= 81) {
				item.shovelindex=0;
				item.level=rand.nextInt(6)+5;
				ItemStack shovel = new ItemStack(Material.IRON_SHOVEL);
				item.shovelmeta(shovel);
				player.getWorld().dropItem(location, shovel);
			}
			else if(RandomPercentage > 81    && RandomPercentage <= 86) {
				ItemStack bow = new ItemStack(Material.BOW);
					item.bowindex=rand.nextInt(3);
					item.level=rand.nextInt(6)+5;
					item.bowmeta(bow);
					player.getWorld().dropItem(location, bow);
			}
			else if(RandomPercentage > 86    && RandomPercentage <= 90) {
				player.getWorld().dropItem(location, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
			}
			else if(RandomPercentage > 90    && RandomPercentage <= 92) {
				ItemStack Destroyer = new ItemStack(Material.NETHER_STAR);
				ItemMeta meta = Destroyer.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD+"Destroyer");
				meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
				Destroyer.setItemMeta(meta);
				player.getWorld().dropItem(location, Destroyer);
			}
			else if(RandomPercentage > 92    && RandomPercentage <= 100) {
				player.getWorld().dropItem(location, new ItemStack(Material.DIAMOND,rand.nextInt(10)+1));
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
