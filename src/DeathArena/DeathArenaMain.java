package DeathArena;

import DeathArena.Commands.DeathArenaCommand;
import DeathArena.EventHandlers.*;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
        registerEvents();
        new Locations(this);
        new BattleStarter(this);
    }

    @Override
    public void onDisable() {

    }

    private void registerCommands() {
        getCommand("deatharena").setExecutor(new DeathArenaCommand(this));
    }

    private void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new RosterListener(), this);
        pm.registerEvents(new RosterClickCancelListener(), this);
        pm.registerEvents(new SelectionListener(this), this);
        pm.registerEvents(new PreparationListener(), this);
        pm.registerEvents(new DevBookListener(), this);
        pm.registerEvents(new BattleManager(this), this);
    }
}
