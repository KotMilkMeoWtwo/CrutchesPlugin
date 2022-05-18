package com.crutches.meow.crutchesplugin.commands;

import com.crutches.meow.crutchesplugin.CrutchesPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class CrutchesCommand extends AbstractCommand{

    public CrutchesCommand(){
        super("crutches");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if(args.length == 0){
            sender.sendMessage("To get info send /crutches help");
        };

        if(args[0].equalsIgnoreCase("reload")){
            if(!sender.hasPermission("crutches.reload")){
                sender.sendMessage(ChatColor.RED + "No permissions");
                return;
            }
            CrutchesPlugin.getInstance().reloadConfig();
            sender.sendMessage(ChatColor.GREEN + "Костыли перезагружены");
            return;
        }

        sender.sendMessage(ChatColor.RED + "Хз шо за комманда" + args[0]);

    }
}
