package br.com.alura.comex.Produtos;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.util.List;

public class TestaBuscaProdutoAlternado {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        ProdutoService produtoService = new ProdutoService(connection);

        List<Produtos> produtos = produtoService.listaProdutoOrdenada(connection);

        for (Produtos produtos1 : produtos) {
            System.out.println("[" + "Nome" + "] " + produtos1.getProduto());
        }


    }


}
