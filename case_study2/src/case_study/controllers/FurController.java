package case_study.controllers;

import case_study.models.Employee;
import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;
import case_study.services.FacilityServiceImpl;

import java.util.Scanner;

public class FurController {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

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

    public static void displayMainMenu(int selection) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
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
                            employeeService.showList();
                            break;
                        }
                        case 2: {
                            employeeService.add();
                            break;
                        }
                        case 3:
                            System.out.print("Enter your id employee, you want to edit: ");
                            int id = scanner.nextInt();
                            employeeService.editEmployee(id);
                            break;
                        case 4:{
                            return;
                        }
                    }
                }
            }
            case 2: {
                while (true) {
                    System.out.println("=== Customer Management ===");
                    System.out.println("1. Show list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customers");
                    System.out.println("4. Return main menu");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    switch (number) {
                        case 1: {
                            customerService.showList();
                            break;
                        }
                        case 2: {
                            customerService.addNewCustomer();
                            break;
                        }
                        case 3:{
                            System.out.print("Enter id customer, you want to edit: ");
                            int id = scanner.nextInt();
                            customerService.editList(id);
                            break;
                        }
                        case 4:{
                            return;
                        }
                        default:{
                            System.out.println("Please check your number!!!");
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
                            facilityService.showList();
                            break;
                        }
                        case 2: {
                            facilityService.addFacility();
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

}
