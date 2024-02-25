package org.example.OutraParte.src.store;

import org.example.OutraParte.src.Customers.Client;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
public class Order implements Comparable<Order>{
    private long ID;
    private Client client;
    private double price;
    private int quantity;
    private LocalDateTime date;

    public Order(){

        this.date = LocalDateTime.now();
    }

    public Order(Client client,double price,int quantity){
        Objects.requireNonNull(client,"NOT NULL CLIENT");
        this.ID = ThreadLocalRandom.current().nextLong();
        this.client = client;
        this.price = price;
        this.quantity = quantity;
        this.date = LocalDateTime.now();



    }
    public long getID(){
        return ID;

    }
    public void setID(long ID){
        this.ID = ID;

    }
    public Client getClient(){
        return client;

    }
    public void setClient(Client client){
        this.client = client;

    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public LocalDateTime getDate(){
        return date;
    }

    public boolean isCheaperThan(Order order){
        if(this.price>order.price){
            return true;
        }else{
            return false;

        }

    }
    public BigDecimal Amount (){
        BigDecimal price = BigDecimal.valueOf(this.price);
        BigDecimal quantity = BigDecimal.valueOf(this.quantity);
        BigDecimal ValuesPrice =price.multiply(quantity);
        return ValuesPrice;

    }

    public boolean isMoreExpensiveThan(Order order){
        if(this.price<order.price){
            return true;
        }else{
            return false;

        }

    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", client=" + client +
                ", price=" + price +
                ", quantity=" + quantity +
                ", Amount=" + this.Amount() +
                ", Date=" + date.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) +
                '}';
    }

    @Override
    public int compareTo(Order order) {
        return this.Amount().compareTo(order.Amount());
    }
}
