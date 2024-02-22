package br.com.alura.comex;

public class Endereco {
    private String Bairro;
    private String Cidade;
    private String Complemento;
    private String Estado;
    private String Rua;
    private int Número;

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public int getNúmero() {
        return Número;
    }

    public void setNúmero(int número) {
        Número = número;
    }
}
