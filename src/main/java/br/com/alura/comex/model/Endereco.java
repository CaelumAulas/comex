package br.com.alura.comex.model;

import br.com.alura.comex.service.ViaCepApi;

import java.io.IOException;

public class Endereco {
    private String cep;
    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String rua;
    private int numero;

    public Endereco(String cep) {
        buscaEnderecoPorCep(cep);
    }
    public String getCep() {
        return cep;
    }
    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void buscaEnderecoPorCep(String cep) {
        try {
            ViaCepResponse retorno = ViaCepApi.getAddr(cep);
            this.preencheEnderecoCompleto(retorno);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void preencheEnderecoCompleto(ViaCepResponse model) {
        this.cep = model.cep();
        this.bairro = model.bairro();
        this.cidade = model.localidade();
        this.complemento = model.complemento();
        this.estado = model.uf();
        this.rua = model.logradouro();
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }
}
