package br.com.alura.comex;

public class ClienteTeste {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Jardim das Flores", "São Paulo", "Apartamento 101", "SP", "Rua das Camélias",
                123);

        Cliente cliente = new Cliente("João da Silva", "123.456.789-00", "joao.silva@example.com", "Engenheiro",
                "11 99999-9999", endereco);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco().getRua() + ", " + cliente.getEndereco().getNumero());
    }
}
