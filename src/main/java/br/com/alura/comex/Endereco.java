package br.com.alura.comex;

public class Endereco {

    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String rua;
    private int numero;

    public Endereco(String cep) {
        buscaEnderecoPorCep(cep);
    }

    public void buscaEnderecoPorCep(String cep) {
        try {
            APIViaCepResponse retorno = APIViaCep.getAddress(cep);
            preencheEnderecoCompleto(retorno);
        } catch (Exception e) {
            System.out.println("Erro ao buscar o endereço pelo CEP: " + e.getMessage());
        }
    }

    public void preencheEnderecoCompleto(APIViaCepResponse retorno) {
        this.bairro = retorno.bairro();
        this.cidade = retorno.localidade();
        this.complemento = retorno.complemento();
        this.estado = retorno.uf();
        this.rua = retorno.logradouro();
    }

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
}
