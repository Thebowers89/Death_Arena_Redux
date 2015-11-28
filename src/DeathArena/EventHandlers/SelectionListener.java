package DeathArena.EventHandlers;

import DeathArena.BattleStarter;
import DeathArena.DeathArenaMain;
import DeathArena.Inventories;
import DeathArena.ItemStacks;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SelectionListener implements Listener {

    DeathArenaMain plugin;
    public SelectionListener(DeathArenaMain instance) {
        plugin = instance;
    }

    @EventHandler
    public void selectEvent(InventoryClickEvent event) {
        ItemStack item = event.getCurrentItem();
        Inventory inventory = event.getClickedInventory();
        Player player = (Player) event.getWhoClicked();
        Inventory pInv = player.getInventory();
        if (inventory != null) {
            if (inventory.getName().equals(ChatColor.DARK_GRAY + "Class Selection")) {
                if (item.equals(ItemStacks.tankInfo())) {
                    if (inventory.getItem(3).equals(ItemStacks.rangerSelect())) {
                        inventory.setItem(3, ItemStacks.rangerInfo());
                        inventory.setItem(2, ItemStacks.tankSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Tank");
                        player.sendMessage("You have chosen Tank");
                    } else if (inventory.getItem(4).equals(ItemStacks.alchemistSelect())) {
                        inventory.setItem(4, ItemStacks.alchemistInfo());
                        inventory.setItem(2, ItemStacks.tankSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Tank");
                        player.sendMessage("You have chosen Tank");
                    } else {
                        inventory.setItem(2, ItemStacks.tankSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Tank");
                        player.sendMessage("You have chosen Tank");
                    }
                }
                if (item.equals(ItemStacks.rangerInfo())) {
                    if (inventory.getItem(2).equals(ItemStacks.tankSelect())) {
                        inventory.setItem(2, ItemStacks.tankInfo());
                        inventory.setItem(3, ItemStacks.rangerSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Ranger");
                        player.sendMessage("You have chosen Ranger");
                    } else if (inventory.getItem(4).equals(ItemStacks.alchemistSelect())) {
                        inventory.setItem(4, ItemStacks.alchemistInfo());
                        inventory.setItem(3, ItemStacks.rangerSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Ranger");
                        player.sendMessage("You have chosen Ranger");
                    } else {
                        inventory.setItem(3, ItemStacks.rangerSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Ranger");
                        player.sendMessage("You have chosen Ranger");
                    }
                }
                if (item.equals(ItemStacks.alchemistInfo())) {
                    if (inventory.getItem(2).equals(ItemStacks.tankSelect())) {
                        inventory.setItem(2, ItemStacks.tankInfo());
                        inventory.setItem(4, ItemStacks.alchemistSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Alchemist");
                        player.sendMessage("You have chosen Alchemist");
                    } else if (inventory.getItem(3).equals(ItemStacks.rangerSelect())) {
                        inventory.setItem(3, ItemStacks.rangerInfo());
                        inventory.setItem(4, ItemStacks.alchemistSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Alchemist");
                        player.sendMessage("You have chosen Alchemist");
                    } else {
                        inventory.setItem(4, ItemStacks.alchemistSelect());
                        BattleStarter.players.put(player.getUniqueId(), "Alchemist");
                        player.sendMessage("You have chosen Alchemist");
                    }
                }
                if (item.equals(ItemStacks.clearSelectionGlass())) {
                    player.closeInventory();
                    player.openInventory(Inventories.classSelection());
                }
                if (item.equals(ItemStacks.backBook())) {
                    player.closeInventory();
                    player.openInventory(Inventories.roster());
                }
                if (item.equals(ItemStacks.confirmGlass())) {
                    if (inventory.getItem(2).equals(ItemStacks.tankSelect())) {
                        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Lobby.World"));
                        Double x = plugin.getConfig().getDouble("Lobby.X");
                        Double y = plugin.getConfig().getDouble("Lobby.Y");
                        Double z = plugin.getConfig().getDouble("Lobby.Z");
                        player.teleport(new Location(w, x, y, z));
                        pInv.clear();
                        pInv.setItem(0, ItemStacks.notReadyWool());
                        pInv.setItem(1, ItemStacks.tankPack());
                    } else if (inventory.getItem(3).equals(ItemStacks.rangerSelect())) {
                        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Lobby.World"));
                        Double x = plugin.getConfig().getDouble("Lobby.X");
                        Double y = plugin.getConfig().getDouble("Lobby.Y");
                        Double z = plugin.getConfig().getDouble("Lobby.Z");
                        player.teleport(new Location(w, x, y, z));
                        pInv.clear();
                        pInv.setItem(0, ItemStacks.notReadyWool());
                        pInv.setItem(1, ItemStacks.rangerPack());
                    } else if (inventory.getItem(4).equals(ItemStacks.alchemistSelect())) {
                        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Lobby.World"));
                        Double x = plugin.getConfig().getDouble("Lobby.X");
                        Double y = plugin.getConfig().getDouble("Lobby.Y");
                        Double z = plugin.getConfig().getDouble("Lobby.Z");
                        player.teleport(new Location(w, x, y, z));
                        pInv.clear();
                        pInv.setItem(0, ItemStacks.notReadyWool());
                        pInv.setItem(1, ItemStacks.alchemistPack());
                    }
                }
            }
        }
    }

}
