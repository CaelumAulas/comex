package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaPedidoOrdenado {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto 1", "Produto 1.0", 125, 2);
        Produto produto2 = new Produto("Produto 2", "Produto 2.0", 14, 1);
        Produto produto3 = new Produto("Produto 3", "Produto 3.0", 20, 4);
        Produto produto4 = new Produto("Produto 4", "Produto 4.0", 70, 2);
        Produto produto5 = new Produto("Produto 5", "Produto 5.0", 345, 2);

        Cliente cliente1 = new Cliente("Fulano", "222.222.222.22");

        Pedido pedido1 = new Pedido(1, cliente1, produto1, new BigDecimal(80), 1, LocalDate.now());
        Pedido pedido2 = new Pedido(2, cliente1, produto2, new BigDecimal(200), 3, LocalDate.now());
        Pedido pedido3 = new Pedido(3, cliente1, produto3, new BigDecimal(380), 2, LocalDate.now());
        Pedido pedido4 = new Pedido(4, cliente1, produto4, new BigDecimal(463), 2, LocalDate.now());
        Pedido pedido5 = new Pedido(5, cliente1, produto5, new BigDecimal(100), 5, LocalDate.now());

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);


        Collections.sort(pedidos);
        System.out.println("Pedido mais caro: "+pedidos.get(4));
        System.out.println("Pedido mais barato: "+pedidos.get(0));


    }

}
