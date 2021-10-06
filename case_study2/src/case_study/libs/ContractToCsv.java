package case_study.libs;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;

import java.io.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ContractToCsv {
    public static File file = new File("D:\\codegym_final\\case_study2\\src\\case_study\\data\\customer.csv");
    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
    public static Queue<Contract> readData (){
        Queue<Contract> contractQueue = new ArrayDeque<>();
        try {
            FileReader fileReader = new FileReader(file);
//            if(!file.exists()){
//                throw  new FileNotFoundException();
//            }
            BufferedReader br = new BufferedReader(fileReader);
            String line="";
            while ((line = br.readLine()) != null){
                String[] contractString = line.split(",");
//                contractQueue.add(new Customer(Integer.parseInt(contractString[0]),Double.parseDouble(contractString[1]),
//                        Double.parseDouble(contractString[2]), contractString[3]));
            }
            //int idContract, double depositAdvance, double totalPayment, Booking booking

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return contractQueue;
    }

    public static void writeListContractToCSV (Queue<Contract> contracts){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Contract contract : contracts) {
                bufferedWriter.write(contract.getInformationContract());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
