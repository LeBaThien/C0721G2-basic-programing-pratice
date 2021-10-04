package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.CheckValidate;

import javax.xml.ws.FaultAction;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    protected static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    protected static Scanner scanner = new Scanner(System.in);
//    private static CheckValidate checkValidate = new CheckValidate();

    static {
        facilityIntegerMap.put(new House("HO",200,300,2,House.DATE,"A",2),0);
        facilityIntegerMap.put(new Villa("VL",300,400,4,Villa.MONTH,"A",200,3),0);
        facilityIntegerMap.put(new Room("RO",400,250,1, Room.DATE,"Free"),0);
    }

    @Override
    public void showList() {
        //option 1: print out
        // System.out.println(facilityIntegerMap.toString());
       //option 2: using
        //need to review
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility facility: facilitySet){
            System.out.println(facility + ": times " + facilityIntegerMap.get(facility));
        }
        //option3:
//        Set<Map.Entry<Facility,Integer>> entries = facilityIntegerMap.entrySet();
//        for(Map.Entry<Facility,Integer> entry : entries){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }

    public static Facility getFacility (String nameFacility) {
       Set<Map.Entry<Facility,Integer>> entries = facilityIntegerMap.entrySet();
       //equals or contains
       for(Map.Entry<Facility,Integer> map : entries){
           if(map.getKey().getNameService().equals(nameFacility)){
               map.setValue(map.getValue() + 1);
               return map.getKey();
           }
       }
        return null;
    }

    @Override
    public void addFacility() {
        while (true) {
            System.out.println("Enter the number, you want to add Facility \r"
                    + "1. Add New Villa\n"
                    + "2. Add New House\n"
                    + "3. Add New Room\n"
                    + "4. Back to menu\n"
            );
            int choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.print("Enter name service: ");
                    String nameService = scanner.next();
                    ;
                    System.out.print("Enter using Area: ");
                    double usingArea = scanner.nextDouble();
                    //chuyển về string, thuộc tính class ko đổi,
                    //dùng regex kieểm tra, chuyển đổi string đó sang kiểu số...roồi đẩy vào đối tiowjng
                    System.out.print("Enter price rental: ");
                    double priceRental = scanner.nextDouble();
                    System.out.print("Enter number person in room: ");
                    int numberPersonInRoom = scanner.nextInt();
                    System.out.print("Enter type of rent: ");
                    String typeOfRent = scanner.next();
                    System.out.print("Enter the room standard: ");
                    String roomStandard = scanner.next();
                    System.out.print("Enter the pool Area: ");
                    double poolArea = scanner.nextDouble();
                    System.out.print("Enter the number of floor: ");
                    int numberOfFloor = scanner.nextInt();
                    Villa villa = new Villa(CheckValidate.checkNameService(nameService),usingArea,priceRental,numberPersonInRoom,typeOfRent,roomStandard,poolArea,numberOfFloor);
                    facilityIntegerMap.put(villa,0);
                    break;
                }
                case 2: {
                    System.out.print("Enter name service: ");
                    String nameService = scanner.next();
                    System.out.print("Enter using Area: ");
                    double usingArea = scanner.nextDouble();
                    System.out.print("Enter price rental: ");
                    double priceRental = scanner.nextDouble();
                    System.out.print("Enter number person in room: ");
                    int numberPersonInRoom = scanner.nextInt();
                    System.out.print("Enter type of rent: ");
                    String typeOfRent = scanner.next();
                    System.out.print("Enter the room standard: ");
                    String houseStandard = scanner.next();
                    System.out.print("Enter the number of floor house: ");
                    int numberOfFloorHouse = scanner.nextInt();
                    House house = new House(nameService,usingArea,priceRental,numberPersonInRoom,typeOfRent,houseStandard,numberOfFloorHouse);
                    facilityIntegerMap.put(house,0);
                    break;
                }
                case 3:{
                    System.out.print("Enter name service: ");
                    String nameService = scanner.next();
                    System.out.print("Enter using Area: ");
                    double usingArea = scanner.nextDouble();
                    System.out.print("Enter price rental: ");
                    double priceRental = scanner.nextDouble();
                    System.out.print("Enter number person in room: ");
                    int numberPersonInRoom = scanner.nextInt();
                    System.out.print("Enter type of rent: ");
                    String typeOfRent = scanner.next();
                    System.out.print("enter the service free: ");
                    String serviceFree = scanner.next();
                    Room room = new Room (nameService,usingArea,priceRental,numberPersonInRoom,typeOfRent,serviceFree);
                    facilityIntegerMap.put(room,0);
                    break;
                }
                case 4: {
                    return;
                }
                case 5: {
                    System.out.println("Please check your number !!!");
                    break;
                }

            }
        }

    }

    @Override
    public void editFacility() {
        //ko y/cau
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }
}
