package code_for_fun.collection.student_manager;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int selection = 0;
        do {
            System.out.println("======== Menu ====");
            System.out.println("1. Add student in  list");
            System.out.println("2. Print student list on screen");
            System.out.println("3. Check student list is null or not null");
            System.out.println("4. Taking the number of student in the student list");
            System.out.println("5. Student list will be null");
            System.out.println("6. Checking student is in list (yes or no) by Id student ");
            System.out.println("7. Deleting a student in list by idStudent");
            System.out.println("8. Finding a student by student name, Its entered from keyboard");
            System.out.println("9. Print a student list with average score from max to min");
            System.out.println("10. Exit program");

            selection = sc.nextInt();
            switch (selection){
                case 1:
                    System.out.println("Nhập mã sinh vien");
                    int idStudent = sc.nextInt();
                    System.out.println("Nhập tên sinh vien");
                    String studentName = sc.next();
                    System.out.println("Nhập năm sinh của sinh vien");
                    int dateBirth = sc.nextInt();
                    System.out.println("Nhập điểm trung bình của sinh vien");
                    float averageScore = sc.nextFloat();
                    Student sv = new Student(idStudent,studentName,dateBirth,averageScore);
                    studentList.addStudent(sv);
                case 2:
                    studentList.printList();
                case 3:
                    System.out.println("Null list : " + studentList.checkNull());
                case 4:
                    System.out.println("The number of student: " + studentList.numberOfStudent());
                case 5:
                    studentList.removeList();
                case 6:


            }

        }while (selection != 0);
    }
}
