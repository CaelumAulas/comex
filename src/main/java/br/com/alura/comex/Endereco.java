package br.com.alura.comex;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco(String cep) {
        if (cep == null) {
            throw new RuntimeException("O CEP não pode ser nulo!");
        }

        if (cep.isEmpty()) {
            throw new RuntimeException("O CEP não pode ser vazio!");
        }

        if (cep.length() != 8) {
            throw new RuntimeException("Formato do CEP inválido!");
        }

        this.buscaEnderecoPorCep(cep);
    }

    private void buscaEnderecoPorCep(String cep) {
        ViaCepResponse viaCepResponse = ViaCep.buscaEnderecoPorCep(cep);
        this.preencheEnderecoCompleto(viaCepResponse);
    }

    private void preencheEnderecoCompleto(ViaCepResponse viaCepResponse) {
        this.uf = viaCepResponse.uf();
        this.bairro = viaCepResponse.bairro();
        this.localidade = viaCepResponse.localidade();
        this.complemento = viaCepResponse.complemento();
        this.cep = viaCepResponse.cep();
        this.logradouro = viaCepResponse.logradouro();
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}

