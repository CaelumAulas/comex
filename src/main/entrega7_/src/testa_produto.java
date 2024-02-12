public class testa_produto {
    public static void main(String[] args) {
        produto loja = new produto();
        loja.nome = "Margarida branca";
        loja.descricao = "Jardinagem";
        loja.preco_unitario = 29.90;
        loja.quantidade = 2;

        produto aquario = new produto();
        aquario.nome = "Beta";
        aquario.descricao = "Peixe de água doce";
        aquario.preco_unitario = 4.90;
        aquario.quantidade = 1;

        System.out.println(">> Dados do produto");
        System.out.println(":: Nome: " + loja.nome);
        System.out.println(":: Descrição: " + loja.descricao);
        System.out.println("----------------------------------");
        System.out.println(":: Nome: " + aquario.nome);
        System.out.println(":: Descrição: " + aquario.descricao);
    }
}
