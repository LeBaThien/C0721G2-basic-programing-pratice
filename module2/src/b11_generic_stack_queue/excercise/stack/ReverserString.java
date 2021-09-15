package b11_generic_stack_queue.excercise.stack;

public class ReverserString {
        static void swap(char[] a, int index1, int index2){
            char temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }

        static void reverse(char[] s){

            int n = s.length, i;

            for(i = 0; i < n/2; i++) {
                swap(s, i, n-i-1);
            }
        }

        public static void main(String[] args){
            char[] s = "thien".toCharArray();

            reverse(s);
            System.out.print(String.valueOf(s));

        }

}
