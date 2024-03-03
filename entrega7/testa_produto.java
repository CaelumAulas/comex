import ST_Comex.produto;

public class testa_produto {
    public static void main(String[] args) {
        produto loja1 = new produto();
        loja1.setNome("Margarida Branca");
        loja1.setDescricao("Jardinagem");

        produto loja2 = new produto();
        loja2.setNome("Peixe Beta");
        loja2.setDescricao("Peixe de água doce");

        loja1.exibeDados();
        loja2.exibeDados();
    }
}
