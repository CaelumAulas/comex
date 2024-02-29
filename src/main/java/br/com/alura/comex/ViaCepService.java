package br.com.alura.comex;

import br.com.alura.comex.Endereco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ViaCepService {

    private static final String VIA_CEP_API_URL = "https://viacep.com.br/ws/";

    public Endereco buscarEnderecoPorCep(String cep) throws Exception {
        String urlString = VIA_CEP_API_URL + cep + "/json/";
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            connection.disconnect();
            return Endereco.fromJson(content.toString());
        } else {
            throw new Exception("Erro ao buscar endereço. Código de resposta: " + responseCode);
        }
    }
}
