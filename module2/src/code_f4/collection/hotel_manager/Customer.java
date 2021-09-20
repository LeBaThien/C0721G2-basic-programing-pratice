package code_f4.collection.hotel_manager;

public class Customer {
    private String nameCustomer;
    private int age;
    private int id;
    private Room room;
    private int numberRent;

    public Customer(String nameCustomer, int ageCustomer, int idCustomer){

    }

    public Customer(String nameCustomer, int age, int id, Room room, int numberRent) {
        this.nameCustomer = nameCustomer;
        this.age = age;
        this.id = id;
        this.room = room;
        this.numberRent = numberRent;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", room=" + room +
                ", numberRent=" + numberRent +
                '}';
    }
}
