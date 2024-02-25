package org.example.OutraParte.src.InfosUser;

import org.example.OutraParte.src.Utilities.AddressRecord;

import java.util.Objects;

public class Address {
    private int zipCode;
    private String Neighborhood ;
    private String City ;
    private String Complement ;
    private String State ;
    private String Street ;
    private int Number ;

    public Address(String Neighborhood,String City, String Complement, String State,String Street,int Number){
        Objects.requireNonNull(Neighborhood);
        Objects.requireNonNull(City);
        Objects.requireNonNull(Complement);
        Objects.requireNonNull(State);
        Objects.requireNonNull(Street);
        Objects.requireNonNull(Number);
        this.Neighborhood =Neighborhood;
        this.City = City;
        this.Complement = Complement;
        this.State = State;
        this.Street = Street;
        this.Number =Number;



    }

    public Address(AddressRecord aR){
        this.zipCode =Integer.valueOf(aR.cep().replace("-",""));
        this.Complement = aR.complemento();
        this.Neighborhood = aR.bairro();
        this.City = aR.localidade();
        this.State = aR.uf();
        this.Street =aR.logradouro();




    }

    public String getNeighborhood(){
        return Neighborhood;

    }
    public void setNeighborhood(String Neighborhood){
        this.Neighborhood = Neighborhood;

    }
    public String getCity(){
        return City;

    }
    public void setCity(String City){
        this.City = City;

    }
    public String getComplement(){

        return Complement;
    }
    public void setComplement(String Complement){
        this.Complement = Complement;

    }
    public String getState(){
        return State;
    }
    public void setState(String State){
        this.State = State;

    }
    public String getStreet(){

        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public int getNumber(){
        return Number;
    }
    public void setNumber(int Number){

        this.Number = Number;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                ", Neighborhood='" + Neighborhood + '\'' +
                ", City='" + City + '\'' +
                ", Complement='" + Complement + '\'' +
                ", State='" + State + '\'' +
                ", Street='" + Street + '\'' +
                ", Number=" + Number +
                '}';
    }
}
