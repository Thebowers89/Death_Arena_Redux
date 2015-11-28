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

}
