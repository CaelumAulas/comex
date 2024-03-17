package br.com.alura.comex;

/*Depois de deixar a classe Produto com atributos privados,
foi preciso implementar os metodos get e set para fazer o
acesso a eles de forma segura. (contemplando o Card 6. */

public class Teste {
    public static void main(String[] args) {

        Produto celular = new Produto("Iphone 15");
        celular.setDescricao("Celular com ótimo desempenho!");
        celular.setPrecoUnitario(6000.00);
        celular.setQuantidade(500);
//Card 2
//Apresentação das propriedades no console da IDE
        System.out.println("Nome: " + celular.getNome());
        System.out.println("Descrição: " + celular.getDescricao());
        System.out.println("R$" + celular.getPrecoUnitario());
        System.out.println("Qunatidade: " + celular.getQuantidade());
    }
}
