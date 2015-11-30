package DeathArena;

import DeathArena.EventHandlers.BattleManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class BattleStarter {

    static DeathArenaMain plugin;
    public BattleStarter(DeathArenaMain instance) {
        plugin = instance;
    }

    public static HashMap<UUID, String> players = new HashMap<UUID, String>();

    public static ArrayList<Player> tanks = new ArrayList<Player>();
    public static ArrayList<Player> rangers = new ArrayList<Player>();
    public static ArrayList<Player> alchemists = new ArrayList<Player>();

    public static void onJoin() {
        if (players.size() == 3) {
            players.clear();
            startBattle();
        }
    }

    public static void startBattle() {
        for (Player player : tanks) {
            player.teleport(Locations.tankLocation());
            Inventory inventory = player.getInventory();
            inventory.clear();
            inventory.setContents(Inventories.tankInventory().getContents());
            inventory.setItem(36, ItemStacks.tankBoots());
            inventory.setItem(37, ItemStacks.tankLeggings());
            inventory.setItem(38, ItemStacks.tankChestplate());
            inventory.setItem(39, ItemStacks.tankHelmet());
            BattleManager.allPlayers.add(player);
        }
        tanks.clear();
        for (Player player : rangers) {
            player.teleport(Locations.rangerLocation());
            Inventory inventory = player.getInventory();
            inventory.clear();
            inventory.setContents(Inventories.rangerInventory().getContents());
            inventory.setItem(36, ItemStacks.rangerBoots());
            inventory.setItem(37, ItemStacks.rangerLeggings());
            inventory.setItem(38, ItemStacks.rangerChestplate());
            inventory.setItem(39, ItemStacks.rangerHelmet());
            BattleManager.allPlayers.add(player);
        }
        rangers.clear();
        for (Player player : alchemists) {
            player.teleport(Locations.alchemistLocation());
            Inventory inventory = player.getInventory();
            inventory.clear();
            inventory.setContents(Inventories.alchemistInventory().getContents());
            inventory.setItem(36, ItemStacks.alchemistBoots());
            inventory.setItem(37, ItemStacks.alchemistLeggings());
            inventory.setItem(38, ItemStacks.alchemistChestplate());
            inventory.setItem(39, ItemStacks.alchemistHelmet());
            BattleManager.allPlayers.add(player);
        }
        alchemists.clear();
        Bukkit.broadcastMessage("Death Arena is now starting!");
        BattleManager.summonBoss();
    }

}
