package com.crutches.meow.crutchesplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import com.crutches.meow.crutchesplugin.CrutchesPlugin;
import org.bukkit.command.PluginCommand;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractCommand implements CommandExecutor {
    public AbstractCommand(String command){
        PluginCommand pluginCommand = CrutchesPlugin.getInstance().getCommand(command);
        if(pluginCommand != null){
            pluginCommand.setExecutor(this);
        }
    }
    public abstract void execute(CommandSender sender, String label, String[] args);
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args){
        execute(sender, label, args);
        return true;
    }

}
