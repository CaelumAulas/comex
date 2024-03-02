package br.com.alura.comex.module.Classes.ConnectionWithDB.ServiceWithCategories;

import br.com.alura.comex.module.Classes.Client;

import java.math.BigDecimal;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class DAOCategory {
    private Connection conn;
    DAOCategory(Connection connection){
        this.conn = connection;
    }

    public void save(Client client){
        Client newClient = new Client(client.getId(),client.getMoney(),client.getName(),client.getCpf(),client.getEmail());

        String sql = "INSERT INTO conta (numero, saldo, cliente_nome, cliente_cpf, cliente_email)" +
                "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, newClient.getId());
            preparedStatement.setBigDecimal(2, BigDecimal.ZERO);
            preparedStatement.setString(3, newClient.getName());
            preparedStatement.setString(4, newClient.getCpf());
            preparedStatement.setString(5, newClient.getEmail());

            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Client> show(){
        PreparedStatement ps;
        ResultSet rs;
        Set<Client> clients = new HashSet<>();
        String sql = "SELECT * from conta";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                BigDecimal money = rs.getBigDecimal(2);
                String name = rs.getString(3);
                String cpf = rs.getString(4);
                String email = rs.getString(5);

                clients.add(new Client(id,money,name,cpf,email));
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clients;
    }

    public void alter(int number, BigDecimal bigDecimal) {
        PreparedStatement ps;
        String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";

        try {
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);

            ps.setBigDecimal(1, bigDecimal);
            ps.setInt(2, number);

            ps.execute();
            ps.close();
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            try{
                conn.rollback();
            } catch (SQLException ex){
                throw new RuntimeException(e);
            }
        }
    }

    public Client clientListener(Integer numero) {
        String sql = "SELECT * FROM conta WHERE numero = " + numero;

        Statement ps;
        ResultSet rs;
        Client client = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            while (rs.next()) {
                int idFind = rs.getInt(1);
                BigDecimal money = rs.getBigDecimal(2);
                String name = rs.getString(3);
                String cpf = rs.getString(4);
                String email = rs.getString(5);

                client = new Client(idFind,money,name,cpf,email);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return client;
    }

    public void delete(int idAccount){
        String sql = "DELETE FROM conta WHERE numero = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, idAccount);

            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
