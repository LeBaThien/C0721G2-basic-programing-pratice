package case_study.models;

public class Room extends Facility {
    private String serviceFree;

    public Room(String nameService, double usingArea, double priceRental, int numberPersonInRoom, String typeOfRent) {
        super(nameService, usingArea, priceRental, numberPersonInRoom, typeOfRent);
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
                '}';
    }
}
