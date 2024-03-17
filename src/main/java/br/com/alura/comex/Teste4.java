package br.com.alura.comex;
// Card 5
public class Teste4 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.bairro = "Itaim Paulista";
        endereco.cidade = "São Paulo";
        endereco.estado = "SP";
        endereco.rua = "Av. Marechal Tito";
        endereco.numero = 1981;

        Cliente cliente = new Cliente();
        cliente.cpf = "123.456.789-12";
        cliente.nome = "Paulo";
        cliente.telefone = "(11)2535-6523";
        cliente.endereco = endereco;

        System.out.println("Nome: " + cliente.nome + "\n" +
                "Rua: " + endereco.rua + "\n" + "Nº " +
                cliente.endereco.numero + "\n" + "Bairro: " +
                endereco.bairro + "\n" + "Cidade: " + endereco.cidade + "\n"
                + "Estado: " + endereco.estado);
    }

}
