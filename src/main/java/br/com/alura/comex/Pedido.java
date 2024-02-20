package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private int id;
    private Cliente cliente;
    private BigDecimal preco;
    private int quantidade;

    public Pedido() {
    };

    public Pedido(int id, Cliente cliente, BigDecimal preco, int quantidade) {
        this.id = id;
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}