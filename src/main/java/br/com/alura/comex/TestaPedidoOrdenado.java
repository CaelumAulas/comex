package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaPedidoOrdenado {
    public static void main(String[] args) {
        BigDecimal big1 = new BigDecimal(599.00);
        BigDecimal big2 = new BigDecimal(1.00);
        BigDecimal big3 = new BigDecimal(6000.00);
        BigDecimal big4 = new BigDecimal(4.00);
        BigDecimal big5 = new BigDecimal(15.50);

        var cliente1 = new Cliente("jucicleido", "123456-88");
        var prod1 = new Produto("Caixa de Som");
        var prod2 = new Produto("Talher");
        var prod3 = new Produto("Mesa");
        var prod4 = new Produto("Copo");
        var prod5 = new Produto("Prato");

        var pedido1 = new Pedido(1, cliente1, big1, 2, prod1, LocalDate.now());
        var pedido2 = new Pedido(2, cliente1, big2, 24, prod2, LocalDate.now());
        var pedido3 = new Pedido(3, cliente1, big3, 1, prod3, LocalDate.now());
        var pedido4 = new Pedido(4, cliente1, big4, 12, prod4, LocalDate.now());
        var pedido5 = new Pedido(5, cliente1, big5, 12, prod5, LocalDate.now());


        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);

        Collections.sort(pedidos);

        System.out.println("Pedido mais barato: \n" + pedidos.get(0));
        System.out.println("Pedido mais caro: \n" + pedidos.get(4));
    }
}
