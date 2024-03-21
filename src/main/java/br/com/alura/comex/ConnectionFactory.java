package br.com.alura.comex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/comex?user=root&password=132100");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
