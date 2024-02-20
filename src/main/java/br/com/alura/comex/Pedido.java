package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private int id;
    private Cliente cliente;
    private BigDecimal preco;
    private int quantidade;

    private Produto produto;
    private LocalDate data;

    public Pedido() {
    };

    public Pedido(int id, Cliente cliente, BigDecimal preco, int quantidade, Produto produto, LocalDate data) {
        this.id = id;
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
        this.produto = produto;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}