package br.com.alura.comex.module.Classes.ConnectionWithDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection reconnection(){
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/comextrello?user=root&password=Bomber@4501");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
