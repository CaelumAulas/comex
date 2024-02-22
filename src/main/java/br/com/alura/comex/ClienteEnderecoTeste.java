package br.com.alura.comex;

public class ClienteEnderecoTeste {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Bairro da paz","Natal",
                "Casa","Rio Grande do Norte","Rua Alencar da Silva",55);


        Cliente cliente = new Cliente("Luan","288.222.555.44","luancorp@gmail.com","Advogado",
                "(84)9234-3232",endereco);



        System.out.println("========================");

        Cliente cliente2 = new Cliente("Fulano","222.222.333.44");

        Cliente cliente3 = new Cliente("Fulano","222.222.333.44","fulano@gmail.com");


        cliente.informa();
        System.out.println("=======================");

        // Testando as opções de criação
        System.out.println("Informações Cliente2: "+cliente2.getNome()+ " "+cliente2.getCpf());

        System.out.println("Informações Cliente3: "+cliente3.getNome()+ " "+cliente3.getCpf()+" "+cliente3.getEmail());






    }
}
