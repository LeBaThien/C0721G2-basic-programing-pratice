package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static Scanner scanner = new Scanner(System.in);
    private static final String PRICE_RENTAL = "^CL-[0-9]{4}+$";
//    private static Pattern nameInput(){
//        return pattern = Pattern.compile(PRICE_RENTAL);
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
