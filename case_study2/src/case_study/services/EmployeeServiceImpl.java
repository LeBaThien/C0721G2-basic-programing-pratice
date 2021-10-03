package case_study.services;

import case_study.libs.EmployeeToCsv;
import case_study.models.Employee;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class EmployeeServiceImpl implements EmployeeService {
    //   private static  ArrayList<Employee> employeeArrayList;
    private static final List<Employee> employeeArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
//    protected static EmployeeToCsv employeeToCsv = new EmployeeToCsv();
    //1.ko cần khai báo chấm trực tiếp từ class, vẫn đc à?
    //2. sau khi edit, như trong file employee lại ko cập nhật kết quả sửa?

//   public EmployeeServiceImpl (ArrayList<Employee>employeeServices) {
//      this.employeeArrayList = new ArrayList<>();
//   }

//    static {
//        Employee employee1 = new Employee("Peter", "23 / 9 / 1990", "Male", 11123, 1129, "peter@gmail.com", 1, Employee.COLLEGE, 1200, Employee.RECEPTIONIST);
//        Employee employee2 = new Employee("Camel", "24 / 4 / 1990", "Female", 1243, 12324, "camel@gmail.com", 2, Employee.UNIVERSITY, 2300, Employee.SUPERVISOR);
//        Employee employee3 = new Employee("Son", "12 / 3 / 1898", "Male", 2532, 7352, "Son@gamil.com", 3, Employee.INTERMEDIATE, 900, Employee.SPECIALIST);
//        employeeArrayList.add(employee1);
//        employeeArrayList.add(employee2);
//        employeeArrayList.add(employee3);
//
//    }

    public void showList() {
        EmployeeToCsv.readData();
        for (Employee e : employeeArrayList) {
            System.out.println(e);
        }
    }

    public void add() {
        System.out.print("Enter employee name: ");
        String nameEmployee = scanner.next();
        System.out.print("Enter employee date birth: ");
        String dateBirth = scanner.next();
        System.out.print("Enter employee sex: ");
        String sex = scanner.next();
        System.out.print("Enter employee identification: ");
        int id = scanner.nextInt();
        System.out.print("Enter employee phone number: ");
        int numberPhone = scanner.nextInt();
        System.out.print("Enter employee email: ");
        String email = scanner.next();
        System.out.print("Enter employee id: ");
        int idEmployee = scanner.nextInt();
        System.out.print("Enter employee education degree: ");
        String degree = scanner.next();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter employee position: ");
        String position = scanner.next();
        Employee employee = new Employee(nameEmployee, dateBirth, sex, id, numberPhone, email, idEmployee, degree, salary, position);
        employeeArrayList.add(employee);
        EmployeeToCsv.writeListEmployeeToCSV(employeeArrayList);
    }

    public void editEmployee(int id) {
        EmployeeToCsv.readData();
        for (Employee employee : employeeArrayList) {
            if (employee.getIdEmployee() == id) {
                while (true) {
                    System.out.println("==Chose letter your want to edit ");
                    System.out.println("a. Edit name\n" + "b. Edit date birth\n"
                            + "c. Edit sex\n" + "d. Edit identification\n"
                            + "e. Edit phone number\n" + "f. Edit email\n"
                            + "g. Edit id\n" + "h. Edit academic level\n"
                            + "i. Edit salary\n" + "j. Edit position\n"
                    + "o. Exit edit");
                    String letter = scanner.next();
                    switch (letter) {
                        case "a": {
                            System.out.print("Enter new name: ");
                            String name = scanner.next();
                            employee.setName(name);
                            break;
                        }
                        case "b": {
                            System.out.print("Enter new date birth: ");
                            String dateBirth = scanner.next();
                            employee.setDateBirth(dateBirth);
                            break;
                        }
                        case "c": {
                            System.out.print("Enter new sex: ");
                            String sex = scanner.next();
                            employee.setSex(sex);
                            break;
                        }
                        case "d":{
                            System.out.print("Enter new identification: ");
                            int identification = scanner.nextInt();
                            employee.setIdentification(identification);
                            break;
                        }
                        case "e":{
                            System.out.print("Enter new phone number: ");
                            int numberPhone = scanner.nextInt();
                            employee.setPhoneNumber(numberPhone);
                            break;
                        }
                        case "f":{
                            System.out.print("Enter new email: ");
                            String email = scanner.next();
                            employee.setEmail(email);
                            break;
                        }
                        case "g":{
                            System.out.print("Enter new Id: ");
                            int idEmployee = scanner.nextInt();
                            employee.setIdentification(idEmployee);
                            break;
                        }
                        case "h":{
                            System.out.print("Enter new academic level: ");
                            String degree = scanner.next();
                            employee.setAcademicLevel(degree);
                           break;
                        }
                        case "i":{
                            System.out.print("Enter new salary: ");
                            double salary = scanner.nextDouble();
                            employee.setSalaryStaff(salary);
                            break;
                        }
                        case "j":{
                            System.out.print("Enter new position: ");
                            String position = scanner.next();
                            employee.setPosition(position);
                            break;
                        }
                        case "o":{
                            return;
                        }
                        default:{
                            System.out.println("Please check your 'letter'");
                            break;
                        }

                    }

                }

            }

        }
        EmployeeToCsv.writeListEmployeeToCSV(employeeArrayList);
    }
    //

}
