package DeathArena.EventHandlers;

import DeathArena.Inventories;
import DeathArena.ItemStacks;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RosterListener implements Listener {
    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();
        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (player.getItemInHand().equals(ItemStacks.roster())) {
                player.openInventory(Inventories.roster());
            }
        }
    }

    @EventHandler
    public void infoEvent(InventoryClickEvent event) {
        ItemStack item = event.getCurrentItem();
        Inventory inventory = event.getClickedInventory();
        Player player = (Player) event.getWhoClicked();
        if (inventory != null) {
            if (inventory.getName().equals(ChatColor.GOLD + "Roster")
                    || inventory.getName().contains(ChatColor.DARK_RED + "Tank Info")
                    || inventory.getName().contains(ChatColor.GREEN + "Ranger Info")
                    || inventory.getName().contains(ChatColor.BLUE + "Alchemist Info")) {
                if (item.equals(ItemStacks.tankInfo())) {
                    player.closeInventory();
                    player.openInventory(Inventories.tankInfo());
                }
                if (item.equals(ItemStacks.rangerInfo())) {
                    player.closeInventory();
                    player.openInventory(Inventories.rangerInfo());
                }
                if (item.equals(ItemStacks.alchemistInfo())) {
                    player.closeInventory();
                    player.openInventory(Inventories.alchemistInfo());
                }
                if (item.equals(ItemStacks.classBook())) {
                    player.closeInventory();
                    player.openInventory(Inventories.classSelection());
                }
                if (item.equals(ItemStacks.backBook())) {
                    player.closeInventory();
                    player.openInventory(Inventories.roster());
                }
            }
        }
    }

}
