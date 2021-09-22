package case_study.controllers;

import case_study.models.Employee;

import java.util.Scanner;

public class FurController {
    public static void displayMainMenu(int selection) {
        switch (selection) {
            case 1: {
                while (true) {
                    System.out.println(" === Employee Management ===");
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    System.out.print("Enter number that you want to use: ");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    switch (number) {
                        case 1: {
                            break;
                        }
                        case 4:{
                            return;
                        }
                    }
                }
            }
            case 2: {
                while (true) {
                    System.out.println("=== Customer Management ===");
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customers");
                    System.out.println("4. Return main menu");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    switch (number) {
                        case 1: {
                            break;
                        }

                    }
                }

            }
            case 3: {
                while (true) {
                    System.out.println("=== Facility Management ===");
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    switch (number) {
                        case 1: {
                            break;
                        }
                        case 4: {
                            return;
                        }
                    }
                }

            }
            case 4: {
                while (true) {
                    System.out.println("=== Booking Management ===");
                    System.out.println("1. Add a new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    switch (number) {
                        case 1: {
                            break;
                        }
                        case 4: {
                            return;
                        }
                    }

                }
            }
            case 5: {
                while (true) {
                    System.out.println("=== Promotion Management ===");
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    switch (number) {
                        case 1: {
                            break;
                        }
                        case 4: {
                            return;
                        }
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        FurController furController = new FurController();
        Employee employee = new Employee("Peter",23/2/1990,"Male",1,12312,"peter@gmail.com",1, Employee.COLLEGE,1200,Employee.SUPERVISOR);
        Employee employee1 = new Employee("Rose",12/2/1995,"Female",2,12244,"rose@gmail.com",2, Employee.MASTER,1200,Employee.RECEPTIONIST);

        while (true) {
            System.out.println("===Menu===");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter number, you want to use: ");
            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    displayMainMenu(1);
                    break;
                }
                case 2:{
                    displayMainMenu(2);
                    break;
                }
                case 3:{
                    displayMainMenu(3);
                    break;
                }
                case 4: {
                    displayMainMenu(4);
                    break;
                }
                case 5: {
                    displayMainMenu(5);
                    break;
                }
                case 6: {
                    return;
                }
            }

        }
    }

}
