package InfosUser;

import java.util.Objects;

public class Client {

    private String Name;
    private String CPF;
    private String Email;
    private String Profession;
    private String Telephone;
    private Address Address;
//EX 08
    public Client(String Name, String CPF){
        Objects.requireNonNull(Name);
        Objects.requireNonNull(CPF);
        this.Name = Name;
        this.CPF = CPF;

    }
    public Client(String Name, String CPF, String Email){
        this(Name,CPF);
        Objects.requireNonNull(Name);
        Objects.requireNonNull(CPF);
        Objects.requireNonNull(Email);
        this.Email = Email;



    }

 public Client(String Name,String CPF,String Email,String Profession, String Telephone , Address Address ){
     Objects.requireNonNull(Name);
     Objects.requireNonNull(CPF);
     Objects.requireNonNull(Email);
     Objects.requireNonNull(Profession);
     Objects.requireNonNull(Telephone);
     Objects.requireNonNull(Address);
     this.Name = Name;
     this.CPF = CPF;
     this.Email = Email;
     this.Profession = Profession;
     this.Telephone = Telephone;
     this.Address = Address;

 }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "InfosUser.Client{" +
                "Name='" + getName() + '\'' +
                ", CPF='" + getCPF() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Profession='" + getProfession() + '\'' +
                ", Telephone='" + getTelephone() + '\'' +
                ", InfosUser.Address=" + getAddress() +
                '}';
    }
}
