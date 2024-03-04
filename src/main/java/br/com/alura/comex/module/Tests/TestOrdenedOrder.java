package br.com.alura.comex.module.Tests;

import br.com.alura.comex.module.Classes.Client;
import br.com.alura.comex.module.Classes.Product;
import br.com.alura.comex.module.Classes.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestOrdenedOrder {

    public static void ForArray(){

    }
    public static void main(String[] args) {
        Product newProduct1 = new Product("box");
        Product newProduct2 = new Product("Fork");
        Product newProduct3 = new Product("Paper");
        Product newProduct4 = new Product("Image");
        Product newProduct5 = new Product("Wallpaper");

        Client newClient1 = new Client("Rogério", "111.111.111-11");
        Client newClient2 = new Client("Milena", "222.222.222-22");
        Client newClient3 = new Client("Geraldo", "333.333.333-33");
        Client newClient4 = new Client("Macio","444.444.444-44");
        Client newclient5 = new Client("Dalva","555.555.555-55");

        Order newOrder1 = new Order(newProduct1,newClient1,12,2015,05,03);
        Order newOrder2 = new Order(newProduct2,newClient2,25.99,2018,03,04);
        Order newOrder3 = new Order(newProduct3,newClient3,30.45,2023,01,31);
        Order newOrder4 = new Order(newProduct4,newClient4,0.49,2024,03,15);
        Order newOrder5 = new Order(newProduct5,newclient5,30,2,2017,07,01);

        ArrayList<Order> arrayOrders = new ArrayList<Order>();
        arrayOrders.add(newOrder1);
        arrayOrders.add(newOrder3);
        arrayOrders.add(newOrder2);
        arrayOrders.add(newOrder4);
        arrayOrders.add(newOrder5);

        //Ordened for Total Price
        Collections.sort(arrayOrders);
        System.out.println(arrayOrders);

        System.out.println("--------------//--------------");

        //Ordened for Total Price reversed
        arrayOrders.sort(Comparator.comparing(Order::getTotalPrice).reversed());
        System.out.println(arrayOrders);
    }
}
