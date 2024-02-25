package org.example.OutraParte.src;



import org.example.OutraParte.src.InfosUser.Address;
import org.example.OutraParte.src.Customers.Client;
import org.example.OutraParte.src.Products.Product;

public class Store {
    public static void main(String[] args) {
        // EX 01 E 02
        Product product = new Product("Caneta","Caneta bic",3.50,3);
        Product product2 = new Product("Caneta","Caneta bic",1.50,3);

        System.out.println(product.toString());


        //EX 03
        if(product.equals(product2)){

            System.out.println("É IGUAL");
        }else {

            System.out.println("DIFERENTE");


        }
        //EX 04
        Product Book = new Product("Harry Potter",
                "The novels follow Harry Potter,\nan 11-year-old boy who discovers \nhe is the son of famous wizards",1.50,3);
        System.out.println("NAME:"+ Book.getName()+" \nDESCRIPTION: "+Book.getDescription());
//EX 07
        Address address = new Address("sla","s","y","s","o",367);

        Client client = new Client("rafel","21431","adajnd","dbjajbd","adddadas",address);
        System.out.println(client.toString());


    }
}