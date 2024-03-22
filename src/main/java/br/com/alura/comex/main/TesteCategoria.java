package br.com.alura.comex.main;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.service.CategoriaService;
import br.com.alura.comex.ConnectionFactory;

public class TesteCategoria {
    public static void main(String[] args) {
        // CREATE
        Categoria categoria = new Categoria("Eletrônicos", "Facilitar a vida");
        new CategoriaService(new ConnectionFactory()).cadastrar(categoria);
        // READ
        System.out.println(new CategoriaService(new ConnectionFactory()).consultarRegistros());
        System.out.println(new CategoriaService(new ConnectionFactory()).consultarNomes());
        // UPDATE
        categoria.setId(1);
        categoria.setDescricao("Dificultar a vida");
        new CategoriaService(new ConnectionFactory()).alterar(categoria);
        System.out.println(new CategoriaService(new ConnectionFactory()).consultarRegistros());
        // DELETE
        new CategoriaService(new ConnectionFactory()).remover(categoria.getId());
        System.out.println(new CategoriaService(new ConnectionFactory()).consultarRegistros());
    }
}
