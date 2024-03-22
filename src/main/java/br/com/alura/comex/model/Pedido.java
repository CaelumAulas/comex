package br.com.alura.comex.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido implements Comparable<Pedido> {

    private int id;
    private String categoria;
    private Produto produto;
    private Cliente cliente;

    private BigDecimal preco;
    private int quantidade;

    private LocalDate data;

    public Pedido(int id, String categoria, Produto produto, Cliente cliente, BigDecimal preco, int quantidade, LocalDate data) {
        this.id = id;
        this.categoria = categoria;
        this.produto = produto;
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public int getId() {
        return id;
    }

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
                ", produto='" + produto.getNome() + '\'' +
                ", cliente='" + cliente.getNome() + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", data=" + data +
                ", valorTotal=" + this.getValorTotal() +
                '}';
    }

    public boolean isMaisBaratoQue(Pedido outroPedido) {
        return this.getValorTotal().compareTo(outroPedido.getValorTotal()) < 0;
    }

    public boolean isMaisCaroQue(Pedido outroPedido) {
        return this.getValorTotal().compareTo(outroPedido.getValorTotal()) > 0;
    }

    public BigDecimal getValorTotal() {
        return this.preco.multiply(BigDecimal.valueOf(this.quantidade));
    }

    @Override
    public int compareTo(Pedido outroPedido) {
        return this.getValorTotal().compareTo(outroPedido.getValorTotal());
    }
}