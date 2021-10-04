package case_study.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static Scanner scanner = new Scanner(System.in);
    private static final String NAME_SERVICE = "^SV[HO|VL|RO]{2}-[0-9]{4}$";


    private static Pattern nameInput(){
        return pattern = Pattern.compile(NAME_SERVICE);
    }

    public static boolean checkName (String nameService){
        matcher = nameInput().matcher(nameService);
        return matcher.matches();
    }

    public static String checkNameService(String nameService){
        boolean flag = true;
        while (flag){
            if(checkName(nameService)){
                flag = false;
            }else {
                System.out.println("Please check your name service");
            }
        }
        return nameService;
    }


}
