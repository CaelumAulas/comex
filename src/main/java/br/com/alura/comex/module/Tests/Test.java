package br.com.alura.comex.module.Tests;

import br.com.alura.comex.module.Classes.Address;
import br.com.alura.comex.module.Classes.Client;
import br.com.alura.comex.module.Classes.Product;

public class Test {

    public static String TestBiggerSmaller(double productA, double productB){
        if (productA > productB){
            return "The first product is bigger than second";
        } else if (productA < productB) {
            return "The first product is smaller than second";
        } else if (productA == productB) {
            return "The both is equals";
        } else {
            return"ERROR";
        }
    }

    public static void main(String[] args) {
        Product bottle = new Product();
        bottle.setName("bottle");
        bottle.setDescription("Used to drinking water or other liquids");
        bottle.setUnitPrice(19.99);
        bottle.setAmount(5);

        Product fork = new Product("Fork",
                "Used to eat food",
                4.50,
                20);

        System.out.println(bottle.toString() + "\n");
        System.out.println(fork.toString() + "\n");

        double bottlePrice = bottle.getGrossValue();
        double forkPrice = fork.getGrossValue();
        System.out.println(TestBiggerSmaller(bottlePrice, forkPrice) + "\n");

        boolean productsEquals = (bottle == fork);
        System.out.println(productsEquals + "\n");

        Address clientAddress = new Address();
        clientAddress.setDistrict("Vila Mariana");
        clientAddress.setCity("São Paulo");
        clientAddress.setComplement("Centro Empresarial Santa Júlia");
        clientAddress.setState("São Paulo");
        clientAddress.setStreet("Street Vergueiro");
        clientAddress.setNumber(3185);
        System.out.println(clientAddress.toString() + "\n");

        Client newClient = new Client("Ricardo",
                "999.999.999-99",
                "ricardão99@gmail.com",
                "Desenvolvedor Java",
                "99 99999-9999",
                clientAddress);

        Client newClient2 = new Client("João",
                "222.222.222-22");
        System.out.println(newClient.toString() + "\n");
        System.out.println(newClient2.toString() + "\n");


    }

}
