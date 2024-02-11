package br.com.alura.comex;

public class Cliente extends Endereco {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private String cpf;
    private String email;
    private String profissao;
    private String telefone;

    private Endereco endereco;

    public void setNomeCpf(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNomeCpfEmail(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void informa(){
        System.out.println(">> Clientes");
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("E-mail: "+getEmail());
        System.out.println("Profissão: "+getProfissao());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("=======================");
    }

}
