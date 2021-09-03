package b3_array_java.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {1,2,4,7,2,8,9,10};
        System.out.println("Enter number that you want to delete");
        int x = input.nextInt();
        int count = 0;
        for ( int i = 0; i < array.length; i++){
            if (x == array[i]) {
                count++;
            }
        }
        int [] newArray = new int[array.length - count];

        System.out.print( Arrays.toString(newArray));// duyệt mảng nhanh

        for (int i = 0; i < array.length; i++){
            if (array[i] != x) {
                for ( int j = 0; j < newArray.length; j++ ){
                    if (newArray[j] == 0){
                        newArray[j] = array[i];
                        break;
                    }
//                    int temp = array[i];
//                    array[i] = x;
//                    x = temp;
                }

            }

        }
        System.out.print(Arrays.toString(newArray));

    }
}
