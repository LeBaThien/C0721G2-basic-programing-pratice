package b3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;
//Tìm giá trị lớn nhất trong mảng 2d

public class MaxValueInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the size row of the 2d array: ");
        int row = input.nextInt();
        System.out.print(" Enter the size col of the 2d array: ");
        int col = input.nextInt();

        int[][] array2d = new int[row][col];

        System.out.println(Arrays.deepToString(array2d));

        for ( int i = 0; i < row; i++){
            for ( int j = 0; j < col; j++){
                System.out.print(" Enter element of the index " + "array2d [" +i + "]" + "[" + j + "] : ");
                array2d[i][j] = input.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(array2d));
        int max = array2d[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++){
                if (array2d[i][j] > max){
                    max = array2d[i][j];

                }
            }
        }
        System.out.print( "Max value is : " + max );
    }
}
