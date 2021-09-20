package code_f4.collection.credential_manager;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Household> households;

    public Town (){
        this.households = new ArrayList<>();

    }

    public List<Household> getHouseholds() {
        return households;
    }

    public void setHouseholds(List<Household> households) {
        this.households = households;
    }

    public void addHousehold (Household household){
        this.households.add(household);
    }
    public void showHousehold () {
        for (Household household: households){
            System.out.println(household);
        }
    }
}
