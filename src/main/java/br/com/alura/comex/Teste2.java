package br.com.alura.comex;

public class Teste2 {
    public static void main(String[] args) {
        Produto produtoA = new Produto();
        produtoA.nome = "Celular";
        produtoA.descricao = "Aparelho de comunicação";
        produtoA.precoUnitario = 1500.00;
        produtoA.quantidade = 1000;

        Produto produtoB = new Produto();
        produtoB.nome = "Celular";
        produtoB.descricao = "Aparelho de comunicação";
        produtoB.precoUnitario = 1500.00;
        produtoB.quantidade = 1000;
//Resultado ao compararmos as suas referências = false
        System.out.println(produtoA == produtoB);
    }
}
