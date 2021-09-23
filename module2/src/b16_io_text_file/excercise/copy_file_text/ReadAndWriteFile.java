package b16_io_text_file.excercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFile(String filePath) {
        List<String> sourceFile = new ArrayList<>();
        try{
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine())!= null){
                sourceFile.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sourceFile;
    }

    public static void writeFile(String filePath, List<String> sourceFile, boolean append ){
        try {
            FileWriter writer = new FileWriter(filePath, append);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (String sourFile : sourceFile ){
                bufferedWriter.write(sourFile);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
