package com.minecraftdimensions.bungeesuite.objects;

import com.minecraftdimensions.bungeesuite.configlibrary.Config;
import net.md_5.bungee.api.ChatColor;

public class Messages {

    static String configpath = "/plugins/BungeeSuite/Messages.yml";
    static Config m = new Config( configpath );
    public static String PLAYER_CONNECT_PROXY = colorize( m.getString( "PLAYER_CONNECT_PROXY", "{player}&e has joined the server!" ) );
    public static String PLAYER_DISCONNECT_PROXY = colorize( m.getString( "PLAYER_DISCONNECT_PROXY", "{player}&e has left the server!" ) );
    public static String PLAYER_DOES_NOT_EXIST = colorize( m.getString( "PLAYER_DOES_NOT_EXIST", "&c" + "That player does not exist" ) );
    public static String PLAYER_LOAD = colorize( m.getString( "PLAYER_LOAD", "Loaded player &9{player}" ) );
    public static String PLAYER_UNLOAD = colorize( m.getString( "PLAYER_UNLOAD", "Unloaded player &c{player}" ) );
    public static String PLAYER_NOT_ONLINE = colorize( m.getString( "PLAYER_NOT_ONLINE", "&c" + "That player is not online" ) );
    public static String NO_PERMISSION = colorize( m.getString( "NO_PERMISSION", "&c" + "You do not have permission to use that command" ) );
    // chat
    public static String CHANNEL_DEFAULT_GLOBAL = m.getString( "CHANNEL_DEFAULT_GLOBAL", "&c[{channel}]&e[{server}]{prefix}&f{player}&f{suffix}&f: &f{message}" );
    public static String CHANNEL_DEFAULT_SERVER = m.getString( "CHANNEL_DEFAULT_SERVER", "&e[{server}]{prefix}&f{player}&f{suffix}&f: &7{message}" );
    public static String CHANNEL_DEFAULT_ADMIN = m.getString( "CHANNEL_DEFAULT_ADMIN", "&9[Admin]{player}:{message}" );

    public static String PRIVATE_MESSAGE_OTHER_PLAYER = colorize( m.getString( "PRIVATE_MESSAGE_OTHER_PLAYER", "&7" + "[" + "&3" + "me" + "&7" + "->" + "&6" + "{player}" + "&7" + "] {message}" ) );
    public static String PRIVATE_MESSAGE_RECEIVE = colorize( m.getString( "PRIVATE_MESSAGE_RECEIVE", "&7" + "[" + "&b" + "{player}" + "&7" + "->" + "&6" + "me" + "&7" + "] {message}" ) );
    public static String PRIVATE_MESSAGE_SPY = colorize( m.getString( "PRIVATE_MESSAGE_SPY", "&7" + "[" + "&b" + "{sender}" + "&7" + "->" + "&6" + "{player}" + "&7" + "] {message}" ) );
    public static String MUTE_ALL_ENABLED = colorize( m.getString( "MUTE_ALL_ENABLED", "&c" + "All players have been muted by {sender}" ) );
    public static String MUTE_ALL_DISABLED = colorize( m.getString( "MUTE_ALL_DISABLED", "&2" + "All players have been unmuted by {sender}" ) );
    public static String PLAYER_MUTED = colorize( m.getString( "PLAYER_MUTED", "&2" + "{player} has been muted" ) );
    public static String PLAYER_UNMUTED = colorize( m.getString( "PLAYER_UNMUTED", "&c" + "{player} has been unmuted" ) );
    public static String MUTED = colorize( m.getString( "MUTED", "&c" + "You have been muted" ) );
    public static String UNMUTED = colorize( m.getString( "UNMUTED", "&2" + "You have been unmuted" ) );
    public static String PLAYER_NOT_MUTE = colorize( m.getString( "PLAYER_NOT_MUTE", "&c" + "That player is not muted" ) );
    public static String NO_ONE_TO_REPLY = colorize( m.getString( "NO_ONE_TO_REPLY", "&c" + "You have no one to reply to" ) );
    public static String CHANNEL_DOES_NOT_EXIST = colorize( m.getString( "CHANNEL_DOES_NOT_EXIST", "&c" + "That channel does not exist" ) );
    public static String CHANNEL_NOT_A_MEMBER = colorize( m.getString( "CHANNEL_NOT_A_MEMBER", "&c" + "You are not allowed to join this channel" ) );
    public static String CHANNEL_TOGGLE = colorize( m.getString( "CHANNEL_TOGGLE", "&2" + "You are now talking in the channel {channel}" ) );
    public static String CHANNEL_UNTOGGLABLE = colorize( m.getString( "CHANNEL_UNTOGGLABLE", "&c" + "You are unable to toggle to the channel {channel}" ) );
    public static String NICKNAMED_PLAYER = colorize( m.getString( "NICKNAMED_PLAYER", "&2" + "You have set {player}'s name to {name}" ) );
    public static String NICKNAME_CHANGED = colorize( m.getString( "NICKNAME_CHANGED", "&2" + "Your nickname has been change to {name}" ) );
    public static String NICKNAME_TOO_LONG = colorize( m.getString( "NICKNAME_TOO_LONG", "&c" + "That nickname is too long!" ) );
    public static String NICKNAME_TAKEN = colorize( m.getString( "NICKNAME_TAKEN", "&c" + "That nickname is already taken by a player!" ) );
    public static String NICKNAME_REMOVED_PLAYER = colorize( m.getString( "NICKNAME_REMOVED_PLAYER", "&c" + "You have removed {player}'s nickname!" ) );
    public static String NICKNAME_REMOVED = colorize( m.getString( "NICKNAME_REMOVED", "&c" + "Your nickname has been removed!" ) );
    public static String PLAYER_IGNORED = colorize( m.getString( "PLAYER_IGNORED", "&2" + "{player} has been ignored" ) );
    public static String PLAYER_UNIGNORED = colorize( m.getString( "PLAYER_UNIGNORED", "&2" + "{player} has been unignored" ) );
    public static String PLAYER_IGNORING = colorize( m.getString( "PLAYER_IGNORING", "&c" + "{player} is ignoring you" ) );
    public static String PLAYER_NOT_IGNORED = colorize( m.getString( "PLAYER_NOT_IGNORED", "&c" + "{player} is not ignored" ) );
    public static String CHATSPY_ENABLED = colorize( m.getString( "CHATSPY_ENABLED", "&2" + "ChatSpy enabled" ) );
    public static String CHATSPY_DISABLED = colorize( m.getString( "CHATSPY_DISABLED", "&c" + "ChatSpy disabled" ) );
    public static String AFK_DISPLAY = colorize( m.getString( "AFK_DISPLAY", "&5" + "[AFK]&r" ) );
    public static String PLAYER_AFK = colorize( m.getString( "PLAYER_AFK", "&6" + "{player} &6is now afk" ) );
    public static String PLAYER_NOT_AFK = colorize( m.getString( "PLAYER_NOT_AFK", "&7" + "{player} &7is no longer afk" ) );

    public static String colorize( String input ) {
        return ChatColor.translateAlternateColorCodes( '&', input );
    }

    public static void reloadMessages() {
        m = null;
        m = new Config( configpath );
        PLAYER_CONNECT_PROXY = colorize( m.getString( "PLAYER_CONNECT_PROXY", "{player}&e has joined the server!" ) );
        PLAYER_DISCONNECT_PROXY = colorize( m.getString( "PLAYER_DISCONNECT_PROXY", "{player}&e has left the server!" ) );
        PLAYER_DOES_NOT_EXIST = colorize( m.getString( "PLAYER_DOES_NOT_EXIST", "&c" + "That player does not exist" ) );
        PLAYER_LOAD = colorize( m.getString( "PLAYER_LOAD", "Loaded player &9{player}" ) );
        PLAYER_UNLOAD = colorize( m.getString( "PLAYER_UNLOAD", "Unloaded player &c{player}" ) );
        PLAYER_NOT_ONLINE = colorize( m.getString( "PLAYER_NOT_ONLINE", "&c" + "That player is not online" ) );
        NO_PERMISSION = colorize( m.getString( "NO_PERMISSION", "&c" + "You do not have permission to use that command" ) );
        // chat
        CHANNEL_DEFAULT_GLOBAL = m.getString( "CHANNEL_DEFAULT_GLOBAL", "&c[{channel}]&e[{server}]{prefix}&f{player}&f{suffix}&f: &f{message}" );
        CHANNEL_DEFAULT_SERVER = m.getString( "CHANNEL_DEFAULT_SERVER", "&e[{server}]{prefix}&f{player}&f{suffix}&f: &7{message}" );
        CHANNEL_DEFAULT_ADMIN = m.getString( "CHANNEL_DEFAULT_ADMIN", "&9[Admin]{player}:{message}" );
        PRIVATE_MESSAGE_OTHER_PLAYER = colorize( m.getString( "PRIVATE_MESSAGE_OTHER_PLAYER", "&7" + "[" + "&3" + "me" + "&7" + "->" + "&6" + "{player}" + "&7" + "] {message}" ) );
        PRIVATE_MESSAGE_RECEIVE = colorize( m.getString( "PRIVATE_MESSAGE_RECEIVE", "&7" + "[" + "&b" + "{player}" + "&7" + "->" + "&6" + "me" + "&7" + "] {message}" ) );
        PRIVATE_MESSAGE_SPY = colorize( m.getString( "PRIVATE_MESSAGE_SPY", "&7" + "[" + "&b" + "{sender}" + "&7" + "->" + "&6" + "{player}" + "&7" + "] {message}" ) );
        MUTE_ALL_ENABLED = colorize( m.getString( "MUTE_ALL_ENABLED", "&c" + "All players have been muted by {sender}" ) );
        MUTE_ALL_DISABLED = colorize( m.getString( "MUTE_ALL_DISABLED", "&2" + "All players have been unmuted by {sender}" ) );
        PLAYER_MUTED = colorize( m.getString( "PLAYER_MUTED", "&2" + "{player} has been muted" ) );
        PLAYER_UNMUTED = colorize( m.getString( "PLAYER_UNMUTED", "&c" + "{player} has been unmuted" ) );
        MUTED = colorize( m.getString( "MUTED", "&c" + "You have been muted" ) );
        UNMUTED = colorize( m.getString( "UNMUTED", "&2" + "You have been unmuted" ) );
        PLAYER_NOT_MUTE = colorize( m.getString( "PLAYER_NOT_MUTE", "&c" + "That player is not muted" ) );
        NO_ONE_TO_REPLY = colorize( m.getString( "NO_ONE_TO_REPLY", "&c" + "You have no one to reply to" ) );
        CHANNEL_DOES_NOT_EXIST = colorize( m.getString( "CHANNEL_DOES_NOT_EXIST", "&c" + "That channel does not exist" ) );
        CHANNEL_NOT_A_MEMBER = colorize( m.getString( "CHANNEL_NOT_A_MEMBER", "&c" + "You are not allowed to join this channel" ) );
        CHANNEL_TOGGLE = colorize( m.getString( "CHANNEL_TOGGLE", "&2" + "You are now talking in the channel {channel}" ) );
        CHANNEL_UNTOGGLABLE = colorize( m.getString( "CHANNEL_UNTOGGLABLE", "&c" + "You are unable to toggle to the channel {channel}" ) );
        NICKNAMED_PLAYER = colorize( m.getString( "NICKNAMED_PLAYER", "&2" + "You have set {player}'s name to {name}" ) );
        NICKNAME_CHANGED = colorize( m.getString( "NICKNAME_CHANGED", "&2" + "Your nickname has been change to {name}" ) );
        NICKNAME_TOO_LONG = colorize( m.getString( "NICKNAME_TOO_LONG", "&c" + "That nickname is too long!" ) );
        NICKNAME_TAKEN = colorize( m.getString( "NICKNAME_TAKEN", "&c" + "That nickname is already taken by a player!" ) );
        NICKNAME_REMOVED_PLAYER = colorize( m.getString( "NICKNAME_REMOVED_PLAYER", "&c" + "You have removed {player}'s nickname!" ) );
        NICKNAME_REMOVED = colorize( m.getString( "NICKNAME_REMOVED", "&c" + "Your nickname has been removed!" ) );
        PLAYER_IGNORED = colorize( m.getString( "PLAYER_IGNORED", "&2" + "{player} has been ignored" ) );
        PLAYER_UNIGNORED = colorize( m.getString( "PLAYER_UNIGNORED", "&2" + "{player} has been unignored" ) );
        PLAYER_IGNORING = colorize( m.getString( "PLAYER_IGNORING", "&c" + "{player} is ignoring you" ) );
        PLAYER_NOT_IGNORED = colorize( m.getString( "PLAYER_NOT_IGNORED", "&c" + "{player} is not ignored" ) );
        CHATSPY_ENABLED = colorize( m.getString( "CHATSPY_ENABLED", "&2" + "ChatSpy enabled" ) );
        CHATSPY_DISABLED = colorize( m.getString( "CHATSPY_DISABLED", "&c" + "ChatSpy disabled" ) );
        AFK_DISPLAY = colorize( m.getString( "AFK_DISPLAY", "&5" + "[AFK]&r" ) );
        PLAYER_AFK = colorize( m.getString( "PLAYER_AFK", "&6" + "{player} &6is now afk" ) );
        PLAYER_NOT_AFK = colorize( m.getString( "PLAYER_NOT_AFK", "&7" + "{player} &7is no longer afk" ) );
    }
}
