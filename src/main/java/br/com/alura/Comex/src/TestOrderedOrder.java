package org.example.OutraParte.src;


import org.example.OutraParte.src.Customers.Client;
import org.example.OutraParte.src.store.Order;

import java.util.*;

class TestDisorderly implements Comparator<Order>{


    @Override
    public int compare(Order o1, Order o2) {
        return 0;
    }
}
public class TestOrderedOrder {
    public static void main(String[] args) {
        Client client = new Client("RAFAEL","22233366655");
        Client client1 = new Client("ARMALDO","33399977754");
        Client client2= new Client("RAFAEL","66677895265");
        Order order = new Order(client,205.5,5);
        Order order2 = new Order(client1,432,8);
        Order order3 = new Order(client2,123,9);
        Order order4 = new Order(client2,54,9);
        Order order5 = new Order(client2,1,9);
        List<Order> orders =  Arrays.asList(order,order2,order3,order4,order5);
        Collections.sort(orders);
        for(Order or:orders){
            System.out.println(or);


        }
        System.out.println("--------------------reversed------------------------");
        for(Order or:orders.reversed()){
            System.out.println(or);


        }

    }
}
