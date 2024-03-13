package br.com.alura.comex;

import java.io.IOException;

public class TestaIntegracaoViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            System.out.println(APIViaCep.getAddress("71680349"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
