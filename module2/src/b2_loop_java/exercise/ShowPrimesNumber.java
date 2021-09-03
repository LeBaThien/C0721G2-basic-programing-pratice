package b2_loop_java.exercise;

import java.util.Scanner;

public class ShowPrimesNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your amount of number primes you want to show: ");
        int number = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean flag = true;
            if (n < 2) {
                flag = false;
            } else {
                for ( int i = 2; i<n; i++){
                    if(n % i == 0) {
                        flag = false;
                        break;
                    }
                }

            }
            if(flag) {
                System.out.printf("%s,",n);//sử lý dấu.
                count++;
            }
            n++;

        }


    }
}
