package ST_Comex;

public class produto {
    private String nome;
    private String descricao;
    private double preco_unitario;
    public int quantidade;

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

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }
    public void exibeDados() {
        System.out.println(">> Dados do produto");
        System.out.println("-------------------------------------");
        System.out.println(":: Nome: " + nome);
        System.out.println(":: Descrição: " + descricao);
        System.out.println("-------------------------------------");
    }
}
