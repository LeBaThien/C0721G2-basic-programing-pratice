package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static Scanner scanner = new Scanner(System.in);
    private static final String CHECK_NAME = "^[[A-za-z]\\n]+$";
    private static final String CHECK_ID_CARD = "^[0-9]+$";

    private static Pattern nameInput(){
        return pattern = Pattern.compile(CHECK_NAME);
    }



//    public static validateName(String stringInput) {
////        String stringInput = "";
//        boolean flag = true;
//        while (flag) {
//            System.out.print("Input here: ");
//            stringInput = scanner.nextLine();
//            pattern = Pattern.compile(CHECK_NAME);
//            matcher = pattern.matcher(stringInput);
//            if (matcher.matches()) {
//                flag = false;
//            } else {
//                System.err.println("Please check your input" +
//                        ". Enter another type of input: ");
//            }
//        }
//        return true;
//    }

    public static boolean validateName(String stringInput){
//            stringInput = scanner.nextLine();
        pattern = Pattern.compile(CHECK_NAME);
        matcher = pattern.matcher(stringInput);
        if(matcher.matches()) {
            return true;
        }
        return false;
    }

    public static boolean validateIdCard(String stringInput){
//            stringInput = scanner.nextLine();
        pattern = Pattern.compile(CHECK_ID_CARD);
        matcher = pattern.matcher(stringInput);
        if(matcher.matches()) {
            return true;
        }
        return false;
    }

}
