package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
    private int id;

    private String categoria;
    private Produto produto;
    private Cliente cliente;

    private BigDecimal preco;
    private int quantidade;


    private LocalDate data;

    public Pedido(int id, Cliente cliente, BigDecimal preco, int quantidade, Produto produto, LocalDate data) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public Pedido(int id, String categoria, Produto produto, Cliente cliente, BigDecimal preco, int quantidade, LocalDate data) {
        this.categoria = categoria;
        this.produto = produto;
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getNomeProduto() {
        return produto.getNome();
    }

    public String getNomeCliente() { return cliente.getNome();}


    public String getCategoria() {
        return categoria;
    }

    public Produto getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "categoria='" + categoria + '\'' +
                ", produto='" + produto + '\'' +
                ", cliente='" + cliente + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", data=" + data +
                '}';
    }

}