package DeathArena.Bosses;

import DeathArena.DeathArenaMain;
import DeathArena.ItemStacks;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ShiaLabeoufBoss {

    DeathArenaMain plugin;
    public ShiaLabeoufBoss(DeathArenaMain instance) {
        plugin = instance;
    }

    public static Zombie shiaBoss(Location boss) {
        Zombie zombie = (Zombie) boss.getWorld().spawn(boss, Zombie.class);

        if (zombie.isBaby()) {
            zombie.setCustomName(ChatColor.RED + "Baby Labeouf");
        } else {
            zombie.setCustomName(ChatColor.RED + "Shia Labeouf");
        }
        zombie.setCustomNameVisible(true);
        zombie.setMaxHealth(20.0);
        zombie.setHealth(20.0);
        zombie.getEquipment().setHelmet(ItemStacks.bHead());
        zombie.getEquipment().setHelmetDropChance(0.1f);
        zombie.getEquipment().setChestplate(ItemStacks.bChest());
        zombie.getEquipment().setChestplateDropChance(0.0f);
        zombie.getEquipment().setLeggings(ItemStacks.bLeg());
        zombie.getEquipment().setLeggingsDropChance(0.0f);
        zombie.getEquipment().setBoots(ItemStacks.bBoot());
        zombie.getEquipment().setBootsDropChance(0.0f);
        zombie.getEquipment().setItemInHand(ItemStacks.bSword());
        zombie.getEquipment().setItemInHandDropChance(0.0f);
        zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 25000, 3));
        zombie.setRemoveWhenFarAway(false);
        return zombie;
    }

}
