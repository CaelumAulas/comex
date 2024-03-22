package br.com.alura.comex.service;

import br.com.alura.comex.ConnectionFactory;
import br.com.alura.comex.DAO.ProdutoDAO;
import br.com.alura.comex.model.Produto;

import java.util.Set;

public class ProdutoService {
    private ConnectionFactory connFac;

    public ProdutoService(ConnectionFactory connFac) {
        this.connFac = connFac;
    }

    public void cadastrar(Produto produto) {
        new ProdutoDAO(connFac.rtrConn()).cadastrar(produto);
    }

    public Set<Produto> consultarRegistros() {
        return new ProdutoDAO(connFac.rtrConn()).consultarRegistros();
    }

    public Set<String> consultarNomes() {
        return new ProdutoDAO(connFac.rtrConn()).consultarNomes();
    }

    public void alterar(Produto produto) {
        new ProdutoDAO(connFac.rtrConn()).alterar(produto);
    }

    public void remover(int id) {
        new ProdutoDAO(connFac.rtrConn()).remover(id);
    }
}
