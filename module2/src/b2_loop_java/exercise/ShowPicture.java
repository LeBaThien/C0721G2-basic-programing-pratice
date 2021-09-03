package b2_loop_java.exercise;

import java.util.Scanner;

public class ShowPicture {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        //Chèn switch case trong vòng lặp while
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");// dùng print thôi, để in trên dòng
                        }
                        System.out.println();//prinline để nhảy xuống dòng khác
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle  at 4 different angles");//khai báo cùng biến i, mà vẫn chạy
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\r");

                    for (int i = 0; i < 6; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("\r");
                    for (int i = 1; i < 6; i++) {
                        for (int j = 0 ; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 6; k > i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\r");
                    for (int i = 1; i < 6; i++) {
                        for (int k = 6; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0 ; j < i; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 1; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i; k++){
                            if ( k == 0 && k < 1){
                                System.out.print("*");
                            } else {
                                System.out.print("**");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
