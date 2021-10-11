package csv;

import models.SoTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToCsv {
//    public static File file = new File("D:\\codegym_final\\test\\src\\data\\sotietkiem.csv");
//    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
//    public static List<SoTietKiem> readData (){
//        List<SoTietKiem> soTietKiems = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader br = new BufferedReader(fileReader);
//            String line="";
//            while ((line = br.readLine()) != null){
//                String[] soTietKiemList = line.split(",");
//
//                soTietKiems.add(new SoTietKiem( name,dateBirth,sex,identification,phoneNumber,
//                        email,idEmployee,academicLevel,salaryStaff,position));
//            }
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("can't read file");
//        }
//        return soTietKiems;
//    }
//
//    public static void writeListToCSV (List<Employee> employees){
//        try{
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for(Employee employee : employees) {
//                bufferedWriter.write(employee.getInformationEmployee());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
