package br.com.alura.comex.modelo;

public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    int quantidade;

    @Override
    public String toString () {
        return ">> Dados do Produto <<" + "\n" +
                "Nome: " + nome + "\n" +
                "Valor: R$" + precoUnitario + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Descrição: " + descricao + "\n";
    }
}