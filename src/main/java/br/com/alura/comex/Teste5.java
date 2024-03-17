package br.com.alura.comex;
//Card 7 - instância de Produto obrigando o usuário
// a fornecer um nome.

public class Teste5 {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno");
        System.out.println(produto.getNome());
    }
}
