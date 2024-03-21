package br.com.alura.comex.Categoria;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaRemoveCategoria {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        CategoriaService categoriaService = new CategoriaService(connection);

        try {
        CategoriaProduto categoria = new CategoriaProduto();
        categoria.setNome("Armário");

            categoriaService.removeCategoria(categoria);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
