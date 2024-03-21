package br.com.alura.comex.Cliente;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaAtualizarCliente {
    public static void main(String[] args) throws SQLException {
        Connection conexao = ConnectionFactory.getConnection();
        ClienteService clienteService = new ClienteService(conexao);

        Cliente cliente = new Cliente();
        cliente.setNome("Bel");
        cliente.setEmail("bel@gmail.com");

        clienteService.atualizar(cliente);
        conexao.close();



    }
}
