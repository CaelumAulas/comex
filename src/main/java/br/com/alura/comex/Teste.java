package br.com.alura.comex;

public class Teste {
    public static void main(String[] args) {

        Produto celular = new Produto();
        celular.nome = "Iphone 15";
        celular.descricao = "Celular com ótimo desempenho!";
        celular.precoUnitario = 6000.00;
        celular.quantidade = 500;

//Apresentação das propriedades no console da IDE
        System.out.println("Nome: " + celular.nome);
        System.out.println("Descrição: " + celular.descricao);
        System.out.println("R$" + celular.precoUnitario);
        System.out.println("Qunatidade: " + celular.quantidade);
    }


}
