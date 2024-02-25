package store;

import java.util.Objects;

public class Product {
    // EX 06 VISIBILIDADE
    private String name;
    private String description;
    private double unitPrice;
    private int quantity;

    public Product(){


    }
    // EX 07 OBRIGATORIO FORNECER NOME
    public Product(String name){
        Objects.requireNonNull(name);
        this.name = name;

    }
    public Product(String name, String description, double cost,int quantity){
        Objects.requireNonNull(name," NAME NULL");
        Objects.requireNonNull(cost," COST NULL");
        Objects.requireNonNull(quantity, " QUANTITY NULL");
        this.name =name;
        this.description = description;
        this.unitPrice = cost;
        this.quantity = quantity;


    }

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public int getQuantity(){
        return quantity;

    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false ;
        if(this == obj)return true ;
        if(this.getClass() != obj.getClass())return false ;
        Product p = (Product) obj;
        return name!=null&& name.equals(p.name)&&unitPrice == p.unitPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,quantity,description, unitPrice);
    }
//EX 04
    @Override
    public String toString() {
        return "\n" +
                ">> store.Product data{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
