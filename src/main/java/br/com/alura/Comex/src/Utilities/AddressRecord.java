package org.example.OutraParte.src.Utilities;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public record AddressRecord(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {


    public static final AddressRecord  GsonAddress(String json){
        AddressRecord record = new AddressRecord(null,null,null,null,null,null);

        try {


            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
            AddressRecord addressRecord = gson.fromJson(json, AddressRecord.class);
            record = addressRecord;
        }catch (JsonSyntaxException ex){
            System.out.println(ex.getMessage());

        }finally {

            return record;
        }
    }
}
