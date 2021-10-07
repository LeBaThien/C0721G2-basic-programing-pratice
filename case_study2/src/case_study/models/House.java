package case_study.models;

public class House extends Facility {
    private String houseStandard;
    private int numberOfFloorHouse;

    public House(String nameService, double usingArea, double priceRental, int numberPersonInRoom,
                 String typeOfRent, String houseStandard, int numberOfFloorHouse) {
        super(nameService, usingArea, priceRental, numberPersonInRoom, typeOfRent);
        this.houseStandard = houseStandard;
        this.numberOfFloorHouse = numberOfFloorHouse;
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
                "} " + super.toString();
    }

    @Override
    public String getInformationFacility() {
        return getNameService() + ", " + getUsingArea() + "," + getPriceRental() + ","
                + getNumberPersonInRoom() + "," + getTypeOfRent() + "," + getHouseStandard() + ","
                + getNumberOfFloorHouse();
    }

    public String getInformationHouse(){
        return getNameService() + ", " + getUsingArea() + "," + getPriceRental() + ","
                + getNumberPersonInRoom() + "," + getTypeOfRent() + "," + getHouseStandard() + ","
                + getNumberOfFloorHouse();
    }
}
