package br.com.alura.comex;

public class Teste2 {
    public static void main(String[] args) {
        Produto produtoA = new Produto("Celular");
        produtoA.setDescricao("Aparelho de comunicação");
        produtoA.setPrecoUnitario(1500.00);
        produtoA.setQuantidade(1000);

        Produto produtoB = new Produto("Celular");
        produtoB.setDescricao("Aparelho de comunicação");
        produtoB.setPrecoUnitario(1500.00);
        produtoB.setQuantidade(1000);

//Card 3
//Resultado ao compararmos as suas referências = false
        System.out.println(produtoA == produtoB);
    }
}
