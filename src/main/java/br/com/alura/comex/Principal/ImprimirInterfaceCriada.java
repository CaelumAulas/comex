package br.com.alura.comex.Principal;

import br.com.alura.comex.Cliente;
import br.com.alura.comex.Endereco;
import br.com.alura.comex.Livro;

public class ImprimirInterfaceCriada {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setCidade("São Paulo");
        endereco.setComplemento("Fundos");
        endereco.setEstado("SP");
        endereco.setRua("Ruas das flores");
        endereco.setNumero(100);


        System.out.println("\n=========================CLIENTE===========================");

        Cliente cliente = new Cliente("Jackson Medeiros", "012.334.654-98", "jackson@gmail.com", "Programador", "(11)96545-7800", endereco);
        System.out.println(cliente.getIdentificacao());

        System.out.println("\n=================LIVRO=============================");
        Livro livro = new Livro("F@deu Geral", "Livro do cotidiano", 5,10, "65479", 127);
        System.out.println(livro.getIdentificacao());
    }
}
