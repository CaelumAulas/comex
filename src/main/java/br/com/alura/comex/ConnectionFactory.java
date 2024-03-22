package br.com.alura.comex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection rtrConn() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/comex?user=root&password=gabiruba");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
