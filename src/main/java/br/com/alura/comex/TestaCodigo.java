package br.com.alura.comex;

import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.modelo.Endereco;
import br.com.alura.comex.modelo.Produto;

public class TestaCodigo {

    public static void main(String[] args) {

        Produto celular = new Produto("Samsung S12");

        System.out.println(celular);
        System.out.println("\n");

        Cliente aluno = new Cliente("Ana",
                "999.999.999-00",
                "aluno@email.com",
                "",
                new Endereco("Sao Paulo",
                    "Sao Paulo",
                    "SP",
                    "Rua Sem nome",
                    10));

        System.out.println(aluno);
    }
}
