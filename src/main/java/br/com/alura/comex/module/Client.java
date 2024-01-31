package br.com.alura.comex.module;

public class Client {

    private String name;
    private String cpf;
    private String email;
    private String profession;
    private String telephone;
    private Address address;

    public Client(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
        this.email = "Unknown";
        this.profession = "Unknown";
        this.telephone = "Unknown";
        this.address = null;
    }

    public Client(String name, String cpf, String email, String profession, String telephone, Address address){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.profession = profession;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullDescription(){
        return "name: " + name +
                "\ncpf: " + cpf +
                "\nemail: " + email +
                "\nprofession: " + profession +
                "\ntelephone: " + telephone +
                "\naddress: " + address.getFullDescription();

    }
}
