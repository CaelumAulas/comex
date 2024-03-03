package br.com.alura.comex;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();

        Produto produto1 = new Produto();
        System.out.println(produto);
        System.out.println(produto1);

        produto.setNome("Livro");
        produto.setDescricao("Conjunto de folhas impressas");

        System.out.println(">> Dados do produto:");
        System.out.println(":: Nome: " + produto.getNome());
        System.out.println(":: Descrição: " + produto.getDescricao());

        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setCidade("São Paulo");
        endereco.setComplemento("Fundos");
        endereco.setEstado("SP");
        endereco.setRua("Ruas das flores");
        endereco.setNumero(100);

        Cliente cliente = new Cliente();
        cliente.setEndereco(endereco);
        cliente.setNome("Jackson Medeiros");

        System.out.println("endereço cadastrado " + endereco);
        System.out.println("O endereço do " + cliente.getNome() + " é " + cliente.getEndereco());

    }
}
