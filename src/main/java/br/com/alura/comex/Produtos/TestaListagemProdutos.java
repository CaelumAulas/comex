package br.com.alura.comex.Produtos;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemProdutos {
    public static void main(String[] args) {
        Connection conexao = ConnectionFactory.getConnection();
        ProdutoService produtoService = new ProdutoService(conexao);

        try {
            List<Produtos> produtos1 = produtoService.listaProdutos();

            System.out.println("Lista de produtos:");

            for (Produtos produtos : produtos1) {
                System.out.println("[" + "Produto" + "] " + produtos.getProduto() + " | " + "[" + "Preco" + "] " + produtos.getPreco() + " | " + "[" + "QTD" + "] " + produtos.getQuantidade());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
