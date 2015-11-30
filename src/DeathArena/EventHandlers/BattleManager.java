package DeathArena.EventHandlers;

import DeathArena.BattleStarter;
import DeathArena.Bosses.ShiaLabeoufBoss;
import DeathArena.DeathArenaMain;
import DeathArena.Locations;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.ArrayList;

public class BattleManager implements Listener {

    static DeathArenaMain plugin;
    public BattleManager(DeathArenaMain instance) {
        plugin = instance;
    }
    public static ArrayList<Player> allPlayers = new ArrayList<Player>();

    public static void summonBoss() {
        Bukkit.broadcastMessage("The Boss will spawn in 5 seconds!");
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            public void run() {
                ShiaLabeoufBoss.shiaBoss(Locations.bossLocation());
                for (Player player : allPlayers) {
                    player.sendMessage("The Boss has spawned!");
                }
            }
        }, 100L);
    }

    public static void resetAll() {
        BattleStarter.players.clear();
        BattleStarter.rangers.clear();
        BattleStarter.alchemists.clear();
        BattleStarter.tanks.clear();
        allPlayers.clear();
    }

    @EventHandler
    public void onBossDeath(EntityDeathEvent event) {
        Entity entity = event.getEntity();
        if (entity.getCustomName() != null) {
            if (entity.getCustomName().equals(ChatColor.RED + "Shia Labeouf") || entity.getCustomName().equals(ChatColor.RED + "Baby Labeouf")) {
                event.getDrops().clear();
                for (Player player : BattleManager.allPlayers) {
                    player.sendMessage(ChatColor.GREEN + "You have defeated Shia Labeouf");
                }
                resetAll();
            }
        }
    }

}
