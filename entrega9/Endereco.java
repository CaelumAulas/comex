import com.google.gson.annotations.SerializedName;
import java.io.IOException;

public class Endereco implements Comparable<Endereco> {

        @SerializedName("CEP")
        private String cep;

        @SerializedName("Logradouro")
        private String logradouro;

        @SerializedName("Complemento")
        private String complemento;
        @SerializedName("Bairro")
        private String bairro;
        @SerializedName("Localidade")
        private String localidade;

        @SerializedName("UF")
        private String uf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public int compareTo(Endereco outroEndereco) {
        return this.getCep().compareTo(outroEndereco.getCep());
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "CEP='" + cep + '\'' +
                ", Logradouro='" + logradouro + '\'' +
                ", Complemento='" + complemento + '\'' +
                ", Bairro='" + bairro + '\'' +
                ", Localidade='" + localidade + '\'' +
                ", UF='" + uf + '\'' +
                '}';
    }
}
