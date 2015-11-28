package DeathArena;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class BattleStarter {

    public static HashMap<UUID, String> players = new HashMap<UUID, String>();

    public static ArrayList<Player> tanks = new ArrayList<Player>();
    public static ArrayList<Player> rangers = new ArrayList<Player>();
    public static ArrayList<Player> alchemists = new ArrayList<Player>();

    public static void onJoin() {
        if (players.size() == 3) {
            Bukkit.getServer().broadcastMessage("Death Arena is now Starting.");
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
    }

}
