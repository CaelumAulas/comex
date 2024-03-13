package br.com.alura.comex;

import br.com.alura.comex.api.ViaCEPService;
import br.com.alura.comex.api.record.ViaCEPResponse;

import java.util.Scanner;

public class TestaViaCEP {
    public static void main(String[] args){
        try {
            String cep = "60175230";

            ViaCEPResponse viaCepResponse = ViaCEPService.busca(cep);

            System.out.println(">> Dados do endereço");
            System.out.printf("""
                    CEP: %s
                    Logradouro: %s
                    Complemento: %s
                    Bairro: %s
                    Localidade: %s
                    UF: %s
                    """, viaCepResponse.cep(), viaCepResponse.logradouro(),viaCepResponse.complemento(),viaCepResponse.bairro(),viaCepResponse.localidade(),viaCepResponse.uf());

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("== FIM DO PROGRAMA ===");
    }

}