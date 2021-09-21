package b14_sort_algorithm.excercise;

public class MethodInsertionSort {
    static int[] list = {1, 4, 5, 6, 8, 2, 5, 8, 9};

    public static  void insertSort (int[] list) {
        int pos, x;
        for(int i = 1; i < list.length; i++){
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]){
                list[pos] = list[pos -1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        System.out.print("List is sorted : ");
        for ( int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}
