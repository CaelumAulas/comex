package br.com.alura.comex;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CategoriaService {
    private CategoriaDAO dao;
    private Connection con;

    public CategoriaService() {
        this.con = ConnectionFactory.getConnection();
        this.dao = new CategoriaDAO(con);
    }
    public void salvar(Categoria categoria) {
        this.dao.salvar(categoria);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Categoria> listar() {
        return this.dao.listar();
    }

    public void atualizar(Categoria categoria) {
        this.dao.atualizar(categoria);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(Categoria categoria) {
        this.dao.remover(categoria);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
