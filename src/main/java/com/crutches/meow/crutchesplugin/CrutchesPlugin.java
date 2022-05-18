package com.crutches.meow.crutchesplugin;

import com.crutches.meow.crutchesplugin.commands.CrutchesCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class CrutchesPlugin extends JavaPlugin {

    private static CrutchesPlugin instance;
    @Override
    public void onEnable() {
        instance = this;
        new CrutchesCommand();

    }

    @Override
    public void onDisable() {
    }
    public static CrutchesPlugin getInstance(){
        return instance;
    }
}
