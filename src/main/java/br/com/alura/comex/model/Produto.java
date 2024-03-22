package br.com.alura.comex.model;

import java.math.BigDecimal;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int qtd;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, String descricao, BigDecimal preco, int qtd) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto(int id, String nome, String descricao, BigDecimal preco, int qtd) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void show() {
        System.out.println(">> Dados do produto");
        System.out.println(":: Nome: " + this.nome);
        System.out.println(":: Descrição: " + this.descricao);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", desc='" + descricao + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}
