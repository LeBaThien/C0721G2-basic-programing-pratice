package _01_introduction_to_java.practice.so_ngay_trong_thang;
import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input month here to counting day ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month '" + month + " ' has 31 days!");
                break;
            case 11:
                System.out.println("The month ' " + month + "' has 30 days!");
                break;
            default:
                System.out.println("please check your input. It maybe wrong");
                break;
        }
        //Hỏi về khử mã lặp, mục đích và cách làm ntn?
        //rút gọn code,

    }
}
