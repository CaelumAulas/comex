public class Main {
    public static void main(String[] args){
        produto vendinha = new produto();
        vendinha.nome = "Freegells";
        vendinha.descricao = "Bala de morango";
        vendinha.preco_unitario = 2.50;
        vendinha.quantidade = 10;

        System.out.println(">> Dados do produto <<");
        System.out.println("Nome: " + vendinha.nome);
        System.out.println("Descrição: " + vendinha.descricao);
        System.out.println("Preço unitário: " + vendinha.preco_unitario);
        System.out.println("Quantidade: " + vendinha.quantidade);
    }
}