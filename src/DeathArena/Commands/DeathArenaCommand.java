package DeathArena.Commands;

import DeathArena.DeathArenaMain;
import DeathArena.ItemStacks;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class DeathArenaCommand implements CommandExecutor {

    DeathArenaMain plugin;
    public DeathArenaCommand(DeathArenaMain instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
        if (sender instanceof Player) {
            if (sender.isOp()) {
                if (commandLabel.equalsIgnoreCase("deatharena")) {
                    Player player = (Player) sender;
                    Location ploc = player.getLocation();
                    if (args.length >= 1) {
                        if (args[0].equalsIgnoreCase("configure")) {
                            if (args.length == 2) {
                                if (args[1].equalsIgnoreCase("boss")) {
                                    plugin.getConfig().set("Boss.Location.X", ploc.getX());
                                    plugin.getConfig().set("Boss.Location.Y", ploc.getY());
                                    plugin.getConfig().set("Boss.Location.Z", ploc.getZ());
                                    plugin.getConfig().set("Boss.Location.World", ploc.getWorld().getName());

                                    sender.sendMessage(ChatColor.GOLD + "Boss Spawn set.");
                                    plugin.saveConfig();
                                    return true;
                                }
                                if (args[1].equalsIgnoreCase("tank")) {
                                    plugin.getConfig().set("Class.Tank.Location.X", ploc.getX());
                                    plugin.getConfig().set("Class.Tank.Location.Y", ploc.getY());
                                    plugin.getConfig().set("Class.Tank.Location.Z", ploc.getZ());
                                    plugin.getConfig().set("Class.Tank.Location.World", ploc.getWorld().getName());

                                    sender.sendMessage(ChatColor.RED + "Tank Spawn Set.");
                                    plugin.saveConfig();
                                    return true;
                                }
                                if (args[1].equalsIgnoreCase("ranger")) {
                                    plugin.getConfig().set("Class.Ranger.Location.X", ploc.getX());
                                    plugin.getConfig().set("Class.Ranger.Location.Y", ploc.getY());
                                    plugin.getConfig().set("Class.Ranger.Location.Z", ploc.getZ());
                                    plugin.getConfig().set("Class.Ranger.Location.World", ploc.getWorld().getName());

                                    sender.sendMessage(ChatColor.GREEN + "Ranger Spawn Set.");
                                    plugin.saveConfig();
                                    return true;
                                }
                                if (args[1].equalsIgnoreCase("alchemist")) {
                                    plugin.getConfig().set("Class.Alchemist.Location.X", ploc.getX());
                                    plugin.getConfig().set("Class.Alchemist.Location.Y", ploc.getY());
                                    plugin.getConfig().set("Class.Alchemist.Location.Z", ploc.getZ());
                                    plugin.getConfig().set("Class.Alchemist.Location.World", ploc.getWorld().getName());

                                    sender.sendMessage(ChatColor.BLUE + "Alchemist Spawn Set.");
                                    plugin.saveConfig();
                                    return true;
                                }
                                if (args[1].equalsIgnoreCase("lobby")) {
                                    plugin.getConfig().set("Lobby.X", ploc.getX());
                                    plugin.getConfig().set("Lobby.Y", ploc.getY());
                                    plugin.getConfig().set("Lobby.Z", ploc.getZ());
                                    plugin.getConfig().set("Lobby.World", ploc.getWorld().getName());

                                    sender.sendMessage("Lobby Set.");
                                    plugin.saveConfig();
                                    return true;
                                }
                                sender.sendMessage(ChatColor.DARK_RED + "Invalid Parameters.");
                                return true;
                            }
                            return false;
                        }
                        if (args[0].equalsIgnoreCase("roster")) {
                            Inventory pi = player.getInventory();
                            pi.addItem(ItemStacks.roster());
                            sender.sendMessage(ChatColor.GREEN + "Please choose your desired class.");
                            return true;
                        }
                        if (args[0].equalsIgnoreCase("devbook")) {
                            Inventory pi = player.getInventory();
                            pi.addItem(ItemStacks.devBook());
                            return true;
                        }
                        sender.sendMessage(ChatColor.DARK_RED + "Invalid Parameters.");
                        return true;
                    }
                    sender.sendMessage(ChatColor.DARK_RED + "Invalid Parameters.");
                    return true;
                }
                return false;
            }
            sender.sendMessage(ChatColor.RED + "You are not an Operator.");
            return true;
        }
        return false;
    }

}
