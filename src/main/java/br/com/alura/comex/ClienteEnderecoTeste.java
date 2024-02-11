package br.com.alura.comex;

public class ClienteEnderecoTeste {
    public static void main(String[] args) {

        // Fiz dessa forma para diferenciar com e sem os construtores
        Cliente cliente = new Cliente();
        cliente.setNome("Luan");
        cliente.setCpf("288.222.555.44");
        cliente.setEmail("luancorp@gmail.com");
        cliente.setProfissao("Advogado");
        cliente.setTelefone("(84)9234-3232");

        cliente.setBairro("Bairro da paz");
        cliente.setEstado("Rio Grande do Norte");
        cliente.setComplemento("Casa");
        cliente.setCidade("Natal");
        cliente.setRua("Rua Alencar da Silva");
        cliente.setNumero(55);
        System.out.println("========================");

        // Novo cliente para testar criações de classes com construtores
        Cliente cliente2 = new Cliente();
        cliente2.setNomeCpf("Fulano","222.222.333.44");
        cliente2.setNomeCpfEmail("Fulano","222.222.333.44","fulano@gmail.com");

        cliente.informa();
        cliente.informaEndereco();
        System.out.println("=======================");

        // Testando as opções de criação
        System.out.println("Informações Cliente2: "+cliente2.getNome()+ " "+cliente2.getCpf()+" "+cliente2.getEmail());





    }
}
