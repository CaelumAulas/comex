package br.com.alura.comex.Cliente;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaCliente {
    public static void main(String[] args) {
        Connection conexao = ConnectionFactory.getConnection();
        ClienteService clienteService = new ClienteService(conexao);

        try {
            Cliente cliente = new Cliente();
            cliente.setNome("Brayan");
            cliente.setCpf("000.000.000.00");
            cliente.setEmail("brayan@gmail.com");

            clienteService.salvar(cliente);

            conexao.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
