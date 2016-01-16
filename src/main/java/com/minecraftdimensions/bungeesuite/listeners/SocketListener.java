package com.minecraftdimensions.bungeesuite.listeners;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * Very simple socket server example. That responds to a single object with
 * another object. The
 */
public class SocketListener extends Thread {

    private Socket socket = null;
    private int port;

    public SocketListener( Socket socket ) {
        this.socket = socket;
    }

    //this shit confuses me!
    public void run() {
        try {
            DataInputStream in = new DataInputStream( socket.getInputStream() );

            port = in.readInt();
            int length = in.readInt();
            byte[] message = new byte[length];
            in.readFully( message, 0, message.length );
            DataInputStream data = new DataInputStream( new ByteArrayInputStream( message ) );

            String task = data.readUTF();

            data.close();
            in.close();

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private ServerInfo getServer( InetSocketAddress inetSocketAddress ) {
        for ( ServerInfo s : ProxyServer.getInstance().getServers().values() ) {
            if ( s.getAddress().equals( inetSocketAddress ) ) {
                return s;
            }
        }
        return null;
    }
}
