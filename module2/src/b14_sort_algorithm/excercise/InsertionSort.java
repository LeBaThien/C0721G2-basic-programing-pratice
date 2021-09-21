package b14_sort_algorithm.excercise;

import java.util.Arrays;

public class InsertionSort {
    static int[] array = {1, 4, 5, 6, 8, 2, 5, 8, 9};

    public static void insertSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            System.out.println("Select element at index " + i);
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Compare " + x + " and " + array[pos - 1]);
                array[pos] = array[pos - 1];
                System.out.println("Swap " + array[pos] + " and " + array[pos - 1]);
                pos--;
            }
            array[pos] = x;
            System.out.println("Insert " + array[pos] + " into the subArray");
        }
    }

    public static void main(String[] args) {
        insertSort(array);
        System.out.println("Array (subArray) is : " + Arrays.toString(array));
    }
}
