package b3_array_java.practice;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a name's student: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for ( int i = 0; i < students.length; i++) {
            if(students[i].equals(inputName)){
            System.out.println("Position of the student in the list " + inputName + " is: " + i);
            isExist = true;
            break;
            }
        }
        if (!isExist) {
            System.out.println(" Not found" + inputName + " int the list.");
        }
    }
}
