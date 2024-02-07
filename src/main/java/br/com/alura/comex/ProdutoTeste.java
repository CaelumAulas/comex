package br.com.alura.comex;

public class ProdutoTeste {

    public static void main(String[] args) {
        // Criação de dois produtos com os mesmos valores
        Produto produto1 = new Produto("Café", "Café moído premium", 15.50, 10);
        Produto produto2 = new Produto("Café", "Café moído premium", 15.50, 10);

        // Comparação das referências dos objetos
        boolean saoIguais = produto1 == produto2;

        System.out.println("Sao iguais? " + saoIguais);
    }
}
