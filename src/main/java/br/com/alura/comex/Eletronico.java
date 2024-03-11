package br.com.alura.comex;

public class Eletronico extends Produto{
    private int voltagem;
    private int potencia;

    public Eletronico(String nome, String descricao, double precoUnitario, int quantidade, int voltagem, int potencia) {
        super(nome, descricao, precoUnitario, quantidade);
        this.voltagem = voltagem;
        this.potencia = potencia;
    }
}
