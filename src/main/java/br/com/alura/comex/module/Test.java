package br.com.alura.comex.module;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "garrafa";
        product1.description = "Serve para beber água";
        product1.unitPrice = 19.99;
        product1.amount = 5;

        Product product2 = new Product();
        product2.name = "";
        product2.description = "";
        product2.unitPrice = 4.50;
        product2.amount = 20;
    }
}
