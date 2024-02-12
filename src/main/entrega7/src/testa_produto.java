public class Main {

    public static void main(String[] args) {

        produto1 loja = new produto();
        loja.nome = "Jardinagem";
        loja.descricao = "Margarida branca";
        loja.preco_Unitario = 29.90;
        loja.quantidade = 2;

        produto2 aquario = new produto();
        aquario.nome = "Água";
        aquario.descricao = "Peixe beta azul";
        aquario.preco_Unitario = 4.90;
        aquario.quantidade = 1;

        System.out.println(">> Dados do produto");
        System.out.println("::Nome: " + loja.nome);
        System.out.println("::Descrição: " + loja.descricao);

        System.out.println("------------------------------");
        System.out.println("::Nome: " + aquario.nome);
        System.out.println("::Descrição: " + aquario.descricao);
        System.out.println("------------------------------");
    }
}
