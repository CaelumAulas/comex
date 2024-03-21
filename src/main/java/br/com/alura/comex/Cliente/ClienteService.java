package br.com.alura.comex.Cliente;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClienteService {
    Connection connection = ConnectionFactory.getConnection();
    private ClienteDAO clienteDAO;
    public ClienteService(Connection connection) {
        this.clienteDAO = new ClienteDAO(connection);
    }
    public void salvar(Cliente cliente) throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO(connection);
        clienteDAO.salvar(cliente);
    }

    public List<Cliente> listar() throws SQLException {
        return clienteDAO.listaCliente();
    }

    public void atualizar(Cliente cliente) throws SQLException{
        ClienteDAO clienteDAO1 = new ClienteDAO(connection);
        clienteDAO1.atualizar(cliente);
    }

    public void remover(Cliente cliente) throws SQLException{
        ClienteDAO clienteDAO2 = new ClienteDAO(connection);
        clienteDAO2.remover(cliente);
    }
}
