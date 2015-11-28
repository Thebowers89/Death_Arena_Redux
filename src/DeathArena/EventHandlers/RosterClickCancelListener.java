package DeathArena.EventHandlers;

import DeathArena.ItemStacks;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RosterClickCancelListener implements Listener {

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        Inventory inv = event.getInventory();
        ItemStack item = event.getCurrentItem();
        if (inv.getName().contains(ChatColor.GOLD + "Roster")
                || inv.getName().contains(ChatColor.DARK_RED + "Tank Info")
                || inv.getName().contains(ChatColor.GREEN + "Ranger Info")
                || inv.getName().contains(ChatColor.BLUE + "Alchemist Info")
                || inv.getName().contains(ChatColor.DARK_GRAY + "Class Selection")) {
            event.setCancelled(true);
        }
    }
}
