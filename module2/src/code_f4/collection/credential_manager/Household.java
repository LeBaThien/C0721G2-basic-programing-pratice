package code_f4.collection.credential_manager;

import java.util.List;

public class Household {
    private List<Citizen> citizens;
    private String address;

    public Household(List<Citizen>citizens, String address){
        this.citizens = citizens;
        this.address = address;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCitizen (Citizen citizen){
        this.citizens.add(citizen);
    }

    public void showCitizen (){
        for (Citizen citizen : citizens) {
            System.out.println(citizen);
        }
    }

    @Override
    public String toString() {
        return "Household{" +
                "citizens=" + citizens +
                ", address='" + address + '\'' +
                '}';
    }
}
