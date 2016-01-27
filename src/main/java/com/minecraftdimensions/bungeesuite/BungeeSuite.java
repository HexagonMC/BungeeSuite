package com.minecraftdimensions.bungeesuite;

import com.minecraftdimensions.bungeesuite.commands.ReloadCommand;
import com.minecraftdimensions.bungeesuite.listeners.*;
import com.minecraftdimensions.bungeesuite.managers.*;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeSuite extends Plugin {
    public static BungeeSuite instance;
    public static ProxyServer proxy;

    public void onEnable() {
        instance = this;
        LoggingManager.log( ChatColor.GREEN + "Starting BungeeSuite" );
        proxy = ProxyServer.getInstance();
        LoggingManager.log( ChatColor.GREEN + "Initialising Managers" );
        initialiseManagers();
        registerListeners();
        registerCommands();
        reloadServersPlugins();
    }

    private void registerCommands() {
        proxy.getPluginManager().registerCommand( this, new ReloadCommand() );
    }

    private void initialiseManagers() {
        if ( SQLManager.initialiseConnections() ) {
            DatabaseTableManager.createDefaultTables();
            ChatManager.loadChannels();
            PrefixSuffixManager.loadPrefixes();
            PrefixSuffixManager.loadSuffixes();
        } else {
            LoggingManager.log( ChatColor.DARK_RED + "Your BungeeSuite is unable to connect to your SQL database specified in the config" );
        }
    }

    void registerListeners() {
        this.getProxy().registerChannel( "BSChat" );//in
        this.getProxy().registerChannel( "BungeeSuiteChat" );//out
        proxy.getPluginManager().registerListener( this, new PlayerListener() );
        proxy.getPluginManager().registerListener( this, new ChatListener() );
        proxy.getPluginManager().registerListener( this, new ChatMessageListener() );
    }


    private void reloadServersPlugins() {
        for ( ServerInfo s : ProxyServer.getInstance().getServers().values() ) {
            ChatManager.checkForPlugins( s );
        }
    }

    public void onDisable() {
        SQLManager.closeConnections();
    }
}
