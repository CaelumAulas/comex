package br.com.alura.comex.main;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Endereco;
import br.com.alura.comex.service.ClienteService;
import br.com.alura.comex.ConnectionFactory;

public class TesteCliente {
    public static void main(String[] args) {
        // Create
        Cliente cliente = new Cliente("04786277185", "Gabriel", "gabriel.borges@hotmail.com", "Programador", "(61) 99994-7045", new Endereco("70660086"));
        new ClienteService(new ConnectionFactory()).cadastrar(cliente);

        // Read
        System.out.println(new ClienteService(new ConnectionFactory()).mostrarClientes());

        // UPDATE
        cliente.setEmail("gabriel.borges@sortech.com.br");
        new ClienteService(new ConnectionFactory()).atualizaInformacoes(cliente);
        System.out.println(new ClienteService(new ConnectionFactory()).mostrarClientes());

        // DELETE
        new ClienteService(new ConnectionFactory()).apagaInformacoes(cliente.getCpf());
        System.out.println(new ClienteService(new ConnectionFactory()).mostrarClientes());

    }
}
