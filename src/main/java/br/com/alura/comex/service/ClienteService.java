package br.com.alura.comex.service;

import br.com.alura.comex.ConnectionFactory;
import br.com.alura.comex.DAO.ClienteDAO;
import br.com.alura.comex.model.Cliente;

import java.util.Set;

public class ClienteService {
    private ConnectionFactory connFac;

    public ClienteService(ConnectionFactory connFac) {
        this.connFac = connFac;
    }

    public void cadastrar(Cliente cliente) {
        new ClienteDAO(connFac.rtrConn()).salvar(cliente);
    }

    public Set<Cliente> mostrarClientes() {
        return new ClienteDAO(connFac.rtrConn()).listar();
    }

    public void atualizaInformacoes(Cliente cliente) {
        new ClienteDAO(connFac.rtrConn()).atualiza(cliente);
    }

    public void apagaInformacoes(String cpf) {
        new ClienteDAO(connFac.rtrConn()).remove(cpf);
    }
}
