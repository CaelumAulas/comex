package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestaPedido {

    public static void main(String[] args) {
        // Criar produtos
        Produto produto1 = new Produto("Produto 1", "Descrição do Produto 1", 100.0, 10);
        Produto produto2 = new Produto("Produto 2", "Descrição do Produto 2", 200.0, 20);
        Produto produto3 = new Produto("Produto 3", "Descrição do Produto 3", 300.0, 30);

        // Criar cliente
        Cliente cliente = new Cliente("Cliente 1", "123.456.789-00", "cliente1@email.com", "Profissão do Cliente",
                "9999-9999", new Endereco("71680349"));

        // Criar pedidos
        Pedido pedido1 = new Pedido(1, cliente, new BigDecimal("100.0"), 1, produto1, LocalDate.now());

        Pedido pedido2 = new Pedido(2, cliente, new BigDecimal("200.0"), 2, produto2, LocalDate.now());

        Pedido pedido3 = new Pedido(3, cliente, new BigDecimal("300.0"), 3, produto3, LocalDate.now());

        // Exibir informações dos pedidos
        exibirInformacoesPedido(pedido1);
        exibirInformacoesPedido(pedido2);
        exibirInformacoesPedido(pedido3);
    }

    private static void exibirInformacoesPedido(Pedido pedido) {
        System.out.println("Produto: " + pedido.getProduto().getNome() +
                ", Cliente: " + pedido.getCliente().getNome() +
                ", Preço: " + pedido.getPreco() +
                ", Data: " + pedido.getData());
    }
}
