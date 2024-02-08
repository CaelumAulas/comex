package br.com.alura.comex;

public class TesteComparacao {
    public static void main(String[] args) {
        Produto teste1 = new Produto();
        Produto teste2 = new Produto();
        boolean comparacao = teste1 == teste2;
        System.out.println(comparacao);
    }

}
