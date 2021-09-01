package b1_introduction_to_java.exercise.exchange_money;

import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double exchangeRateUsd = 23000;
        System.out.println("Input USD to exchange VND");
        double usdAmount = scanner.nextDouble();
        System.out.println(" USD exchanged VND is : " + exchangeRateUsd * usdAmount + " VND");

    }
}
