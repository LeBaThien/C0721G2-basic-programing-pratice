package case_study.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static Scanner scanner = new Scanner(System.in);
//    private static final String USING_AREA = "^[3-9]+[0-9]+[.][0-9]+$";
//    private static final String PRICE_RENTAL = "^[0-9]+.?[0-9]$";
//    private static final String PEOPLE = "^[1-9]|[1][0-9]$";
//    private static final String NUMBER_FLOOR = "^[1-9]+$";

//    private static Pattern nameInput(){
//        return pattern = Pattern.compile(PRICE_RENTAL);
//    }

//    public static boolean checkName1 (String nameService){
//        matcher = nameInput(NAME_SERVICE_HO).matcher(nameService);
//        return matcher.matches();
//    }
//    public static boolean checkName2 (String nameService){
//        matcher = nameInput(NAME_SERVICE_RO).matcher(nameService);
//        return matcher.matches();
//    }
//    public static boolean checkName3 (String nameService){
//        matcher = nameInput(NAME_SERVICE_VL).matcher(nameService);
//        return matcher.matches();
//    }


//    public static String checkNameService(Boolean checkName){
//        String nameService = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the name service: ");
//            nameService = scanner.next();
//            if(checkName1(nameService)){
//                flag = false;
//            }else {
//                System.err.println("Please check your name service.\n" + "Enter another name service:");
//            }
//        }
//        return nameService;
//    }

    public static String checkNameService(String NAME_SERVICE_HO){
        String nameService = "";
        boolean flag = true;
        while (flag){
            System.out.print("Enter the name service: ");
            nameService = scanner.nextLine();
            pattern = Pattern.compile(NAME_SERVICE_HO);
            matcher = pattern.matcher(nameService);
            if(matcher.matches()){
                flag = false;
            }else {
                System.err.println("Please check your name service.. Ex: SVHO-1423, SVVL-1312, or SCRO-1231" +
                        ". Enter another name service:");
            }
        }
        return nameService;
    }

//    public static String standardRoom(String NAME_SERVICE){
//        String standardType = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the type of standard: ");
//            standardType = scanner.nextLine();
//            pattern = Pattern.compile(NAME_SERVICE);
//            matcher = pattern.matcher(standardType);
//            if(matcher.matches()){
//                flag = false;
//            }else {
//                System.err.println("Please check your type of standard.. Ex: SVHO-1423, SVVL-1312,..." +
//                        ". Enter another type of standard:");
//            }
//        }
//        return standardType;
//    }
//
//
//    public static String checkAreaUsing(){
//        String areaUsing = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the area using: ");
//            areaUsing = scanner.nextLine();
//            pattern = Pattern.compile(USING_AREA);
//            matcher = pattern.matcher(areaUsing);
//            if(matcher.matches()){
//                flag = false;
//            }else {
//                System.err.println("Please check area using.. Ex: 30.0, 35.0,... must be bigger than 30" +
//                        ". Enter another area using:");
//            }
//        }
//        return areaUsing;
//    }
//
//    public static String checkAreaPool(){
//        String areaPool = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the area pool: ");
//            areaPool = scanner.nextLine();
//            pattern = Pattern.compile(USING_AREA);
//            matcher = pattern.matcher(areaPool);
//            if(matcher.matches()){
//                flag = false;
//            }else {
//                System.err.println("Please check area pool.. Ex: 30.0, 35.0,... must be bigger than 30" +
//                        ". Enter another area pool:");
//            }
//        }
//        return areaPool;
//    }
//
//    public static String checkPriceRental(){
//        String priceRental = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the price rental: ");
//            priceRental = scanner.nextLine();
//            pattern = Pattern.compile(PRICE_RENTAL);
//            matcher = pattern.matcher(priceRental);
//            if(matcher.matches()){
//                flag = false;
//            }else {
//                System.err.println("Please check price rental.. Ex: 123, 32312,... must be bigger than 0" +
//                        ". Enter another price rental:");
//            }
//        }
//        return priceRental;
//    }
//
//    public static String checkPeople(){
//        String peopleInRoom = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the number people in room: ");
//            peopleInRoom = scanner.nextLine();
//            pattern = Pattern.compile(PEOPLE);
//            matcher = pattern.matcher(peopleInRoom);
//            if(matcher.matches()){
//                flag = false;
//            }else {
//                System.err.println("Please check number in room.. Ex: 01,02,10,12,... must be bigger than 0 and smaller 20" +
//                        ". Enter another the number people in room:");
//            }
//        }
//        return peopleInRoom;
//    }
//
//    public static String numberOfFloor(){
//        String numberOfFloor = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the number of floor: ");
//            numberOfFloor = scanner.nextLine();
//            pattern = Pattern.compile(NUMBER_FLOOR);
//            matcher = pattern.matcher(numberOfFloor);
//            if(matcher.matches()){
//                flag = false;
//            }else {
//                System.err.println("Please check number of floor.. Ex: 1, 32,... must be bigger than 0" +
//                        ". Enter another number of floor:");
//            }
//        }
//        return numberOfFloor;
//    }
//    public static String typeOfRent(String NAME_SERVICE){
//        String typeRent = "";
//        boolean flag = true;
//        while (flag){
//            System.out.print("Enter the type of rent: ");
//            typeRent = scanner.nextLine();
//            pattern = Pattern.compile(NAME_SERVICE);
//            matcher = pattern.matcher(typeRent);
//            if(matcher.matches()){
//                flag = false;
//            }else {
//                System.err.println("Please check your type of rent.. Ex: SVHO-1423, SVVL-1312, or SCRO-1231" +
//                        ". Enter another type of rent:");
//            }
//        }
//        return typeRent;
//    }



    public static String validateInput(String a){
        String stringInput = "";
        boolean flag = true;
        while (flag){
            System.out.print("Input here: ");
            stringInput = scanner.nextLine();
            pattern = Pattern.compile(a);
            matcher = pattern.matcher(stringInput);
            if(matcher.matches()){
                flag = false;
            }else {
                System.err.println("Please check your input" +
                        ". Enter another type of input: ");
            }
        }
        return stringInput;
    }


}
