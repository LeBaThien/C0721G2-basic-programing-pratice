package b4_class_and_object_java.exercise;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch(System.currentTimeMillis(),System.currentTimeMillis());
        SelectionSort ob = new SelectionSort();
            int arr[] = new int [100000];
            for (int i = 0; i < 100000; i++) {
                Random rd = new Random();//khai báo một đối tượng random
                int number = rd.nextInt(100000);//trả về một số nguyên bất kì
                arr[i] = number;
            }
            watch.start();
            ob.sort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
            watch.stop();
        System.out.println("Time is: " + watch.getElapsedTime());
    }
}
