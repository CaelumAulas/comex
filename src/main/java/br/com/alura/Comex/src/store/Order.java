package store;

import InfosUser.Client;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
public class Order implements Comparable<Order>{
    private long ID;
    private Client client;
    private double price;
    private int quantity;

    public Order(Client client,double price,int quantity){
        Objects.requireNonNull(client,"NOT NULL CLIENT");
        this.ID = ThreadLocalRandom.current().nextLong();
        this.client = client;
        this.price = price;
        this.quantity = quantity;


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

    public boolean isCheaperThan(Order order){
        if(this.price>order.price){
            return true;
        }else{
            return false;

        }

    }
    public BigDecimal Amount (){
        BigDecimal b = new BigDecimal(price);
        return BigDecimal.valueOf(b.doubleValue());
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
                ", price=" + this.Amount() +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Order order) {
        return this.Amount().compareTo(order.Amount());
    }
}
