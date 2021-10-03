package b18_string_and_regex.excercise.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private static final String NAME_ClASS = "^[CAP][0-9]{4}[GHIKLM]$";
//    private static final String NAME_ClASS = "^[a-zA-Z0-9]{8,}+\\@gmail.com$";
    public NameClass(){
        pattern = Pattern.compile(NAME_ClASS);
    }

    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
