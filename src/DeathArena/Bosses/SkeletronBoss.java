package DeathArena.Bosses;

import DeathArena.DeathArenaMain;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Skeleton;

public class SkeletronBoss {

    DeathArenaMain plugin;

    public SkeletronBoss(DeathArenaMain instance) {
        plugin = instance;
    }

    public static Skeleton skeletronBoss(Location boss) {
        Skeleton skeleton = (Skeleton) boss.getWorld().spawn(boss, Skeleton.class);
        skeleton.setCustomName(ChatColor.RED + "Skeletron");
        skeleton.setCustomNameVisible(true);
        skeleton.setMaxHealth(250.0);
        skeleton.setHealth(250.0);
        skeleton.setRemoveWhenFarAway(false);
        return skeleton;
    }

}
