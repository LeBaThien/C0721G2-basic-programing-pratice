package code_f4.oop;

import java.util.HashMap;

public class TestMain {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
//        capitalCities.
        //{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
        System.out.println(capitalCities);

        HashMap<String, Integer> languages = new HashMap<>();
        // sử dụng phương thức put() để thêm các cá thể cho hashmap
        languages.put("Java", 14);
        languages.put("Python", 3);
        languages.put("JavaScript", 1);
        languages.put("JavaScript1", 1);
        // hiển thị các hashmap sau khi thêm
        System.out.println("\n\nHashMap: " + languages);

    }
}
