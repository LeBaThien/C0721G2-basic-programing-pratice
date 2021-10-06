package case_study.utils;

import java.util.Scanner;

public class CheckInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkInputSelection(){
        boolean flag = true;
        int selection = 0 ;
        while(flag){
            flag = false;
            try{
                // trôi lệnh xảy ra khi chúng ta nhập một số sau đó nhập vào một chuỗi
                // Cách xử lý,Integer.parseInt, or Integer.valueOf
                selection = Integer.parseInt(scanner.nextLine());
                //=>Sai
                //selection = scanner.nextInt();

            }catch (Exception input) {
                System.err.println("Please check your input again!!!");
                flag = true;
            }
        }
        return selection;
    }
}
