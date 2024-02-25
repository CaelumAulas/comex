package org.example.OutraParte.src.Utilities;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.OutraParte.src.InfosUser.Address;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesJson {

    public File CreateDiretorio(){
        Path Directory = Paths.get("ClientFolder");
        Path Directories = Paths.get(Directory.toString(),"Adresses");
        Path AddressFiles =Paths.get(Directories.toString(),"AddressFiles.json");
        File file = AddressFiles.toFile();
try {


    if (Files.notExists(Directory)) {
        Files.createDirectory(Directory);
    }
    if (Files.notExists(Directories)) {
        Files.createDirectories(Directories);
    }
    if (Files.notExists(AddressFiles)) {
        Files.createFile(AddressFiles);
    }
}catch (IOException ex){
    System.out.println(ex.getMessage());

}
return file;
    }

    public void ToWrite(File file, Address address){

        try(FileWriter fw = new FileWriter(file);) {
            Gson gsonAddress = new GsonBuilder().setPrettyPrinting().create();
            String AddressJson = gsonAddress.toJson(address);
            fw.write(AddressJson);
            fw.flush();

        }catch (IOException ex){
            System.out.println(ex.getMessage());

        }



    }

}
