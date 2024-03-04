package br.com.alura.comex;

import java.io.IOException;

public class Endereco {
    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String rua;
    private int numero;

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

    public void buscaEnderecoPorCep(String cep) throws IOException, InterruptedException {
        ViaCepResponse retorno = ViaCepApi.getAddr(cep);
        this.preencheEnderecoCompleto(retorno);
    }

    public void preencheEnderecoCompleto(ViaCepResponse model) {
        this.bairro = model.bairro();
        this.cidade = model.localidade();
        this.complemento = model.complemento();
        this.estado = model.uf();
        this.rua = model.logradouro();
    }
}
