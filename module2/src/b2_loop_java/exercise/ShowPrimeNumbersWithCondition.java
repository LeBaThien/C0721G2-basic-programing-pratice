package b2_loop_java.exercise;

import java.util.Scanner;

public class ShowPrimeNumbersWithCondition {
    public static void main(String[] args) {
        System.out.println("Input your number, you want to show");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int n = 2;
        while ( count != number) {
            if (checkPrime(n)) {
                if( n < 100){
                System.out.print(n + ",");
                }
                count++;
            }
            n++;
        }


    }
    public static boolean checkPrime (int n){
        for (int i = 2; i < Math.sqrt(n); i++ ){
            if(n%i == 0) {
                return false;
            }

        } return true;

    }


}
