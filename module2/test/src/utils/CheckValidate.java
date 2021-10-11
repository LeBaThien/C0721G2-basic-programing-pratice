package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static Scanner scanner = new Scanner(System.in);

    private static final String NAME_SERVICE_HO = "^SV[HO]{2}-[0-9]{4}$";
    private static final String NAME_SERVICE_VL = "^SV[VL]{2}-[0-9]{4}$";


    //    private static Utilities utilities = new Utilities();
    //✔	Mã sổ tiết kiệm không được trùng nhau và phải đúng format STK-xxxx với x là số từ 0->9
    //✔	Ngày mở sổ và thời gian bắt đầu gửi phải đúng định dạng ngày tháng năm dd/MM/yyyy
    //✔	Kỳ hạn ( Nếu là sổ tiết kiệm ngắn hạn thì phải có giá trị từ 6 tháng hoặc 3 tháng. Còn nếu là sổ tiết kiệm dài hạn
    // thì phải có giá trị là 1 năm, 3 năm, 5 năm, 10 năm)
    //✔	Số tiền gửi ( nhỏ nhất là 1 triệu đồng)
//    private static Pattern nameInput(){
//        return pattern = Pattern.compile(NGAY);
//    }

    public static String validateInput(String a){
        String stringInput = "";
        boolean flag = true;
        while (flag){
            System.out.print("Input here: ");
            stringInput = scanner.nextLine();
            pattern = Pattern.compile(a);
            matcher = pattern.matcher(stringInput);
            if(matcher.matches()){
                flag = false;
            }else {
                System.err.println("Please check your input" +
                        ". Enter another type of input: ");
            }
        }
        return stringInput;
    }

}
