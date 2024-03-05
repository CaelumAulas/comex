package br.com.alura.comex;

public class TestaEndereco {
    public static void main(String[] args) {
        String cep = "01001000";

        Endereco endereco = new Endereco(cep);

        System.out.println(endereco);


    }
}
