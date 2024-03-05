package br.com.alura.comex;

public class Produto {
    private String nome;
    private String descricao;
    private float precoUnico;
    private int quantidade;

    //Construtor da classe Produto que exige o nome como argumento
    public Produto(String nome, String descricao, float precoUnico, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnico = precoUnico;
        this.quantidade = quantidade;
    }

    //Métodos getters para acesso aos atributos
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPrecoUnico() {
        return precoUnico;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Métodos setters para modificação dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoUnico(float precoUnico) {
        this.precoUnico = precoUnico;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}