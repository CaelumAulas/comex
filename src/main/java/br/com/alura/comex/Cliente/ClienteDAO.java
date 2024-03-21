package br.com.alura.comex.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Cliente cliente) {
        String sql = "INSERT INTO cliente (NOME, CPF, EMAIL) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());

            ps.execute();
            System.out.println("Cliente cadastrado com sucesso!");

            ps.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Cliente> listaCliente() {
        List<Cliente> clientes = new ArrayList<>();

        try {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM CLIENTE");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Cliente cliente = new Cliente();

                String nome = resultSet.getString("NOME");
                String cpf = resultSet.getString("CPF");
                String email = resultSet.getString("EMAIL");

                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setEmail(email);

                clientes.add(cliente);
            }
            resultSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void atualizar(Cliente cliente){
        String sql = "UPDATE cliente SET email = ? WHERE nome = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            ps.setString(1, cliente.getEmail());
            ps.setString(2,cliente.getNome());

            ps.execute();

            System.out.println("Cliente atualizado com sucesso!");
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remover(Cliente cliente){
        String sql = " DELETE FROM cliente WHERE nome = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            ps.setString(1, cliente.getNome());

            ps.execute();

            System.out.println("Cliente removido com sucesso!");
            ps.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}