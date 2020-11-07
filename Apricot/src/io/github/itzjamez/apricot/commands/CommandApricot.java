package io.github.itzjamez.apricot.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.itzjamez.apricot.Apricot;

public class CommandApricot implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String cL, String[] args)
    {
        s.sendMessage(" ");
        s.sendMessage("Apricot Version: " + Apricot.getInstance().getDescription().getVersion());
        s.sendMessage(" ");
        
        return false;
    }

}
