package br.com.alura.comex;

import java.io.IOException;

public class TestaIntegracaoViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(ViaCepApi.getAddr("70660086"));
    }
}
