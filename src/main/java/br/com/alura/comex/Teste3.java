package br.com.alura.comex;

public class Teste3 {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular");
        produto.setDescricao("Sansung S23");
        produto.setPrecoUnitario(7000.00);
        produto.setQuantidade(100);

//Card 4

        System.out.println(produto);
    }
}
