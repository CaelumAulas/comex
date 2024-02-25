package org.example.OutraParte.src.Products;

public class TestProduct {
    public static void main(String[] args) {
        Product product = new Product("TV",2500);
        ProductService service = new ProductService(product);
        //service.register();
        service.delete(2);
        service.update("TV",3);
        for (Product mostra: service.Products()){
            System.out.println(mostra);

        }


    }
}
