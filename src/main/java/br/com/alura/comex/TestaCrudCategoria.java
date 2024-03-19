package br.com.alura.comex;

public class TestaCrudCategoria {
    public static void main(String[] args) {
        CategoriaService service = new CategoriaService();

        Categoria livros = new Categoria();
        livros.setId(2);
        livros.setNome("Livros Técnicos");
        livros.setDescricao("Aumentar o conhecimento...");

        service.remover(livros);

    }
}

