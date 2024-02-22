package br.com.alura.comex;

public class TesteProdutos {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Melancia");
        produto1.setDescricao("Melancia Baby");
        produto1.setPrecoUnitario(10.5F);
        produto1.setQuantidade(3);

        Produto produto2 = new Produto("Banana");
        produto2.setDescricao("Banana Nanica");
        produto2.setPrecoUnitario(4.99F);
        produto2.setQuantidade(10);

        produto1.fichaProdutos();
        System.out.println("========================");
        produto2.fichaProdutos();
        System.out.println("========================");

        if (produto1 == produto2) {
            System.out.println("Produtos iguais!!!");
        } else {
            System.out.println("Produtos diferentes!!!");
        }
    }

}