package br.com.alura.comex.module;

public class Address {
    private String neighborhood;
    private String city;
    private String complement;
    private String state;
    private String street;
    private int number;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullDescription(){
        return "neighborhood: " + neighborhood +
                "\ncity: " + city +
                "\ncomplement: " + complement +
                "\nstate: " + state +
                "\nstreet: " + street +
                "\nnumber: " + number;

    }
}
