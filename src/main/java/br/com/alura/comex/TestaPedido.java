package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;

import static br.com.alura.comex.Pedido.fichaProduto;

public class TestaPedido {
    public static void main(String[] args) {
        //Produtos
        Produto produto1 = new Produto("Teclado", "Mecânico", 120, 1);
        Produto produto2 = new Produto("Mouse", "Com led", 70, 2);
        Produto produto3 = new Produto("Monitor", "21 Polegadas", 420, 1);

        //Cliente
        Cliente cliente = new Cliente("Lucas Ferreira", "222.222.222.22", "lucas23@gmail.com", "Analista",
                "(86)98228222", new Endereco("Da paz", "São Paulo", "Casa", "SP", "Rua do Coqueiro", 99));

        Pedido pedido1 = new Pedido(1, cliente, produto1, new BigDecimal(200), 1, LocalDate.now());
        Pedido pedido2 = new Pedido(2, cliente, produto2, new BigDecimal(100), 1, LocalDate.now());
        Pedido pedido3 = new Pedido(3, cliente, produto3, new BigDecimal(150), 1, LocalDate.now());

        fichaProduto(pedido2);

    }

}

