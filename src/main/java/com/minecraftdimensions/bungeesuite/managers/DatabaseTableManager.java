package com.minecraftdimensions.bungeesuite.managers;

import java.sql.SQLException;


public class DatabaseTableManager {

    public static void runTableQuery( String name, String query ) throws SQLException {
        boolean tableExists = false;
        tableExists = SQLManager.doesTableExist( name );
        if ( !tableExists ) {
            SQLManager.standardQuery( query );
        }
    }

    public static void insertData( String table, String column, String data ) throws SQLException {
        SQLManager.standardQuery( "INSERT INTO " + table + " (" + column + ") VALUE (" + data + ");" );
    }

    public static boolean doesTableExist( String table ) {
        return SQLManager.doesTableExist( table );
    }

    public static void createDefaultTables() {
        //BungeePlayers
        try {
            runTableQuery( "BungeePlayers", "CREATE TABLE BungeePlayers (playername VARCHAR(100), lastonline DATETIME NOT NULL, ipaddress VARCHAR(100), nickname VARCHAR(100), channel VARCHAR(100),muted TINYINT(1) DEFAULT 0, chat_spying TINYINT(1) DEFAULT 0, dnd TINYINT(1) DEFAULT 0, CONSTRAINT pk_playername PRIMARY KEY (playername))" );
            //BungeeChatIgnores
            runTableQuery( "BungeeChatIgnores", "CREATE TABLE BungeeChatIgnores (player VARCHAR(100), ignoring VARCHAR(100), CONSTRAINT pk_ignored PRIMARY KEY (player,ignoring), CONSTRAINT fk_player FOREIGN KEY (player) REFERENCES BungeePlayers (playername) ON UPDATE CASCADE ON DELETE CASCADE, CONSTRAINT fk_ignored FOREIGN KEY (ignoring) REFERENCES BungeePlayers (playername) ON UPDATE CASCADE ON DELETE CASCADE)" );
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
    }
}
