package DeathArena.DevBook;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DevBookItems {

    public static ItemStack listsBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.GOLD + "Class Lists");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack tankListBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.RED + "Clear Tank List");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack rangerListBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.GREEN + "Clear Ranger List");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack alchemistListBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.BLUE + "Clear Alchemist List");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack clearAllListBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.GOLD + "Clear All Lists");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack backBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.AQUA + "Back to Dev Book");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack clearCounterBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName("Clear player counter");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack startBattleBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.RED + "Start Boss Battle");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack summonBossEgg() {
        ItemStack egg = new ItemStack(Material.MONSTER_EGG, 1, (short) 54);
        ItemMeta eggMeta = egg.getItemMeta();
        eggMeta.setDisplayName(ChatColor.GOLD + "Summon Boss");
        egg.setItemMeta(eggMeta);
        return egg;
    }

    public static ItemStack devSword() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 9001);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.AQUA + "Dev Sword");
        sword.setItemMeta(swordMeta);
        return sword;
    }

}
