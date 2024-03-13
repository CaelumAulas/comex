package br.com.alura.comex;

import br.com.alura.comex.api.ViaCEPService;
import br.com.alura.comex.api.record.ViaCEPResponse;

public class Endereco {
    private String cep;
    private String bairro;
    private String logradouro;
    private String complemento;
    private String localidade;
    private String uf;

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }

    public Endereco(String cep){
        this.cep = cep;
    }

    private void buscaEnderecoPorCep(String cep) {
        ViaCEPResponse viaCepResponse = ViaCEPService.busca(cep);
        this.preencheEnderecoCompleto(viaCepResponse);
    }
    private void preencheEnderecoCompleto(ViaCEPResponse viaCEPResponse) {
        this.uf = viaCEPResponse.uf();
        this.bairro = viaCEPResponse.bairro();
        this.localidade = viaCEPResponse.localidade();
        this.complemento = viaCEPResponse.complemento();
        this.cep = viaCEPResponse.cep();
        this.logradouro = viaCEPResponse.logradouro();
    }


}
