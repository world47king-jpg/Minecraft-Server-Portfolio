package com.test.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ServerInfoCommand implements CommandExecutor {
    
    private TestPlugin plugin;
    
    public ServerInfoCommand(TestPlugin plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GOLD + "=== Server Information ===");
        sender.sendMessage(ChatColor.YELLOW + "Server Name: " + ChatColor.WHITE + Bukkit.getServerName());
        sender.sendMessage(ChatColor.YELLOW + "Players: " + ChatColor.WHITE + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers());
        sender.sendMessage(ChatColor.YELLOW + "TPS: " + ChatColor.WHITE + String.format("%.2f", Bukkit.getTPS()[0]));
        sender.sendMessage(ChatColor.YELLOW + "Version: " + ChatColor.WHITE + Bukkit.getVersion());
        sender.sendMessage(ChatColor.YELLOW + "Bukkit Version: " + ChatColor.WHITE + Bukkit.getBukkitVersion());
        sender.sendMessage(ChatColor.GOLD + "========================");
        
        return true;
    }
}
