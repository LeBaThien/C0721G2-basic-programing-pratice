package b16_io_text_file.excercise.copy_file_text;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<String> result = ReadAndWriteFile.readFile("D:\\codegym_final\\module2\\src\\b16_io_text_file\\excercise\\copy_file_text\\sourcefile.txt");
        ReadAndWriteFile.writeFile("D:\\codegym_final\\module2\\src\\b16_io_text_file\\excercise\\copy_file_text\\targetfile.txt",result,true);
    }
}
