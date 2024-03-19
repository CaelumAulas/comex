package br.com.alura.comex;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProdutoService {
    private ProdutoDAO dao;
    private Connection con;

    public ProdutoService() {
        this.con = ConnectionFactory.getConnection();
        this.dao = new ProdutoDAO(con);
    }
    public void salvar(Produto produto) {
        this.dao.salvar(produto);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listar() {
        return this.dao.listar();
    }

    public void atualizar(Produto produto) {
        this.dao.atualizar(produto);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(Produto produto) {
        this.dao.remover(produto);

        try {
            this.con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}