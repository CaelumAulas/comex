package br.com.alura.comex;

public class Produto {
    private String nome;
    private String descricao;
    private float precoUnitario;
    private int quantidade;

    // Construtor da classe Produto
    public Produto(String nome, String descricao, float precoUnitario, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    // Métodos para acessar os atributos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para apresentar as propriedades do produto no console
    public void imprimirDados() {
        System.out.println(">> Dados do produto");
        System.out.println(":: Nome: " + nome);
        System.out.println(":: Descrição: " + descricao);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Produto
        Produto produto = new Produto("Livro", "Conjunto de folhas impressas.", 39.99f, 15);
        produto.imprimirDados();
    }
}
