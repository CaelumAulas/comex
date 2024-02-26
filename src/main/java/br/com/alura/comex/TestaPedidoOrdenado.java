package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaPedidoOrdenado {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Iphone");
        Produto produto2 = new Produto("MacBook");
        Produto produto3 = new Produto("Airpods");
        Produto produto4 = new Produto("AppleWatch");
        Produto produto5 = new Produto("Vision Pro");
        Cliente cliente1 = new Cliente("Rodrigo", "370.860.620-57");
        Cliente cliente2 = new Cliente("Marcelo", "446.570.270-18");
        Cliente cliente3 = new Cliente("Genton", "626.391.500-57");
        Cliente cliente4 = new Cliente("Edvaldo", "594.474.260-77");
        Cliente cliente5 = new Cliente("Valter", "892.220.510-50");
        Pedido pedido1 = new Pedido(1, "Eletrônicos Apple", produto1, cliente1, new BigDecimal("7000.00"), 4, LocalDate.now());
        Pedido pedido2 = new Pedido(2, "Eletrônicos Apple", produto2, cliente2, new BigDecimal("20000.00"), 7, LocalDate.now());
        Pedido pedido3 = new Pedido(3, "Eletrônicos Apple", produto3, cliente3, new BigDecimal("2000.00"), 2, LocalDate.now());
        Pedido pedido4 = new Pedido(4, "Eletrônicos Apple", produto4, cliente4, new BigDecimal("3000.00"), 11, LocalDate.now());
        Pedido pedido5 = new Pedido(5, "Eletrônicos Apple", produto5, cliente5, new BigDecimal("50000.00"), 5, LocalDate.now());
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);
        Collections.sort(pedidos, Comparator.reverseOrder());
        System.out.println("1) " + pedidos);
        Collections.sort(pedidos);
        System.out.println("2) " + pedidos);
    }
}
