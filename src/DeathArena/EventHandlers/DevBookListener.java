package DeathArena.EventHandlers;

import DeathArena.BattleStarter;
import DeathArena.Bosses.ShiaLabeoufBoss;
import DeathArena.DevBook.DevBookInventories;
import DeathArena.DevBook.DevBookItems;
import DeathArena.ItemStacks;
import DeathArena.Locations;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class DevBookListener implements Listener {

    @EventHandler
    public void openDevBook(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();
        if (action.equals(Action.RIGHT_CLICK_BLOCK) || action.equals(Action.RIGHT_CLICK_AIR)) {
            if (player.getItemInHand().equals(ItemStacks.devBook())) {
                player.openInventory(DevBookInventories.devBook());
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onDevBookNavigate(InventoryClickEvent event) {
        Inventory inventory = event.getClickedInventory();
        ItemStack item = event.getCurrentItem();
        Player player = (Player) event.getWhoClicked();
        if (inventory != null) {
            if (inventory.getName().equals(ChatColor.AQUA + "Dev Book")) {
                if (item.equals(DevBookItems.listsBook())) {
                    player.closeInventory();
                    player.openInventory(DevBookInventories.listsBook());
                }
                if (item.equals(DevBookItems.startBattleBook())) {
                    BattleStarter.startBattle();
                }
                if (item.equals(DevBookItems.summonBossEgg())) {
                    ShiaLabeoufBoss.shiaBoss(Locations.bossLocation());
                }
                if (item.equals(DevBookItems.devSword())) {
                    player.getInventory().addItem(DevBookItems.devSword());
                }
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onListBookAction(InventoryClickEvent event) {
        Inventory inventory = event.getClickedInventory();
        ItemStack item = event.getCurrentItem();
        Player player = (Player) event.getWhoClicked();
        if (inventory != null) {
            if (inventory.getName().equals(ChatColor.GREEN + "Lists Book")) {
                if (item.equals(DevBookItems.tankListBook())) {
                    BattleStarter.tanks.clear();
                    player.sendMessage("Tank list has been cleared.");
                }
                if (item.equals(DevBookItems.rangerListBook())) {
                    BattleStarter.rangers.clear();
                    player.sendMessage("Ranger list has been cleared.");
                }
                if (item.equals(DevBookItems.alchemistListBook())) {
                    BattleStarter.alchemists.clear();
                    player.sendMessage("Alchemist list has been cleared.");
                }
                if (item.equals(DevBookItems.clearAllListBook())) {
                    BattleStarter.alchemists.clear();
                    BattleStarter.rangers.clear();
                    BattleStarter.tanks.clear();
                    player.sendMessage("All class lists have been cleared.");
                }
                if (item.equals(DevBookItems.clearCounterBook())) {
                    BattleStarter.players.clear();
                    player.sendMessage("Player counter has been cleared.");
                }
                if (item.equals(DevBookItems.backBook())) {
                    player.closeInventory();
                    player.openInventory(DevBookInventories.devBook());
                }
                event.setCancelled(true);
            }
        }
    }

}
