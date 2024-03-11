package br.com.alura.comex.Principal;

import java.util.Scanner;

public class ImprimirNumero {
    public static void main(String[] args) {

        int numero;

        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("Digite um número:");
            numero = leitura.nextInt();
            System.out.println("O número digitado foi o: " + numero);
        } catch (Exception e){
            System.out.println("O valor digitado não foi um número!");
        }
    }
}
