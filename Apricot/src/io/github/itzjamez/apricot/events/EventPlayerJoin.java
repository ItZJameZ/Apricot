package io.github.itzjamez.apricot.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventPlayerJoin implements Listener
{
    @EventHandler
    public void join(PlayerJoinEvent e)
    {
        Player p = e.getPlayer();
        p.sendMessage("Hello");
    }
}
