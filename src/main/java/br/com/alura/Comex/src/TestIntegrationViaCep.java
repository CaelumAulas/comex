package org.example.OutraParte.src;



import org.example.OutraParte.src.InfosUser.Address;
import org.example.OutraParte.src.InfosUser.AddressSearch;
import org.example.OutraParte.src.Utilities.AddressRecord;
import org.example.OutraParte.src.Utilities.FilesJson;

import java.io.File;

public class TestIntegrationViaCep {
    public static void main(String[] args) {




        try {
            String Search = AddressSearch.Search("02301100");

            Address address = new Address(AddressRecord.GsonAddress(Search));

            System.out.println(address);
            FilesJson filesJson = new FilesJson();
            File file =  filesJson.CreateDiretorio();
            filesJson.ToWrite(file,address);



        }catch (Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
