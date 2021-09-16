package b11_generic_stack_queue.excercise.stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverserArray {
    public static void main(String[] args) {
//        Stack<Integer> integerStack= new Stack<>();
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
//
//        for (int value : array) {
//            integerStack.push(value);
//        }
//        //integerStack,, đóng vai trò bộ nhớ trung gian
//        System.out.println(Arrays.toString(array));
//        for( int i = 0; i < array.length; i++){
//            array[i] = integerStack.pop();
//        }
//        System.out.println(Arrays.toString(array));
        reverserArr(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverserArr (int [] array){
        Stack<Integer> integerStack= new Stack<>();
        for( int value: array) {
            integerStack.push(value);
        }
        for( int i = 0; i < array.length; i++){
            array[i] = integerStack.pop();
        }
    }




}
