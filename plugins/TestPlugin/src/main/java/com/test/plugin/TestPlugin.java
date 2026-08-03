package com.test.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("TestPlugin has been enabled!");
        
        // Register commands
        getCommand("greet").setExecutor(new GreetCommand(this));
        getCommand("serverinfo").setExecutor(new ServerInfoCommand(this));
    }
    
    @Override
    public void onDisable() {
        getLogger().info("TestPlugin has been disabled!");
    }
}
