package b18_string_and_regex.excercise.validate_number_phone;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberPhoneValidate numberPhoneValidate = new NumberPhoneValidate();
        while(true){
            System.out.println("Enter the number phone");
            String numberPhone = scanner.next();
            if(numberPhoneValidate.numberPhoneCheck(numberPhone)){
                System.out.println( numberPhone + " is that right format");
                break;
            }
        }
    }
}
