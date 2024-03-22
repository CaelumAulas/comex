package br.com.alura.comex.main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/comex?user=root&password=root");
            System.out.println("Conexão bem sucedida");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
