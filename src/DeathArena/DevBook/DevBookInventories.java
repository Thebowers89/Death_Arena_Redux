package DeathArena.DevBook;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

public class DevBookInventories {

    public static Inventory devBook() {
        Inventory devBook = Bukkit.getServer().createInventory(null, 54, ChatColor.AQUA + "Dev Book");
        devBook.setItem(10, DevBookItems.listsBook());
        devBook.setItem(16, DevBookItems.devSword());
        devBook.setItem(19, DevBookItems.startBattleBook());
        devBook.setItem(28, DevBookItems.summonBossEgg());
        return devBook;
    }

    public static Inventory listsBook() {
        Inventory listBook = Bukkit.getServer().createInventory(null, 9, ChatColor.GREEN + "Lists Book");
        listBook.setItem(0, DevBookItems.tankListBook());
        listBook.setItem(1, DevBookItems.rangerListBook());
        listBook.setItem(2, DevBookItems.alchemistListBook());
        listBook.setItem(3, DevBookItems.clearAllListBook());
        listBook.setItem(4, DevBookItems.clearCounterBook());
        listBook.setItem(8, DevBookItems.backBook());
        return listBook;
    }



}
