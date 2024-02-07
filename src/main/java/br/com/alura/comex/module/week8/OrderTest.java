package br.com.alura.comex.module.week8;

import br.com.alura.comex.module.week7.Client;
import org.w3c.dom.ls.LSOutput;

public class OrderTest {
    public static void main(String[] args) {
        Client newClient1 = new Client("Rogério", "111.111.111-11");
        Client newClient2 = new Client("Milena", "222.222.222-22");
        Client newClient3 = new Client("Geraldo", "333.333.333-33");
        Order newOrder1 = new Order(1, newClient1, 39.99, 3);
        Order newOrder2 = new Order(2, newClient2, 22.50, 2);
        Order newOrder3 = new Order(3, newClient3, 59.99, 1);

        System.out.println(newOrder1 + "\n");
        System.out.println(newOrder2 + "\n");
        System.out.println(newOrder3 + "\n");
    }
}