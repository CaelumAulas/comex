package br.com.alura.comex;
import java.math.BigDecimal;
import java.time.LocalDate;

public class TestePedido{
    public static void main(String[] args) {

        BigDecimal big1 = new BigDecimal(599.99);
        BigDecimal big2 = new BigDecimal(1.99);
        BigDecimal big3 = new BigDecimal(6000.00);

        var cliente1 = new Cliente("jucicleido", "123456-88");
        var prod1 = new Produto("Vaso");
        var prod2 = new Produto("Talher");
        var prod3 = new Produto("Mesa");

        var pedido1 = new Pedido(1, cliente1, big1, 12, prod1, LocalDate.now());
        var pedido2 = new Pedido(2, cliente1, big2, 24, prod2, LocalDate.now());
        var pedido3 = new Pedido(3, cliente1, big3, 1, prod3, LocalDate.now());


        System.out.println(pedido1.getNomeProduto());
        System.out.println(pedido1.getNomeCliente());
        System.out.println(pedido1.getPreco());
        System.out.println(pedido1.getData());

    }
}
