package br.com.alura.comex.module.Classes.CEP;

import br.com.alura.comex.module.Classes.Address;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultCEP{
    public Address findCEP(String cep){
        URI address = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            RecordCEP recordCEP = new Gson().fromJson(response.body(), RecordCEP.class);

            if (recordCEP.cep() == null || recordCEP.street() == null ||
                    recordCEP.city() == null || recordCEP.uf() == null || recordCEP.district() == null){
                throw new RuntimeException("CEP code unavailable or not found");
            }
            return new Address(recordCEP);
        } catch (IOException | InterruptedException | JsonSyntaxException e) {
            throw new RuntimeException("Error in " + cep + ": " + e.getMessage());

        }
    }
}