package b3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

//tìm giá trị nhỏ nhất trong mảng
public class FindMinValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print (" Enter size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Input element " + i + " : ");
            int a = input.nextInt();
            array[i] = a;
        }
        int minValue = array[0];
        for (int i = 0 ; i < size; i++) {
            if ( array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(" Min Value in the array is: " + minValue);
    }

}
