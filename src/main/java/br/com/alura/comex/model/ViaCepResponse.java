package br.com.alura.comex.model;

public record ViaCepResponse(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
}

