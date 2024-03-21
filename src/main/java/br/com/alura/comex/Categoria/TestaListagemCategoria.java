package br.com.alura.comex.Categoria;

import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.util.List;

public class TestaListagemCategoria {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        CategoriaService categoriaService = new CategoriaService(connection);

        List<CategoriaProduto> categorias = categoriaService.listaCategorias();

        System.out.println("Categorias: ");

        for (CategoriaProduto categoria : categorias) {
            System.out.println("[" + "Produto" + "] " + categoria.getNome() + " | " + "[" + "Descrição" + "] " + categoria.getDescricao());
        }

        categoriaService.listaCategorias();
    }
}
