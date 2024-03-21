package br.com.alura.comex.Produtos;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaProduto {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        ProdutoService produtoService = new ProdutoService(connection);

        try {
        Produtos produto = new Produtos();
        produto.setProduto("Armário");
        produto.setPreco(340);
        produto.setQuantidade(1);


            produtoService.registraProduto(produto);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
