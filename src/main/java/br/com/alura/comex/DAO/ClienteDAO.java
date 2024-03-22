package br.com.alura.comex.DAO;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ClienteDAO {

    private Connection conn;
    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Cliente cliente) {
        String sql = "INSERT INTO cliente (cpf, nome, email, profissao, telefone, cep) values (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getProfissao());
            ps.setString(5, cliente.getTelefone());
            ps.setString(6, cliente.getEndereco().getCep());
            ps.execute();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Cliente> listar() {
        String sql = "SELECT * FROM cliente";
        Set<Cliente> clientes = new HashSet<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String cpf = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String email = resultSet.getString(4);
                String profissao = resultSet.getString(5);
                String telefone = resultSet.getString(6);
                String cep = resultSet.getString(7);
                clientes.add(new Cliente(cpf, nome, email, profissao, telefone, new Endereco(cep)));
            }
            resultSet.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void atualiza(Cliente cliente) {
        String sql = "UPDATE cliente set nome = ?, email = ?, profissao = ?, telefone = ?, cep = ? where cpf = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getProfissao());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getEndereco().getCep());
            ps.setString(6, cliente.getCpf());
            ps.execute();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(String cpf) {
        String sql = "DELETE FROM cliente where cpf = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cpf);
            ps.execute();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
