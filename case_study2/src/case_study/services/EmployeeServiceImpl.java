package case_study.services;

import case_study.libs.EmployeeToCsv;
import case_study.models.Employee;
import case_study.utils.CheckInput;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class EmployeeServiceImpl implements EmployeeService {
    //   private static  ArrayList<Employee> employeeArrayList;
    private static List<Employee> employeeArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
//    protected static EmployeeToCsv employeeToCsv = new EmployeeToCsv();
    //1.ko cần khai báo chấm trực tiếp từ class, vẫn đc à?//do import thư viện à?
    //2. sau khi edit, như trong file employee lại ko cập nhật kết quả sửa?

//   public EmployeeServiceImpl (ArrayList<Employee>employeeServices) {
//      this.employeeArrayList = new ArrayList<>();
//   }

//    static {
//        Employee employee1 = new Employee("Peter", "23 / 9 / 1990", "Male", 11123, 1129, "peter@gmail.com", 1,
//        Employee.COLLEGE, 1200, Employee.RECEPTIONIST);
//        Employee employee2 = new Employee("Camel", "24 / 4 / 1990", "Female", 1243, 12324, "camel@gmail.com", 2,
//        Employee.UNIVERSITY, 2300, Employee.SUPERVISOR);
//        Employee employee3 = new Employee("Son", "12 / 3 / 1898", "Male", 2532, 7352, "Son@gamil.com", 3,
//        Employee.INTERMEDIATE, 900, Employee.SPECIALIST);
//        employeeArrayList.add(employee1);
//        employeeArrayList.add(employee2);
//        employeeArrayList.add(employee3);
//
//    }
    @Override
    public void edit(int id) {
        employeeArrayList = EmployeeToCsv.readData();
        boolean flag = true;
        for (Employee employee : employeeArrayList) {
            if (employee.getIdEmployee() == id) {
                while (flag) {
                    System.out.println("==Chose letter your want to edit ");
                    System.out.println("1. Edit name\n" + "2. Edit date birth\n"
                            + "3. Edit sex\n" + "4. Edit identification\n"
                            + "5. Edit phone number\n" + "6. Edit email\n"
                            + "7. Edit id\n" + "8. Edit academic level\n"
                            + "9. Edit salary\n" + "10. Edit position\n"
                            + "11. Exit edit");
                    int letter = CheckInput.checkInputSelection();
                    switch (letter) {
                        case 1: {
                            System.out.print("Enter new name: ");
                            String name = scanner.next();
                            employee.setName(name);
                            break;
                        }
                        case 2: {
                            System.out.print("Enter new date birth: ");
                            String dateBirth = scanner.next();
                            employee.setDateBirth(dateBirth);
                            break;
                        }
                        case 3: {
                            System.out.print("Enter new sex: ");
                            String sex = scanner.next();
                            employee.setSex(sex);
                            break;
                        }
                        case 4: {
                            System.out.print("Enter new identification: ");
                            int identification = scanner.nextInt();
                            employee.setIdentification(identification);
                            break;
                        }
                        case 5: {
                            System.out.print("Enter new phone number: ");
                            int numberPhone = scanner.nextInt();
                            employee.setPhoneNumber(numberPhone);
                            break;
                        }
                        case 6: {
                            System.out.print("Enter new email: ");
                            String email = scanner.next();
                            employee.setEmail(email);
                            break;
                        }
                        case 7: {
                            System.out.print("Enter new Id: ");
                            int idEmployee = scanner.nextInt();
                            employee.setIdentification(idEmployee);
                            break;
                        }
                        case 8: {
                            System.out.print("Enter new academic level: ");
                            String degree = scanner.next();
                            employee.setAcademicLevel(degree);
                            break;
                        }
                        case 9: {
                            System.out.print("Enter new salary: ");
                            double salary = scanner.nextDouble();
                            employee.setSalaryStaff(salary);
                            break;
                        }
                        case 10: {
                            System.out.print("Enter new position: ");
                            String position = scanner.next();
                            employee.setPosition(position);
                            break;
                        }
                        case 11: {
                            flag = false;
                            break;
                        }
                        default: {
                            System.out.println("Please check your 'letter'");
                            break;
                        }

                    }

                }

            }

        }
        EmployeeToCsv.writeListEmployeeToCSV(employeeArrayList);
    }

    @Override
    public void delete() {
        //cap nhat sau
    }

    @Override
    public void display() {
        employeeArrayList = EmployeeToCsv.readData();//Đổ từ CSDL vao employeeArrayList để duyệt lại
        for (Employee e : employeeArrayList) {
            System.out.println(e);
        }

    }

    @Override
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
        if(EmployeeToCsv.file.length() > 0){
            employeeArrayList = EmployeeToCsv.readData();
        }
        employeeArrayList.add(employee);
        EmployeeToCsv.writeListEmployeeToCSV(employeeArrayList);

    }

}
