package br.com.alura.comex;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClienteService {
    private ClienteDAO dao;
    private Connection con;

    public ClienteService() {
        this.con = ConnectionFactory.getConnection();
        this.dao = new ClienteDAO(con);
    }
    public void salvar(Cliente cliente) {
        this.dao.salvar(cliente);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Cliente> listar() {
        return this.dao.listar();
    }

    public void atualizar(Cliente cliente) {
        this.dao.atualizar(cliente);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(Cliente cliente) {
        this.dao.remover(cliente);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
