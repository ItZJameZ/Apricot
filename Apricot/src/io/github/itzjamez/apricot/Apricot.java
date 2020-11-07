package io.github.itzjamez.apricot;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.itzjamez.apricot.commands.CommandApricot;
import io.github.itzjamez.apricot.events.EventPlayerJoin;

public class Apricot extends JavaPlugin
{
    private static Apricot instance;

    public void onEnable()
    {
        // Set Instance
        instance = this;
        
        // Register Commands
        registerCommand("apricot", new CommandApricot());
        
        // Register Events
        registerEvent(new EventPlayerJoin(), this);
    }
    
    public void onDisable()
    {
        // Set Instance
        instance = null;
    }
    
    public static Apricot getInstance()
    {
        // Get Instance
        return instance;
    }
    
    // Register Command
    private void registerCommand(String cmd, CommandExecutor executor)
    {
        getCommand(cmd).setExecutor(executor);
    }
    
    // Register Event
    private void registerEvent(Listener listener, Plugin plugin)
    {
        Bukkit.getPluginManager().registerEvents(listener, plugin);
    }
}
