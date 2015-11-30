package DeathArena;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class ItemStacks {

    public static ItemStack roster() {
        ItemStack book = new ItemStack(Material.BOOK, 1);
        ItemMeta bmeta = book.getItemMeta();
        bmeta.setDisplayName(ChatColor.GOLD + "Class Roster");
        book.setItemMeta(bmeta);
        return book;
    }

    public static ItemStack backBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.GOLD + "Back to Roster");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack tankInfo() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta msword = sword.getItemMeta();
        msword.setDisplayName(ChatColor.RED + "Tank Class");
        sword.setItemMeta(msword);
        return sword;
    }

    public static ItemStack tankSelect() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta msword = sword.getItemMeta();
        msword.setDisplayName(ChatColor.RED + "Tank Class: " + ChatColor.GREEN + "[SELECTED]");
        sword.setItemMeta(msword);
        return sword;
    }

    public static ItemStack rangerInfo() {
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.GREEN + "Ranger Class");
        bow.setItemMeta(bowMeta);
        return bow;
    }

    public static ItemStack rangerSelect() {
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.GREEN + "Ranger Class: " + ChatColor.GREEN + "[SELECTED]");
        bow.setItemMeta(bowMeta);
        return bow;
    }

    public static ItemStack alchemistInfo() {
        ItemStack waterBottle = new ItemStack(Material.POTION, 1, (short) 0);
        ItemMeta wbm = waterBottle.getItemMeta();
        wbm.setDisplayName(ChatColor.BLUE + "Alchemist Class");
        waterBottle.setItemMeta(wbm);
        return waterBottle;
    }

    public static ItemStack alchemistSelect() {
        ItemStack waterBottle = new ItemStack(Material.POTION, 1, (short) 0);
        ItemMeta wbm = waterBottle.getItemMeta();
        wbm.setDisplayName(ChatColor.BLUE + "Alchemist Class: " + ChatColor.GREEN + "[SELECTED]");
        waterBottle.setItemMeta(wbm);
        return waterBottle;
    }

    public static ItemStack tankHelmet() {
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        return helmet;
    }

    public static ItemStack tankChestplate() {
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        return chestplate;
    }

    public static ItemStack tankLeggings() {
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        return leggings;
    }

    public static ItemStack tankBoots() {
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        return boots;
    }

    public static ItemStack tankSword() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        return sword;
    }

    public static ItemStack rangerHelmet() {
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        return helmet;
    }

    public static ItemStack rangerChestplate() {
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        return chestplate;
    }

    public static ItemStack rangerLeggings() {
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        return leggings;
    }

    public static ItemStack rangerBoots() {
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        return boots;
    }

    public static ItemStack rangerBow() {
        ItemStack bow = new ItemStack(Material.BOW);
        return bow;
    }

    public static ItemStack alchemistHelmet() {
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        return helmet;
    }

    public static ItemStack alchemistChestplate() {
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        return chestplate;
    }

    public static ItemStack alchemistLeggings() {
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        return leggings;
    }

    public static ItemStack alchemistBoots() {
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        return boots;
    }

    public static ItemStack bHead() {
        ItemStack bHead = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta sMeta = (SkullMeta) bHead.getItemMeta();
        sMeta.setOwner("Shia");
        bHead.setItemMeta(sMeta);
        return bHead;
    }

    public static ItemStack bChest() {
        ItemStack bChest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        bChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        return bChest;
    }

    public static ItemStack bLeg() {
        ItemStack bLeg = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        bLeg.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        return bLeg;
    }

    public static ItemStack bBoot() {
        ItemStack bBoot = new ItemStack(Material.DIAMOND_BOOTS, 1);
        bBoot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        return bBoot;
    }

    public static ItemStack bSword() {
        ItemStack bSword = new ItemStack(Material.DIAMOND_SWORD, 1);
        bSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        return bSword;
    }

    public static ItemStack confirmGlass() {
        ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
        ItemMeta glassMeta = glass.getItemMeta();
        glassMeta.setDisplayName(ChatColor.GREEN + "Confirm");
        glass.setItemMeta(glassMeta);
        return glass;
    }

    public static ItemStack clearSelectionGlass() {
        ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 0);
        ItemMeta glassMeta = glass.getItemMeta();
        glassMeta.setDisplayName(ChatColor.WHITE + "Clear Selection");
        glass.setItemMeta(glassMeta);
        return glass;
    }

    public static ItemStack classBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.GOLD + "Class Selection");
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack notReadyWool() {
        ItemStack wool = new ItemStack(Material.WOOL, 1, (short) 14);
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.RED + "Not Ready");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    public static ItemStack readyWool() {
        ItemStack wool = new ItemStack(Material.WOOL, 1, (short) 5);
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.GREEN + "Ready");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    public static ItemStack devBook() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookMeta = book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.AQUA + "Dev Book");
        book.setItemMeta(bookMeta);
        return book;
    }


}
