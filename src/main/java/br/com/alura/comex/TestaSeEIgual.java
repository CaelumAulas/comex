package br.com.alura.comex;

import br.com.alura.comex.modelo.Produto;

public class TestaSeEIgual {

    public static void main(String[] args) {
        Produto celular1 = new Produto("Samsung S12");

        Produto celular2 = new Produto("Samsung S12");

        if (celular1.equals(celular2)){
            System.out.println("É igual");
        } else System.out.println("Não é igual");

    }
}
