package code_f4.collection.hotel_manager;

public class Room {
    private String nameRoom;
    private int price;

    public Room(String nameRoom, int price) {
        this.nameRoom = nameRoom;
        this.price = price;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameRoom='" + nameRoom + '\'' +
                ", price=" + price +
                '}';
    }
}
