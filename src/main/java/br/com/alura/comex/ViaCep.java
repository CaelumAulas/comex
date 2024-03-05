package br.com.alura.comex;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCep {
    public static ViaCepResponse buscaEnderecoPorCep(String cep) {
        if (cep == null){
            throw new RuntimeException("O Cep não pode ser vazio");
        }

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            if (responseBody.contains("erro")) {
                throw new IllegalArgumentException("CEP inválido: " + cep);
            }

            Gson gson = new Gson();
            return gson.fromJson(responseBody, ViaCepResponse.class);
        } catch (ConnectException e) {
            throw new RuntimeException("400 - Bad Request");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Algo de errado aconteceu com o CEP digitado");
        } catch (JsonSyntaxException e){
            throw new RuntimeException("CEP Não encontrado.");
        }
    }

}

