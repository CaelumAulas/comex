package br.com.alura.comex.service;

import br.com.alura.comex.ConnectionFactory;
import br.com.alura.comex.DAO.CategoriaDAO;
import br.com.alura.comex.model.Categoria;

import java.util.Set;

public class CategoriaService {
    private ConnectionFactory connFac;

    public CategoriaService(ConnectionFactory connFac) {
        this.connFac = connFac;
    }

    public void cadastrar(Categoria categoria) {
        new CategoriaDAO(connFac.rtrConn()).cadastrar(categoria);
    }

    public Set<Categoria> consultarRegistros() {
        return new CategoriaDAO(connFac.rtrConn()).consultarRegistros();
    }

    public Set<String> consultarNomes() {
        return new CategoriaDAO(connFac.rtrConn()).consultarNomes();
    }

    public void alterar(Categoria categoria) {
        new CategoriaDAO(connFac.rtrConn()).alterar(categoria);
    }

    public void remover(int id) {
        new CategoriaDAO(connFac.rtrConn()).remover(id);
    }
}
