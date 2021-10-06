package case_study.libs;

import case_study.models.House;
import case_study.models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class VillaToCsv {
    public static File file = new File("D:\\codegym_final\\case_study2\\src\\case_study\\data\\villa.csv");
    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
    public static Map<Villa,Integer> readData (){
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);
            String line="";
            while ((line = br.readLine()) != null){
                String[] villaString = line.split(",");
                villaMap.put(new Villa( villaString[0],Double.parseDouble(villaString[1]), Double.parseDouble(villaString[2])
                        ,Integer.parseInt(villaString[3]),villaString[4],villaString[5],Double.parseDouble(villaString[6]),
                        Integer.parseInt(villaString[7])), Integer.parseInt(villaString[8]));

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return villaMap;
    }

    public static void writeListVillaToCSV (Map<Villa,Integer> villaIntegerMap){
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            //Nếu ko chuyển về false, ko ghi đè ,,, khi ghi lại
            //sẽ bị sai??? thắc mắc
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Map.Entry<Villa,Integer>> entries = villaIntegerMap.entrySet();
            for(Map.Entry<Villa,Integer> entry : entries){
                bufferedWriter.write( entry.getKey().getInformationVilla() + "," + entry.getValue() );
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
