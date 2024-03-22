package br.com.alura.comex.DAO;

import br.com.alura.comex.model.Produto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ProdutoDAO {
    private Connection conn;

    public ProdutoDAO(Connection conn) {
        this.conn = conn;
    }

    public void cadastrar(Produto produto) {
        String sql = "INSERT INTO produto (nome, descricao, preco, quantidade) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setBigDecimal(3, produto.getPreco());
            ps.setInt(4, produto.getQtd());
            ps.execute();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Produto> consultarRegistros() {
        String sql = "SELECT * FROM produto";
        Set<Produto> produtos = new HashSet<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
                BigDecimal preco = resultSet.getBigDecimal(4);
                int qtd = resultSet.getInt(5);
                produtos.add(new Produto(id, nome, descricao, preco, qtd));
            }
            resultSet.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public Set<String> consultarNomes() {
        String sql = "SELECT nome FROM produto order by nome";
        Set<String> nomes = new HashSet<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                nomes.add(resultSet.getString(1));
            }
            resultSet.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nomes;
    }

    public void alterar(Produto produto) {
        String sql = "UPDATE produto set nome = ?, descricao = ?, preco = ?, quantidade = ? where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setBigDecimal(3, produto.getPreco());
            ps.setInt(4, produto.getQtd());
            ps.setInt(5, produto.getId());
            ps.execute();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM produto where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
