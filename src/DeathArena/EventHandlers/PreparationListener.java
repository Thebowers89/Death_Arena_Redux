package DeathArena.EventHandlers;

import DeathArena.BattleStarter;
import DeathArena.ItemStacks;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PreparationListener implements Listener {

    @EventHandler
    public void onInventoryInteractEvent(InventoryClickEvent event) {
        ItemStack item = event.getCurrentItem();
        Inventory inventory = event.getClickedInventory();
        Player player = (Player) event.getWhoClicked();

        if (!(inventory == null)) {
            if (item.equals(ItemStacks.notReadyWool())
                    || item.equals(ItemStacks.tankPack())
                    || item.equals(ItemStacks.rangerPack())
                    || item.equals(ItemStacks.alchemistPack())) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteractEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack item = player.getItemInHand();
        Inventory inventory = player.getInventory();
        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (player.getItemInHand().equals(ItemStacks.notReadyWool())) {
                event.setCancelled(true);
                inventory.setItem(0, ItemStacks.readyWool());
                BattleStarter.onJoin();
            } else if (item.equals(ItemStacks.tankPack())
                    || item.equals(ItemStacks.rangerPack())
                    || item.equals(ItemStacks.alchemistPack())
                    || item.equals(ItemStacks.readyWool())) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onPlaceEvent(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        if (block.equals(ItemStacks.notReadyWool())
                || block.equals(ItemStacks.readyWool())
                || block.equals(ItemStacks.tankPack())
                || block.equals(ItemStacks.rangerPack())
                || block.equals(ItemStacks.alchemistPack())
                || block.equals(ItemStacks.readyWool())) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onDropEvent(PlayerDropItemEvent event) {
        ItemStack item = event.getItemDrop().getItemStack();
        Player player = event.getPlayer();
        if (item.equals(ItemStacks.notReadyWool())
                || item.equals(ItemStacks.readyWool())
                || item.equals(ItemStacks.tankPack())
                || item.equals(ItemStacks.rangerPack())
                || item.equals(ItemStacks.alchemistPack())) {
            event.setCancelled(true);
        }
    }

}
