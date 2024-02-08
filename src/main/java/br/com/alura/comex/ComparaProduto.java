package br.com.alura.comex;

public class ComparaProduto {

    public static void main(String[] args) {
        // Criando dois objetos da classe Produto
        Produto produto1 = new Produto("Camisa", "Camisa de algodão", 29.99f, 10);
        Produto produto2 = new Produto("Calça", "Calça jeans", 49.99f, 5);

        // Comparando as referências dos objetos
        if (produto1 == produto2) {
            System.out.println("Os produtos são iguais.");
        } else {
            System.out.println("Os produtos são diferentes.");
        }
    }
}
