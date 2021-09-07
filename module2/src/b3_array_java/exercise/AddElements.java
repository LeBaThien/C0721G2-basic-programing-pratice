package b3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 5, 7, 3, 0, 8, 5, 6};
        System.out.println("Enter number that you want to add ");
        int number = input.nextInt();
        System.out.println(" Enter the index of array, you want to add");
        int index = input.nextInt();
        int[] newArray = new int[array.length + 1];

        System.out.println(Arrays.toString(newArray));

        if (index <= -1 || index > array.length) {
            System.out.println("Please check your index");
        } else {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            System.out.println(Arrays.toString(newArray));
            for (int j = 0; j < newArray.length; j++) {
                if (j == index) {
                    for (int k = newArray.length - 1; k > index; k--) {
                        newArray[k] = newArray[k - 1];
                    }
                    newArray[j] = number;
                }

            }
            //Ra rồi a :v, kakaka, fix sớm hơn dự tính :v

            System.out.println(Arrays.toString(newArray));

        }
    }
}


//Thao tác với mảng 1 rồi
//                if (index == j) {
//                    for ( int k = 0; k <= index; k++) {
//                        newArray[j] = number;
//                    }
//                } else if (j <index){
//                    array[j] = newArray[j];
//                } else {
//                    newArray[j] = array[ j - 1];
//                }
