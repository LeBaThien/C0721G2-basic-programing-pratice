package case_study.models;

public class House extends Facility {
    private String houseStandard;
    private int numberOfFloorHouse;

    public House(String nameService, double usingArea, double priceRental, int numberPersonInRoom, String typeOfRent) {
        super(nameService, usingArea, priceRental, numberPersonInRoom, typeOfRent);
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberOfFloorHouse() {
        return numberOfFloorHouse;
    }

    public void setNumberOfFloorHouse(int numberOfFloorHouse) {
        this.numberOfFloorHouse = numberOfFloorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseStandard='" + houseStandard + '\'' +
                ", numberOfFloorHouse=" + numberOfFloorHouse +
                '}';
    }

}
