package b2_loop_java.practice;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input your number: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime number");
        } else {
            int i = 2;
            boolean check = true;
            //Tại sao dùng căn bậc hai của number ở đây, vì chỉ vì chỉ cần kiểm tra
            // đến căn bậc 2 của một số là đã có thể biết được số đó có phải số nguyên tố rồi?
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }

}
