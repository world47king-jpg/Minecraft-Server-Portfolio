package com.test.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GreetCommand implements CommandExecutor {
    
    private TestPlugin plugin;
    
    public GreetCommand(TestPlugin plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be used by players!");
            return true;
        }
        
        Player player = (Player) sender;
        
        if (args.length == 0) {
            player.sendMessage(ChatColor.GREEN + "Hello, " + player.getName() + "! Welcome to the server!");
        } else {
            Player target = plugin.getServer().getPlayer(args[0]);
            if (target != null) {
                target.sendMessage(ChatColor.GREEN + "Hello! " + player.getName() + " says hi!");
                player.sendMessage(ChatColor.GREEN + "You greeted " + target.getName() + "!");
            } else {
                player.sendMessage(ChatColor.RED + "Player not found!");
            }
        }
        
        return true;
    }
}
