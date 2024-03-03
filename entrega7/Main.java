import ST_Comex.produto;

public class Main {
    public static void main(String[] args){
        produto vendinha = new produto();
        vendinha.setNome("Freegells");
        vendinha.setDescricao("Bala de morango");
        vendinha.setPreco_unitario(2.50);
        vendinha.quantidade = 10;

        System.out.println(">> Dados do ST_Comex.produto <<");
        System.out.println("Nome: " + vendinha.getNome());
        System.out.println("Descrição: " + vendinha.getDescricao());
        System.out.println("Preço unitário: " + vendinha.getPreco_unitario());
        System.out.println("Quantidade: " + vendinha.quantidade);
    }
}