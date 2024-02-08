package br.com.alura.comex;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.bairro = "República";
        endereco.cidade = "São Paulo";
        endereco.complemento = "Casa";
        endereco.estado = "SP";
        endereco.rua = "Praça da República";
        endereco.numero = 213;
        Cliente cliente = new Cliente();
        cliente.nome = "Luciano";
        cliente.cpf = "456.736.540-22";
        cliente.email = "luciano@gmail.com";
        cliente.profissao = "Programador";
        cliente.telefone = "(11) 98744-5443";
        cliente.endereco = endereco;
    }
}
