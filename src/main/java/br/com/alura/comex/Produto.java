package br.com.alura.comex;

public class Produto{
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;

    }

    public Produto(String nome) {
        this.nome = nome;
    }

    //Método para imprimir os dados do produto
     public void imprimirDados(){
            System.out.println(">> Dados do produto");
            System.out.println(":: Nome: " + getNome());
            System.out.println(":: Descrição: " + getDescricao());
        }

}
