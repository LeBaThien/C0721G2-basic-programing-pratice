package b3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the size of the first array1: ");
        int size1 = input.nextInt();
        double[] array1 = new double[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print(" Enter the element " + i + " : ");
            double a = input.nextInt();
            array1[i] = a;
        }
        System.out.println(Arrays.toString(array1));

        System.out.print(" Enter the size of the second array2 ");
        int size2 = input.nextInt();
        double[] array2 = new double[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print(" Enter the element " + i + " : ");
            double b = input.nextInt();
            array2[i] = b;
        }
        System.out.println(Arrays.toString(array2));
//        double[] array3 = new double[size1 + size2];
//        for (int i = 0; i <= size1 ; i++) {
//
//            if (i < size1) {
//                array3[i] = array1[i];
//            } else {
//                for (int k = 0 ; k <size2; k++ ) {
//                    array3[size1 + k] = array2[k];
//                }
//            }
//
//        }
//        System.out.println(" New Array is below: ");
        double[] array3 = new double[size1 + size2];

        int pos = 0;

        for (double element : array1) {
            array3[pos] = element;
            pos++;
        }

        for (double element : array2) {
            array3[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(array3));
    }
}
