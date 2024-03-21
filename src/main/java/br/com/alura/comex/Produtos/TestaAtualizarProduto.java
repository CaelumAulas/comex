package br.com.alura.comex.Produtos;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaAtualizarProduto {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        ProdutoService produtoService = new ProdutoService(connection);

        try {
        Produtos produtos = new Produtos();
        produtos.setPreco(40);
        produtos.setProduto("Livro");

        produtoService.atualizarProduto(produtos);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
