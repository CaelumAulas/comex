package br.com.alura.comex.Categoria;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.util.List;

public class TestaBuscaOrdenada {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        CategoriaService categoriaService = new CategoriaService(connection);

        List<CategoriaProduto> categorias = categoriaService.listaCategoriaOrdenada(connection);

        for (CategoriaProduto categoria : categorias) {
            System.out.println("[" + "Nome" + "] " + categoria.getNome());
        }


    }
}
