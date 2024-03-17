package br.com.alura.comex;
//Card 8 - classe de teste do card 8. (lista de desejos).
public class Teste6 {
    public static void main(String[] args) {
        Produto produtoA = new Produto("Celular");
        produtoA.setDescricao("Aparelho de comunicação");
        produtoA.setQuantidade(100);
        produtoA.setPrecoUnitario(3000.50);

        Produto produtoB = new Produto("Livro");
        produtoB.setDescricao("Harry Potter");
        produtoB.setQuantidade(500);
        produtoB.setPrecoUnitario(49.59);

        ListaDeDesejos listaDeDesejos = new ListaDeDesejos();
        listaDeDesejos.adicionaProduto(produtoA);
        listaDeDesejos.adicionaProduto(produtoB);
        System.out.println(listaDeDesejos.produtos);

    }
}
