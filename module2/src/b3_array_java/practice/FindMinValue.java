package b3_array_java.practice;

public class FindMinValue {
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;

            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {4, 10, 7,13 , -1, 6, 9};
        int index = minValue(arr);
        System.out.println("the smallest element in the array is: " +  arr[index]);
    }

}
