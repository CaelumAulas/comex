package br.com.alura.comex.Categoria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CategoriaService {
    private Connection connection;
    private CategoriaDAO categoriaDAO;

    public CategoriaService(Connection connection) {
        this.connection = connection;
        this.categoriaDAO = new CategoriaDAO(connection);
    }

    public void registroCategoria(CategoriaProduto categoria) throws SQLException {
        categoriaDAO.registroCategoria(categoria);
    }

    public List<CategoriaProduto> listaCategorias() {
        List<CategoriaProduto> categorias = categoriaDAO.listaCategoria();
        return categorias;
    }

    public List<CategoriaProduto> listaCategoriaOrdenada(Connection connection) {
        List<CategoriaProduto> categorias = categoriaDAO.listaCategoriaOrdenada();
        return categorias;
    }

    public void atualizarCategoria(CategoriaProduto categoria) throws SQLException{
        categoriaDAO.atualizarCategoria(categoria);
    }

    public void removeCategoria(CategoriaProduto categoria) throws SQLException{
        categoriaDAO.removeCategoria(categoria);
    }



}
