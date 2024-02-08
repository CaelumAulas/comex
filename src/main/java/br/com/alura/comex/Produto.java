package br.com.alura.comex;

public class Produto {
    private String nome;
    private String desc;
    private float preco;
    private int qtd;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void show() {
        System.out.println(">> Dados do produto");
        System.out.println(":: Nome: " + this.nome);
        System.out.println(":: Descrição: " + this.desc);
    }
}
