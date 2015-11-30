package DeathArena;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Inventories {

    public static Inventory roster() {
        ItemStack s = new ItemStack(Material.STONE);
        Inventory rs = Bukkit.getServer().createInventory(null, 9, ChatColor.GOLD + "Roster");
        rs.setItem(0, ItemStacks.tankInfo());
        rs.setItem(1, ItemStacks.rangerInfo());
        rs.setItem(2, ItemStacks.alchemistInfo());
        rs.setItem(3, s);
        rs.setItem(4, s);
        rs.setItem(5, ItemStacks.classBook());
        rs.setItem(8, s);
        return rs;
    }

    public static Inventory tankInfo() {
        Inventory tankInv = Bukkit.getServer().createInventory(null, 45, ChatColor.DARK_RED + "Tank Info");
        tankInv.setItem(1, ItemStacks.tankHelmet());
        tankInv.setItem(10, ItemStacks.tankChestplate());
        tankInv.setItem(19, ItemStacks.tankLeggings());
        tankInv.setItem(28, ItemStacks.tankBoots());
        tankInv.setItem(11, ItemStacks.tankSword());
        tankInv.setItem(44, ItemStacks.backBook());
        return tankInv;
    }

    public static Inventory rangerInfo() {
        Inventory rangerInv = Bukkit.getServer().createInventory(null, 45, ChatColor.GREEN + "Ranger Info");
        rangerInv.setItem(1, ItemStacks.rangerHelmet());
        rangerInv.setItem(10, ItemStacks.rangerChestplate());
        rangerInv.setItem(19, ItemStacks.rangerLeggings());
        rangerInv.setItem(28, ItemStacks.rangerBoots());
        rangerInv.setItem(11, ItemStacks.rangerBow());
        rangerInv.setItem(44, ItemStacks.backBook());
        return rangerInv;
    }

    public static Inventory alchemistInfo() {
        Inventory alchemistInv = Bukkit.getServer().createInventory(null, 45, ChatColor.BLUE + "Alchemist Info");
        alchemistInv.setItem(1, ItemStacks.alchemistHelmet());
        alchemistInv.setItem(10, ItemStacks.alchemistChestplate());
        alchemistInv.setItem(19, ItemStacks.alchemistLeggings());
        alchemistInv.setItem(28, ItemStacks.alchemistBoots());
        alchemistInv.setItem(44, ItemStacks.backBook());
        return alchemistInv;
    }

    public static Inventory classSelection() {
        Inventory classSelection = Bukkit.getServer().createInventory(null, 9, ChatColor.DARK_GRAY + "Class Selection");
        classSelection.setItem(0, ItemStacks.backBook());
        classSelection.setItem(2, ItemStacks.tankInfo());
        classSelection.setItem(3, ItemStacks.rangerInfo());
        classSelection.setItem(4, ItemStacks.alchemistInfo());
        classSelection.setItem(5, ItemStacks.clearSelectionGlass());
        classSelection.setItem(8, ItemStacks.confirmGlass());
        return classSelection;
    }

    public static Inventory tankInventory() {
        Inventory tankInventory = Bukkit.getServer().createInventory(null, 36, "");
        tankInventory.setItem(0, ItemStacks.tankSword());
        return tankInventory;
    }

    public static Inventory rangerInventory() {
        Inventory rangerInventory = Bukkit.getServer().createInventory(null, 36, "");
        rangerInventory.setItem(0, ItemStacks.rangerBow());
        rangerInventory.setItem(10, new ItemStack(Material.ARROW));
        return rangerInventory;
    }

    public static Inventory alchemistInventory() {
        Inventory pi = Bukkit.getServer().createInventory(null, 36, "");
        ItemStack feye = new ItemStack(Material.FERMENTED_SPIDER_EYE, 8);
        ItemStack bottle = new ItemStack(Material.GLASS_BOTTLE, 24);
        ItemStack eye = new ItemStack(Material.SPIDER_EYE, 4);
        ItemStack melon = new ItemStack(Material.SPECKLED_MELON, 8);
        ItemStack feather = new ItemStack(Material.SUGAR, 4);
        ItemStack cream = new ItemStack(Material.MAGMA_CREAM, 2);
        ItemStack rstone = new ItemStack(Material.REDSTONE, 24);
        ItemStack powder = new ItemStack(Material.SULPHUR, 24);
        ItemStack gcarrot = new ItemStack(Material.GOLDEN_CARROT, 1);
        ItemStack tear = new ItemStack(Material.GHAST_TEAR, 4);
        ItemStack bpowder = new ItemStack(Material.BLAZE_POWDER, 2);
        ItemStack gStone = new ItemStack(Material.GLOWSTONE_DUST, 24);
        ItemStack nWart = new ItemStack(Material.NETHER_STALK, 8);

        pi.setItem(9, feye);
        pi.setItem(10, bottle);
        pi.setItem(11, eye);
        pi.setItem(12, melon);
        pi.setItem(13, feather);
        pi.setItem(14, cream);
        pi.setItem(15, rstone);
        pi.setItem(16, powder);
        pi.setItem(17, gcarrot);
        pi.setItem(18, tear);
        pi.setItem(19, bpowder);
        pi.setItem(20, gStone);
        pi.setItem(21, nWart);
        return pi;
    }

}
