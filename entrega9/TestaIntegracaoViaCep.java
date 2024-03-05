import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TestaIntegracaoViaCep {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu CEP: ");

        var digita = leitura.nextLine();

        String add = "https://viacep.com.br/ws/" + digita + "/json";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(add)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);

        Gson gson = new Gson();
        Endereco meuEndereco = gson.fromJson(json, Endereco.class);
        System.out.println(meuEndereco);

    }
}
