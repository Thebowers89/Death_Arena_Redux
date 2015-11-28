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
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Tank.Location.X"));
        Double x = plugin.getConfig().getDouble("Class.Tank.Location.X");
        Double y = plugin.getConfig().getDouble("Class.Tank.Location.Y");
        Double z = plugin.getConfig().getDouble("Class.Tank.Location.Z");

        Location tankLocation = new Location(w, x, y, z);
        return tankLocation;
    }

    public static Location rangerLocation() {
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Ranger.Location.World"));
        Double x = plugin.getConfig().getDouble("Class.Ranger.Location.X");
        Double y = plugin.getConfig().getDouble("Class.Ranger.Location.Y");
        Double z = plugin.getConfig().getDouble("Class.Ranger.Location.Z");

        Location rangerLocation = new Location(w, x, y, z);
        return rangerLocation;
    }

    public static Location alchemistLocation() {
        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Alchemist.Location.World"));
        Double x = plugin.getConfig().getDouble("Class.Alchemist.Location.X");
        Double y = plugin.getConfig().getDouble("Class.Alchemist.Location.Y");
        Double z = plugin.getConfig().getDouble("Class.Alchemist.Location.Z");

        Location alchemistLocation = new Location(w, x, y, z);
        return alchemistLocation;
    }
}
