package b18_string_and_regex.excercise.validate_number_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String NUMBER_PHONE = "^\\([\\d]{2}\\)-\\([0][\\d]{0,9}\\)$";

    public NumberPhoneValidate(){
        pattern = Pattern.compile(NUMBER_PHONE);
    }

    public boolean numberPhoneCheck (String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
