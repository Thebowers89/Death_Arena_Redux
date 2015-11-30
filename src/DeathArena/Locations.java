package DeathArena;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class Locations {

    static DeathArenaMain plugin;
    public Locations(DeathArenaMain instance) {
        plugin = instance;
    }

    public static Location bossLocation() {
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Boss.Location.World"));
        Double x = plugin.getConfig().getDouble("Boss.Location.X");
        Double y = plugin.getConfig().getDouble("Boss.Location.Y");
        Double z = plugin.getConfig().getDouble("Boss.Location.Z");

        Location bossLocation = new Location(w, x, y, z);
        return bossLocation;
    }

    public static Location tankLocation() {
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Tank.Location.World"));
        Double x = plugin.getConfig().getDouble("Class.Tank.Location.X");
        Double y = plugin.getConfig().getDouble("Class.Tank.Location.Y");
        Double z = plugin.getConfig().getDouble("Class.Tank.Location.Z");
        Float yaw = (Float) plugin.getConfig().get("Class.Tank.Location.Yaw");
        Float pitch = (Float) plugin.getConfig().get("Class.Tank.Location.Pitch");

        Location tankLocation = new Location(w, x, y, z, yaw, pitch);
        return tankLocation;
    }

    public static Location rangerLocation() {
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Ranger.Location.World"));
        Double x = plugin.getConfig().getDouble("Class.Ranger.Location.X");
        Double y = plugin.getConfig().getDouble("Class.Ranger.Location.Y");
        Double z = plugin.getConfig().getDouble("Class.Ranger.Location.Z");
        Float yaw = (Float) plugin.getConfig().get("Class.Ranger.Location.Yaw");
        Float pitch = (Float) plugin.getConfig().get("Class.Ranger.Location.Pitch");

        Location rangerLocation = new Location(w, x, y, z, yaw, pitch);
        return rangerLocation;
    }

    public static Location alchemistLocation() {
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Alchemist.Location.World"));
        Double x = plugin.getConfig().getDouble("Class.Alchemist.Location.X");
        Double y = plugin.getConfig().getDouble("Class.Alchemist.Location.Y");
        Double z = plugin.getConfig().getDouble("Class.Alchemist.Location.Z");
        Float yaw = (Float) plugin.getConfig().get("Class.Alchemist.Location.Yaw");
        Float pitch = (Float) plugin.getConfig().get("Class.Alchemist.Location.Pitch");

        Location alchemistLocation = new Location(w, x, y, z, yaw, pitch);;
        return alchemistLocation;
    }

    public static Location lobbyLocation() {
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Lobby.World"));
        Double x = plugin.getConfig().getDouble("Lobby.X");
        Double y = plugin.getConfig().getDouble("Lobby.Y");
        Double z = plugin.getConfig().getDouble("Lobby.Z");
        Float yaw = (Float) plugin.getConfig().get("Lobby.Yaw");
        Float pitch = (Float) plugin.getConfig().get("Lobby.Pitch");

        Location lobbyLocation = new Location(w, x, y, z, yaw, pitch);
        return lobbyLocation;
    }

}
