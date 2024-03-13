package br.com.alura.comex.api;

import br.com.alura.comex.api.record.ViaCEPResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCEPService {
    public static ViaCEPResponse busca(String cep){
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(endereco)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 400) {
                throw new RuntimeException("Formato do endereço incorreto. Verifique o seu endereço ou parâmetro");
            }
            Gson gson = new Gson();
            ViaCEPResponse enderecoResponse = gson.fromJson(response.body(), ViaCEPResponse.class);
            return enderecoResponse;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (JsonSyntaxException e){
            throw new RuntimeException("CEP Não encontrado.");
        }
    }
}
