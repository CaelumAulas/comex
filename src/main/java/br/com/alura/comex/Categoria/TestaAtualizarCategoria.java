package br.com.alura.comex.Categoria;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaAtualizarCategoria {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        CategoriaService categoriaService = new CategoriaService(connection);

        try {
        CategoriaProduto categoria = new CategoriaProduto();
        categoria.setDescricao("Gamer com led");
        categoria.setNome("Mouse");

        categoriaService.atualizarCategoria(categoria);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
