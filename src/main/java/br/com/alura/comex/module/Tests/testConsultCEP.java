package br.com.alura.comex.module.Tests;

import br.com.alura.comex.module.Classes.Address;
import br.com.alura.comex.module.Classes.CEP.ConsultCEP;

import java.util.Scanner;

public class testConsultCEP {
    public static void main(String[] args) {
        Scanner catchAwsner = new Scanner(System.in);
        ConsultCEP consulting = new ConsultCEP();

        System.out.println("enter CEP code to search");
        var cepSearch = catchAwsner.nextLine();
        try {
            Address testCEP = consulting.findCEP(cepSearch);
            System.out.println("Address found:");
            System.out.println(testCEP);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Ending try");
        }

    }
}
