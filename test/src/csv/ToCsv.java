package csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToCsv {
    public static File file = new File("D:\\codegym_final\\test\\src\\data\\database.csv");
    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
    public static List<Employee> readData (){
        List<Employee> employeeArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line="";
            while ((line = br.readLine()) != null){
                String[] employeeList = line.split(",");
                String name = employeeList[0];
                String dateBirth = employeeList[1];
                String sex = employeeList[2];
                int identification = Integer.parseInt(employeeList[3]);
                int phoneNumber = Integer.parseInt(employeeList[4]);
                String email = employeeList[5];
                int idEmployee = Integer.parseInt(employeeList[6]);
                String academicLevel = employeeList[7];
                double salaryStaff = Double.parseDouble(employeeList[8]);
                String position = employeeList[9];

                employeeArrayList.add(new Employee( name,dateBirth,sex,identification,phoneNumber,
                        email,idEmployee,academicLevel,salaryStaff,position));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return employeeArrayList;
    }

    public static void writeListToCSV (List<Employee> employees){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Employee employee : employees) {
                bufferedWriter.write(employee.getInformationEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
