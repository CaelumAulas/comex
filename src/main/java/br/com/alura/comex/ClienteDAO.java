package br.com.alura.comex;

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
        String sql = "INSERT INTO CLIENTE (NOME, CPF, EMAIL, PROFISSAO, TELEFONE, CEP) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getProfissao());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getCep());

            preparedStatement.execute();

            System.out.println("Cliente cadastrado com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Cliente> listar() {
        List<Cliente> clientes = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM CLIENTE");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                Cliente cliente = new Cliente();

                cliente.setNome(resultSet.getString("NOME"));
                cliente.setCpf(resultSet.getString("CPF"));
                cliente.setEmail(resultSet.getString("EMAIL"));
                cliente.setProfissao(resultSet.getString("PROFISSAO"));
                cliente.setTelefone(resultSet.getString("TELEFONE"));
                cliente.setCep(resultSet.getString("CEP"));

                clientes.add(cliente);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void atualizar(Cliente cliente) {
        String sql = "UPDATE CLIENTE SET NOME = ? , CPF = ?, EMAIL = ?, PROFISSAO = ?, TELEFONE = ?, CEP = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getProfissao());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getCep());
            preparedStatement.setInt(7, cliente.getId());

            preparedStatement.execute();

            System.out.println("Cliente atualizado com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(Cliente cliente) {
        String sql = "DELETE FROM CLIENTE WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setInt(1, cliente.getId());

            preparedStatement.execute();

            System.out.println("Cliente removido com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
