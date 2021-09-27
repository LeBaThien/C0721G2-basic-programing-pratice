package b18_string_and_regex.excercise.validate_name_class;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter name class to check");
            String strInput = scanner.next();
            if( nameClass.validate(strInput)){
                System.out.println(strInput + ": That's true");
                break;
            }
        }
    }
}
