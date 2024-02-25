package InfosUser;

import java.util.Objects;

public class Address {

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


    @Override
    public String toString() {
        return "InfosUser.Address{" +
                "Neighborhood='" + Neighborhood + '\'' +
                ", City='" + City + '\'' +
                ", Complement='" + Complement + '\'' +
                ", State='" + State + '\'' +
                ", Street='" + Street + '\'' +
                ", Number=" + Number +
                '}';
    }
}
