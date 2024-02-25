package org.example.OutraParte.src.InfosUser;

import org.example.OutraParte.src.ExceptionsJson.ZipCodeError;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface AddressSearch {


    public static String Search(String zipCode){
        String jsonSalvo = "";
        try {

            if(zipCode.length()!=8){

                throw new ZipCodeError("Entering the wrong zip code");


            }

            URI uri = URI.create("https://viacep.com.br/ws/"+zipCode+"/json/");
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            jsonSalvo = response.body();

        }catch (IOException ex){
            System.out.println(ex.getMessage());

        }catch (InterruptedException | ZipCodeError ex){

            System.out.println(ex.getMessage());


        }finally {
            return jsonSalvo;

        }


    }
}
