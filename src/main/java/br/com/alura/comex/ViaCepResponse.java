package br.com.alura.comex;

public record ViaCepResponse(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
}

