package b15_exception_and_debug.excercise;

import java.util.Scanner;

public class CheckShape {
    public static void checkTriangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  first side of Triangle: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second side of Triangle: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the third side of Triangle: ");
        double c = scanner.nextDouble();
        double x = a + b;
        double y = a + c;
        double z = b + c;

        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Side is negative number, please enter another one");
            //muốn ghi đc phải tạo ra class,,,ill

        }
        if (x < c || y < b || z < a) {
            throw new IllegalTriangleException("can't to create a Triangle, because a + b <c (wrong) => a + b > c (right)");
        }
        System.out.println("The Triangle with side : " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                checkTriangle();
            } catch (IllegalTriangleException e) {
                flag = true;
                e.printStackTrace();//Để hiện thị lỗi cụ thể ở đâu, có cái này mới hiển thị lỗi
                System.out.println("Please enter new a,b,c");
            }

        }
    }
}
