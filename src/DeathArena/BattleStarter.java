package DeathArena;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

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
        }
        tanks.clear();
        for (Player player : rangers) {
            player.teleport(Locations.rangerLocation());
        }
        rangers.clear();
        for (Player player : alchemists) {
            player.teleport(Locations.alchemistLocation());
        }
        alchemists.clear();
        Bukkit.broadcastMessage("Death Arena is now starting!");
    }

}
