package br.com.alura.comex.api.record;

public record ViaCEPResponse(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
}
