package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
//   private static  ArrayList<Employee> employeeArrayList;
   private static List<Employee> employeeArrayList = new ArrayList<>();
   private static Scanner scanner = new Scanner(System.in);


   public EmployeeServiceImpl (ArrayList<Employee>employeeServices) {
      this.employeeArrayList = new ArrayList<>();
   }

   static {
      Employee employee1 = new Employee("Peter",23/9/1990,"Male",11123,1129,"peter@gmail.com",1,Employee.COLLEGE,1200,Employee.RECEPTIONIST);
      Employee employee2 = new Employee("Camel", 24/1/1990,"Female",1243,12324,"camel@gmail.com",2,Employee.UNIVERSITY, 2300,Employee.SUPERVISOR);
      Employee employee3 = new Employee("Son", 12/3/1898,"Male",2532, 7352, "Son@gamil.com",3,Employee.INTERMEDIATE,900,Employee.SPECIALIST);

   }

   public void showList() {
      for (Employee e : employeeArrayList) {
         System.out.println(e);
      }
   }


}
