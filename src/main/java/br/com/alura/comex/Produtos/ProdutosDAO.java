package br.com.alura.comex.Produtos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {
    private Connection connection;
    public ProdutosDAO(Connection connection) {
        this.connection = connection;
    }

    public void registroProdutos(br.com.alura.comex.Produtos.Produtos produtos) {
        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, produtos.getProduto());
            ps.setDouble(2, produtos.getPreco());
            ps.setDouble(3, produtos.getQuantidade());

            ps.execute();
            System.out.println("Produto inserido com sucesso!");
            ps.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produtos> listaProdutos() {
        List<Produtos> produtos = new ArrayList<>();

        try {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM PRODUTOS");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Produtos produtos1 = new Produtos();

                String nome = resultSet.getString("NOME");
                double preco = resultSet.getDouble("PRECO");
                double quantidade = resultSet.getDouble("QUANTIDADE");

                produtos1.setProduto(nome);
                produtos1.setPreco(preco);
                produtos1.setQuantidade(quantidade);

                produtos.add(produtos1);

            }
            resultSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }
    public List<Produtos> listaProdutosOrdenada() {
        List<Produtos> produtos = new ArrayList<>();

        try {
            PreparedStatement ps = this.connection.prepareStatement("SELECT nome FROM produtos ORDER BY nome ASC");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Produtos produtos1 = new Produtos();

                String nome = resultSet.getString("NOME");
                produtos1.setProduto(nome);


                produtos.add(produtos1);
            }
            resultSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;

    }

    public void atualizarProduto(Produtos produtos) {
        String sql = "UPDATE produtos SET preco = ? WHERE nome = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            ps.setDouble(1, produtos.getPreco());
            ps.setString(2, produtos.getProduto());

            ps.execute();
            System.out.println("Produto atualizado com sucesso!");
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void removeProduto(Produtos produtos) {
        String sql = "DELETE FROM produtos WHERE nome = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            ps.setString(1, produtos.getProduto());

            ps.execute();
            System.out.println("Produto removido com sucesso!");
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
