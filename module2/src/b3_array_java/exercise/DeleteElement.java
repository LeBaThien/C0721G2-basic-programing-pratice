package b3_array_java.exercise;

//Thuật toán ni là lọc chứ ko phải xóa
//        for (int i = 0; i < array.length; i++){
//            if (array[i] != x) {
//                for ( int j = 0; j < newArray.length; j++ ){
//                    if (newArray[j] == 0){
//                        newArray[j] = array[i];
//                        break;
//                    }
////                    int temp = array[i];
////                    array[i] = x;
////                    x = temp;
//                }
//
//            }
//
//        }

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 4, 7, 2, 8, 9, 10};
        System.out.println("Enter number that you want to delete");
        int x = input.nextInt();
        int count = 0;

        for (int i = 0; i < array.length - count; i++) {
            if (array[i] == x) {
                int pos = i;
                for (int j = pos; j < array.length - 1 - count; j++) {
                    array[j] = array[j + 1];
                }
                count++;
            }
        }

//        int[] b = new int[a.length - 1];
        int[] newArray = Arrays.copyOf(array, array.length - count);
        System.out.println(Arrays.toString(newArray));
    }

}
//CÁch 1
//
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập vị trí muốn xóa");
//                int index = scanner.nextInt(); // vị trí xóa
//                int temp = array.length;
//                for (int i = index; i < array.length-1; i++) {
//        array[i] = array[i + 1];
//        }
//        temp--;
//        for (int i = 0; i < temp; i++) {
//        System.out.print(array[i]+",");
//        }