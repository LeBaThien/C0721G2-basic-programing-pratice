package case_study.services;

import case_study.libs.HouseToCsv;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.CheckValidate;

import javax.print.attribute.standard.MediaSize;
import javax.xml.ws.Holder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    protected static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Map<House,Integer> houseIntegerMap = new LinkedHashMap<>();
    private static final String NAME_SERVICE_HO = "^SV[HO]{2}-[0-9]{4}$";
    private static final String NAME_SERVICE_VL = "^SV[VL]{2}-[0-9]{4}$";
    private static final String NAME_SERVICE_RO = "^SV[RO]{2}-[0-9]{4}$";
    private static final String USING_AREA = "^[3-9]+[0-9]+[.][0-9]+$";
    private static final String PRICE_RENTAL = "^[0-9]+$";
    private static final String PEOPLE = "^[1-9]|[1][0-9]$";
    private static final String NUMBER_FLOOR = "^[1-9]+$";

    static {
        facilityIntegerMap.put(new House("SVHO-1234",200,300,2,House.DATE,
                "A",2),0);
        facilityIntegerMap.put(new Villa("SVVL-1234",300,400,4,Villa.MONTH,
                "A",200,3),0);
        facilityIntegerMap.put(new Room("SVRO-1234",400,250,1, Room.DATE,
                "Free"),0);
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
    public void add() {
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
                    String nameService = CheckValidate.checkNameService(NAME_SERVICE_VL);
                    System.out.print("Enter the area using: ");
                    double usingArea = Double.parseDouble(CheckValidate.validateInput(USING_AREA));
                    //chuyển về string, thuộc tính class ko đổi,
                    //dùng regex kieểm tra, chuyển đổi string đó sang kiểu số...roồi đẩy vào đối tiowjng
                    System.out.print("Enter the price rental: ");
                    double priceRental = Double.parseDouble(CheckValidate.validateInput(PRICE_RENTAL));
                    System.out.print("Enter the number people in room: ");
                    int numberPersonInRoom = Integer.parseInt(CheckValidate.validateInput(PEOPLE));
                    System.out.print("Enter the type of rent: ");
                    String typeOfRent = CheckValidate.checkNameService(NAME_SERVICE_VL);
                    System.out.print("Enter the type of standard: ");
                    String roomStandard = CheckValidate.checkNameService(NAME_SERVICE_VL);
                    System.out.print("Enter the area pool: ");
                    double poolArea = Double.parseDouble(CheckValidate.validateInput(USING_AREA));
                    System.out.print("Enter the number of floor: ");
                    int numberOfFloor = Integer.parseInt(CheckValidate.validateInput(NUMBER_FLOOR));
                    Villa villa = new Villa(nameService,usingArea,priceRental,numberPersonInRoom,typeOfRent,roomStandard,poolArea,numberOfFloor);
                    facilityIntegerMap.put(villa,0);
                    break;
                }
                case 2: {
                    String nameService = CheckValidate.checkNameService(NAME_SERVICE_HO);
                    System.out.print("Enter the area using: ");
                    double usingArea = Double.parseDouble(CheckValidate.validateInput(USING_AREA));
                    System.out.print("Enter the price rental: ");
                    double priceRental = Double.parseDouble(CheckValidate.validateInput(PRICE_RENTAL));
                    System.out.print("Enter the number people in room: ");
                    int numberPersonInRoom = Integer.parseInt(CheckValidate.validateInput(PEOPLE));
                    System.out.print("Enter the type of rent: ");
                    String typeOfRent = CheckValidate.checkNameService(NAME_SERVICE_HO);
                    System.out.print("Enter the type of standard: ");
                    String houseStandard = CheckValidate.checkNameService(NAME_SERVICE_HO);
                    System.out.print("Enter the number of floor: ");
                    int numberOfFloorHouse = Integer.parseInt(CheckValidate.validateInput(NUMBER_FLOOR));
                    House house = new House(nameService,usingArea,priceRental,numberPersonInRoom,typeOfRent,houseStandard,numberOfFloorHouse);
                    facilityIntegerMap.put(house,0);
                    houseIntegerMap.put(house,0);
                    HouseToCsv.writeListEmployeeToCSV(houseIntegerMap);
                    break;
                }
                case 3:{
                    String nameService = CheckValidate.checkNameService(NAME_SERVICE_RO);
                    System.out.print("Enter the area using: ");
                    double usingArea = Double.parseDouble(CheckValidate.validateInput(USING_AREA));
                    System.out.print("Enter the price rental: ");
                    double priceRental = Double.parseDouble(CheckValidate.validateInput(PRICE_RENTAL));
                    System.out.print("Enter the number people in room: ");
                    int numberPersonInRoom = Integer.parseInt(CheckValidate.validateInput(PEOPLE));
                    System.out.print("Enter the type of rent: ");
                    String typeOfRent = CheckValidate.checkNameService(NAME_SERVICE_RO);
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
    public void delete() {
    //cap nhat sau
    }

    @Override
    public void display() {
        //option 1: print out
        // System.out.println(facilityIntegerMap.toString());
        //option 2: using
        //need to review
        HouseToCsv.readData();
//        Set<Map.Entry<House,Integer>> entries = houseIntegerMap.entrySet();
//        for(Map.Entry<House,Integer> entry : entries){
//            System.out.println(entry.getKey().toString() + "," + entry.getValue() );
//        }

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
}
