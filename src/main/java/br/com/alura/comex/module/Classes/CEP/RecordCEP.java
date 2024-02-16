package br.com.alura.comex.module.Classes.CEP;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public record RecordCEP(        @SerializedName("cep") String cep,
                                @SerializedName("logradouro") String street,
                                @SerializedName("complemento") String complement,
                                @SerializedName("bairro") String district,
                                @SerializedName("localidade") String city,
                                @SerializedName("uf") String uf) {

}