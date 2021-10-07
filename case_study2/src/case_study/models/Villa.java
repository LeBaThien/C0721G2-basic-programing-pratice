package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloor;

    public Villa(){}

    public Villa(String nameService, double usingArea, double priceRental, int numberPersonInRoom, String typeOfRent,
                 String roomStandard, double poolArea, int numberOfFloor) {
        super(nameService, usingArea, priceRental, numberPersonInRoom, typeOfRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                "} " + super.toString();
    }

    @Override
    public String getInformation() {
        return getNameService() + "," + getUsingArea() +"," + getPriceRental() + ","
                + getNumberPersonInRoom() + "," + getTypeOfRent() + ","
                + getRoomStandard() + "," + getPoolArea() +"," + getNumberOfFloor();
    }
    //String nameService, double usingArea, double priceRental, int numberPersonInRoom, String typeOfRent,
    //                 String roomStandard, double poolArea, int numberOfFloor

//    public String getInformationVilla(){
//        return getNameService() + "," + getUsingArea() +"," + getPriceRental() + ","
//                + getNumberPersonInRoom() + "," + getTypeOfRent() + ","
//                + getRoomStandard() + "," + getPoolArea() +"," + getNumberOfFloor();
//    }
}
