package code_f4.oop.student_highschool;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();

        school.getStudents20YearsOld();
        school.countStudent23YearsOldInDn();
    }
}
