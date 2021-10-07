package case_study.libs;

import case_study.models.House;
import case_study.models.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RoomToCsv {
    public static File file = new File("D:\\codegym_final\\case_study2\\src\\case_study\\data\\room.csv");
    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
    public static Map<Room,Integer> readData (){
        Map<Room, Integer> houseMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(file);
//
//            if(!file.exists()){
//                throw  new FileNotFoundException();
//            }

            BufferedReader br = new BufferedReader(fileReader);
            String line="";
            while ((line = br.readLine()) != null){
                String[] roomString = line.split(",");
                houseMap.put(new Room( roomString[0],Double.parseDouble(roomString[1]), Double.parseDouble(roomString[2])
                        ,Integer.parseInt(roomString[3]),roomString[4],roomString[5]), Integer.parseInt(roomString[6]));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return houseMap;
    }

    public static void writeListRoomToCSV (Map<Room,Integer> roomIntegerMap){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Map.Entry<Room,Integer>> entries = roomIntegerMap.entrySet();
            for(Map.Entry<Room,Integer> entry : entries){
                bufferedWriter.write( entry.getKey().getInformation() + "," + entry.getValue() );
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
