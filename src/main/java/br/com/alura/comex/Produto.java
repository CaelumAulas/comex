package br.com.alura.comex;

public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (this.nome == null){
            System.out.println("O nome do produto não pode ser vazio!!!");
        } else {
            this.nome = nome;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
