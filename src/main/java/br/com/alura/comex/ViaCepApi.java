package br.com.alura.comex;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class ViaCepApi {
    public static ViaCepResponse getAddr (String cep) throws IOException, InterruptedException {
        String url = String.format("https://viacep.com.br/ws/%s/json/", cep);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        return gson.fromJson(response.body(), ViaCepResponse.class);
    }
}
