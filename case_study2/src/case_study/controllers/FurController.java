package case_study.controllers;

import case_study.models.Booking;
import case_study.models.Employee;
import case_study.services.*;
import case_study.utils.CheckInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FurController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        PromotionServiceImpl promotionService = new PromotionServiceImpl();
        boolean flagMenu = true;
        while (flagMenu) {
            System.out.println("===Menu===");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter number, you want to use: ");
            int selection = CheckInput.checkInputSelection();
            flagMenu = true;
            boolean flag = true;
            switch (selection) {
                case 1: {
                    while (flag) {
                        System.out.println(" === Employee Management ===");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        System.out.print("Enter number that you want to use: ");
                        int number = CheckInput.checkInputSelection();
                        switch (number) {
                            case 1: {
                                employeeService.display();
                                break;
                            }
                            case 2: {
                                employeeService.add();
                                break;
                            }
                            case 3:
                                System.out.print("Enter your id employee, you want to edit: ");
                                int id = CheckInput.checkInputSelection();
                                employeeService.edit(id);
                                break;
                            case 4: {
                                flag = false;
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    while (flag) {
                        System.out.println("=== Customer Management ===");
                        System.out.println("1. Show list customers");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customers");
                        System.out.println("4. Return main menu");
                        int number = CheckInput.checkInputSelection();
                        switch (number) {
                            case 1: {
                                customerService.display();
                                break;
                            }
                            case 2: {
                                customerService.add();
                                break;
                            }
                            case 3: {
                                System.out.print("Enter id customer, you want to edit: ");
                                int id = CheckInput.checkInputSelection();
                                customerService.edit(id);
                                break;
                            }
                            case 4: {
                                flag = false;
                                break;
                            }
                            default: {
                                System.out.println("Please check your number!!!");
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    while (flag) {
                        System.out.println("=== Facility Management ===");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        int number = CheckInput.checkInputSelection();
                        switch (number) {
                            case 1: {
                                facilityService.display();
                                break;
                            }
                            case 2: {
                                facilityService.add();
                                break;
                            }
                            case 4: {
                                flag = false;
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    while (flag) {
                        System.out.println("=== Booking Management ===");
                        System.out.println("1. Add a new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");

                        int number = CheckInput.checkInputSelection();
                        switch (number) {
                            case 1: {
                                bookingService.add();
                                break;
                            }
                            case 2: {
                                bookingService.display();
                                break;
                            }
                            case 3: {
                                contractService.add();
                                break;
                            }
                            case 4: {
                                contractService.display();
                                break;
                            }
                            case 5: {
                                contractService.edit();
                                break;
                            }
                            case 6: {
                                flag = false;
                                break;
                            }
                        }

                    }
                    break;
                }
                case 5: {
                    while (flag) {
                        System.out.println("=== Promotion Management ===");
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        int number = CheckInput.checkInputSelection();
                        switch (number) {
                            case 1: {
                                promotionService.display();
                                break;
                            }
                            case 4: {
                                flag = false;
                                break;
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    flagMenu = false;
                    break;
                }
                default:
                    System.err.println("Check your input again");
                    break;
            }
        }
    }
}
