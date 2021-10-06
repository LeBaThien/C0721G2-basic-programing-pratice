package case_study.libs;

import case_study.models.Employee;
import case_study.models.House;

import java.io.*;
import java.util.*;

public class HouseToCsv {
    public static File file = new File("D:\\codegym_final\\case_study2\\src\\case_study\\data\\house.csv");
    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
    public static Map<House,Integer> readData (){
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);
            String line="";
            while ((line = br.readLine()) != null){
                String[] houseString = line.split(",");
                houseMap.put(new House( houseString[0],Double.parseDouble(houseString[1]), Double.parseDouble(houseString[2])
                        ,Integer.parseInt(houseString[3]),houseString[4],houseString[5],Integer.parseInt(houseString[6])),Integer.parseInt(houseString[7]));

            //String nameService, double usingArea, double priceRental, int numberPersonInRoom,
                //                 String typeOfRent, String houseStandard, int numberOfFloorHouse
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return houseMap;
    }

    public static void writeListHouseToCSV (Map<House,Integer> houseIntegerMap){
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Map.Entry<House,Integer>> entries = houseIntegerMap.entrySet();
            for(Map.Entry<House,Integer> entry : entries){
                bufferedWriter.write( entry.getKey().getInformationHouse() + "," + entry.getValue() );
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
