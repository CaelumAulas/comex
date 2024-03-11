package br.com.alura.comex.Principal;



import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException, InterruptedException {

        int numero;

        Scanner leitura = new Scanner(System.in);



            System.out.println("Digite um número:");
            numero = leitura.nextInt();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://fakestoreapi.com/products/" + numero)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());



    }
}
