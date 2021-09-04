package b3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;
//Tính tổng column mảng 2d:
public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size row of the 2d array: ");
        int row = input.nextInt();
        System.out.print("Enter the size col of the 2d array: ");
        int col = input.nextInt();

        double[][] array2d = new double[row][col];

        System.out.println(Arrays.deepToString(array2d));

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element [" + i + "][" + j + "] : ");
                array2d[i][j] = input.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(array2d));

        System.out.print("Enter your column that you want to accounting Sum: ");
        int colSum = input.nextInt();
        double sum = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0 ; j < col; j++){
                if(colSum == j) {
                   sum += array2d[i][j];
                }
            }
        }
        System.out.println(" Sum of column " + colSum + " in array2d is: " + sum);

    }
}
