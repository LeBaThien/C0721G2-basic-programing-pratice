package b16_io_text_file.excercise.read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\codegym_final\\module2\\src\\b16_io_text_file\\excercise\\read_file\\national.csv"));

            while ((line = br.readLine()) != null) {
             String[] strings = line.split(",");
            int id = Integer.parseInt(strings[0]);
            String code = strings[1];
            String name = strings[2];
            countries.add(new Country(id,code,name));
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(Country country : countries){
//            System.out.println(country);
//        }
        countries.forEach(System.out :: println);
    }

}
