package br.com.alura.comex.modelo;
public class Endereco {
    String nomeRua;
    int complemento;
    String cep;
    String estado;
    String cidade;
    int numero;
    String bairro;


    public String getNomeRua() {
        return nomeRua;
    }
    public int getComplemento() {
        return complemento;
    }
    public String getCep() {
        return cep;
    }
    public int getNumero() {
        return numero;
    }
    public String getEstado() {
        return estado;
    }
    public String getCidade() {
        return cidade;
    }
    public String getBairro() {
        return bairro;
    }
    @Override
    public String toString() {
        return ">> Dados do Endereço <<" + "\n" +
                "Nome da Rua: " + "\n" +
                "Cep: " + cep + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n" +
                "Número: " + numero + "\n" +
                "Complemento: " + complemento + "\n";

    }
}
