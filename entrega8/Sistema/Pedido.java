package Sistema;
import java.time.LocalDate;

public class Pedido {
    private int id;
    private Cliente cliente;
    private double preco;
    private int quantidade;
    private LocalDate data;

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
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

    public boolean Pedido pedidoMaisBarato(Pedido pedidos) {

    }

    public boolean Pedido pedidoMaisCaroQue(Pedido pedidos) {

    }

    public BigDecimal Pedido getValorTotal(Pedido pedido) {

    }
}
