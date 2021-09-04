package b3_array_java.exercise;

import java.util.Scanner;

//Đếm kí tự giống nhau trong chuỗi
public class AccountingLetterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = "accountingletter";
//        char [] charArray = letter.toCharArray();// toCharArray() để chuyển String về mảng các ký tự
        System.out.print( " Enter a letter, you want to accounting in String: ");
        //Khai báo a là kí tự, .charAt(index), để lấy giá trị ở index đó ra
        char a = input.next().charAt(0);
        int count = 0;
//        Để lấy ra độ dài của một String, dùng phương thức length()
        for ( int i = 0; i< letter.length();i++ ){
            if( letter.charAt(i) == a){
                count++;
            }
        }
        System.out.println("The number of " + a + " in the String is: " + count);
    }
}
