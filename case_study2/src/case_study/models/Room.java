package case_study.models;

public class Room extends Facility {
    private String serviceFree;


    public Room(String nameService, double usingArea, double priceRental, int numberPersonInRoom,
                String typeOfRent, String serviceFree) {
        super(nameService, usingArea, priceRental, numberPersonInRoom, typeOfRent);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                "} " + super.toString();
    }
//
//    public String getInformationRoom() {
//        return getNameService() + "," + getUsingArea() + "," + getPriceRental() + "," + getNumberPersonInRoom()
//                + "," + getTypeOfRent() + "," + getServiceFree();
//
//    }

    @Override
    public String getInformation() {
        return getNameService() + "," + getUsingArea() + "," + getPriceRental() + "," + getNumberPersonInRoom()
                + "," + getTypeOfRent() + "," + getServiceFree();
    }
}
