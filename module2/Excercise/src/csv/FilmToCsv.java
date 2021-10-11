package csv;

import models.MovieScreening;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FilmToCsv {
    public static File file = new File("D:\\codegym_final\\Excercise\\src\\data\\film.csv");
    // Viết ntn có đảm bảo tính bao đóng ko, cần thay public => private???
    public static Map<MovieScreening,Integer> readData (){
        Map<MovieScreening, Integer> movieMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);
            String line="";
            while ((line = br.readLine()) != null){
                String[] movieString = line.split(",");
                movieMap.put(new MovieScreening(movieString[0],movieString[1],movieString[2],
                        Integer.parseInt(movieString[3])), Integer.parseInt(movieString[4])) ;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return movieMap;
    }

    public static void writeListMovieToCSV (Map<MovieScreening,Integer> movieIntegerMap){
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Map.Entry<MovieScreening,Integer>> entries = movieIntegerMap.entrySet();
            for(Map.Entry<MovieScreening,Integer> entry : entries){
                bufferedWriter.write( entry.getKey().getInformationMovie() + "," + entry.getValue() );
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
