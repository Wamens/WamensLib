package me.wamens.wamenslib;

import me.wamens.wamenslib.commands.WamensLibCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class WamensLib extends JavaPlugin {

    public static WamensLib plugin;

    public Logger log = Bukkit.getLogger();


    @Override
    public void onEnable() {
        this.plugin = plugin;
        log.info("[WamensLib] Very cool lib.");
        log.info("[WamensLib] Kevades is very hot");
        getCommand("wamenslib").setExecutor((CommandExecutor) new WamensLibCommand(this.plugin));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
