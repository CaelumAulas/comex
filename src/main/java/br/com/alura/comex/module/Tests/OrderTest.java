package br.com.alura.comex.module.Tests;

import br.com.alura.comex.module.Classes.Client;
import br.com.alura.comex.module.Classes.Product;
import br.com.alura.comex.module.Classes.Order;

public class OrderTest {
    public static void main(String[] args) {
        Product newProduct1 = new Product("box");
        Product newProduct2 = new Product("Fork");
        Product newProduct3 = new Product("Paper");
        Client newClient1 = new Client("Rogério", "111.111.111-11");
        Client newClient2 = new Client("Milena", "222.222.222-22");
        Client newClient3 = new Client("Geraldo", "333.333.333-33");
        Order newOrder1 = new Order(newProduct1,newClient1,12,2015,05,03);
        Order newOrder2 = new Order(newProduct2,newClient2,25.99,2018,03,04);
        Order newOrder3 = new Order(newProduct3,newClient3,30.45,2023,01,31);

        System.out.println(newOrder1 + "\n");
        System.out.println(newOrder2 + "\n");
        System.out.println(newOrder3 + "\n");

        System.out.println(newOrder1.getTotalPrice());
        System.out.println(newOrder1.CheaperThan(newOrder2));
        System.out.println(newOrder1.MoreExpensiveThan(newOrder2));
    }
}