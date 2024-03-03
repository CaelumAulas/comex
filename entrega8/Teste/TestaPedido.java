package Teste;
import Sistema.Produto;
import Sistema.Cliente;
import Sistema.Produto;

import java.time.LocalDate;

public class TestaPedido {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Policarpo");

        Produto artesanato1 = new Produto();
        artesanato1.setNome("Fio de lã");
        artesanato1.setPreco_unitario(9.99);
        Produto artesanato2 = new Produto();
        artesanato2.setNome("Agulha de Tricô");
        artesanato2.setPreco_unitario(20.90);
        Produto artesanato3 = new Produto();
        artesanato3.setNome("Agulha de Tapeçaria");
        artesanato3.setPreco_unitario(5.99);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Safira");

        Produto papelaria1 = new Produto();
        papelaria1.setNome("Folha Sulfite");
        papelaria1.setPreco_unitario(19.99);
        Produto papelaria2 = new Produto();
        papelaria2.setNome("Lápis de Cor");
        papelaria2.setPreco_unitario(50.00);
        Produto papelaria3 = new Produto();
        papelaria3.setNome("Canetinha");
        papelaria3.setPreco_unitario(15.99);

        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Produto: " + artesanato1.getNome());
        System.out.println("Preço: " + artesanato1.getPreco_unitario());
        System.out.println("--------------------------------------------");
        System.out.println("Produto: " + artesanato2.getNome());
        System.out.println("Preço: " + artesanato2.getPreco_unitario());
        System.out.println("--------------------------------------------");
        System.out.println("Produto: " + artesanato3.getNome());
        System.out.println("Preço: " + artesanato3.getPreco_unitario());
        System.out.println("Data: " + LocalDate.now());
        System.out.println("********************************************");

        System.out.println("Cliente: " + cliente2.getNome());
        System.out.println("Produto: " + papelaria1.getNome());
        System.out.println("Preço: " + papelaria1.getPreco_unitario());
        System.out.println("--------------------------------------------");
        System.out.println("Produto: " + papelaria2.getNome());
        System.out.println("Preço: " + papelaria2.getPreco_unitario());
        System.out.println("--------------------------------------------");
        System.out.println("Produto: " + papelaria3.getNome());
        System.out.println("Preço: " + papelaria3.getPreco_unitario());
        System.out.println("Data: " + LocalDate.now());
    }

}
