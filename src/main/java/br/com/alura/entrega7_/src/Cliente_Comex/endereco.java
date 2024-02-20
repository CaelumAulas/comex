package Cliente_Comex;

public class endereco {
    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String rua;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void exibeEndereco() {
        System.out.println(">> Dados do envio");
        System.out.println("-------------------------------------");
        System.out.println(":: Bairro: " + bairro);
        System.out.println(":: Cidade: " + cidade);
        System.out.println(":: Complemento: " + complemento);
        System.out.println(":: Estado: " + estado);
        System.out.println(":: Rua: " + rua);
        System.out.println(":: Número: " + numero);
        System.out.println("-------------------------------------");
    }
}
