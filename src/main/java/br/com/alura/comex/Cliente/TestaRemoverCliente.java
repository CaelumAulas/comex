package br.com.alura.comex.Cliente;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;

public class TestaRemoverCliente {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        ClienteService clienteService = new ClienteService(connection);

        try {
            Cliente cliente = new Cliente();
            cliente.setNome("Brayan");

            clienteService.remover(cliente);
            connection.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
