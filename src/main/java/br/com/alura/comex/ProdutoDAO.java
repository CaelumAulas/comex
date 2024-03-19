package br.com.alura.comex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }


    public void salvar(Produto produto) {
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, PRECO_UNITARIO, NUMERO) VALUES (?,?,?,?)";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setBigDecimal(3, produto.getPrecoUnitario());
            preparedStatement.setInt(4, produto.getNumero());

            preparedStatement.execute();

            System.out.println("Produto cadastrado com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listar() {
        List<Produto> produtos = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM PRODUTO");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Produto produto = new Produto();

                produto.setNome(resultSet.getString("NOME"));
                produto.setDescricao(resultSet.getString("DESCRICAO"));
                produto.setPrecoUnitario(resultSet.getBigDecimal("PRECO_UNITARIO"));
                produto.setNumero(resultSet.getInt("NUMERO"));

                produtos.add(produto);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public void atualizar(Produto produto) {
        String sql = "UPDATE PRODUTO SET NOME = ? , DESCRICAO = ?, PRECO_UNITARIO = ?, NUMERO = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setBigDecimal(3, produto.getPrecoUnitario());
            preparedStatement.setInt(4, produto.getNumero());
            preparedStatement.setInt(5, produto.getId());

            preparedStatement.execute();

            System.out.println("Produto atualizado com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(Produto produto) {
        String sql = "DELETE FROM PRODUTO WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setInt(1, produto.getId());

            preparedStatement.execute();

            System.out.println("Produto removido com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
