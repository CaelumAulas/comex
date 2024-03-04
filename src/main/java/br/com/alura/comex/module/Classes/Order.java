package br.com.alura.comex.module.Classes;

import br.com.alura.comex.module.Classes.Client;
import br.com.alura.comex.module.Classes.Product;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order implements Comparable<Order>{
    private int id;
    private Client client;
    private double price;
    private int amount = 1;

    private Product product;
    private LocalDate day;

    public Order(){

    }

    public Order(Product product, Client client, double price, int year, int month, int day){
        this.product = product;
        this.client = client;
        this.price = price;
        this.day = LocalDate.of(year,month,day);
    }

    public Order(Product product, Client client, double price,int amount, int year, int month, int day){
        this.product = product;
        this.client = client;
        this.price = price;
        this.amount = amount;
        this.day = LocalDate.of(year,month,day);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "\n\nProduct:" + product.getName() +
                "\nclient: " + client.getName() +
                "\nprice: R$:" + getTotalPrice() +
                "\nDate: " + day;
    }

    public boolean CheaperThan(Order otherOrder) {
        if (this.price < otherOrder.price) {
            return true;
        } else{
            return false;
        }
    }

    public boolean MoreExpensiveThan(Order otherOrder){
        if (this.price > otherOrder.price){
            return true;
        } else{
            return false;
        }
    }

    public BigDecimal getTotalPrice() {
        BigDecimal priceBigDecimal = BigDecimal.valueOf(this.price);
        BigDecimal amountBigDecimal = BigDecimal.valueOf(this.amount);
        return priceBigDecimal.multiply(amountBigDecimal);
    }

    @Override
    public int compareTo(Order otherOrder) {
        return this.getTotalPrice().compareTo(otherOrder.getTotalPrice());
    }

}
