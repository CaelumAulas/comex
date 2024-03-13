package br.com.alura.comex;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIViaCEP {
    public static <ViaCepResponse> ViaCepResponse getAddress(String cep) throws IOException, InterruptedException {
        String url = String.format("https://viacep.com.br/ws/%s/json/", cep);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();

        if (response.statusCode() == 400) {
            throw new RuntimeException("cep inválido");
        } else if (response.statusCode() == 404) {
            throw new RuntimeException("url inválida");
        } else if (response.statusCode() == 200) {
            JsonObject viaCepResponse = gson.fromJson(response.body(), JsonObject.class);
            if (viaCepResponse.getCep() == null) {
                throw new RuntimeException("cep não encontrado");
            }
            return (ViaCepResponse) viaCepResponse;
        }
        throw new RuntimeException("erro desconhecido");
    }
}
