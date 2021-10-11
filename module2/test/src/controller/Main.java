package controller;

import services.QuanLySoTietKiem;
import utils.CheckInput;

public class Main {
    public static void main(String[] args) {
        QuanLySoTietKiem showTime = new QuanLySoTietKiem();
        boolean flag = true;
        while (flag) {
            System.out.println(" === Management ===");
            System.out.println("1.Hiển thị sổ tiết kiệm  ");
            System.out.println("2. Thêm mới số tiết kiệm");
            System.out.println("3. Xóa sổ tiết kiệm");
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
