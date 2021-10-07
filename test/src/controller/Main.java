package controller;

import utils.CheckInput;

public class Main {
    public static void main(String[] args) {
        ShowTimeImpl showTime = new ShowTimeImpl();
        boolean flag = true;
        while (flag) {
            System.out.println(" === Film Management ===");
            System.out.println("1. Display list product ");
            System.out.println("2. Add new product");
            System.out.println("3. Delete product");
            System.out.println("4. Return main menu");
            System.out.print("Enter number that you want to use: ");
            int number = CheckInput.checkInputSelection();
            switch (number) {
                case 1: {
                    showTime.show();
                    break;
                }
                case 2: {
                    showTime.add();
                    break;
                }
                case 3:
                    showTime.delete();
                    break;
                case 4: {
                    flag = false;
                    break;
                }
            }
        }
    }
}
