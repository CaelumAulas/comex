package br.com.alura.comex;

import java.math.BigDecimal;

public class TestaCrudProduto {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();


        Produto produto1 = new Produto();
        produto1.setId(3);
        produto1.setNumero(200);
        produto1.setPrecoUnitario(new BigDecimal("79.56"));
        produto1.setNome("Produto 1");
        produto1.setDescricao("Desc do produto 1 com 200 itens");

        service.remover(produto1);
    }
}
