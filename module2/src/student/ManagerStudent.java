package student;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ManagerStudent {
    Student[] studentList = new Student[100];
    Scanner sc = new Scanner(System.in);

    public int getSize(){
        int count = 0;
        for (int i = 0; i < studentList.length; i++) {
            count++;
        }
        return count;
    }

    public void add() {
        System.out.println("Enter ID:");
        int id = parseInt(sc.nextLine());
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = parseInt(sc.nextLine());
        System.out.println("Enter address:");
        String address = sc.nextLine();
        Student student = new Student(id, name, age, address);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public void deleteID(int idStudent) {
        for (int i = 0; i < studentList.length; i++) {
            if (idStudent == studentList[i].id) {
                for (int j = i; j < studentList.length; j++) {
                    if (studentList[j + 1] != null) {
                        studentList[j] = studentList[j + 1];
                    } else {
                        studentList[j] = null;
                        break;
                    }
                }
                break;
            }
        }
        printList();
    }

    public void editID(int idStudent) {
        for (int i = 0; i < studentList.length; i++) {
            if (idStudent == studentList[i].id) {
                boolean checkEdit = true;
                while (checkEdit) {
                    System.out.println(studentList[i].toString());
                    System.out.print("1.ID\n" +
                            "2.Name\n" +
                            "3.Age\n" +
                            "4.Address\n" +
                            "0.Exit\n" +
                            "Choose section you want to edit:");
                    switch (parseInt(sc.nextLine())) {
                        case 1:
                            System.out.print("Enter new ID:");
                            studentList[i].setId(parseInt(sc.nextLine()));
                            break;
                        case 2:
                            System.out.print("Enter new Name:");
                            studentList[i].setName(sc.nextLine());
                            break;
                        case 3:
                            System.out.print("Enter new age");
                            studentList[i].setAge(parseInt(sc.nextLine()));
                            break;
                        case 4:
                            System.out.print("Enter new address");
                            studentList[i].setAddress(sc.nextLine());
                            break;
                        case 0:
                            checkEdit = false;
                            break;
                        default:
                            System.out.println("invalid value, please enter ordinal number(1,2,3,4)");
                    }
                }
                break;
            }
        }
        printList();
    }

    public Boolean search(String infor) {
        for (int i = 0; i < studentList.length; i++) {
            if (infor.equals(String.valueOf(studentList[i].getId()))
                    ||infor.equals(String.valueOf(studentList[i].getAge()))
                    ||infor.equals(studentList[i].getName())
                    ||infor.equals(studentList[i].getAddress())
            ) {
                System.out.println(studentList[i]);
                return true;
            }
        }
        System.out.println("this infor isn't exist");
        return false;
    }

    public void printList(){
        for (Student e: studentList) {
            if (e != null)
            System.out.print(e + " " );
        }
    }
}
