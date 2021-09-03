package b2_loop_java.practice;

import java.util.Scanner;

public class LoanInterestCalculatorApp {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Input investment amount: ");
        money = input.nextDouble();
        System.out.println(" Input number of months: ");
        month = input.nextInt();
        System.out.println(" Input annual interest rate in percentage:  ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);

    }
}
