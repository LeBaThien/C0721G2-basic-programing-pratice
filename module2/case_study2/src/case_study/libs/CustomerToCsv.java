package case_study.libs;

import case_study.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerToCsv {
    public static File file = new File("D:\\codegym_final\\case_study2\\src\\case_study\\data\\customer.csv");
    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
    public static List<Customer> readData (){
        List<Customer> customerList = new LinkedList<>();
        try {
            FileReader fileReader = new FileReader(file);
//            if(!file.exists()){
//                throw  new FileNotFoundException();
//            }
            BufferedReader br = new BufferedReader(fileReader);
            String line="";
            while ((line = br.readLine()) != null){
                String[] customerString = line.split(",");
                customerList.add(new Customer(customerString[0],customerString[1],customerString[2], Integer.parseInt(customerString[3]),
                        Integer.parseInt(customerString[4]),customerString[5],Integer.parseInt(customerString[6]),customerString[7],
                        customerString[8]));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return customerList;
    }

    public static void writeListCustomerToCSV (List<Customer> customers){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Customer customer : customers) {
                bufferedWriter.write(customer.getInformationCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
