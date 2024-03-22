package br.com.alura.comex.main;

import br.com.alura.comex.service.ViaCepApi;

import java.io.IOException;

public class TestaIntegracaoViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            System.out.println(ViaCepApi.getAddr("99999999999"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
