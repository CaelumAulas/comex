package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private int id;
    private Cliente cliente;
    private Produto produto;
    private BigDecimal preco;
    private int quantidade;

    private LocalDate data;

    public Pedido() {
    };

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Pedido(int id, Cliente cliente, Produto produto, BigDecimal preco, int quantidade, LocalDate data) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", data=" + data +
                ", produto=" + produto +
                ", cliente=" + cliente +
                '}';
    }

    public static void fichaProduto(Pedido pedido) {
        System.out.println(">> Nome do produto: " + pedido.getProduto().getNome());
        System.out.println(">> Nome do cliente: " + pedido.getCliente().getNome());
        System.out.println(">> Preço: " + pedido.getPreco());
        System.out.println(">> Data: " + pedido.getData());
    }
}
