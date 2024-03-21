package br.com.alura.comex.Produtos;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProdutoService {
    Connection connection = ConnectionFactory.getConnection();
    private ProdutosDAO produtosDAO;

    public ProdutoService(Connection connection) {
        this.connection = connection;
        this.produtosDAO = new ProdutosDAO(connection);
    }

    public void registraProduto(Produtos produtos) throws SQLException {
        ProdutosDAO produtosDAO = new ProdutosDAO(connection);
        produtosDAO.registroProdutos(produtos);
    }

    public List<Produtos> listaProdutos() throws SQLException {
        return produtosDAO.listaProdutos();
    }

    public List<Produtos> listaProdutoOrdenada(Connection connection) {
        List<Produtos> produtos = produtosDAO.listaProdutosOrdenada();
        return produtos;
    }

    public void atualizarProduto(Produtos produtos) throws SQLException{
        produtosDAO.atualizarProduto(produtos);
    }

    public void removeProduto(Produtos produtos) throws SQLException{
        produtosDAO.removeProduto(produtos);
    }
}
