package br.com.alura.comex.module.week8;

import br.com.alura.comex.module.week7.Client;

public class Order {
    private int id;
    private Client client;
    private double price;
    private int amount;

    public Order(int id, Client client, double price, int amount){
        this.id = id;
        this.client = client;
        this.price = price;
        this.amount = amount;
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
        return "id:" + id +
                "\nclient:\n'" + client + "'" +
                "\nprice: " + price +
                "\namount: " + amount;
    }


    public boolean CheaperThan(Pedido outroPedido) {

    }

    public boolean MoreExpensiveThan(Pedido outroPedido) {

    }

    public BigDecimal getValorTotal() {

    }
}
