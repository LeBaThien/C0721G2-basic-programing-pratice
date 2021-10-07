package case_study.models;

public abstract class Facility {
    private String nameService;
    private double usingArea;
    private double priceRental;
    private int numberPersonInRoom;
    private String typeOfRent;

    public final static String YEAR = "year";
    public final static String MONTH = "month";
    public final static String DATE = "Date";
    public final static String HOURS = "hours";

    public Facility(){};
    public Facility(String nameService, double usingArea, double priceRental, int numberPersonInRoom, String typeOfRent) {
        this.nameService = nameService;
        this.usingArea = usingArea;
        this.priceRental = priceRental;
        this.numberPersonInRoom = numberPersonInRoom;
        this.typeOfRent = typeOfRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getPriceRental() {
        return priceRental;
    }

    public void setPriceRental(double priceRental) {
        this.priceRental = priceRental;
    }

    public int getNumberPersonInRoom() {
        return numberPersonInRoom;
    }

    public void setNumberPersonInRoom(int numberPersonInRoom) {
        this.numberPersonInRoom = numberPersonInRoom;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", usingArea=" + usingArea +
                ", priceRental=" + priceRental +
                ", numberPersonInRoom=" + numberPersonInRoom +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}' + "\n";
    }

    public abstract String getInformation();
}
