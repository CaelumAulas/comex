package br.com.alura.comex;

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
