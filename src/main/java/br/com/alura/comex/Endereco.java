package br.com.alura.comex;

public class Endereco {
    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;


    public String getRua() {
        return rua;
    }

    private String rua;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private int numero;



    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public Endereco(String bairro, String cidade, String complemento, String estado, String rua, int numero) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }
}
