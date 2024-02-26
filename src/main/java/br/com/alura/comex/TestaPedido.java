package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestaPedido {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Geladeira");
        Produto produto2 = new Produto("Frigobar");
        Produto produto3 = new Produto("Freezer");
        Cliente cliente1 = new Cliente("Jonathan", "791.761.280-59");
        Cliente cliente2 = new Cliente("Luciano", "959.933.940-13");
        Cliente cliente3 = new Cliente("Rafael", "839.854.280-26");
        Pedido pedido1 = new Pedido(1, "Eletrodoméstico", produto1, cliente1, new BigDecimal("5000.00"), 1, LocalDate.now());
        Pedido pedido2 = new Pedido(2, "Eletrodoméstico", produto1, cliente2, new BigDecimal("4000.00"), 1, LocalDate.now());
        Pedido pedido3 = new Pedido(3, "Eletrodoméstico", produto1, cliente3, new BigDecimal("2000.00"), 1, LocalDate.now());
        System.out.printf("%s, %s, %f, %tF%n", pedido1.getProduto().getNome(), pedido1.getCliente().getNome(), pedido1.getPreco(), pedido1.getData());
        System.out.printf("%s, %s, %f, %tF%n", pedido2.getProduto().getNome(), pedido2.getCliente().getNome(), pedido2.getPreco(), pedido2.getData());
        System.out.printf("%s, %s, %f, %tF%n", pedido3.getProduto().getNome(), pedido3.getCliente().getNome(), pedido3.getPreco(), pedido3.getData());
    }
}
