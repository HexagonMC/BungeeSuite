package com.minecraftdimensions.bungeesuite.objects;


public class ServerData {
    String serverName;
    String shortName;
    boolean forceChannel;
    String forcedChannel;
    boolean connectionMessages;


    public ServerData( String name, String shortName, boolean force, String channel, boolean connectionMessages ) {
        this.serverName = name;
        this.shortName = shortName;
        this.forceChannel = force;
        if ( channel.equalsIgnoreCase( "server" ) ) {
            this.forcedChannel = serverName;
        } else if ( channel.equalsIgnoreCase( "global" ) ) {
            this.forcedChannel = "Global";
        } else {
            this.forcedChannel = channel;
        }
        this.connectionMessages = connectionMessages;
    }

    public String getServerName() {
        return serverName;
    }

    public String getServerShortName() {
        return shortName;
    }

    public String getForcedChannel() {
        return forcedChannel;
    }

    public boolean forcingChannel() {
        return forceChannel;
    }

    public boolean usingConnectionMessages() {
        return connectionMessages;
    }
}
