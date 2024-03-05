package br.com.alura.comex;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class ViaCepService {
    public static ViaCepResponse getAddr (String cep) throws IOException, InterruptedException {
        String url = String.format("https://viacep.com.br/ws/%s/json/", cep);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        if (response.statusCode() == 400) {
            throw new RuntimeException("O cep informado é inválido");
        } else if (response.statusCode() == 404) {
            throw new RuntimeException("A url informada é inválida");
        } else if (response.statusCode() == 200) {
            JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
            if (jsonResponse.has("erro") && jsonResponse.get("erro").getAsBoolean()) {
                throw new RuntimeException("CEP não encontrado na base de dados");
            }
        }
        return gson.fromJson(response.body(), ViaCepResponse.class);


        
    }
}