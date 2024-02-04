package store;

import InfosUser.Client;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
public class Order {
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

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", client=" + client +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
