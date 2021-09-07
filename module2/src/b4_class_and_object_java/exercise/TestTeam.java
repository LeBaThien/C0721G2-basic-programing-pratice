package b4_class_and_object_java.exercise;

public class TestTeam {
    public static void main(String[] args) {
        String s = "abcdeddadd";
        System.out.println(countDifferentCharacters(s));
    }
    static int countDifferentCharacters(String s) {
        int count = 0;
        for (int i = 0, j = i + 1; i < s.length() - 1 || j < s.length() ; i++, j++) {
//            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    break;
                }

//            }
        }
        return s.length() - count;
}
}
