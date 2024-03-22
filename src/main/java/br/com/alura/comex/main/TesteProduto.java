package br.com.alura.comex.main;

import br.com.alura.comex.model.Produto;
import br.com.alura.comex.ConnectionFactory;
import br.com.alura.comex.service.ProdutoService;

import java.math.BigDecimal;

public class TesteProduto {
    public static void main(String[] args) {
        // CREATE
        Produto produto = new Produto("Iphone", "Celular", new BigDecimal("5000.00"), 1);
        new ProdutoService(new ConnectionFactory()).cadastrar(produto);
        // READ
        System.out.println(new ProdutoService(new ConnectionFactory()).consultarRegistros());
        System.out.println(new ProdutoService(new ConnectionFactory()).consultarNomes());
        // UPDATE
        produto.setId(1);
        produto.setDescricao("Dispositivo eletrônico");
        new ProdutoService(new ConnectionFactory()).alterar(produto);
        System.out.println(new ProdutoService(new ConnectionFactory()).consultarRegistros());
        // DELETE
        new ProdutoService(new ConnectionFactory()).remover(produto.getId());
        System.out.println(new ProdutoService(new ConnectionFactory()).consultarRegistros());
    }
}
