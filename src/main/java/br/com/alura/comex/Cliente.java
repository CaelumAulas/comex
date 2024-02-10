package br.com.alura.comex;

public class Cliente {
    private String nome;

    private String cpf;

    private String email;

    private String profissão;

    private String telefone;

    //Da mesma forma que String é uma classe e podemos declarar-lo como atributo de outra classe,
    // podemos fazer com o Endereco, só que nesse caso nós recebemos um outro obejeto como atributo
    private Endereco endereco;

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

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
