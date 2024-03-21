package br.com.alura.comex.Cliente;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemCliente {
    public static void main(String[] args) throws SQLException {
        Connection conexao = ConnectionFactory.getConnection();
        ClienteService clienteService = new ClienteService(conexao);

        try {
            List<Cliente> clientes = clienteService.listar();

            System.out.println("Lista de Clientes:");

            for (Cliente cliente : clientes) {
                System.out.println("[" + "Nome" + "] " + cliente.getNome() + " | " + "[" + "CPF" + "] " + cliente.getCpf() + " | " + "[" + "EMAIL" + "] " + cliente.getEmail());
            }

            clienteService.listar();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
