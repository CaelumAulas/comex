package br.com.alura.comex;

import br.com.alura.comex.Identificacoes.Identificacao;

public class Livro extends Produto implements Identificacao {
    private String isbn;
    private int totalDePaginas;

    public Livro(String nome, String descricao, double precoUnitario, int quantidade, String isbn, int totalDePaginas) {
        super(nome, descricao, precoUnitario, quantidade);
        this.isbn = isbn;
        this.totalDePaginas = totalDePaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    @Override
    public String getIdentificacao() {
        return "O nome do Livro é: " + this.getNome() + " e o ISBN é: " + this.getIsbn();
    }
}
