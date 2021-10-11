package check_validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static Scanner scanner = new Scanner(System.in);

    public static String checkDataInput(String format){
        String str= "";
        boolean flag = true;
        while (flag){
            System.out.print("Enter here: ");
            str = scanner.nextLine();
            pattern = Pattern.compile(format);
            matcher = pattern.matcher(str);
            if(matcher.matches()){
                flag = false;
            }else {
                System.err.println("Please check your input." +
                        ". Enter another one: ");
            }
        }
        return str;
    }
}
