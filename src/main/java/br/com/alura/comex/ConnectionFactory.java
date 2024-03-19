package br.com.alura.comex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/brh?autoReconnect=true&useSSL=false", "root", "root");
            System.out.println("conectado...");

            return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}