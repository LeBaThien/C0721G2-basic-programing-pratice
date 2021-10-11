package utils;

import java.util.Scanner;

public class CheckInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkInputSelection(){
        boolean flag = true;
        int selection = 0 ;
        while(flag){
            flag = false;
            try{
                selection = Integer.parseInt(scanner.nextLine());
            }catch (Exception input) {
                System.err.println("Please check your input again!!!");
                flag = true;
            }
        }
        return selection;
    }
}
