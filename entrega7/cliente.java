import Cliente_Comex.endereco;

public class cliente {
    public String nome;
    private String cpf;
    private String email;
    public String profissao;
    public String telefone;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        endereco pessoa1 = new endereco();
        pessoa1.setBairro("Casa Verde");
        pessoa1.setCidade("São Paulo");
        pessoa1.setComplemento("Apto 171");
        pessoa1.setEstado("São Paulo");
        pessoa1.setRua("Avenida Braz Leme");
        pessoa1.setNumero(1500);

        endereco pessoa2 = new endereco();
        pessoa2.setBairro("Vila Olímpia");
        pessoa2.setCidade("São Paulo");
        pessoa2.setComplemento("1604");
        pessoa2.setEstado("São Paulo");
        pessoa2.setRua("Rua das Olimpíadas");
        pessoa2.setNumero(5500);

        pessoa1.exibeEndereco();
        pessoa2.exibeEndereco();
    }
}


