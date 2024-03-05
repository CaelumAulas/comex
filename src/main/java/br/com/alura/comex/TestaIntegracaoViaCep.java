package br.com.alura.comex;
import java.util.Scanner;

public class TestaIntegracaoViaCep {
    public static void main(String[] args) {

        System.out.println(">> BEM VINDO AO BUSCA CEP <<");
        Scanner scanner = new Scanner(System.in);

        System.out.println(">> INSIRA O CEP ESCOLHIDO: ");
        String cep = scanner.next();

        ViaCep buscaCep = new ViaCep();
        ViaCepResponse endereco = buscaCep.buscaEnderecoPorCep(cep);
        System.out.println(endereco);

    }
}
