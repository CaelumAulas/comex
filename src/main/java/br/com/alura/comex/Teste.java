package br.com.alura.comex;

public class Teste {
    public static void main(String[] args) {
        Produto teste1 = new Produto();
        Produto teste2 = new Produto();
        boolean comparacao = teste1 == teste2;
        teste1.setNome("Produto de teste");
        teste1.setDescricao("Esse produto é um teste");
        teste1.imprimirDados();
    }
}
