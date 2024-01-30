package br.com.alura.comex.module;

public class Product {
    private String name;
    private String description;
    private double unitPrice;
    private int amount;

    public Product(){
        this.name = "Unnamed";
        this.description = "Without description";
        this.unitPrice = 0;
        this.amount = 0;
    }

    public Product(String name, String description, double unitPrice, int amount){
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public String getName() {
        return "Name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Description: " + description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitPrice() {
        return "UnitPrice: " + unitPrice;
    }

    public double getGrossValue(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAmount() {
        return "Amount: " + amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFullDescription(){
        return "Name: " + name +
                "\nDescription: " + description +
                "\nUnitPrice: " + unitPrice +
                "\nAmount: " + amount;
    }

}