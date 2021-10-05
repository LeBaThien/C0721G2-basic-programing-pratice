package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.CheckValidate;

import javax.print.attribute.standard.MediaSize;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    protected static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    protected static Scanner scanner = new Scanner(System.in);
    private static final String NAME_SERVICE_HO = "^SV[HO]{2}-[0-9]{4}$";
    private static final String NAME_SERVICE_VL = "^SV[VL]{2}-[0-9]{4}$";
    private static final String NAME_SERVICE_RO = "^SV[RO]{2}-[0-9]{4}$";
//    private static CheckValidate checkValidate = new CheckValidate();

    static {
        facilityIntegerMap.put(new House("SVHO-1312",200,300,2,House.DATE,
                "A",2),0);
        facilityIntegerMap.put(new Villa("SVVL-1231",300,400,4,Villa.MONTH,
                "A",200,3),0);
        facilityIntegerMap.put(new Room("SVRO-1213",400,250,1, Room.DATE,
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
                    double usingArea = Double.parseDouble(CheckValidate.checkAreaUsing());
                    //chuyển về string, thuộc tính class ko đổi,
                    //dùng regex kieểm tra, chuyển đổi string đó sang kiểu số...roồi đẩy vào đối tiowjng
                    double priceRental = Double.parseDouble(CheckValidate.checkPriceRental());
                    int numberPersonInRoom = Integer.parseInt(CheckValidate.checkPeople());
                    String typeOfRent = CheckValidate.typeOfRent(NAME_SERVICE_VL);
                    String roomStandard = CheckValidate.standardRoom(NAME_SERVICE_VL);
                    double poolArea = Double.parseDouble(CheckValidate.checkAreaPool());
                    int numberOfFloor = Integer.parseInt(CheckValidate.numberOfFloor());
                    Villa villa = new Villa(nameService,usingArea,priceRental,numberPersonInRoom,typeOfRent,roomStandard,poolArea,numberOfFloor);
                    facilityIntegerMap.put(villa,0);
                    break;
                }
                case 2: {
                    String nameService = CheckValidate.checkNameService(NAME_SERVICE_RO);
                    double usingArea = Double.parseDouble(CheckValidate.checkAreaUsing());
                    double priceRental = Double.parseDouble(CheckValidate.checkPriceRental());
                    int numberPersonInRoom = Integer.parseInt(CheckValidate.checkPeople());
                    String typeOfRent = CheckValidate.typeOfRent(NAME_SERVICE_RO);
                    String houseStandard = CheckValidate.standardRoom(NAME_SERVICE_RO);
                    int numberOfFloorHouse = Integer.parseInt(CheckValidate.numberOfFloor());
                    House house = new House(nameService,usingArea,priceRental,numberPersonInRoom,typeOfRent,houseStandard,numberOfFloorHouse);
                    facilityIntegerMap.put(house,0);
                    break;
                }
                case 3:{
                    String nameService = CheckValidate.checkNameService(NAME_SERVICE_HO);
                    double usingArea = Double.parseDouble(CheckValidate.checkAreaUsing());
                    double priceRental = Double.parseDouble(CheckValidate.checkPriceRental());
                    int numberPersonInRoom = Integer.parseInt(CheckValidate.checkPeople());
                    String typeOfRent = CheckValidate.typeOfRent(NAME_SERVICE_HO);
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
