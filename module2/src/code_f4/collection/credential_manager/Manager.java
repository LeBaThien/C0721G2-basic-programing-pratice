package code_f4.collection.credential_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of household: ");
        int n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("Enter address household " + i);
            scanner.nextLine();
            String address = scanner.nextLine();

            List<Citizen> citizens = new ArrayList<>();
            System.out.println("Enter number person in household " + i);
            int number = scanner.nextInt();
            for ( int j = 1; j<=number; j++) {
                System.out.println("Enter information the person " + j + ", on the household " + i);

            }
            town.addHousehold(new Household(citizens,address));
            town.showHousehold();
        }
    }
}
