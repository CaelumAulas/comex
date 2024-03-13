package br.com.alura.comex;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIViaCep {
    public static APIViaCepResponse getAddress(String cep) throws IOException, InterruptedException {
        String url = String.format("https://viacep.com.br/ws/%s/json/", cep);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException("Falha ao conectar com a API ViaCEP", e);
        }

        if (response.statusCode() == 400) {
            throw new IllegalArgumentException("CEP inválido: " + cep);
        } else if (response.statusCode() != 200) {
            throw new RuntimeException("Erro ao consultar o CEP: " + response.statusCode());
        }

        Gson gson = new Gson();
        APIViaCepResponse viaCepResponse = gson.fromJson(response.body(), APIViaCepResponse.class);

        if (response.body().contains("\"erro\": true")) {
            throw new RuntimeException("CEP não encontrado: " + cep);
        }

        return viaCepResponse;
    }
}
