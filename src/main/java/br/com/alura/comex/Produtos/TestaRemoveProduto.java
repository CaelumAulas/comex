package br.com.alura.comex.Produtos;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaRemoveProduto {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        ProdutoService produtoService = new ProdutoService(connection);

        try {
        Produtos produtos = new Produtos();
        produtos.setProduto("Armário");

        produtoService.removeProduto(produtos);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
