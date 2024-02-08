package br.com.alura.comex;

public class Produto {
    String nome;
    String desc;
    float preco;
    int qtd;

    public void show() {
        System.out.println(">> Dados do produto");
        System.out.println(":: Nome: " + this.nome);
        System.out.println(":: Descrição: " + this.desc);
    }
}
