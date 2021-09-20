package code_f4.collection.hotel_manager;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
        Room roomA = new Room("A",1200);
        Room roomB = new Room("B",1400);
        Room roomC = new Room("C",1600);
        hotelManager.addCustomer(new Customer("Peter",18,1,roomA,2));
        hotelManager.addCustomer(new Customer("Alex",28,2,roomA,4));
        hotelManager.addCustomer(new Customer("Howard",30,3,roomB ,1));
        hotelManager.addCustomer(new Customer("Tim", 23,4,roomC ,5));
//        String nameCustomer, int age, int id, Room room, int numberRent)

        while (true){
            System.out.println("==== HOTEL MANAGEMENT ====");
            System.out.println("1. Add customer by ID");
            System.out.println("2. Show customer list");
            System.out.println("3. Edit customer list by ID ");
            System.out.println("4. Delete customer by ID ");
            System.out.println("5. Calculate room rental by ID ");
            System.out.println("6. Exit programming ");
            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();
            switch (selection) {
                case 1:{
                    System.out.print("Enter Id for new customer: ");
                    int idCustomer = sc.nextInt();
                    System.out.print("Enter customer name: ");
                    String nameCustomer = sc.next();
                    System.out.print("Enter customer age: ");
                    int ageCustomer = sc.nextInt();

                    System.out.println("Choice a to rent room type A");
                    System.out.println("Choice b to rent room type B");
                    System.out.println("Choice c to rent room type C");
                    String choice = sc.next();
                    Room room;
                    if (choice.equals("a")) {
                        room = new RoomA();
                    } else if (choice.equals("b")) {
                        room = new RoomB();
                    } else if (choice.equals("c")) {
                        room = new RoomC();
                    } else {
                        continue;
                    }

                    System.out.print("Enter number of rent: ");
                    int numberRent = sc.nextInt();
                    Customer customer = new Customer(nameCustomer,ageCustomer,idCustomer,room,numberRent);
                    hotelManager.addCustomer(customer);
                    break;
                }
                case 2:{
                    hotelManager.showCustomer();
                    break;
                }
                case 3:{
                    System.out.print("Enter ID customer, you want to edit: ");
                    int id = sc.nextInt();
                    hotelManager.editCustomer(id);
                    break;
                }
                case 4:
                    System.out.print("Enter Id customer, you want to delete: ");
                    int id = sc.nextInt();
                    hotelManager.deleteCustomer(id);
                    break;
                case 5:
                case 6:
                    return;//Dung return thi tra ve ket thuc vong lap
                default:
                    break;
            }
        }
    }
}
