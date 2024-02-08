package br.com.alura.comex;

public class Cliente {
    String nome;
    String cpf;
    String email;
    String profissao;
    String telefone;
    Endereco endereco;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
}
